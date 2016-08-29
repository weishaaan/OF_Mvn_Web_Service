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
    
    /*
    @GET
    @Path("mysql")
    @Produces(MediaType.APPLICATION_JSON) 
    public List<Ofentete> aaa() throws SQLException {
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet rslt = null;
        
        String search = "SELECT * FROM OF_list where reference = 11226200;"; 
        String con = "jdbc:mysql://localhost:3306/OF_DB";
        String conplus = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false";
        
        List<Ofentete> list = new ArrayList<>();
        
        String user = "root";
        String pass = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            myConn = DriverManager.getConnection(con+conplus, user, pass);
            myStmt = myConn.createStatement();
            rslt = myStmt.executeQuery(search);
            
            while (rslt.next()) {
                
                Ofentete of = new Ofentete();
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
    */
    
    @GET
    @Path("testJNDI")
    @Produces(MediaType.APPLICATION_JSON) 
    public Response test (@QueryParam("REFERENCE") long ref,
                          @QueryParam("SREFERENCE1") String sref,
                          @QueryParam("date_start") String date_start,
                          @QueryParam("date_end") String date_end)throws SQLException, NamingException {
        
        
        List<Of> list = new ArrayList<>();
        
        String search = "SELECT * FROM ofentete WHERE REFERENCE = \'" + ref + "\'"; 
        if(sref != null && !sref.equals("")){
            search = search + " AND SREFERENCE1 = \'" + sref + "\'";
        }
        if(date_start!=null && !date_start.equals("") && date_end!=null && !date_end.equals("")){
            search = search + " AND PREVDEBDT BETWEEN " + date_start + " AND " + date_end;
        }
        System.out.println("SEARCH QUERY IS: " + search);
        
        Context initCtx = new InitialContext();
        Context envCtx = (Context) initCtx.lookup("java:comp/env");
        DataSource ds = (DataSource) envCtx.lookup("jdbc/OF_DB");
        Connection myConn = ds.getConnection();
        
        Statement myStmt = null;
        ResultSet rslt = null;
        
        try {
            myStmt = myConn.createStatement();
            rslt = myStmt.executeQuery(search);
            
            while (rslt.next()) {
                Ofentete ofentete = new Ofentete();
                
                ofentete.setBLNO(rslt.getLong("BLNO"));
                ofentete.setCALDEBDT(rslt.getDate("CALDEBDT"));
                ofentete.setCALDEBHMS(rslt.getString("CALDEBHMS"));
                ofentete.setCDENO(rslt.getString("CDENO"));
                ofentete.setCEFORM(rslt.getInt("CEFORM"));
                ofentete.setDATECREATION(rslt.getDate("DATECREATION"));
                ofentete.setDATEDEBPREVUETARD(rslt.getDate("DATEDEBPREVUETARD"));
                ofentete.setDATEDEBPREVUETOT(rslt.getDate("DATEDEBPREVUETOT"));
                ofentete.setDATEDEBUTREVISEE(rslt.getDate("DATEDEBUTREVISEE"));
                ofentete.setDATEDEMANDEE(rslt.getDate("DATEDEMANDEE"));
                ofentete.setDATEFINPREVUETARD(rslt.getDate("DATEFINPREVUETARD"));
                ofentete.setDATEFINPREVUETOT(rslt.getDate("DATEFINPREVUETOT"));
                ofentete.setDATEFINREVISEE(rslt.getDate("DATEFINREVISEE"));
                ofentete.setDATEMODIF(rslt.getDate("DATEMODIF"));
                ofentete.setDATEPLANIFDEBUT(rslt.getDate("DATEPLANIFDEBUT"));
                ofentete.setDATEPLANIFFIN(rslt.getDate("DATEPLANIFFIN"));
                ofentete.setDEBDT(rslt.getDate("DEBDT"));
                ofentete.setDEBHMS(rslt.getString("DEBHMS"));
                ofentete.setDELAIFAB(rslt.getInt("DELAIFAB"));
                ofentete.setDEPOT(rslt.getString("DEPOT"));
                ofentete.setDOSSIER(rslt.getInt("DOSSIER"));
                ofentete.setENREGNO(rslt.getInt("ENREGNO"));
                ofentete.setETABLISSEMENT(rslt.getString("ETABLISSEMENT"));
                ofentete.setEXPORTCOD(rslt.getInt("EXPORTCOD"));
                ofentete.setFABLOTNO(rslt.getString("FABLOTNO"));
                ofentete.setFAMILLEOF(rslt.getString("FAMILLEOF"));
                ofentete.setFINDT(rslt.getDate("FINDT"));
                ofentete.setFINHMS(rslt.getString("FINHMS"));
                ofentete.setFORMULAIRE(rslt.getString("FORMULAIRE"));
                ofentete.setGAMME(rslt.getString("GAMME"));
                ofentete.setHEUREDEBPREVUETARD(rslt.getString("HEUREDEBPREVUETARD"));
                ofentete.setHEUREDEBPREVUETOT(rslt.getString("HEUREDEBPREVUETOT"));
                ofentete.setHEUREDEBUTREVISEE(rslt.getString("HEUREDEBUTREVISEE"));
                ofentete.setHEUREDEMANDEE(rslt.getString("HEUREDEMANDEE"));
                ofentete.setHEUREFINPREVUETARD(rslt.getString("HEUREFINPREVUETARD"));
                ofentete.setHEUREFINPREVUETOT(rslt.getString("HEUREFINPREVUETOT"));
                ofentete.setHEUREFINREVISEE(rslt.getString("HEUREFINREVISEE"));
                ofentete.setHEUREPLANIFDEBUT(rslt.getString("HEUREPLANIFDEBUT"));
                ofentete.setHEUREPLANIFFIN(rslt.getString("HEUREPLANIFFIN"));
                ofentete.setHISTORISATIONNO(rslt.getInt("HISTORISATIONNO"));
                ofentete.setINDICEPROD(rslt.getString("INDICEPROD"));
                ofentete.setINDICOFCOUT(rslt.getInt("INDICOFCOUT"));
                ofentete.setINDICRESERVESTOCK(rslt.getInt("INDICRESERVESTOCK"));
                ofentete.setINDICSUIVIREAPPRO(rslt.getInt("INDICSUIVIREAPPRO"));
                ofentete.setId(rslt.getLong("id"));
                ofentete.setLIBELLE_OF_ENTETE(rslt.getString("LIBELLE_OF_ENTETE"));
                ofentete.setMTPREVU_0001(rslt.getFloat("MTPREVU_0001"));
                ofentete.setMTPREVU_0002(rslt.getFloat("MTPREVU_0002"));
                ofentete.setMTPREVU_0003(rslt.getFloat("MTPREVU_0003"));
                ofentete.setMTPREVU_0004(rslt.getFloat("MTPREVU_0004"));
                ofentete.setMTPREVU_0005(rslt.getFloat("MTPREVU_0005"));
                ofentete.setMTPREVU_0006(rslt.getFloat("MTPREVU_0006"));
                ofentete.setMTREEL_0001(rslt.getFloat("MTREEL_0001"));
                ofentete.setMTREEL_0002(rslt.getFloat("MTREEL_0002"));
                ofentete.setMTREEL_0003(rslt.getFloat("MTREEL_0003"));
                ofentete.setMTREEL_0004(rslt.getFloat("MTREEL_0004"));
                ofentete.setMTREEL_0005(rslt.getFloat("MTREEL_0005"));
                ofentete.setMTREEL_0006(rslt.getFloat("MTREEL_0006"));
                ofentete.setNATURESTOCK(rslt.getString("NATURESTOCK"));
                ofentete.setOFCONTRAINTE(rslt.getInt("OFCONTRAINTE"));
                ofentete.setOFMODIFIE(rslt.getInt("OFMODIFIE"));
                ofentete.setOFSUSPENDU(rslt.getInt("OFSUSPENDU"));
                ofentete.setORIGINE(rslt.getInt("ORIGINE"));
                ofentete.setPG_CERTIFICATION(rslt.getInt("PG_CERTIFICATION"));
                ofentete.setPG_CR_SEMI_FINI(rslt.getInt("PG_CR_SEMI_FINI"));
                ofentete.setPG_QUANTITE_SEMI_FINI(rslt.getInt("PG_QUANTITE_SEMI_FINI"));
                ofentete.setPIECENO(rslt.getString("PIECENO"));
                ofentete.setPLANPRODNO(rslt.getString("PLANPRODNO"));
                ofentete.setPREVDEBDT(rslt.getDate("PREVDEBDT"));
                ofentete.setPREVDEBHMS(rslt.getString("REFERENCE"));
                ofentete.setPREVFINDT(rslt.getDate("PREVFINDT"));
                ofentete.setPREVFINHMS(rslt.getString("PREVFINHMS"));
                ofentete.setPROJET(rslt.getString("PROJET"));
                ofentete.setQTEBL(rslt.getInt("QTEBL"));
                ofentete.setQTECDE(rslt.getInt("QTECDE"));
                ofentete.setQTELANCEE(rslt.getInt("QTELANCEE"));
                ofentete.setQTENOMENCLATURE(rslt.getInt("QTENOMENCLATURE"));
                ofentete.setQTEREBUT(rslt.getInt("QTEREBUT"));
                ofentete.setQTEREBUTBL(rslt.getInt("QTEREBUTBL"));
                ofentete.setQTE_OF_ENTETE(rslt.getInt("QTE_OF_ENTETE"));
                ofentete.setREFERENCE(rslt.getString("REFERENCE"));
                ofentete.setSGAMME1(rslt.getString("SGAMME1"));
                ofentete.setSGAMME2(rslt.getString("SGAMME2"));
                ofentete.setSREFERENCE1(rslt.getString("SREFERENCE1"));
                ofentete.setSREFERENCE2(rslt.getString("SREFERENCE2"));
                ofentete.setSTATUS(rslt.getString("STATUS"));
                ofentete.setTIERS(rslt.getString("TIERS"));
                ofentete.setTPSPREVU_0001(rslt.getFloat("TPSPREVU_0001"));
                ofentete.setTPSPREVU_0002(rslt.getFloat("TPSPREVU_0002"));
                ofentete.setTPSPREVU_0003(rslt.getFloat("TPSPREVU_0003"));
                ofentete.setTPSREEL_0001(rslt.getFloat("TPSREEL_0001"));
                ofentete.setTPSREEL_0002(rslt.getFloat("TPSREEL_0002"));
                ofentete.setTPSREEL_0003(rslt.getFloat("TPSREEL_0003"));
                ofentete.setTYPEDELAIDEMANDE(rslt.getInt("TYPEDELAIDEMANDE"));
                ofentete.setTYPEJALON(rslt.getInt("TYPEJALON"));
                ofentete.setUNITENOMENCLATURE(rslt.getString("UNITENOMENCLATURE"));
                ofentete.setUNITEPRIX(rslt.getString("UNITEPRIX"));
                ofentete.setUNITEREFERENCE(rslt.getString("UNITEREFERENCE"));
                ofentete.setUTILISATEURCREATION(rslt.getString("UTILISATEURCREATION"));
                ofentete.setUTILISATEURMODIF(rslt.getString("UTILISATEURMODIF"));
                ofentete.setVALEURCOEF_0001(rslt.getFloat("VALEURCOEF_0001"));
                ofentete.setVALEURCOEF_0002(rslt.getFloat("VALEURCOEF_0002"));
                ofentete.setVALEURCOEF_0003(rslt.getFloat("VALEURCOEF_0003"));
                ofentete.setVALEURCOEF_0004(rslt.getFloat("VALEURCOEF_0004"));
                ofentete.setVALEURCOEF_0005(rslt.getFloat("VALEURCOEF_0005"));
                ofentete.setVALEURCOEF_0006(rslt.getFloat("VALEURCOEF_0006"));
                ofentete.setVALEURCST_0001(rslt.getFloat("VALEURCST_0001"));
                ofentete.setVALEURCST_0002(rslt.getFloat("VALEURCST_0002"));
                ofentete.setVALEURCST_0003(rslt.getFloat("VALEURCST_0003"));
                ofentete.setVALEURCST_0004(rslt.getFloat("VALEURCST_0004"));
                ofentete.setVALEURCST_0005(rslt.getFloat("VALEURCST_0005"));
                ofentete.setVTLCDE(rslt.getInt("VTLCDE"));
                
                Of of = new Of();
                of.setOfNum(rslt.getLong("PIECENO"));
                of.setReference(rslt.getLong("REFERENCE"));
                of.setSreference(rslt.getString("SREFERENCE1"));
                //of.setArtDesignation(rslt.getString("PIECENO"));
                //of.setNbArtPerContainer(rslt.getString("PIECENO"));
                of.setQteOfEntete(rslt.getInt("QTE_OF_ENTETE"));
                of.setDatePlainfDebut(rslt.getString("PREVDEBDT"));
                
                list.add(of);
                System.out.println("Ofentete list is : " + list.toString());
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
