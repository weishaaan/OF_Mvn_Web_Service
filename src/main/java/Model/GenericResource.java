package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import org.apache.log4j.Logger;


@Path("home")
public class GenericResource {

    static final Logger logger = Logger.getLogger(GenericResource.class);
    
    Connection conn;
    ResultSet rslt;

    @GET
    @Path("mysql")
    @Produces(MediaType.APPLICATION_JSON) 
    public List<Of> aaa() throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet rslt = null;
        
        String search = "SELECT * FROM OF_list where reference = 11226200;"; 
        String con = "jdbc:mysql://localhost:3306/OF_DB";
        String conplus = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false";
        
        List<Of> list = new ArrayList<>();
        
        String user = "root";
        String pass = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            myConn = DriverManager.getConnection(con+conplus, user, pass);
            myStmt = myConn.createStatement();
            rslt = myStmt.executeQuery(search);
            
            while (rslt.next()) {
                Of of = new Of();
                of.setOfNum(rslt.getLong("ofNum"));
                of.setReference(rslt.getLong("reference"));
                of.setSreference(rslt.getString("sReference"));
                of.setArtDesignation(rslt.getString("artDesignation"));
                of.setNbArtPerContainer(rslt.getString("nbArtPerContainer"));
                of.setDatePlainfDebut(rslt.getString("datePlainfDebut"));
                of.setQteOfEntete(rslt.getInt("qteOfEntete"));
                list.add(of);
                System.out.println("ofnum is :" + rslt.getLong("ofNum"));
                System.out.println("******************");
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rslt != null) {
                rslt.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
    
        return list;
    }
    
    
    @GET
    @Path("testJNDI")
    @Produces(MediaType.APPLICATION_JSON) 
    public Response test (@QueryParam("ref") long ref,
                          @QueryParam("sref") String sref,
                          @QueryParam("date_start") String date_start,
                          @QueryParam("date_end") String date_end)throws SQLException, NamingException {
        
        
        List<Of> list = new ArrayList<>();
        String search = "SELECT * FROM OF_list WHERE reference = " + ref ; 
        if(sref != null && !sref.equals("")){
            search = search + " AND sReference = " + sref;
        }
        if(date_start!=null && !date_start.equals("") && date_end!=null && !date_end.equals("")){
            search = search + " AND datePlainfDebut BETWEEN " + date_start+ " AND " + date_end;
        }
        System.out.println("SEARCH QUERY IS: " + search);
        
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource ds = (DataSource) envCtx.lookup("jdbc/OF_DB");
        Connection myConn = ds.getConnection();
        
        Statement myStmt = null;
        ResultSet rslt = null;
        
        try {
            //myConn = DriverManager.getConnection(con+conplus, user, pass);
            myStmt = myConn.createStatement();
            rslt = myStmt.executeQuery(search);
            
            while (rslt.next()) {
                Of of = new Of();
                of.setOfNum(rslt.getLong("ofNum"));
                of.setReference(rslt.getLong("reference"));
                of.setSreference(rslt.getString("sReference"));
                of.setArtDesignation(rslt.getString("artDesignation"));
                of.setNbArtPerContainer(rslt.getString("nbArtPerContainer"));
                of.setDatePlainfDebut(rslt.getString("datePlainfDebut"));
                of.setQteOfEntete(rslt.getInt("qteOfEntete"));
                list.add(of);
                
                System.out.println("ofnum is :" + rslt.getLong("ofNum"));
                System.out.println("******************");
            }

        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {
            if (rslt != null) {
                rslt.close();
            }

            if (myStmt != null) {
                myStmt.close();
            }

            if (myConn != null) {
                myConn.close();
            }
        }
        
        GenericEntity generic = new GenericEntity<List<Of>>(list){};
        
        return Response.status(201).entity(generic).build();
    }
    
    
}
