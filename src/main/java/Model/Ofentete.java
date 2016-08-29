package Model;

import java.sql.Date;

public class Ofentete {

    long id;
    int DOSSIER;
    String PIECENO;
    String ETABLISSEMENT;
    String GAMME;
    String SGAMME1;
    String SGAMME2;
    String REFERENCE;
    String SREFERENCE1;
    String SREFERENCE2;
    String INDICEPROD;
    String STATUS;
    String LIBELLE_OF_ENTETE;
    Date PREVDEBDT;	
    String PREVDEBHMS;
    Date PREVFINDT;
    String PREVFINHMS;
    Date DEBDT;
    String DEBHMS;
    Date FINDT;
    String FINHMS;
    Date DATEPLANIFDEBUT;
    String HEUREPLANIFDEBUT;
    Date DATEPLANIFFIN;
    String HEUREPLANIFFIN;
    String FORMULAIRE;
    String PLANPRODNO;
    String TIERS;
    String CDENO;
    int INDICOFCOUT;
    String FAMILLEOF;
    String UNITEPRIX;
    String UNITEREFERENCE;
    String UNITENOMENCLATURE;
    String PROJET;
    long ENREGNO;
    long BLNO;
    String DEPOT;
    String NATURESTOCK;
    int VTLCDE;
    Date CALDEBDT;
    String CALDEBHMS;
    String UTILISATEURCREATION;
    String UTILISATEURMODIF;
    Date DATEDEMANDEE;
    String HEUREDEMANDEE;
    Date DATEDEBPREVUETOT;
    String HEUREDEBPREVUETOT;
    Date DATEFINPREVUETOT;
    String HEUREFINPREVUETOT;
    Date DATEDEBPREVUETARD;
    String HEUREDEBPREVUETARD;
    Date DATEFINPREVUETARD;
    String HEUREFINPREVUETARD;
    Date DATEDEBUTREVISEE;	
    String HEUREDEBUTREVISEE;
    Date DATEFINREVISEE;
    String HEUREFINREVISEE;
    String FABLOTNO;
    int PG_CERTIFICATION;
    int PG_CR_SEMI_FINI;
    int PG_QUANTITE_SEMI_FINI;
    Date DATECREATION;
    Date DATEMODIF;
    int CEFORM;
    int ORIGINE;
    Float MTPREVU_0001;
    Float MTPREVU_0002;
    Float MTPREVU_0003;
    Float MTPREVU_0004;
    Float MTPREVU_0005;
    Float MTPREVU_0006;
    Float MTREEL_0001;
    Float MTREEL_0002;
    Float MTREEL_0003;
    Float MTREEL_0004;
    Float MTREEL_0005;
    Float MTREEL_0006;
    Float TPSPREVU_0001;
    Float TPSPREVU_0002;
    Float TPSPREVU_0003;
    Float TPSREEL_0001;
    Float TPSREEL_0002;
    Float TPSREEL_0003;
    int QTE_OF_ENTETE;
    int QTECDE;
    int QTEBL;
    int QTEREBUTBL;
    int INDICSUIVIREAPPRO;
    int INDICRESERVESTOCK;
    int DELAIFAB;
    int QTENOMENCLATURE;
    int QTEREBUT;
    int QTELANCEE;
    Float VALEURCOEF_0001;
    Float VALEURCOEF_0002;
    Float VALEURCOEF_0003;
    Float VALEURCOEF_0004;
    Float VALEURCOEF_0005;
    Float VALEURCOEF_0006;
    Float VALEURCST_0001;
    Float VALEURCST_0002;
    Float VALEURCST_0003;
    Float VALEURCST_0004;
    Float VALEURCST_0005;
    int TYPEJALON;
    int TYPEDELAIDEMANDE;
    int OFSUSPENDU;
    int HISTORISATIONNO;
    int OFMODIFIE;
    int OFCONTRAINTE;
    int EXPORTCOD;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDOSSIER() {
        return DOSSIER;
    }

    public void setDOSSIER(int DOSSIER) {
        this.DOSSIER = DOSSIER;
    }

    public String getPIECENO() {
        return PIECENO;
    }

    public void setPIECENO(String PIECENO) {
        this.PIECENO = PIECENO;
    }

    public String getETABLISSEMENT() {
        return ETABLISSEMENT;
    }

    public void setETABLISSEMENT(String ETABLISSEMENT) {
        this.ETABLISSEMENT = ETABLISSEMENT;
    }

    public String getGAMME() {
        return GAMME;
    }

    public void setGAMME(String GAMME) {
        this.GAMME = GAMME;
    }

    public String getSGAMME1() {
        return SGAMME1;
    }

    public void setSGAMME1(String SGAMME1) {
        this.SGAMME1 = SGAMME1;
    }

    public String getSGAMME2() {
        return SGAMME2;
    }

    public void setSGAMME2(String SGAMME2) {
        this.SGAMME2 = SGAMME2;
    }

    public String getREFERENCE() {
        return REFERENCE;
    }

    public void setREFERENCE(String REFERENCE) {
        this.REFERENCE = REFERENCE;
    }

    public String getSREFERENCE1() {
        return SREFERENCE1;
    }

    public void setSREFERENCE1(String SREFERENCE1) {
        this.SREFERENCE1 = SREFERENCE1;
    }

    public String getSREFERENCE2() {
        return SREFERENCE2;
    }

    public void setSREFERENCE2(String SREFERENCE2) {
        this.SREFERENCE2 = SREFERENCE2;
    }

    public String getINDICEPROD() {
        return INDICEPROD;
    }

    public void setINDICEPROD(String INDICEPROD) {
        this.INDICEPROD = INDICEPROD;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getLIBELLE_OF_ENTETE() {
        return LIBELLE_OF_ENTETE;
    }

    public void setLIBELLE_OF_ENTETE(String LIBELLE_OF_ENTETE) {
        this.LIBELLE_OF_ENTETE = LIBELLE_OF_ENTETE;
    }

    public Date getPREVDEBDT() {
        return PREVDEBDT;
    }

    public void setPREVDEBDT(Date PREVDEBDT) {
        this.PREVDEBDT = PREVDEBDT;
    }

    public String getPREVDEBHMS() {
        return PREVDEBHMS;
    }

    public void setPREVDEBHMS(String PREVDEBHMS) {
        this.PREVDEBHMS = PREVDEBHMS;
    }

    public Date getPREVFINDT() {
        return PREVFINDT;
    }

    public void setPREVFINDT(Date PREVFINDT) {
        this.PREVFINDT = PREVFINDT;
    }

    public String getPREVFINHMS() {
        return PREVFINHMS;
    }

    public void setPREVFINHMS(String PREVFINHMS) {
        this.PREVFINHMS = PREVFINHMS;
    }

    public Date getDEBDT() {
        return DEBDT;
    }

    public void setDEBDT(Date DEBDT) {
        this.DEBDT = DEBDT;
    }

    public String getDEBHMS() {
        return DEBHMS;
    }

    public void setDEBHMS(String DEBHMS) {
        this.DEBHMS = DEBHMS;
    }

    public Date getFINDT() {
        return FINDT;
    }

    public void setFINDT(Date FINDT) {
        this.FINDT = FINDT;
    }

    public String getFINHMS() {
        return FINHMS;
    }

    public void setFINHMS(String FINHMS) {
        this.FINHMS = FINHMS;
    }

    public Date getDATEPLANIFDEBUT() {
        return DATEPLANIFDEBUT;
    }

    public void setDATEPLANIFDEBUT(Date DATEPLANIFDEBUT) {
        this.DATEPLANIFDEBUT = DATEPLANIFDEBUT;
    }

    public String getHEUREPLANIFDEBUT() {
        return HEUREPLANIFDEBUT;
    }

    public void setHEUREPLANIFDEBUT(String HEUREPLANIFDEBUT) {
        this.HEUREPLANIFDEBUT = HEUREPLANIFDEBUT;
    }

    public Date getDATEPLANIFFIN() {
        return DATEPLANIFFIN;
    }

    public void setDATEPLANIFFIN(Date DATEPLANIFFIN) {
        this.DATEPLANIFFIN = DATEPLANIFFIN;
    }

    public String getHEUREPLANIFFIN() {
        return HEUREPLANIFFIN;
    }

    public void setHEUREPLANIFFIN(String HEUREPLANIFFIN) {
        this.HEUREPLANIFFIN = HEUREPLANIFFIN;
    }

    public String getFORMULAIRE() {
        return FORMULAIRE;
    }

    public void setFORMULAIRE(String FORMULAIRE) {
        this.FORMULAIRE = FORMULAIRE;
    }

    public String getPLANPRODNO() {
        return PLANPRODNO;
    }

    public void setPLANPRODNO(String PLANPRODNO) {
        this.PLANPRODNO = PLANPRODNO;
    }

    public String getTIERS() {
        return TIERS;
    }

    public void setTIERS(String TIERS) {
        this.TIERS = TIERS;
    }

    public String getCDENO() {
        return CDENO;
    }

    public void setCDENO(String CDENO) {
        this.CDENO = CDENO;
    }

    public int getINDICOFCOUT() {
        return INDICOFCOUT;
    }

    public void setINDICOFCOUT(int INDICOFCOUT) {
        this.INDICOFCOUT = INDICOFCOUT;
    }

    public String getFAMILLEOF() {
        return FAMILLEOF;
    }

    public void setFAMILLEOF(String FAMILLEOF) {
        this.FAMILLEOF = FAMILLEOF;
    }

    public String getUNITEPRIX() {
        return UNITEPRIX;
    }

    public void setUNITEPRIX(String UNITEPRIX) {
        this.UNITEPRIX = UNITEPRIX;
    }

    public String getUNITEREFERENCE() {
        return UNITEREFERENCE;
    }

    public void setUNITEREFERENCE(String UNITEREFERENCE) {
        this.UNITEREFERENCE = UNITEREFERENCE;
    }

    public String getUNITENOMENCLATURE() {
        return UNITENOMENCLATURE;
    }

    public void setUNITENOMENCLATURE(String UNITENOMENCLATURE) {
        this.UNITENOMENCLATURE = UNITENOMENCLATURE;
    }

    public String getPROJET() {
        return PROJET;
    }

    public void setPROJET(String PROJET) {
        this.PROJET = PROJET;
    }

    public long getENREGNO() {
        return ENREGNO;
    }

    public void setENREGNO(long ENREGNO) {
        this.ENREGNO = ENREGNO;
    }

    public long getBLNO() {
        return BLNO;
    }

    public void setBLNO(long BLNO) {
        this.BLNO = BLNO;
    }

    public String getDEPOT() {
        return DEPOT;
    }

    public void setDEPOT(String DEPOT) {
        this.DEPOT = DEPOT;
    }

    public String getNATURESTOCK() {
        return NATURESTOCK;
    }

    public void setNATURESTOCK(String NATURESTOCK) {
        this.NATURESTOCK = NATURESTOCK;
    }

    public int getVTLCDE() {
        return VTLCDE;
    }

    public void setVTLCDE(int VTLCDE) {
        this.VTLCDE = VTLCDE;
    }

    public Date getCALDEBDT() {
        return CALDEBDT;
    }

    public void setCALDEBDT(Date CALDEBDT) {
        this.CALDEBDT = CALDEBDT;
    }

    public String getCALDEBHMS() {
        return CALDEBHMS;
    }

    public void setCALDEBHMS(String CALDEBHMS) {
        this.CALDEBHMS = CALDEBHMS;
    }

    public String getUTILISATEURCREATION() {
        return UTILISATEURCREATION;
    }

    public void setUTILISATEURCREATION(String UTILISATEURCREATION) {
        this.UTILISATEURCREATION = UTILISATEURCREATION;
    }

    public String getUTILISATEURMODIF() {
        return UTILISATEURMODIF;
    }

    public void setUTILISATEURMODIF(String UTILISATEURMODIF) {
        this.UTILISATEURMODIF = UTILISATEURMODIF;
    }

    public Date getDATEDEMANDEE() {
        return DATEDEMANDEE;
    }

    public void setDATEDEMANDEE(Date DATEDEMANDEE) {
        this.DATEDEMANDEE = DATEDEMANDEE;
    }

    public String getHEUREDEMANDEE() {
        return HEUREDEMANDEE;
    }

    public void setHEUREDEMANDEE(String HEUREDEMANDEE) {
        this.HEUREDEMANDEE = HEUREDEMANDEE;
    }

    public Date getDATEDEBPREVUETOT() {
        return DATEDEBPREVUETOT;
    }

    public void setDATEDEBPREVUETOT(Date DATEDEBPREVUETOT) {
        this.DATEDEBPREVUETOT = DATEDEBPREVUETOT;
    }

    public String getHEUREDEBPREVUETOT() {
        return HEUREDEBPREVUETOT;
    }

    public void setHEUREDEBPREVUETOT(String HEUREDEBPREVUETOT) {
        this.HEUREDEBPREVUETOT = HEUREDEBPREVUETOT;
    }

    public Date getDATEFINPREVUETOT() {
        return DATEFINPREVUETOT;
    }

    public void setDATEFINPREVUETOT(Date DATEFINPREVUETOT) {
        this.DATEFINPREVUETOT = DATEFINPREVUETOT;
    }

    public String getHEUREFINPREVUETOT() {
        return HEUREFINPREVUETOT;
    }

    public void setHEUREFINPREVUETOT(String HEUREFINPREVUETOT) {
        this.HEUREFINPREVUETOT = HEUREFINPREVUETOT;
    }

    public Date getDATEDEBPREVUETARD() {
        return DATEDEBPREVUETARD;
    }

    public void setDATEDEBPREVUETARD(Date DATEDEBPREVUETARD) {
        this.DATEDEBPREVUETARD = DATEDEBPREVUETARD;
    }

    public String getHEUREDEBPREVUETARD() {
        return HEUREDEBPREVUETARD;
    }

    public void setHEUREDEBPREVUETARD(String HEUREDEBPREVUETARD) {
        this.HEUREDEBPREVUETARD = HEUREDEBPREVUETARD;
    }

    public Date getDATEFINPREVUETARD() {
        return DATEFINPREVUETARD;
    }

    public void setDATEFINPREVUETARD(Date DATEFINPREVUETARD) {
        this.DATEFINPREVUETARD = DATEFINPREVUETARD;
    }

    public String getHEUREFINPREVUETARD() {
        return HEUREFINPREVUETARD;
    }

    public void setHEUREFINPREVUETARD(String HEUREFINPREVUETARD) {
        this.HEUREFINPREVUETARD = HEUREFINPREVUETARD;
    }

    public Date getDATEDEBUTREVISEE() {
        return DATEDEBUTREVISEE;
    }

    public void setDATEDEBUTREVISEE(Date DATEDEBUTREVISEE) {
        this.DATEDEBUTREVISEE = DATEDEBUTREVISEE;
    }

    public String getHEUREDEBUTREVISEE() {
        return HEUREDEBUTREVISEE;
    }

    public void setHEUREDEBUTREVISEE(String HEUREDEBUTREVISEE) {
        this.HEUREDEBUTREVISEE = HEUREDEBUTREVISEE;
    }

    public Date getDATEFINREVISEE() {
        return DATEFINREVISEE;
    }

    public void setDATEFINREVISEE(Date DATEFINREVISEE) {
        this.DATEFINREVISEE = DATEFINREVISEE;
    }

    public String getHEUREFINREVISEE() {
        return HEUREFINREVISEE;
    }

    public void setHEUREFINREVISEE(String HEUREFINREVISEE) {
        this.HEUREFINREVISEE = HEUREFINREVISEE;
    }

    public String getFABLOTNO() {
        return FABLOTNO;
    }

    public void setFABLOTNO(String FABLOTNO) {
        this.FABLOTNO = FABLOTNO;
    }

    public int getPG_CERTIFICATION() {
        return PG_CERTIFICATION;
    }

    public void setPG_CERTIFICATION(int PG_CERTIFICATION) {
        this.PG_CERTIFICATION = PG_CERTIFICATION;
    }

    public int getPG_CR_SEMI_FINI() {
        return PG_CR_SEMI_FINI;
    }

    public void setPG_CR_SEMI_FINI(int PG_CR_SEMI_FINI) {
        this.PG_CR_SEMI_FINI = PG_CR_SEMI_FINI;
    }

    public int getPG_QUANTITE_SEMI_FINI() {
        return PG_QUANTITE_SEMI_FINI;
    }

    public void setPG_QUANTITE_SEMI_FINI(int PG_QUANTITE_SEMI_FINI) {
        this.PG_QUANTITE_SEMI_FINI = PG_QUANTITE_SEMI_FINI;
    }

    public Date getDATECREATION() {
        return DATECREATION;
    }

    public void setDATECREATION(Date DATECREATION) {
        this.DATECREATION = DATECREATION;
    }

    public Date getDATEMODIF() {
        return DATEMODIF;
    }

    public void setDATEMODIF(Date DATEMODIF) {
        this.DATEMODIF = DATEMODIF;
    }

    public int getCEFORM() {
        return CEFORM;
    }

    public void setCEFORM(int CEFORM) {
        this.CEFORM = CEFORM;
    }

    public int getORIGINE() {
        return ORIGINE;
    }

    public void setORIGINE(int ORIGINE) {
        this.ORIGINE = ORIGINE;
    }

    public Float getMTPREVU_0001() {
        return MTPREVU_0001;
    }

    public void setMTPREVU_0001(Float MTPREVU_0001) {
        this.MTPREVU_0001 = MTPREVU_0001;
    }

    public Float getMTPREVU_0002() {
        return MTPREVU_0002;
    }

    public void setMTPREVU_0002(Float MTPREVU_0002) {
        this.MTPREVU_0002 = MTPREVU_0002;
    }

    public Float getMTPREVU_0003() {
        return MTPREVU_0003;
    }

    public void setMTPREVU_0003(Float MTPREVU_0003) {
        this.MTPREVU_0003 = MTPREVU_0003;
    }

    public Float getMTPREVU_0004() {
        return MTPREVU_0004;
    }

    public void setMTPREVU_0004(Float MTPREVU_0004) {
        this.MTPREVU_0004 = MTPREVU_0004;
    }

    public Float getMTPREVU_0005() {
        return MTPREVU_0005;
    }

    public void setMTPREVU_0005(Float MTPREVU_0005) {
        this.MTPREVU_0005 = MTPREVU_0005;
    }

    public Float getMTPREVU_0006() {
        return MTPREVU_0006;
    }

    public void setMTPREVU_0006(Float MTPREVU_0006) {
        this.MTPREVU_0006 = MTPREVU_0006;
    }

    public Float getMTREEL_0001() {
        return MTREEL_0001;
    }

    public void setMTREEL_0001(Float MTREEL_0001) {
        this.MTREEL_0001 = MTREEL_0001;
    }

    public Float getMTREEL_0002() {
        return MTREEL_0002;
    }

    public void setMTREEL_0002(Float MTREEL_0002) {
        this.MTREEL_0002 = MTREEL_0002;
    }

    public Float getMTREEL_0003() {
        return MTREEL_0003;
    }

    public void setMTREEL_0003(Float MTREEL_0003) {
        this.MTREEL_0003 = MTREEL_0003;
    }

    public Float getMTREEL_0004() {
        return MTREEL_0004;
    }

    public void setMTREEL_0004(Float MTREEL_0004) {
        this.MTREEL_0004 = MTREEL_0004;
    }

    public Float getMTREEL_0005() {
        return MTREEL_0005;
    }

    public void setMTREEL_0005(Float MTREEL_0005) {
        this.MTREEL_0005 = MTREEL_0005;
    }

    public Float getMTREEL_0006() {
        return MTREEL_0006;
    }

    public void setMTREEL_0006(Float MTREEL_0006) {
        this.MTREEL_0006 = MTREEL_0006;
    }

    public Float getTPSPREVU_0001() {
        return TPSPREVU_0001;
    }

    public void setTPSPREVU_0001(Float TPSPREVU_0001) {
        this.TPSPREVU_0001 = TPSPREVU_0001;
    }

    public Float getTPSPREVU_0002() {
        return TPSPREVU_0002;
    }

    public void setTPSPREVU_0002(Float TPSPREVU_0002) {
        this.TPSPREVU_0002 = TPSPREVU_0002;
    }

    public Float getTPSPREVU_0003() {
        return TPSPREVU_0003;
    }

    public void setTPSPREVU_0003(Float TPSPREVU_0003) {
        this.TPSPREVU_0003 = TPSPREVU_0003;
    }

    public Float getTPSREEL_0001() {
        return TPSREEL_0001;
    }

    public void setTPSREEL_0001(Float TPSREEL_0001) {
        this.TPSREEL_0001 = TPSREEL_0001;
    }

    public Float getTPSREEL_0002() {
        return TPSREEL_0002;
    }

    public void setTPSREEL_0002(Float TPSREEL_0002) {
        this.TPSREEL_0002 = TPSREEL_0002;
    }

    public Float getTPSREEL_0003() {
        return TPSREEL_0003;
    }

    public void setTPSREEL_0003(Float TPSREEL_0003) {
        this.TPSREEL_0003 = TPSREEL_0003;
    }

    public int getQTE_OF_ENTETE() {
        return QTE_OF_ENTETE;
    }

    public void setQTE_OF_ENTETE(int QTE_OF_ENTETE) {
        this.QTE_OF_ENTETE = QTE_OF_ENTETE;
    }

    public int getQTECDE() {
        return QTECDE;
    }

    public void setQTECDE(int QTECDE) {
        this.QTECDE = QTECDE;
    }

    public int getQTEBL() {
        return QTEBL;
    }

    public void setQTEBL(int QTEBL) {
        this.QTEBL = QTEBL;
    }

    public int getQTEREBUTBL() {
        return QTEREBUTBL;
    }

    public void setQTEREBUTBL(int QTEREBUTBL) {
        this.QTEREBUTBL = QTEREBUTBL;
    }

    public int getINDICSUIVIREAPPRO() {
        return INDICSUIVIREAPPRO;
    }

    public void setINDICSUIVIREAPPRO(int INDICSUIVIREAPPRO) {
        this.INDICSUIVIREAPPRO = INDICSUIVIREAPPRO;
    }

    public int getINDICRESERVESTOCK() {
        return INDICRESERVESTOCK;
    }

    public void setINDICRESERVESTOCK(int INDICRESERVESTOCK) {
        this.INDICRESERVESTOCK = INDICRESERVESTOCK;
    }

    public int getDELAIFAB() {
        return DELAIFAB;
    }

    public void setDELAIFAB(int DELAIFAB) {
        this.DELAIFAB = DELAIFAB;
    }

    public int getQTENOMENCLATURE() {
        return QTENOMENCLATURE;
    }

    public void setQTENOMENCLATURE(int QTENOMENCLATURE) {
        this.QTENOMENCLATURE = QTENOMENCLATURE;
    }

    public int getQTEREBUT() {
        return QTEREBUT;
    }

    public void setQTEREBUT(int QTEREBUT) {
        this.QTEREBUT = QTEREBUT;
    }

    public int getQTELANCEE() {
        return QTELANCEE;
    }

    public void setQTELANCEE(int QTELANCEE) {
        this.QTELANCEE = QTELANCEE;
    }

    public Float getVALEURCOEF_0001() {
        return VALEURCOEF_0001;
    }

    public void setVALEURCOEF_0001(Float VALEURCOEF_0001) {
        this.VALEURCOEF_0001 = VALEURCOEF_0001;
    }

    public Float getVALEURCOEF_0002() {
        return VALEURCOEF_0002;
    }

    public void setVALEURCOEF_0002(Float VALEURCOEF_0002) {
        this.VALEURCOEF_0002 = VALEURCOEF_0002;
    }

    public Float getVALEURCOEF_0003() {
        return VALEURCOEF_0003;
    }

    public void setVALEURCOEF_0003(Float VALEURCOEF_0003) {
        this.VALEURCOEF_0003 = VALEURCOEF_0003;
    }

    public Float getVALEURCOEF_0004() {
        return VALEURCOEF_0004;
    }

    public void setVALEURCOEF_0004(Float VALEURCOEF_0004) {
        this.VALEURCOEF_0004 = VALEURCOEF_0004;
    }

    public Float getVALEURCOEF_0005() {
        return VALEURCOEF_0005;
    }

    public void setVALEURCOEF_0005(Float VALEURCOEF_0005) {
        this.VALEURCOEF_0005 = VALEURCOEF_0005;
    }

    public Float getVALEURCOEF_0006() {
        return VALEURCOEF_0006;
    }

    public void setVALEURCOEF_0006(Float VALEURCOEF_0006) {
        this.VALEURCOEF_0006 = VALEURCOEF_0006;
    }

    public Float getVALEURCST_0001() {
        return VALEURCST_0001;
    }

    public void setVALEURCST_0001(Float VALEURCST_0001) {
        this.VALEURCST_0001 = VALEURCST_0001;
    }

    public Float getVALEURCST_0002() {
        return VALEURCST_0002;
    }

    public void setVALEURCST_0002(Float VALEURCST_0002) {
        this.VALEURCST_0002 = VALEURCST_0002;
    }

    public Float getVALEURCST_0003() {
        return VALEURCST_0003;
    }

    public void setVALEURCST_0003(Float VALEURCST_0003) {
        this.VALEURCST_0003 = VALEURCST_0003;
    }

    public Float getVALEURCST_0004() {
        return VALEURCST_0004;
    }

    public void setVALEURCST_0004(Float VALEURCST_0004) {
        this.VALEURCST_0004 = VALEURCST_0004;
    }

    public Float getVALEURCST_0005() {
        return VALEURCST_0005;
    }

    public void setVALEURCST_0005(Float VALEURCST_0005) {
        this.VALEURCST_0005 = VALEURCST_0005;
    }

    public int getTYPEJALON() {
        return TYPEJALON;
    }

    public void setTYPEJALON(int TYPEJALON) {
        this.TYPEJALON = TYPEJALON;
    }

    public int getTYPEDELAIDEMANDE() {
        return TYPEDELAIDEMANDE;
    }

    public void setTYPEDELAIDEMANDE(int TYPEDELAIDEMANDE) {
        this.TYPEDELAIDEMANDE = TYPEDELAIDEMANDE;
    }

    public int getOFSUSPENDU() {
        return OFSUSPENDU;
    }

    public void setOFSUSPENDU(int OFSUSPENDU) {
        this.OFSUSPENDU = OFSUSPENDU;
    }

    public int getHISTORISATIONNO() {
        return HISTORISATIONNO;
    }

    public void setHISTORISATIONNO(int HISTORISATIONNO) {
        this.HISTORISATIONNO = HISTORISATIONNO;
    }

    public int getOFMODIFIE() {
        return OFMODIFIE;
    }

    public void setOFMODIFIE(int OFMODIFIE) {
        this.OFMODIFIE = OFMODIFIE;
    }

    public int getOFCONTRAINTE() {
        return OFCONTRAINTE;
    }

    public void setOFCONTRAINTE(int OFCONTRAINTE) {
        this.OFCONTRAINTE = OFCONTRAINTE;
    }

    public int getEXPORTCOD() {
        return EXPORTCOD;
    }

    public void setEXPORTCOD(int EXPORTCOD) {
        this.EXPORTCOD = EXPORTCOD;
    }

    @Override
    public String toString() {
        return "OfComposant [ofComposant=" + id + " - " + PIECENO + ", ref=" + REFERENCE + "]";
    }

}
