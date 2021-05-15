package cm.gov.minfof.model.entity;

import cm.gov.minfof.model.entity.common.*;
import cm.gov.minfof.model.entityviewobject.CategorieunitemesureViewImpl;
import cm.gov.minfof.model.entityviewobject.CollMultiCritereImpl;
import cm.gov.minfof.model.entityviewobject.CollecteMultiImpl;
import cm.gov.minfof.model.entityviewobject.DepartementEtRegionViewImpl;
import cm.gov.minfof.model.entityviewobject.LocaliteLettreVoitureImpl;
import cm.gov.minfof.model.entityviewobject.NiveauValidationViewImpl;
import cm.gov.minfof.model.entityviewobject.AgrementsViewImpl;
import cm.gov.minfof.model.entityviewobject.CategorieproduitViewImpl;
import cm.gov.minfof.model.entityviewobject.CollectepfnlViewImpl;
import cm.gov.minfof.model.entityviewobject.CommuneViewImpl;
import cm.gov.minfof.model.entityviewobject.DepartementViewImpl;
import cm.gov.minfof.model.entityviewobject.DetailpermisViewImpl;
import cm.gov.minfof.model.entityviewobject.DetailscollectepfnlViewImpl;
import cm.gov.minfof.model.entityviewobject.DetailsexportpfnlViewImpl;
import cm.gov.minfof.model.entityviewobject.DetailslettrevoitureViewImpl;
import cm.gov.minfof.model.entityviewobject.ExportpfnlViewImpl;
import cm.gov.minfof.model.entityviewobject.LettrevoitureViewImpl;
import cm.gov.minfof.model.entityviewobject.OriginespnflsViewImpl;
import cm.gov.minfof.model.entityviewobject.PaysViewImpl;
import cm.gov.minfof.model.entityviewobject.PermisViewImpl;
import cm.gov.minfof.model.entityviewobject.PermissionnairespnflViewImpl;
import cm.gov.minfof.model.entityviewobject.PosteControleCompletImpl;
import cm.gov.minfof.model.entityviewobject.PostecontroleViewImpl;

import cm.gov.minfof.model.entityviewobject.RegionViewImpl;
import cm.gov.minfof.model.entityviewobject.TransporteurViewImpl;
import cm.gov.minfof.model.entityviewobject.TypeacteurViewImpl;
import cm.gov.minfof.model.entityviewobject.UniteMesureWithPartieProduitPfnlImpl;
import cm.gov.minfof.model.entityviewobject.UnitemesureViewImpl;
import cm.gov.minfof.model.entityviewobject.UtilisateurViewImpl;
import cm.gov.minfof.model.entityviewobject.VehiculeViewImpl;
import cm.gov.minfof.model.entityviewobject.gestLastIdUnitMesureImpl;
import cm.gov.minfof.model.entityviewobject.getCodeSigifPosteControleImpl;
import cm.gov.minfof.model.entityviewobject.getExportDocumentsOfficielsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIcCollecteImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCategorieUniteMesureImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCommunesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDepartementsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDetailsexportImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdExportImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdFamillesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdOriginePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPartiesRecolteesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPaysImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPermissionnairePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdProduitsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdRegionsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdartiesProduitsPfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleFixeImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleProduitPfnlImpl;
import cm.gov.minfof.model.entityviewobject.listeExploitantImpl;
import cm.gov.minfof.model.entityviewobject.listeOrigineImpl;
import cm.gov.minfof.model.entityviewobject.listeQualitePermissionnaireImpl;
import cm.gov.minfof.model.entityviewobject.listeSexeImpl;
import cm.gov.minfof.model.entityviewobject.listeStatutPermissionnaireImpl;
import cm.gov.minfof.model.entityviewobject.listeTypePersonneImpl;
import cm.gov.minfof.model.entityviewobject.localiteCompletImpl;
import cm.gov.minfof.model.entityviewobject.permisActifViewImpl;
import cm.gov.minfof.model.entityviewobject.typeDocViewFinalImpl;
import cm.gov.minfof.model.entityviewobject.typeDocumentViewImpl;

import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;

import cm.gov.minfof.model.entityviewobject.getLastIcCollecteImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCategorieUniteMesureImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCollectePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCommunesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDepartementsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDetailsCollecteImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDetailsexportImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdExportImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdFamillesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdOriginePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPartiesRecolteesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPaysImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPermissionnairePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdProduitsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdRegionsImpl;

import cm.gov.minfof.model.entityviewobject.getLastIdartiesProduitsPfnlImpl;

import cm.gov.minfof.model.entityviewobject.getLibelleProduitCompletImpl;
import cm.gov.minfof.model.entityviewobject.listeExploitantImpl;
import cm.gov.minfof.model.entityviewobject.listeOrigineImpl;

import cm.gov.minfof.model.entityviewobject.listeQualitePermissionnaireImpl;

import cm.gov.minfof.model.entityviewobject.listeSexeImpl;
import cm.gov.minfof.model.entityviewobject.listeStatutPermissionnaireImpl;
import cm.gov.minfof.model.entityviewobject.listeTypePersonneImpl;

import cm.gov.minfof.model.entityviewobject.permisActifViewImpl;

import cm.gov.minfof.model.entityviewobject.typeDocumentViewImpl;

import java.math.BigDecimal;

import oracle.jbo.Row;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;


//import cm.gov.minfof.model.entityviewobject.getLastIdCategorieMesureImpl;

import cm.gov.minfof.model.entityviewobject.getLastIdCategorieUniteMesureImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCollectePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdCommunesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDepartementsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdDetailsCollecteImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdFamillesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdOriginePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPartiesRecolteesImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPaysImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdPermissionnairePfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdProduitsImpl;
import cm.gov.minfof.model.entityviewobject.getLastIdRegionsImpl;

import cm.gov.minfof.model.entityviewobject.getLastIdartiesProduitsPfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleProduitPfnlImpl;
import cm.gov.minfof.model.entityviewobject.getLibelleProduitCompletImpl;
import cm.gov.minfof.model.entityviewobject.listeExploitantImpl;
import cm.gov.minfof.model.entityviewobject.listeOrigineImpl;

import cm.gov.minfof.model.entityviewobject.listeQualitePermissionnaireImpl;

import cm.gov.minfof.model.entityviewobject.listeSexeImpl;
import cm.gov.minfof.model.entityviewobject.listeStatutPermissionnaireImpl;
import cm.gov.minfof.model.entityviewobject.listeTypePersonneImpl;

import java.math.BigDecimal;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.jbo.Row;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 05 11:35:57 WAT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class AppModuleImpl extends ApplicationModuleImpl implements AppModule {
    /**
     * This is the default constructor (do not remove).
     */
    public AppModuleImpl() {
    }
    
    
    
    
    /**
     * @return
     */
    public BigDecimal creerIdRegion() {
        BigDecimal lastId=new BigDecimal(0);
        getLastIdRegionsImpl vo = this.getgetLastIdRegions1();
        vo.executeQuery();
        if (vo.hasNext()) {
            Row r = vo.next();
            lastId = (BigDecimal) r.getAttribute(0);
            //System.out.println("lastid = " + lastId);
        }
        BigDecimal un = new BigDecimal(1);
        lastId = lastId.add(un);
        return lastId;
    }
    
    /**
     * Container's getter for CommuneView1.
     * @return CommuneView1
     */
    public CommuneViewImpl getCommuneView1() {
        return (CommuneViewImpl) findViewObject("CommuneView1");
    }

    /**
     * Container's getter for DepartementView1.
     * @return DepartementView1
     */
    public DepartementViewImpl getDepartementView1() {
        return (DepartementViewImpl) findViewObject("DepartementView1");
    }

    /**
     * Container's getter for RegionView1.
     * @return RegionView1
     */
    public RegionViewImpl getRegionView1() {
        return (RegionViewImpl) findViewObject("RegionView1");
    }

    /**
     * Container's getter for RegionsView1.
     * @return RegionsView1
     */
    public ViewObjectImpl getRegionsView1() {
        return (ViewObjectImpl) findViewObject("RegionsView1");
    }

    /**
     * Container's getter for CommunesView1.
     * @return CommunesView1
     */
    public ViewObjectImpl getCommunesView1() {
        return (ViewObjectImpl) findViewObject("CommunesView1");
    }

    /**
     * Container's getter for DepartementsView1.
     * @return DepartementsView1
     */
    public ViewObjectImpl getDepartementsView1() {
        return (ViewObjectImpl) findViewObject("DepartementsView1");
    }

    /**
     * Container's getter for DepartementView2.
     * @return DepartementView2
     */
    public DepartementViewImpl getDepartementView2() {
        return (DepartementViewImpl) findViewObject("DepartementView2");
    }

    /**
     * Container's getter for DepartementView3.
     * @return DepartementView3
     */
    public DepartementViewImpl getDepartementView3() {
        return (DepartementViewImpl) findViewObject("DepartementView3");
    }

    /**
     * Container's getter for CommuneView2.
     * @return CommuneView2
     */
    public CommuneViewImpl getCommuneView2() {
        return (CommuneViewImpl) findViewObject("CommuneView2");
    }

    /**
     * Container's getter for DepartementView4.
     * @return DepartementView4
     */
    public DepartementViewImpl getDepartementView4() {
        return (DepartementViewImpl) findViewObject("DepartementView4");
    }

    /**
     * Container's getter for CommuneView3.
     * @return CommuneView3
     */
    public CommuneViewImpl getCommuneView3() {
        return (CommuneViewImpl) findViewObject("CommuneView3");
    }

    /**
     * Container's getter for CommuneView4.
     * @return CommuneView4
     */
    public CommuneViewImpl getCommuneView4() {
        return (CommuneViewImpl) findViewObject("CommuneView4");
    }

    /**
     * Container's getter for CommunesView2.
     * @return CommunesView2
     */
    public ViewObjectImpl getCommunesView2() {
        return (ViewObjectImpl) findViewObject("CommunesView2");
    }

    /**
     * Container's getter for DepartementsView2.
     * @return DepartementsView2
     */
    public ViewObjectImpl getDepartementsView2() {
        return (ViewObjectImpl) findViewObject("DepartementsView2");
    }

    /**
     * Container's getter for CommunesView3.
     * @return CommunesView3
     */
    public ViewObjectImpl getCommunesView3() {
        return (ViewObjectImpl) findViewObject("CommunesView3");
    }

    /**
     * Container's getter for DepartementsView3.
     * @return DepartementsView3
     */
    public ViewObjectImpl getDepartementsView3() {
        return (ViewObjectImpl) findViewObject("DepartementsView3");
    }

    /**
     * Container's getter for CommunesView4.
     * @return CommunesView4
     */
    public ViewObjectImpl getCommunesView4() {
        return (ViewObjectImpl) findViewObject("CommunesView4");
    }

    /**
     * Container's getter for DepartementsView4.
     * @return DepartementsView4
     */
    public ViewObjectImpl getDepartementsView4() {
        return (ViewObjectImpl) findViewObject("DepartementsView4");
    }

    /**
     * Container's getter for CommuneView5.
     * @return CommuneView5
     */
    public CommuneViewImpl getCommuneView5() {
        return (CommuneViewImpl) findViewObject("CommuneView5");
    }

    /**
     * Container's getter for FamillePfnlView1.
     * @return FamillePfnlView1
     */
    public FamillePfnlViewImpl getFamillePfnlView1() {
        return (FamillePfnlViewImpl) findViewObject("FamillePfnlView1");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView1.
     * @return PartiesProduitsPfnlView1
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView1() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView1");
    }

    /**
     * Container's getter for PartiesRecolteesView1.
     * @return PartiesRecolteesView1
     */
    public PartiesRecolteesViewImpl getPartiesRecolteesView1() {
        return (PartiesRecolteesViewImpl) findViewObject("PartiesRecolteesView1");
    }

    /**
     * Container's getter for ProduitsPfnlView1.
     * @return ProduitsPfnlView1
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView1() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView1");
    }

    /**
     * Container's getter for ProduitspfnlView2.
     * @return ProduitspfnlView2
     */
    public ViewObjectImpl getProduitspfnlView2() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView2");
    }

    /**
     * Container's getter for PartiesrecolteesView2.
     * @return PartiesrecolteesView2
     */
    public ViewObjectImpl getPartiesrecolteesView2() {
        return (ViewObjectImpl) findViewObject("PartiesrecolteesView2");
    }

    /**
     * Container's getter for PartiesproduitspfnlView2.
     * @return PartiesproduitspfnlView2
     */
    public ViewObjectImpl getPartiesproduitspfnlView2() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView2");
    }

    /**
     * Container's getter for FamillepfnlView2.
     * @return FamillepfnlView2
     */
    public ViewObjectImpl getFamillepfnlView2() {
        return (ViewObjectImpl) findViewObject("FamillepfnlView2");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView3.
     * @return PartiesProduitsPfnlView3
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView3() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView3");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView4.
     * @return PartiesProduitsPfnlView4
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView4() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView4");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView5.
     * @return PartiesProduitsPfnlView5
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView5() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView5");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView6.
     * @return PartiesProduitsPfnlView6
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView6() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView6");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView7.
     * @return PartiesProduitsPfnlView7
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView7() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView7");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView8.
     * @return PartiesProduitsPfnlView8
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView8() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView8");
    }

    /**
     * Container's getter for ProduitsPfnlView3.
     * @return ProduitsPfnlView3
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView3() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView3");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView9.
     * @return PartiesProduitsPfnlView9
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView9() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView9");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView10.
     * @return PartiesProduitsPfnlView10
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView10() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView10");
    }

    /**
     * Container's getter for ProduitsPfnlView4.
     * @return ProduitsPfnlView4
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView4() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView4");
    }

    /**
     * Container's getter for ProduitsPfnlView5.
     * @return ProduitsPfnlView5
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView5() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView5");
    }

    /**
     * Container's getter for ProduitsPfnlView6.
     * @return ProduitsPfnlView6
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView6() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView6");
    }

    /**
     * Container's getter for ProduitspfnlView7.
     * @return ProduitspfnlView7
     */
    public ViewObjectImpl getProduitspfnlView7() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView7");
    }

    /**
     * Container's getter for PartiesproduitspfnlView11.
     * @return PartiesproduitspfnlView11
     */
    public ViewObjectImpl getPartiesproduitspfnlView11() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView11");
    }

    /**
     * Container's getter for PartiesproduitspfnlView12.
     * @return PartiesproduitspfnlView12
     */
    public ViewObjectImpl getPartiesproduitspfnlView12() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView12");
    }

    /**
     * Container's getter for ProduitspfnlView8.
     * @return ProduitspfnlView8
     */
    public ViewObjectImpl getProduitspfnlView8() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView8");
    }

    /**
     * Container's getter for PartiesproduitspfnlView13.
     * @return PartiesproduitspfnlView13
     */
    public ViewObjectImpl getPartiesproduitspfnlView13() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView13");
    }

    /**
     * Container's getter for PartiesproduitspfnlView14.
     * @return PartiesproduitspfnlView14
     */
    public ViewObjectImpl getPartiesproduitspfnlView14() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView14");
    }

    /**
     * Container's getter for ProduitspfnlView9.
     * @return ProduitspfnlView9
     */
    public ViewObjectImpl getProduitspfnlView9() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView9");
    }

    /**
     * Container's getter for PartiesproduitspfnlView15.
     * @return PartiesproduitspfnlView15
     */
    public ViewObjectImpl getPartiesproduitspfnlView15() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView15");
    }

    /**
     * Container's getter for PartiesproduitspfnlView16.
     * @return PartiesproduitspfnlView16
     */
    public ViewObjectImpl getPartiesproduitspfnlView16() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView16");
    }

    /**
     * Container's getter for ProduitspfnlView10.
     * @return ProduitspfnlView10
     */
    public ViewObjectImpl getProduitspfnlView10() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView10");
    }

    /**
     * Container's getter for PartiesproduitspfnlView17.
     * @return PartiesproduitspfnlView17
     */
    public ViewObjectImpl getPartiesproduitspfnlView17() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView17");
    }

    /**
     * Container's getter for PartiesproduitspfnlView18.
     * @return PartiesproduitspfnlView18
     */
    public ViewObjectImpl getPartiesproduitspfnlView18() {
        return (ViewObjectImpl) findViewObject("PartiesproduitspfnlView18");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView19.
     * @return PartiesProduitsPfnlView19
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView19() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView19");
    }

    /**
     * Container's getter for DepartementsIbfk1Link1.
     * @return DepartementsIbfk1Link1
     */
    public ViewLinkImpl getDepartementsIbfk1Link1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Link1");
    }

    /**
     * Container's getter for DepartementsIbfk1Assoc1Link1.
     * @return DepartementsIbfk1Assoc1Link1
     */
    public ViewLinkImpl getDepartementsIbfk1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Assoc1Link1");
    }

    /**
     * Container's getter for CommunesIbfk1Link1.
     * @return CommunesIbfk1Link1
     */
    public ViewLinkImpl getCommunesIbfk1Link1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Link1");
    }

    /**
     * Container's getter for DepartementsIbfk1Assoc2Link1.
     * @return DepartementsIbfk1Assoc2Link1
     */
    public ViewLinkImpl getDepartementsIbfk1Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Assoc2Link1");
    }

    /**
     * Container's getter for CommunesIbfk1Assoc1Link1.
     * @return CommunesIbfk1Assoc1Link1
     */
    public ViewLinkImpl getCommunesIbfk1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Assoc1Link1");
    }

    /**
     * Container's getter for CommunesIbfk1Assoc2Link1.
     * @return CommunesIbfk1Assoc2Link1
     */
    public ViewLinkImpl getCommunesIbfk1Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Assoc2Link1");
    }

    /**
     * Container's getter for CommunesIbfk1Link2.
     * @return CommunesIbfk1Link2
     */
    public ViewLinkImpl getCommunesIbfk1Link2() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Link2");
    }

    /**
     * Container's getter for DepartementsIbfk1Link2.
     * @return DepartementsIbfk1Link2
     */
    public ViewLinkImpl getDepartementsIbfk1Link2() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Link2");
    }

    /**
     * Container's getter for CommunesIbfk1Link1_1.
     * @return CommunesIbfk1Link1_1
     */
    public ViewLinkImpl getCommunesIbfk1Link1_1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Link1_1");
    }

    /**
     * Container's getter for DepartementsIbfk1Link1_1.
     * @return DepartementsIbfk1Link1_1
     */
    public ViewLinkImpl getDepartementsIbfk1Link1_1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Link1_1");
    }

    /**
     * Container's getter for CommunesIbfk1Link2_1.
     * @return CommunesIbfk1Link2_1
     */
    public ViewLinkImpl getCommunesIbfk1Link2_1() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Link2_1");
    }

    /**
     * Container's getter for DepartementsIbfk1Link2_1.
     * @return DepartementsIbfk1Link2_1
     */
    public ViewLinkImpl getDepartementsIbfk1Link2_1() {
        return (ViewLinkImpl) findViewLink("DepartementsIbfk1Link2_1");
    }

    /**
     * Container's getter for CommunesIbfk1Assoc2Link2.
     * @return CommunesIbfk1Assoc2Link2
     */
    public ViewLinkImpl getCommunesIbfk1Assoc2Link2() {
        return (ViewLinkImpl) findViewLink("CommunesIbfk1Assoc2Link2");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link1.
     * @return FkPartiesproduitspfnl2Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link1.
     * @return FkPartiesproduitspfnl1Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc1Link1.
     * @return FkPartiesproduitspfnl2Assoc1Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc1Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc1Link1.
     * @return FkPartiesproduitspfnl1Assoc1Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc1Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc2Link1.
     * @return FkPartiesproduitspfnl2Assoc2Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc2Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc2Link1.
     * @return FkPartiesproduitspfnl1Assoc2Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc2Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link1.
     * @return ProduitspfnlIbfk1Link1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc3Link1.
     * @return FkPartiesproduitspfnl2Assoc3Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc3Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc3Link1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc3Link1.
     * @return FkPartiesproduitspfnl1Assoc3Link1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc3Link1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc3Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Assoc1Link1.
     * @return ProduitspfnlIbfk1Assoc1Link1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Assoc1Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Assoc2Link1.
     * @return ProduitspfnlIbfk1Assoc2Link1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Assoc2Link1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Assoc2Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Assoc3Link1.
     * @return ProduitspfnlIbfk1Assoc3Link1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Assoc3Link1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Assoc3Link1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link2.
     * @return ProduitspfnlIbfk1Link2
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link2() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link2");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link2.
     * @return FkPartiesproduitspfnl1Link2
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link2() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link2");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link2.
     * @return FkPartiesproduitspfnl2Link2
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link2() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link2");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link1_1.
     * @return ProduitspfnlIbfk1Link1_1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link1_1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link1_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link1_1.
     * @return FkPartiesproduitspfnl1Link1_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link1_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link1_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link1_1.
     * @return FkPartiesproduitspfnl2Link1_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link1_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link1_1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link2_1.
     * @return ProduitspfnlIbfk1Link2_1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link2_1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link2_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link2_1.
     * @return FkPartiesproduitspfnl1Link2_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link2_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link2_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link2_1.
     * @return FkPartiesproduitspfnl2Link2_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link2_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link2_1");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Link3_1.
     * @return ProduitspfnlIbfk1Link3_1
     */
    public ViewLinkImpl getProduitspfnlIbfk1Link3_1() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Link3_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Link3_1.
     * @return FkPartiesproduitspfnl1Link3_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Link3_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Link3_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Link3_1.
     * @return FkPartiesproduitspfnl2Link3_1
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Link3_1() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Link3_1");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc3Link2.
     * @return FkPartiesproduitspfnl1Assoc3Link2
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc3Link2() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc3Link2");
    }

    /**
     * Container's getter for getLastIdRegions1.
     * @return getLastIdRegions1
     */
    public getLastIdRegionsImpl getgetLastIdRegions1() {
        return (getLastIdRegionsImpl) findViewObject("getLastIdRegions1");
    }

    /**
     * Container's getter for getLastIdDepartements1.
     * @return getLastIdDepartements1
     */
    public getLastIdDepartementsImpl getgetLastIdDepartements1() {
        return (getLastIdDepartementsImpl) findViewObject("getLastIdDepartements1");
    }

    /**
     * Container's getter for getLastIdCommunes1.
     * @return getLastIdCommunes1
     */
    public getLastIdCommunesImpl getgetLastIdCommunes1() {
        return (getLastIdCommunesImpl) findViewObject("getLastIdCommunes1");
    }

    /**
     * Container's getter for getLastIdFamilles1.
     * @return getLastIdFamilles1
     */
    public getLastIdFamillesImpl getgetLastIdFamilles1() {
        return (getLastIdFamillesImpl) findViewObject("getLastIdFamilles1");
    }

    /**
     * Container's getter for getLastIdProduits1.
     * @return getLastIdProduits1
     */
    public getLastIdProduitsImpl getgetLastIdProduits1() {
        return (getLastIdProduitsImpl) findViewObject("getLastIdProduits1");
    }

    /**
     * Container's getter for getLastIdPartiesRecoltees1.
     * @return getLastIdPartiesRecoltees1
     */
    public getLastIdPartiesRecolteesImpl getgetLastIdPartiesRecoltees1() {
        return (getLastIdPartiesRecolteesImpl) findViewObject("getLastIdPartiesRecoltees1");
    }

    /**
     * Container's getter for getLastIdartiesProduitsPfnl1.
     * @return getLastIdartiesProduitsPfnl1
     */
    public getLastIdartiesProduitsPfnlImpl getgetLastIdartiesProduitsPfnl1() {
        return (getLastIdartiesProduitsPfnlImpl) findViewObject("getLastIdartiesProduitsPfnl1");
    }

    /**
     * Container's getter for PaysView1.
     * @return PaysView1
     */
    public PaysViewImpl getPaysView1() {
        return (PaysViewImpl) findViewObject("PaysView1");
    }

    /**
     * Container's getter for PaysView1_1.
     * @return PaysView1_1
     */
    public ViewObjectImpl getPaysView1_1() {
        return (ViewObjectImpl) findViewObject("PaysView1_1");
    }

    /**
     * Container's getter for getLastIdPays1.
     * @return getLastIdPays1
     */
    public getLastIdPaysImpl getgetLastIdPays1() {
        return (getLastIdPaysImpl) findViewObject("getLastIdPays1");
    }

    /**
     * Container's getter for OriginespnflsView1.
     * @return OriginespnflsView1
     */
    public OriginespnflsViewImpl getOriginespnflsView1() {
        return (OriginespnflsViewImpl) findViewObject("OriginespnflsView1");
    }

    /**
     * Container's getter for OriginespnflsView1_1.
     * @return OriginespnflsView1_1
     */
    public ViewObjectImpl getOriginespnflsView1_1() {
        return (ViewObjectImpl) findViewObject("OriginespnflsView1_1");
    }

    /**
     * Container's getter for origineView1.
     * @return origineView1
     */
 //   public origineViewImpl getorigineView1() {
 //       return (origineViewImpl) findViewObject("origineView1");
 //   }

    /**
     * Container's getter for listeOrigine1.
     * @return listeOrigine1
     */
    public listeOrigineImpl getlisteOrigine1() {
        return (listeOrigineImpl) findViewObject("listeOrigine1");
    }

    /**
     * Container's getter for getLastIdOriginePfnl1.
     * @return getLastIdOriginePfnl1
     */
    public getLastIdOriginePfnlImpl getgetLastIdOriginePfnl1() {
        return (getLastIdOriginePfnlImpl) findViewObject("getLastIdOriginePfnl1");
    }

    /**
     * Container's getter for AgrementsView1.
     * @return AgrementsView1
     */
    public AgrementsViewImpl getAgrementsView1() {
        return (AgrementsViewImpl) findViewObject("AgrementsView1");
    }

    /**
     * Container's getter for PermissionnairespnflView1.
     * @return PermissionnairespnflView1
     */
    public PermissionnairespnflViewImpl getPermissionnairespnflView1() {
        return (PermissionnairespnflViewImpl) findViewObject("PermissionnairespnflView1");
    }

    /**
     * Container's getter for PermissionnairespnflView1_1.
     * @return PermissionnairespnflView1_1
     */
    public ViewObjectImpl getPermissionnairespnflView1_1() {
        return (ViewObjectImpl) findViewObject("PermissionnairespnflView1_1");
    }

    /**
     * Container's getter for AgrementsView1_1.
     * @return AgrementsView1_1
     */
    public ViewObjectImpl getAgrementsView1_1() {
        return (ViewObjectImpl) findViewObject("AgrementsView1_1");
    }


    /**
     * Container's getter for listeExploitant1.
     * @return listeExploitant1
     */
    public listeExploitantImpl getlisteExploitant1() {
        return (listeExploitantImpl) findViewObject("listeExploitant1");
    }

    /**
     * Container's getter for listeQualitePermissionnaire1.
     * @return listeQualitePermissionnaire1
     */
    public listeQualitePermissionnaireImpl getlisteQualitePermissionnaire1() {
        return (listeQualitePermissionnaireImpl) findViewObject("listeQualitePermissionnaire1");
    }

    /**
     * Container's getter for listeTypePersonne1.
     * @return listeTypePersonne1
     */
    public listeTypePersonneImpl getlisteTypePersonne1() {
        return (listeTypePersonneImpl) findViewObject("listeTypePersonne1");
    }

    /**
     * Container's getter for listeSexe1.
     * @return listeSexe1
     */
    public listeSexeImpl getlisteSexe1() {
        return (listeSexeImpl) findViewObject("listeSexe1");
    }

    /**
     * Container's getter for listeStatutPermissionnaire1.
     * @return listeStatutPermissionnaire1
     */
    public listeStatutPermissionnaireImpl getlisteStatutPermissionnaire1() {
        return (listeStatutPermissionnaireImpl) findViewObject("listeStatutPermissionnaire1");
    }

    /**
     * Container's getter for getLastIdPermissionnairePfnl1.
     * @return getLastIdPermissionnairePfnl1
     */
    public getLastIdPermissionnairePfnlImpl getgetLastIdPermissionnairePfnl1() {
        return (getLastIdPermissionnairePfnlImpl) findViewObject("getLastIdPermissionnairePfnl1");
    }

    /**
     * Container's getter for getlastidagrement1.
     * @return getlastidagrement1
     */
    public ViewObjectImpl getgetlastidagrement1() {
        return (ViewObjectImpl) findViewObject("getlastidagrement1");
    }


    /**
     * Container's getter for PaysView2.
     * @return PaysView2
     */
    public PaysViewImpl getPaysView2() {
        return (PaysViewImpl) findViewObject("PaysView2");
    }


    /**
     * Container's getter for CommuneView7.
     * @return CommuneView7
     */
    public CommuneViewImpl getCommuneView7() {
        return (CommuneViewImpl) findViewObject("CommuneView7");
    }


    /**
     * Container's getter for PermissionnairespnflView4.
     * @return PermissionnairespnflView4
     */
    public PermissionnairespnflViewImpl getPermissionnairespnflView4() {
        return (PermissionnairespnflViewImpl) findViewObject("PermissionnairespnflView4");
    }


    /**
     * Container's getter for OriginespnflsView2.
     * @return OriginespnflsView2
     */
    public OriginespnflsViewImpl getOriginespnflsView2() {
        return (OriginespnflsViewImpl) findViewObject("OriginespnflsView2");
    }


    /**
     * Container's getter for RegionView2.
     * @return RegionView2
     */
    public RegionViewImpl getRegionView2() {
        return (RegionViewImpl) findViewObject("RegionView2");
    }


    /**
     * Container's getter for DepartementView6.
     * @return DepartementView6
     */
    public DepartementViewImpl getDepartementView6() {
        return (DepartementViewImpl) findViewObject("DepartementView6");
    }


    /**
     * Container's getter for PaysView3.
     * @return PaysView3
     */
    public PaysViewImpl getPaysView3() {
        return (PaysViewImpl) findViewObject("PaysView3");
    }


    /**
     * Container's getter for CommuneView8.
     * @return CommuneView8
     */
    public CommuneViewImpl getCommuneView8() {
        return (CommuneViewImpl) findViewObject("CommuneView8");
    }


    /**
     * Container's getter for PermissionnairespnflView5.
     * @return PermissionnairespnflView5
     */
    public PermissionnairespnflViewImpl getPermissionnairespnflView5() {
        return (PermissionnairespnflViewImpl) findViewObject("PermissionnairespnflView5");
    }


    /**
     * Container's getter for OriginespnflsView3.
     * @return OriginespnflsView3
     */
    public OriginespnflsViewImpl getOriginespnflsView3() {
        return (OriginespnflsViewImpl) findViewObject("OriginespnflsView3");
    }


    /**
     * Container's getter for RegionView3.
     * @return RegionView3
     */
    public RegionViewImpl getRegionView3() {
        return (RegionViewImpl) findViewObject("RegionView3");
    }


    /**
     * Container's getter for DepartementView7.
     * @return DepartementView7
     */
    public DepartementViewImpl getDepartementView7() {
        return (DepartementViewImpl) findViewObject("DepartementView7");
    }


    /**
     * Container's getter for PermisView1.
     * @return PermisView1
     */
    public PermisViewImpl getPermisView1() {
        return (PermisViewImpl) findViewObject("PermisView1");
    }

    /**
     * Container's getter for PermisView2.
     * @return PermisView2
     */
    public PermisViewImpl getPermisView2() {
        return (PermisViewImpl) findViewObject("PermisView2");
    }

    /**
     * Container's getter for PermisView3.
     * @return PermisView3
     */
    public PermisViewImpl getPermisView3() {
        return (PermisViewImpl) findViewObject("PermisView3");
    }

    /**
     * Container's getter for FkPermis2Link1.
     * @return FkPermis2Link1
     */
    public ViewLinkImpl getFkPermis2Link1() {
        return (ViewLinkImpl) findViewLink("FkPermis2Link1");
    }

    /**
     * Container's getter for FkPermis1Link1.
     * @return FkPermis1Link1
     */
    public ViewLinkImpl getFkPermis1Link1() {
        return (ViewLinkImpl) findViewLink("FkPermis1Link1");
    }

    /**
     * Container's getter for GetLastidPermis2.
     * @return GetLastidPermis2
     */
    public ViewObjectImpl getgetLastidPermis1() {
        return (ViewObjectImpl) findViewObject("getLastidPermis1");
       } 
    /**

     * Container's getter for CategorieunitemesureView1.
     * @return CategorieunitemesureView1
     */
    public CategorieunitemesureViewImpl getCategorieunitemesureView1() {
        return (CategorieunitemesureViewImpl) findViewObject("CategorieunitemesureView1");
    }

    /**
     * Container's getter for CategorieunitemesureView1_1.
     * @return CategorieunitemesureView1_1
     */
    public ViewObjectImpl getCategorieunitemesureView1_1() {
        return (ViewObjectImpl) findViewObject("CategorieunitemesureView1_1");
    }

    /**
     * Container's getter for getLastIdCategorieMesure1.
     * @return getLastIdCategorieMesure1
     */
//    public getLastIdCategorieMesureImpl getgetLastIdCategorieMesure1() {
//        return (getLastIdCategorieMesureImpl) findViewObject("getLastIdCategorieMesure1");
//    }

    /**
     * Container's getter for getLastIdCategorieUniteMesure1.
     * @return getLastIdCategorieUniteMesure1
     */
    public getLastIdCategorieUniteMesureImpl getgetLastIdCategorieUniteMesure1() {
        return (getLastIdCategorieUniteMesureImpl) findViewObject("getLastIdCategorieUniteMesure1");
    }

    /**
     * Container's getter for UnitemesureView1.
     * @return UnitemesureView1
     */
    public UnitemesureViewImpl getUnitemesureView1() {
        return (UnitemesureViewImpl) findViewObject("UnitemesureView1");
    }

    /**
     * Container's getter for UnitemesureView1_1.
     * @return UnitemesureView1_1
     */
    public ViewObjectImpl getUnitemesureView1_1() {
        return (ViewObjectImpl) findViewObject("UnitemesureView1_1");
    }

    /**
     * Container's getter for UnitemesureView2.
     * @return UnitemesureView2
     */
    public UnitemesureViewImpl getUnitemesureView2() {
        return (UnitemesureViewImpl) findViewObject("UnitemesureView2");
    }

    /**
     * Container's getter for UnitemesureView1_2.
     * @return UnitemesureView1_2
     */
    public ViewObjectImpl getUnitemesureView1_2() {
        return (ViewObjectImpl) findViewObject("UnitemesureView1_2");
    }

    /**
     * Container's getter for FkUnitemesure1Link1.
     * @return FkUnitemesure1Link1
     */
    public ViewLinkImpl getFkUnitemesure1Link1() {
        return (ViewLinkImpl) findViewLink("FkUnitemesure1Link1");
    }

    /**
     * Container's getter for FkUnitemesure1Link2.
     * @return FkUnitemesure1Link2
     */
    public ViewLinkImpl getFkUnitemesure1Link2() {
        return (ViewLinkImpl) findViewLink("FkUnitemesure1Link2");
    }

    /**
     * Container's getter for CategorieunitemesureView2.
     * @return CategorieunitemesureView2
     */
    public CategorieunitemesureViewImpl getCategorieunitemesureView2() {
        return (CategorieunitemesureViewImpl) findViewObject("CategorieunitemesureView2");
    }


    /**
     * Container's getter for CategorieunitemesureView3.
     * @return CategorieunitemesureView3
     */
    public CategorieunitemesureViewImpl getCategorieunitemesureView3() {
        return (CategorieunitemesureViewImpl) findViewObject("CategorieunitemesureView3");
    }


    /**
     * Container's getter for CategorieunitemesureView5.
     * @return CategorieunitemesureView5
     */
    public CategorieunitemesureViewImpl getCategorieunitemesureView5() {
        return (CategorieunitemesureViewImpl) findViewObject("CategorieunitemesureView5");
    }

    /**
     * Container's getter for CategToUnitLink1.
     * @return CategToUnitLink1
     */
    public ViewLinkImpl getCategToUnitLink1() {
        return (ViewLinkImpl) findViewLink("CategToUnitLink1");
    }

    /**
     * Container's getter for UnitemesureView4.
     * @return UnitemesureView4
     */
    public UnitemesureViewImpl getUnitemesureView4() {
        return (UnitemesureViewImpl) findViewObject("UnitemesureView4");
    }

    /**
     * Container's getter for CategToUnitLink2.
     * @return CategToUnitLink2
     */
    public ViewLinkImpl getCategToUnitLink2() {
        return (ViewLinkImpl) findViewLink("CategToUnitLink2");
    }

    /**
     * Container's getter for CategorieunitemesureView6.
     * @return CategorieunitemesureView6
     */
    public CategorieunitemesureViewImpl getCategorieunitemesureView6() {
        return (CategorieunitemesureViewImpl) findViewObject("CategorieunitemesureView6");
    }

    /**
     * Container's getter for gestLastIdUnitMesure1.
     * @return gestLastIdUnitMesure1
     */
    public gestLastIdUnitMesureImpl getgetLastIdUnitMesure1() {
        return (gestLastIdUnitMesureImpl) findViewObject("getLastIdUnitMesure1");
    }

    /**
     * Container's getter for listOrdreGrandeur1.
     * @return listOrdreGrandeur1
     */
    public listOrdreGrandeurImpl getlistOrdreGrandeur1() {
        return (listOrdreGrandeurImpl) findViewObject("listOrdreGrandeur1");
    }

    /**
     * Container's getter for CategorieproduitView1.
     * @return CategorieproduitView1
     */
    public CategorieproduitViewImpl getCategorieproduitView1() {
        return (CategorieproduitViewImpl) findViewObject("CategorieproduitView1");
    }

    /**
     * Container's getter for CategorieproduitView2.
     * @return CategorieproduitView2
     */
    public ViewObjectImpl getCategorieproduitView2() {
        return (ViewObjectImpl) findViewObject("CategorieproduitView2");
    }

    /**
     * Container's getter for getLastIdCategorieProduit1.
     * @return getLastIdCategorieProduit1
     */
    public ViewObjectImpl getgetLastIdCategorieProduit1() {
        return (ViewObjectImpl) findViewObject("getLastIdCategorieProduit1");
    }

    /**
     * Container's getter for CategorieproduitView3.
     * @return CategorieproduitView3
     */
    public CategorieproduitViewImpl getCategorieproduitView3() {
        return (CategorieproduitViewImpl) findViewObject("CategorieproduitView3");
    }

    /**
     * Container's getter for ProduitspfnlView11.
     * @return ProduitspfnlView11
     */
    public ViewObjectImpl getProduitspfnlView11() {
        return (ViewObjectImpl) findViewObject("ProduitspfnlView11");
    }

    /**
     * Container's getter for CategToProduitLink.
     * @return CategToProduitLink
     */
    public ViewLinkImpl getCategToProduitLink() {
        return (ViewLinkImpl) findViewLink("CategToProduitLink");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView20.
     * @return PartiesProduitsPfnlView20
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView20() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView20");
    }

    /**
     * Container's getter for UnitemesureView5.
     * @return UnitemesureView5
     */
    public UnitemesureViewImpl getUnitemesureView5() {
        return (UnitemesureViewImpl) findViewObject("UnitemesureView5");
    }

    /**
     * Container's getter for PartieProdToUniteMesureLink.
     * @return PartieProdToUniteMesureLink
     */
    public ViewLinkImpl getPartieProdToUniteMesureLink() {
        return (ViewLinkImpl) findViewLink("PartieProdToUniteMesureLink");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView21.
     * @return PartiesProduitsPfnlView21
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView21() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView21");
    }

    /**
     * Container's getter for UnitemesureView6.
     * @return UnitemesureView6
     */
    public UnitemesureViewImpl getUnitemesureView6() {
        return (UnitemesureViewImpl) findViewObject("UnitemesureView6");
    }

    /**
     * Container's getter for PartieProdToUniteMesureExport.
     * @return PartieProdToUniteMesureExport
     */
    public ViewLinkImpl getPartieProdToUniteMesureExport() {
        return (ViewLinkImpl) findViewLink("PartieProdToUniteMesureExport");
    }

    /**
     * Container's getter for TransporteurView1.
     * @return TransporteurView1
     */
    public TransporteurViewImpl getTransporteurView1() {
        return (TransporteurViewImpl) findViewObject("TransporteurView1");
    }

    /**
     * Container's getter for TransporteurView1_1.
     * @return TransporteurView1_1
     */
    public ViewObjectImpl getTransporteurView1_1() {
        return (ViewObjectImpl) findViewObject("TransporteurView1_1");
    }

    /**
     * Container's getter for TypevehiculeView1.
     * @return TypevehiculeView1
     */
    public ViewObjectImpl getTypevehiculeView1() {
        return (ViewObjectImpl) findViewObject("TypevehiculeView1");
    }

    /**
     * Container's getter for TypevehiculeView2.
     * @return TypevehiculeView2
     */
    public ViewObjectImpl getTypevehiculeView2() {
        return (ViewObjectImpl) findViewObject("TypevehiculeView2");
    }


    /**
     * Container's getter for TransporteurView2.
     * @return TransporteurView2
     */
    public TransporteurViewImpl getTransporteurView2() {
        return (TransporteurViewImpl) findViewObject("TransporteurView2");
    }

    /**
     * Container's getter for VehiculeView5.
     * @return VehiculeView5
     */
    public VehiculeViewImpl getVehiculeView5() {
        return (VehiculeViewImpl) findViewObject("VehiculeView5");
    }

    /**
     * Container's getter for TransporteurToVehiculeLink.
     * @return TransporteurToVehiculeLink
     */
    public ViewLinkImpl getTransporteurToVehiculeLink() {
        return (ViewLinkImpl) findViewLink("TransporteurToVehiculeLink");
    }

    /**
     * Container's getter for RegionView4.
     * @return RegionView4
     */
    public RegionViewImpl getRegionView4() {
        return (RegionViewImpl) findViewObject("RegionView4");
    }

    /**
     * Container's getter for VehiculeView6.
     * @return VehiculeView6
     */
    public VehiculeViewImpl getVehiculeView6() {
        return (VehiculeViewImpl) findViewObject("VehiculeView6");
    }

    /**
     * Container's getter for RegionToVehiculeLink.
     * @return RegionToVehiculeLink
     */
    public ViewLinkImpl getRegionToVehiculeLink() {
        return (ViewLinkImpl) findViewLink("RegionToVehiculeLink");
    }

    /**
     * Container's getter for TypevehiculeView3.
     * @return TypevehiculeView3
     */
    public ViewObjectImpl getTypevehiculeView3() {
        return (ViewObjectImpl) findViewObject("TypevehiculeView3");
    }

    /**
     * Container's getter for VehiculeView7.
     * @return VehiculeView7
     */
    public VehiculeViewImpl getVehiculeView7() {
        return (VehiculeViewImpl) findViewObject("VehiculeView7");
    }

    /**
     * Container's getter for TypeVehiculeToVehiculeLink.
     * @return TypeVehiculeToVehiculeLink
     */
    public ViewLinkImpl getTypeVehiculeToVehiculeLink() {
        return (ViewLinkImpl) findViewLink("TypeVehiculeToVehiculeLink");
    }

    /**
     * Container's getter for getLastIdTransporteur1.
     * @return getLastIdTransporteur1
     */
    public ViewObjectImpl getgetLastIdTransporteur1() {
        return (ViewObjectImpl) findViewObject("getLastIdTransporteur1");
    }

    /**
     * Container's getter for getLastIdVehicule1.
     * @return getLastIdVehicule1
     */
    public ViewObjectImpl getgetLastIdVehicule1() {
        return (ViewObjectImpl) findViewObject("getLastIdVehicule1");
    }

    /**
     * Container's getter for TypeVehiculeForMeView1.
     * @return TypeVehiculeForMeView1
     */
    public ViewObjectImpl getTypeVehiculeForMeView1() {
        return (ViewObjectImpl) findViewObject("TypeVehiculeForMeView1");
    }

    /**
     * Container's getter for RegionView5.
     * @return RegionView5
     */
    public RegionViewImpl getRegionView5() {
        return (RegionViewImpl) findViewObject("RegionView5");
    }


    /**
     * Container's getter for FkLocalite1Link1.
     * @return FkLocalite1Link1
     */
    public ViewLinkImpl getFkLocalite1Link1() {
        return (ViewLinkImpl) findViewLink("FkLocalite1Link1");
    }

    /**
     * Container's getter for getLastidLocalite1.
     * @return getLastidLocalite1
     */
    public ViewObjectImpl getgetLastidLocalite1() {
        return (ViewObjectImpl) findViewObject("getLastidLocalite1");
    }

    /**
     * Container's getter for DepartementView5.
     * @return DepartementView5
     */
    public DepartementViewImpl getDepartementView5() {
        return (DepartementViewImpl) findViewObject("DepartementView5");
    }


    /**
     * Container's getter for DepartementView8.
     * @return DepartementView8
     */
    public DepartementViewImpl getDepartementView8() {
        return (DepartementViewImpl) findViewObject("DepartementView8");
    }

    /**
     * Container's getter for DepToLocaliteLink2.
     * @return DepToLocaliteLink2
     */
    public ViewLinkImpl getDepToLocaliteLink2() {
        return (ViewLinkImpl) findViewLink("DepToLocaliteLink2");
    }


    /**
     * Container's getter for getLatsidPostecontrole1.
     * @return getLatsidPostecontrole1
     */
    public ViewObjectImpl getgetLatsidPostecontrole1() {
        return (ViewObjectImpl) findViewObject("getLatsidPostecontrole1");
    }

    /**
     * Container's getter for DepartementView9.
     * @return DepartementView9
     */
    public DepartementViewImpl getDepartementView9() {
        return (DepartementViewImpl) findViewObject("DepartementView9");
    }


    /**
     * Container's getter for DetailpermisView1.
     * @return DetailpermisView1
     */
    public DetailpermisViewImpl getDetailpermisView1() {
        return (DetailpermisViewImpl) findViewObject("DetailpermisView1");
    }

    /**
     * Container's getter for DetailpermisView2.
     * @return DetailpermisView2
     */
    public DetailpermisViewImpl getDetailpermisView2() {
        return (DetailpermisViewImpl) findViewObject("DetailpermisView2");
    }

    /**
     * Container's getter for DetailpermisView3.
     * @return DetailpermisView3
     */
    public DetailpermisViewImpl getDetailpermisView3() {
        return (DetailpermisViewImpl) findViewObject("DetailpermisView3");
    }

    /**
     * Container's getter for DetailpermisView4.
     * @return DetailpermisView4
     */
    public DetailpermisViewImpl getDetailpermisView4() {
        return (DetailpermisViewImpl) findViewObject("DetailpermisView4");
    }

    /**
     * Container's getter for FkDetailpermis3Link1.
     * @return FkDetailpermis3Link1
     */
    public ViewLinkImpl getFkDetailpermis3Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailpermis3Link1");
    }

    /**
     * Container's getter for FkDetailpermis2Link1.
     * @return FkDetailpermis2Link1
     */
    public ViewLinkImpl getFkDetailpermis2Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailpermis2Link1");
    }

    /**
     * Container's getter for FkDetailpermis1Link1.
     * @return FkDetailpermis1Link1
     */
    public ViewLinkImpl getFkDetailpermis1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailpermis1Link1");
    }

    /**
     * Container's getter for getLatsidDetailpermis1.
     * @return getLatsidDetailpermis1
     */
    public ViewObjectImpl getgetLatsidDetailpermis1() {
        return (ViewObjectImpl) findViewObject("getLatsidDetailpermis1");
    }

    /**
     * Container's getter for PermisView4.
     * @return PermisView4
     */
    public PermisViewImpl getPermisView4() {
        return (PermisViewImpl) findViewObject("PermisView4");
    }

    /**
     * Container's getter for DetailpermisView5.
     * @return DetailpermisView5
     */
    public DetailpermisViewImpl getDetailpermisView5() {
        return (DetailpermisViewImpl) findViewObject("DetailpermisView5");
    }

    /**
     * Container's getter for PermisTopDetailLink.
     * @return PermisTopDetailLink
     */
    public ViewLinkImpl getPermisTopDetailLink() {
        return (ViewLinkImpl) findViewLink("PermisTopDetailLink");
    }

    /**
     * Container's getter for DetailpermisView6.
     * @return DetailpermisView6
     */
    public DetailpermisViewImpl getDetailpermisView6() {
        return (DetailpermisViewImpl) findViewObject("DetailpermisView6");
    }

    /**
     * Container's getter for PermisTopDetailLink1.
     * @return PermisTopDetailLink1
     */
    public ViewLinkImpl getPermisTopDetailLink1() {
        return (ViewLinkImpl) findViewLink("PermisTopDetailLink1");
    }

    /**
     * Container's getter for CollectepfnlView1.
     * @return CollectepfnlView1
     */
    public CollectepfnlViewImpl getCollectepfnlView1() {
        return (CollectepfnlViewImpl) findViewObject("CollectepfnlView1");
    }

    /**
     * Container's getter for CollectepfnlView2.
     * @return CollectepfnlView2
     */
    public ViewObjectImpl getCollectepfnlView2() {
        return (ViewObjectImpl) findViewObject("CollectepfnlView2");
    }

    /**
     * Container's getter for CollectepfnlView3.
     * @return CollectepfnlView3
     */
    public CollectepfnlViewImpl getCollectepfnlView3() {
        return (CollectepfnlViewImpl) findViewObject("CollectepfnlView3");
    }

    /**
     * Container's getter for CollectepfnlView4.
     * @return CollectepfnlView4
     */
    public ViewObjectImpl getCollectepfnlView4() {
        return (ViewObjectImpl) findViewObject("CollectepfnlView4");
    }

    /**
     * Container's getter for FkCollectepfnl1Link1.
     * @return FkCollectepfnl1Link1
     */
    public ViewLinkImpl getFkCollectepfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkCollectepfnl1Link1");
    }

    /**
     * Container's getter for FkCollectepfnl1Link2.
     * @return FkCollectepfnl1Link2
     */
    public ViewLinkImpl getFkCollectepfnl1Link2() {
        return (ViewLinkImpl) findViewLink("FkCollectepfnl1Link2");
    }

    /**
     * Container's getter for DetailscollectepfnlView1.
     * @return DetailscollectepfnlView1
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView1() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView1");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_1.
     * @return DetailscollectepfnlView1_1
     */
    public ViewObjectImpl getDetailscollectepfnlView1_1() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_1");
    }

    /**
     * Container's getter for DetailscollectepfnlView2.
     * @return DetailscollectepfnlView2
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView2() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView2");
    }

    /**
     * Container's getter for DetailscollectepfnlView3.
     * @return DetailscollectepfnlView3
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView3() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView3");
    }

    /**
     * Container's getter for DetailscollectepfnlView4.
     * @return DetailscollectepfnlView4
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView4() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView4");
    }

    /**
     * Container's getter for DetailscollectepfnlView5.
     * @return DetailscollectepfnlView5
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView5() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView5");
    }

    /**
     * Container's getter for DetailscollectepfnlView6.
     * @return DetailscollectepfnlView6
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView6() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView6");
    }

    /**
     * Container's getter for DetailscollectepfnlView7.
     * @return DetailscollectepfnlView7
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView7() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView7");
    }

    /**
     * Container's getter for DetailscollectepfnlView8.
     * @return DetailscollectepfnlView8
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView8() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView8");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_2.
     * @return DetailscollectepfnlView1_2
     */
    public ViewObjectImpl getDetailscollectepfnlView1_2() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_2");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_3.
     * @return DetailscollectepfnlView1_3
     */
    public ViewObjectImpl getDetailscollectepfnlView1_3() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_3");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_4.
     * @return DetailscollectepfnlView1_4
     */
    public ViewObjectImpl getDetailscollectepfnlView1_4() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_4");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_5.
     * @return DetailscollectepfnlView1_5
     */
    public ViewObjectImpl getDetailscollectepfnlView1_5() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_5");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_6.
     * @return DetailscollectepfnlView1_6
     */
    public ViewObjectImpl getDetailscollectepfnlView1_6() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_6");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_7.
     * @return DetailscollectepfnlView1_7
     */
    public ViewObjectImpl getDetailscollectepfnlView1_7() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_7");
    }

    /**
     * Container's getter for DetailscollectepfnlView1_8.
     * @return DetailscollectepfnlView1_8
     */
    public ViewObjectImpl getDetailscollectepfnlView1_8() {
        return (ViewObjectImpl) findViewObject("DetailscollectepfnlView1_8");
    }

    /**
     * Container's getter for FkDetailscollectepfnl7Link1.
     * @return FkDetailscollectepfnl7Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl7Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl7Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl6Link1.
     * @return FkDetailscollectepfnl6Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl6Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl6Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl5Link1.
     * @return FkDetailscollectepfnl5Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl5Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl5Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl4Link1.
     * @return FkDetailscollectepfnl4Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl4Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl4Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl3Link1.
     * @return FkDetailscollectepfnl3Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl3Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl3Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl2Link1.
     * @return FkDetailscollectepfnl2Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl2Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl2Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl1Link1.
     * @return FkDetailscollectepfnl1Link1
     */
    public ViewLinkImpl getFkDetailscollectepfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl1Link1");
    }

    /**
     * Container's getter for FkDetailscollectepfnl1Link2.
     * @return FkDetailscollectepfnl1Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl1Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl1Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl2Link2.
     * @return FkDetailscollectepfnl2Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl2Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl2Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl3Link2.
     * @return FkDetailscollectepfnl3Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl3Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl3Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl4Link2.
     * @return FkDetailscollectepfnl4Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl4Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl4Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl5Link2.
     * @return FkDetailscollectepfnl5Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl5Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl5Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl6Link2.
     * @return FkDetailscollectepfnl6Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl6Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl6Link2");
    }

    /**
     * Container's getter for FkDetailscollectepfnl7Link2.
     * @return FkDetailscollectepfnl7Link2
     */
    public ViewLinkImpl getFkDetailscollectepfnl7Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailscollectepfnl7Link2");
    }

    /**
     * Container's getter for CollectepfnlView5.
     * @return CollectepfnlView5
     */
    public CollectepfnlViewImpl getCollectepfnlView5() {
        return (CollectepfnlViewImpl) findViewObject("CollectepfnlView5");
    }

    /**
     * Container's getter for DetailscollectepfnlView9.
     * @return DetailscollectepfnlView9
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView9() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView9");
    }

    /**
     * Container's getter for CollecteToDetailLink.
     * @return CollecteToDetailLink
     */
    public ViewLinkImpl getCollecteToDetailLink() {
        return (ViewLinkImpl) findViewLink("CollecteToDetailLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView10.
     * @return DetailscollectepfnlView10
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView10() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView10");
    }

    /**
     * Container's getter for PermissionnairespnflView2.
     * @return PermissionnairespnflView2
     */
    public PermissionnairespnflViewImpl getPermissionnairespnflView2() {
        return (PermissionnairespnflViewImpl) findViewObject("PermissionnairespnflView2");
    }

    /**
     * Container's getter for DetailCollToPermissionnaireLink.
     * @return DetailCollToPermissionnaireLink
     */
    public ViewLinkImpl getDetailCollToPermissionnaireLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToPermissionnaireLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView11.
     * @return DetailscollectepfnlView11
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView11() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView11");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView22.
     * @return PartiesProduitsPfnlView22
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView22() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView22");
    }

    /**
     * Container's getter for DetailCollToPartieProdPfnlLink.
     * @return DetailCollToPartieProdPfnlLink
     */
    public ViewLinkImpl getDetailCollToPartieProdPfnlLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToPartieProdPfnlLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView12.
     * @return DetailscollectepfnlView12
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView12() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView12");
    }

    /**
     * Container's getter for OriginespnflsView4.
     * @return OriginespnflsView4
     */
    public OriginespnflsViewImpl getOriginespnflsView4() {
        return (OriginespnflsViewImpl) findViewObject("OriginespnflsView4");
    }

    /**
     * Container's getter for DetailCollToOriginePfnlLink.
     * @return DetailCollToOriginePfnlLink
     */
    public ViewLinkImpl getDetailCollToOriginePfnlLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToOriginePfnlLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView13.
     * @return DetailscollectepfnlView13
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView13() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView13");
    }

    /**
     * Container's getter for UnitemesureView7.
     * @return UnitemesureView7
     */
    public UnitemesureViewImpl getUnitemesureView7() {
        return (UnitemesureViewImpl) findViewObject("UnitemesureView7");
    }

    /**
     * Container's getter for DetailCollToUnitMesureLink.
     * @return DetailCollToUnitMesureLink
     */
    public ViewLinkImpl getDetailCollToUnitMesureLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToUnitMesureLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView14.
     * @return DetailscollectepfnlView14
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView14() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView14");
    }

    /**
     * Container's getter for PermisView5.
     * @return PermisView5
     */
    public PermisViewImpl getPermisView5() {
        return (PermisViewImpl) findViewObject("PermisView5");
    }

    /**
     * Container's getter for DetailCollToDocOfficielLink.
     * @return DetailCollToDocOfficielLink
     */
    public ViewLinkImpl getDetailCollToDocOfficielLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToDocOfficielLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView15.
     * @return DetailscollectepfnlView15
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView15() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView15");
    }

    /**
     * Container's getter for DepartementView10.
     * @return DepartementView10
     */
    public DepartementViewImpl getDepartementView10() {
        return (DepartementViewImpl) findViewObject("DepartementView10");
    }

    /**
     * Container's getter for DetailCollToDeptLink.
     * @return DetailCollToDeptLink
     */
    public ViewLinkImpl getDetailCollToDeptLink() {
        return (ViewLinkImpl) findViewLink("DetailCollToDeptLink");
    }

    /**
     * Container's getter for DetailscollectepfnlView16.
     * @return DetailscollectepfnlView16
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView16() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView16");
    }


    /**
     * Container's getter for DetailscollectepfnlView17.
     * @return DetailscollectepfnlView17
     */
    public DetailscollectepfnlViewImpl getDetailscollectepfnlView17() {
        return (DetailscollectepfnlViewImpl) findViewObject("DetailscollectepfnlView17");
    }

    /**
     * Container's getter for CollecteToDetailLink1.
     * @return CollecteToDetailLink1
     */
    public ViewLinkImpl getCollecteToDetailLink1() {
        return (ViewLinkImpl) findViewLink("CollecteToDetailLink1");
    }

    /**
     * Container's getter for DepartementView11.
     * @return DepartementView11
     */
    public DepartementViewImpl getDepartementView11() {
        return (DepartementViewImpl) findViewObject("DepartementView11");
    }

    /**
     * Container's getter for DetailCollToDeptLink1.
     * @return DetailCollToDeptLink1
     */
    public ViewLinkImpl getDetailCollToDeptLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToDeptLink1");
    }

    /**
     * Container's getter for UnitemesureView8.
     * @return UnitemesureView8
     */
    public UnitemesureViewImpl getUnitemesureView8() {
        return (UnitemesureViewImpl) findViewObject("UnitemesureView8");
    }

    /**
     * Container's getter for DetailCollToUnitMesureLink1.
     * @return DetailCollToUnitMesureLink1
     */
    public ViewLinkImpl getDetailCollToUnitMesureLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToUnitMesureLink1");
    }


    /**
     * Container's getter for PermissionnairespnflView3.
     * @return PermissionnairespnflView3
     */
    public PermissionnairespnflViewImpl getPermissionnairespnflView3() {
        return (PermissionnairespnflViewImpl) findViewObject("PermissionnairespnflView3");
    }

    /**
     * Container's getter for DetailCollToPermissionnaireLink1.
     * @return DetailCollToPermissionnaireLink1
     */
    public ViewLinkImpl getDetailCollToPermissionnaireLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToPermissionnaireLink1");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView23.
     * @return PartiesProduitsPfnlView23
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView23() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView23");
    }

    /**
     * Container's getter for DetailCollToPartieProdPfnlLink1.
     * @return DetailCollToPartieProdPfnlLink1
     */
    public ViewLinkImpl getDetailCollToPartieProdPfnlLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToPartieProdPfnlLink1");
    }

    /**
     * Container's getter for OriginespnflsView5.
     * @return OriginespnflsView5
     */
    public OriginespnflsViewImpl getOriginespnflsView5() {
        return (OriginespnflsViewImpl) findViewObject("OriginespnflsView5");
    }

    /**
     * Container's getter for DetailCollToOriginePfnlLink1.
     * @return DetailCollToOriginePfnlLink1
     */
    public ViewLinkImpl getDetailCollToOriginePfnlLink1() {
        return (ViewLinkImpl) findViewLink("DetailCollToOriginePfnlLink1");
    }

    /**
     * Container's getter for getLastIdCollectePfnl1.
     * @return getLastIdCollectePfnl1
     */
    public getLastIdCollectePfnlImpl getgetLastIdCollectePfnl1() {
        return (getLastIdCollectePfnlImpl) findViewObject("getLastIdCollectePfnl1");
    }

    /**
     * Container's getter for getLastIdDetailsCollecte1.
     * @return getLastIdDetailsCollecte1
     */
    public getLastIdDetailsCollecteImpl getgetLastIdDetailsCollecte1() {
        return (getLastIdDetailsCollecteImpl) findViewObject("getLastIdDetailsCollecte1");
    }


    /**
     * Container's getter for getLibellePartieProduitPfnl1.
     * @return getLibellePartieProduitPfnl1
     */
    public getLibelleProduitPfnlImpl getgetLibellePartieProduitPfnl1() {
        return (getLibelleProduitPfnlImpl) findViewObject("getLibellePartieProduitPfnl1");
    }

    /**
     * Container's getter for getLibelleProduitComplet1.
     * @return getLibelleProduitComplet1
     */
    public getLibelleProduitCompletImpl getgetLibelleProduitComplet1() {
        return (getLibelleProduitCompletImpl) findViewObject("getLibelleProduitComplet1");
    }

    /**
     * Container's getter for getLibellePartieProduitPfnl2.
     * @return getLibellePartieProduitPfnl2
     */
    public getLibelleProduitPfnlImpl getgetLibellePartieProduitPfnl2() {
        return (getLibelleProduitPfnlImpl) findViewObject("getLibellePartieProduitPfnl2");
    }

    /**
     * Container's getter for getLibelleProduitPfnl1.
     * @return getLibelleProduitPfnl1
     */
    public getLibelleProduitPfnlImpl getgetLibelleProduitPfnl1() {
        return (getLibelleProduitPfnlImpl) findViewObject("getLibelleProduitPfnl1");
    }

    /**
     * Container's getter for getLastidDetailslettrevoiture1.
     * @return getLastidDetailslettrevoiture1
     */
    public ViewObjectImpl getgetLastidDetailslettrevoiture1() {
        return (ViewObjectImpl) findViewObject("getLastidDetailslettrevoiture1");
    }

    /**
     * Container's getter for getLastidLettrevoiture1.
     * @return getLastidLettrevoiture1
     */
    public ViewObjectImpl getgetLastidLettrevoiture1() {
        return (ViewObjectImpl) findViewObject("getLastidLettrevoiture1");
    }

    /**
     * Container's getter for Partiproduit1.
     * @return Partiproduit1
     */
    public ViewObjectImpl getPartiproduit1() {
        return (ViewObjectImpl) findViewObject("Partiproduit1");
    }

    /**
     * Container's getter for getPartieProduit1.
     * @return getPartieProduit1
     */
    public ViewObjectImpl getgetPartieProduit1() {
        return (ViewObjectImpl) findViewObject("getPartieProduit1");
    }


    /**
     * Container's getter for DetailslettrevoitureView1.
     * @return DetailslettrevoitureView1
     */
    public DetailslettrevoitureViewImpl getDetailslettrevoitureView1() {
        return (DetailslettrevoitureViewImpl) findViewObject("DetailslettrevoitureView1");
    }

    /**
     * Container's getter for LettrevoitureView1.
     * @return LettrevoitureView1
     */
    public LettrevoitureViewImpl getLettrevoitureView1() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView1");
    }

    /**
     * Container's getter for LettrevoitureView2.
     * @return LettrevoitureView2
     */
    public LettrevoitureViewImpl getLettrevoitureView2() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView2");
    }

    /**
     * Container's getter for LettrevoitureView3.
     * @return LettrevoitureView3
     */
    public LettrevoitureViewImpl getLettrevoitureView3() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView3");
    }

    /**
     * Container's getter for LettrevoitureView4.
     * @return LettrevoitureView4
     */
    public LettrevoitureViewImpl getLettrevoitureView4() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView4");
    }

    /**
     * Container's getter for LettrevoitureView5.
     * @return LettrevoitureView5
     */
    public LettrevoitureViewImpl getLettrevoitureView5() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView5");
    }

    /**
     * Container's getter for LettrevoitureView6.
     * @return LettrevoitureView6
     */
    public LettrevoitureViewImpl getLettrevoitureView6() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView6");
    }

    /**
     * Container's getter for DetailslettrevoitureView2.
     * @return DetailslettrevoitureView2
     */
    public DetailslettrevoitureViewImpl getDetailslettrevoitureView2() {
        return (DetailslettrevoitureViewImpl) findViewObject("DetailslettrevoitureView2");
    }

    /**
     * Container's getter for DetailslettrevoitureView3.
     * @return DetailslettrevoitureView3
     */
    public DetailslettrevoitureViewImpl getDetailslettrevoitureView3() {
        return (DetailslettrevoitureViewImpl) findViewObject("DetailslettrevoitureView3");
    }

    /**
     * Container's getter for DetailslettrevoitureView4.
     * @return DetailslettrevoitureView4
     */
    public DetailslettrevoitureViewImpl getDetailslettrevoitureView4() {
        return (DetailslettrevoitureViewImpl) findViewObject("DetailslettrevoitureView4");
    }

    /**
     * Container's getter for LettrevoitureView7.
     * @return LettrevoitureView7
     */
    public LettrevoitureViewImpl getLettrevoitureView7() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView7");
    }

    /**
     * Container's getter for LettrevoitureView8.
     * @return LettrevoitureView8
     */
    public LettrevoitureViewImpl getLettrevoitureView8() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView8");
    }

    /**
     * Container's getter for LettrevoitureView9.
     * @return LettrevoitureView9
     */
    public LettrevoitureViewImpl getLettrevoitureView9() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView9");
    }

    /**
     * Container's getter for LettrevoitureView10.
     * @return LettrevoitureView10
     */
    public LettrevoitureViewImpl getLettrevoitureView10() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView10");
    }

    /**
     * Container's getter for LettrevoitureView11.
     * @return LettrevoitureView11
     */
    public LettrevoitureViewImpl getLettrevoitureView11() {
        return (LettrevoitureViewImpl) findViewObject("LettrevoitureView11");
    }

    /**
     * Container's getter for DetailslettrevoitureView5.
     * @return DetailslettrevoitureView5
     */
    public DetailslettrevoitureViewImpl getDetailslettrevoitureView5() {
        return (DetailslettrevoitureViewImpl) findViewObject("DetailslettrevoitureView5");
    }

    /**
     * Container's getter for DetailslettrevoitureView6.
     * @return DetailslettrevoitureView6
     */
    public DetailslettrevoitureViewImpl getDetailslettrevoitureView6() {
        return (DetailslettrevoitureViewImpl) findViewObject("DetailslettrevoitureView6");
    }

    /**
     * Container's getter for DetailslettrevoitureView7.
     * @return DetailslettrevoitureView7
     */
    public DetailslettrevoitureViewImpl getDetailslettrevoitureView7() {
        return (DetailslettrevoitureViewImpl) findViewObject("DetailslettrevoitureView7");
    }

    /**
     * Container's getter for FkLettrevoiture5Link1.
     * @return FkLettrevoiture5Link1
     */
    public ViewLinkImpl getFkLettrevoiture5Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture5Link1");
    }

    /**
     * Container's getter for FkLettrevoiture4Link1.
     * @return FkLettrevoiture4Link1
     */
    public ViewLinkImpl getFkLettrevoiture4Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture4Link1");
    }

    /**
     * Container's getter for FkLettrevoiture3Link1.
     * @return FkLettrevoiture3Link1
     */
    public ViewLinkImpl getFkLettrevoiture3Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture3Link1");
    }

    /**
     * Container's getter for FkLettrevoiture2Link1.
     * @return FkLettrevoiture2Link1
     */
    public ViewLinkImpl getFkLettrevoiture2Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture2Link1");
    }

    /**
     * Container's getter for FkLettrevoiture1Link1.
     * @return FkLettrevoiture1Link1
     */
    public ViewLinkImpl getFkLettrevoiture1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture1Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture3Link1.
     * @return FkDetailslettrevoiture3Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture3Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture3Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture2Link1.
     * @return FkDetailslettrevoiture2Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture2Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture2Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture1Link1.
     * @return FkDetailslettrevoiture1Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture5Assoc1Link1.
     * @return FkLettrevoiture5Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture5Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture5Assoc1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture4Assoc1Link1.
     * @return FkLettrevoiture4Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture4Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture4Assoc1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture3Assoc1Link1.
     * @return FkLettrevoiture3Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture3Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture3Assoc1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture2Assoc1Link1.
     * @return FkLettrevoiture2Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture2Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture2Assoc1Link1");
    }

    /**
     * Container's getter for FkLettrevoiture1Assoc1Link1.
     * @return FkLettrevoiture1Assoc1Link1
     */
    public ViewLinkImpl getFkLettrevoiture1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiture1Assoc1Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture1Assoc1Link1.
     * @return FkDetailslettrevoiture1Assoc1Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture1Assoc1Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture2Assoc1Link1.
     * @return FkDetailslettrevoiture2Assoc1Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture2Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture2Assoc1Link1");
    }

    /**
     * Container's getter for FkDetailslettrevoiture3Assoc1Link1.
     * @return FkDetailslettrevoiture3Assoc1Link1
     */
    public ViewLinkImpl getFkDetailslettrevoiture3Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailslettrevoiture3Assoc1Link1");
    }

    /**
     * Container's getter for AgrementByPermisView1.
     * @return AgrementByPermisView1
     */
    public ViewObjectImpl getAgrementByPermisView1() {
        return (ViewObjectImpl) findViewObject("AgrementByPermisView1");
        }
        /**
     * Container's getter for PermissionnairespnflView6.
     * @return PermissionnairespnflView6
     */
    public PermissionnairespnflViewImpl getPermissionnairespnflView6() {
        return (PermissionnairespnflViewImpl) findViewObject("PermissionnairespnflView6");
    }

    /**
     * Container's getter for PermisView7.
     * @return PermisView7
     */
    public PermisViewImpl getPermisView7() {
        return (PermisViewImpl) findViewObject("PermisView7");
    }

    /**
     * Container's getter for PermissionnaireToPermisLink.
     * @return PermissionnaireToPermisLink
     */
    public ViewLinkImpl getPermissionnaireToPermisLink() {
        return (ViewLinkImpl) findViewLink("PermissionnaireToPermisLink");
    }


    /**
     * Container's getter for PermisView8.
     * @return PermisView8
     */
    public PermisViewImpl getPermisView8() {
        return (PermisViewImpl) findViewObject("PermisView8");
    }

    /**
     * Container's getter for PermissionnaireToPermisLink1.
     * @return PermissionnaireToPermisLink1
     */
    public ViewLinkImpl getPermissionnaireToPermisLink1() {
        return (ViewLinkImpl) findViewLink("PermissionnaireToPermisLink1");
    }

    /**
     * Container's getter for permisActifView1.
     * @return permisActifView1
     */
    public permisActifViewImpl getpermisActifView1() {
        return (permisActifViewImpl) findViewObject("permisActifView1");
    }

    /**
     * Container's getter for typeDocumentView1.
     * @return typeDocumentView1
     */
    public typeDocumentViewImpl gettypeDocumentView1() {
        return (typeDocumentViewImpl) findViewObject("typeDocumentView1");
    }


    /**
     * Container's getter for ProduitsPfnlView12.
     * @return ProduitsPfnlView12
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView12() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView12");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView24.
     * @return PartiesProduitsPfnlView24
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView24() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView24");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc3Link3.
     * @return FkPartiesproduitspfnl1Assoc3Link3
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc3Link3() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc3Link3");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView25.
     * @return PartiesProduitsPfnlView25
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView25() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView25");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc3Link2.
     * @return FkPartiesproduitspfnl2Assoc3Link2
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc3Link2() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc3Link2");
    }

    /**
     * Container's getter for ExportpfnlView1.
     * @return ExportpfnlView1
     */
    public ExportpfnlViewImpl getExportpfnlView1() {
        return (ExportpfnlViewImpl) findViewObject("ExportpfnlView1");
    }

    /**
     * Container's getter for ExportpfnlView1_1.
     * @return ExportpfnlView1_1
     */
    public ViewObjectImpl getExportpfnlView1_1() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView1_1");
    }

    /**
     * Container's getter for ExportpfnlView2.
     * @return ExportpfnlView2
     */
    public ExportpfnlViewImpl getExportpfnlView2() {
        return (ExportpfnlViewImpl) findViewObject("ExportpfnlView2");
    }

    /**
     * Container's getter for ExportpfnlView3.
     * @return ExportpfnlView3
     */
    public ExportpfnlViewImpl getExportpfnlView3() {
        return (ExportpfnlViewImpl) findViewObject("ExportpfnlView3");
    }

    /**
     * Container's getter for ExportpfnlView1_2.
     * @return ExportpfnlView1_2
     */
    public ViewObjectImpl getExportpfnlView1_2() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView1_2");
    }

    /**
     * Container's getter for ExportpfnlView1_3.
     * @return ExportpfnlView1_3
     */
    public ViewObjectImpl getExportpfnlView1_3() {
        return (ViewObjectImpl) findViewObject("ExportpfnlView1_3");
    }

    /**
     * Container's getter for FkExportpfnl2Link1.
     * @return FkExportpfnl2Link1
     */
    public ViewLinkImpl getFkExportpfnl2Link1() {
        return (ViewLinkImpl) findViewLink("FkExportpfnl2Link1");
    }

    /**
     * Container's getter for FkExportpfnl1Link1.
     * @return FkExportpfnl1Link1
     */
    public ViewLinkImpl getFkExportpfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkExportpfnl1Link1");
    }

    /**
     * Container's getter for FkExportpfnl1Link1_1.
     * @return FkExportpfnl1Link1_1
     */
    public ViewLinkImpl getFkExportpfnl1Link1_1() {
        return (ViewLinkImpl) findViewLink("FkExportpfnl1Link1_1");
    }

    /**
     * Container's getter for FkExportpfnl2Link1_1.
     * @return FkExportpfnl2Link1_1
     */
    public ViewLinkImpl getFkExportpfnl2Link1_1() {
        return (ViewLinkImpl) findViewLink("FkExportpfnl2Link1_1");
    }

    /**
     * Container's getter for DetailsexportpfnlView1.
     * @return DetailsexportpfnlView1
     */
    public DetailsexportpfnlViewImpl getDetailsexportpfnlView1() {
        return (DetailsexportpfnlViewImpl) findViewObject("DetailsexportpfnlView1");
    }

    /**
     * Container's getter for DetailsexportpfnlView2.
     * @return DetailsexportpfnlView2
     */
    public ViewObjectImpl getDetailsexportpfnlView2() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView2");
    }

    /**
     * Container's getter for DetailsexportpfnlView3.
     * @return DetailsexportpfnlView3
     */
    public DetailsexportpfnlViewImpl getDetailsexportpfnlView3() {
        return (DetailsexportpfnlViewImpl) findViewObject("DetailsexportpfnlView3");
    }

    /**
     * Container's getter for DetailsexportpfnlView4.
     * @return DetailsexportpfnlView4
     */
    public DetailsexportpfnlViewImpl getDetailsexportpfnlView4() {
        return (DetailsexportpfnlViewImpl) findViewObject("DetailsexportpfnlView4");
    }

    /**
     * Container's getter for DetailsexportpfnlView5.
     * @return DetailsexportpfnlView5
     */
    public DetailsexportpfnlViewImpl getDetailsexportpfnlView5() {
        return (DetailsexportpfnlViewImpl) findViewObject("DetailsexportpfnlView5");
    }

    /**
     * Container's getter for DetailsexportpfnlView6.
     * @return DetailsexportpfnlView6
     */
    public ViewObjectImpl getDetailsexportpfnlView6() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView6");
    }

    /**
     * Container's getter for DetailsexportpfnlView7.
     * @return DetailsexportpfnlView7
     */
    public ViewObjectImpl getDetailsexportpfnlView7() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView7");
    }

    /**
     * Container's getter for DetailsexportpfnlView8.
     * @return DetailsexportpfnlView8
     */
    public ViewObjectImpl getDetailsexportpfnlView8() {
        return (ViewObjectImpl) findViewObject("DetailsexportpfnlView8");
    }

    /**
     * Container's getter for FkDetailsexportpfnl3Link1.
     * @return FkDetailsexportpfnl3Link1
     */
    public ViewLinkImpl getFkDetailsexportpfnl3Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl3Link1");
    }

    /**
     * Container's getter for FkDetailsexportpfnl2Link1.
     * @return FkDetailsexportpfnl2Link1
     */
    public ViewLinkImpl getFkDetailsexportpfnl2Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl2Link1");
    }

    /**
     * Container's getter for FkDetailsexportpfnl1Link1.
     * @return FkDetailsexportpfnl1Link1
     */
    public ViewLinkImpl getFkDetailsexportpfnl1Link1() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl1Link1");
    }

    /**
     * Container's getter for FkDetailsexportpfnl1Link2.
     * @return FkDetailsexportpfnl1Link2
     */
    public ViewLinkImpl getFkDetailsexportpfnl1Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl1Link2");
    }

    /**
     * Container's getter for FkDetailsexportpfnl2Link2.
     * @return FkDetailsexportpfnl2Link2
     */
    public ViewLinkImpl getFkDetailsexportpfnl2Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl2Link2");
    }

    /**
     * Container's getter for FkDetailsexportpfnl3Link2.
     * @return FkDetailsexportpfnl3Link2
     */
    public ViewLinkImpl getFkDetailsexportpfnl3Link2() {
        return (ViewLinkImpl) findViewLink("FkDetailsexportpfnl3Link2");
    }

    /**
     * Container's getter for getLastIcCollecte1.
     * @return getLastIcCollecte1
     */
    public getLastIcCollecteImpl getgetLastIcCollecte1() {
        return (getLastIcCollecteImpl) findViewObject("getLastIcCollecte1");
    }

    /**
     * Container's getter for LastiddetailscollecteView1.
     * @return LastiddetailscollecteView1
     */
    public ViewObjectImpl getLastiddetailscollecteView1() {
        return (ViewObjectImpl) findViewObject("LastiddetailscollecteView1");
    }

    /**
     * Container's getter for LastiddetailscollecteView1_1.
     * @return LastiddetailscollecteView1_1
     */
    public ViewObjectImpl getLastiddetailscollecteView1_1() {
        return (ViewObjectImpl) findViewObject("LastiddetailscollecteView1_1");
    }

    /**
     * Container's getter for lastiddetailscollecte1.
     * @return lastiddetailscollecte1
     */
    public ViewObjectImpl getlastiddetailscollecte1() {
        return (ViewObjectImpl) findViewObject("lastiddetailscollecte1");
    }

    /**
     * Container's getter for ExportpfnlView4.
     * @return ExportpfnlView4
     */
    public ExportpfnlViewImpl getExportpfnlView4() {
        return (ExportpfnlViewImpl) findViewObject("ExportpfnlView4");
    }

    /**
     * Container's getter for DetailsexportpfnlView9.
     * @return DetailsexportpfnlView9
     */
    public DetailsexportpfnlViewImpl getDetailsexportpfnlView9() {
        return (DetailsexportpfnlViewImpl) findViewObject("DetailsexportpfnlView9");
    }

    /**
     * Container's getter for ExportToDetailExportLink.
     * @return ExportToDetailExportLink
     */
    public ViewLinkImpl getExportToDetailExportLink() {
        return (ViewLinkImpl) findViewLink("ExportToDetailExportLink");
    }

    /**
     * Container's getter for ExportpfnlView5.
     * @return ExportpfnlView5
     */
    public ExportpfnlViewImpl getExportpfnlView5() {
        return (ExportpfnlViewImpl) findViewObject("ExportpfnlView5");
    }


    /**
     * Container's getter for ExportpfnlView6.
     * @return ExportpfnlView6
     */
    public ExportpfnlViewImpl getExportpfnlView6() {
        return (ExportpfnlViewImpl) findViewObject("ExportpfnlView6");
    }

    /**
     * Container's getter for PermissionnairespnflView7.
     * @return PermissionnairespnflView7
     */
    public PermissionnairespnflViewImpl getPermissionnairespnflView7() {
        return (PermissionnairespnflViewImpl) findViewObject("PermissionnairespnflView7");
    }

    /**
     * Container's getter for ExportToPermissionnaireLink.
     * @return ExportToPermissionnaireLink
     */
    public ViewLinkImpl getExportToPermissionnaireLink() {
        return (ViewLinkImpl) findViewLink("ExportToPermissionnaireLink");
    }

    /**
     * Container's getter for DetailsexportpfnlView10.
     * @return DetailsexportpfnlView10
     */
    public DetailsexportpfnlViewImpl getDetailsexportpfnlView10() {
        return (DetailsexportpfnlViewImpl) findViewObject("DetailsexportpfnlView10");
    }

    /**
     * Container's getter for UnitemesureView9.
     * @return UnitemesureView9
     */
    public UnitemesureViewImpl getUnitemesureView9() {
        return (UnitemesureViewImpl) findViewObject("UnitemesureView9");
    }

    /**
     * Container's getter for DetailsExportToUnitMesureLink.
     * @return DetailsExportToUnitMesureLink
     */
    public ViewLinkImpl getDetailsExportToUnitMesureLink() {
        return (ViewLinkImpl) findViewLink("DetailsExportToUnitMesureLink");
    }

    /**
     * Container's getter for DetailsexportpfnlView11.
     * @return DetailsexportpfnlView11
     */
    public DetailsexportpfnlViewImpl getDetailsexportpfnlView11() {
        return (DetailsexportpfnlViewImpl) findViewObject("DetailsexportpfnlView11");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView26.
     * @return PartiesProduitsPfnlView26
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView26() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView26");
    }

    /**
     * Container's getter for DetailsExportToPartieProduitLink.
     * @return DetailsExportToPartieProduitLink
     */
    public ViewLinkImpl getDetailsExportToPartieProduitLink() {
        return (ViewLinkImpl) findViewLink("DetailsExportToPartieProduitLink");
    }

    /**
     * Container's getter for DetailsexportpfnlView12.
     * @return DetailsexportpfnlView12
     */
    public DetailsexportpfnlViewImpl getDetailsexportpfnlView12() {
        return (DetailsexportpfnlViewImpl) findViewObject("DetailsexportpfnlView12");
    }

    /**
     * Container's getter for ExportToDetailExportLink1.
     * @return ExportToDetailExportLink1
     */
    public ViewLinkImpl getExportToDetailExportLink1() {
        return (ViewLinkImpl) findViewLink("ExportToDetailExportLink1");
    }

    /**
     * Container's getter for PermissionnairespnflView8.
     * @return PermissionnairespnflView8
     */
    public PermissionnairespnflViewImpl getPermissionnairespnflView8() {
        return (PermissionnairespnflViewImpl) findViewObject("PermissionnairespnflView8");
    }

    /**
     * Container's getter for ExportToPermissionnaireLink1.
     * @return ExportToPermissionnaireLink1
     */
    public ViewLinkImpl getExportToPermissionnaireLink1() {
        return (ViewLinkImpl) findViewLink("ExportToPermissionnaireLink1");
    }

    /**
     * Container's getter for PermisView9.
     * @return PermisView9
     */
    public PermisViewImpl getPermisView9() {
        return (PermisViewImpl) findViewObject("PermisView9");
    }

    /**
     * Container's getter for ExportToPermisLink1.
     * @return ExportToPermisLink1
     */
    public ViewLinkImpl getExportToPermisLink1() {
        return (ViewLinkImpl) findViewLink("ExportToPermisLink1");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView27.
     * @return PartiesProduitsPfnlView27
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView27() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView27");
    }

    /**
     * Container's getter for DetailsExportToPartieProduitLink1.
     * @return DetailsExportToPartieProduitLink1
     */
    public ViewLinkImpl getDetailsExportToPartieProduitLink1() {
        return (ViewLinkImpl) findViewLink("DetailsExportToPartieProduitLink1");
    }

    /**
     * Container's getter for UnitemesureView10.
     * @return UnitemesureView10
     */
    public UnitemesureViewImpl getUnitemesureView10() {
        return (UnitemesureViewImpl) findViewObject("UnitemesureView10");
    }

    /**
     * Container's getter for DetailsExportToUnitMesureLink1.
     * @return DetailsExportToUnitMesureLink1
     */
    public ViewLinkImpl getDetailsExportToUnitMesureLink1() {
        return (ViewLinkImpl) findViewLink("DetailsExportToUnitMesureLink1");
    }

    /**
     * Container's getter for getLastIdExport1.
     * @return getLastIdExport1
     */
    public getLastIdExportImpl getgetLastIdExport1() {
        return (getLastIdExportImpl) findViewObject("getLastIdExport1");
    }

    /**
     * Container's getter for getLastIdDetailsexport1.
     * @return getLastIdDetailsexport1
     */
    public getLastIdDetailsexportImpl getgetLastIdDetailsexport1() {
        return (getLastIdDetailsexportImpl) findViewObject("getLastIdDetailsexport1");
    }

    /**
     * Container's getter for GroupeutilisateurView1.
     * @return GroupeutilisateurView1
     */
    public ViewObjectImpl getGroupeutilisateurView1() {
        return (ViewObjectImpl) findViewObject("GroupeutilisateurView1");
    }

    /**
     * Container's getter for UtilisateurView1.
     * @return UtilisateurView1
     */
    public UtilisateurViewImpl getUtilisateurView1() {
        return (UtilisateurViewImpl) findViewObject("UtilisateurView1");
    }

    /**
     * Container's getter for UtilisateurView2.
     * @return UtilisateurView2
     */
    public UtilisateurViewImpl getUtilisateurView2() {
        return (UtilisateurViewImpl) findViewObject("UtilisateurView2");
    }

    /**
     * Container's getter for UtilisateurView3.
     * @return UtilisateurView3
     */
    public UtilisateurViewImpl getUtilisateurView3() {
        return (UtilisateurViewImpl) findViewObject("UtilisateurView3");
    }


    /**
     * Container's getter for UtilisateurView5.
     * @return UtilisateurView5
     */
    public UtilisateurViewImpl getUtilisateurView5() {
        return (UtilisateurViewImpl) findViewObject("UtilisateurView5");
    }

    /**
     * Container's getter for UtilisateurView6.
     * @return UtilisateurView6
     */
    public UtilisateurViewImpl getUtilisateurView6() {
        return (UtilisateurViewImpl) findViewObject("UtilisateurView6");
    }

    /**
     * Container's getter for UtilisateurView7.
     * @return UtilisateurView7
     */
    public UtilisateurViewImpl getUtilisateurView7() {
        return (UtilisateurViewImpl) findViewObject("UtilisateurView7");
    }

    /**
     * Container's getter for FkUtilisateur3Link1.
     * @return FkUtilisateur3Link1
     */
    public ViewLinkImpl getFkUtilisateur3Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur3Link1");
    }

    /**
     * Container's getter for FkUtilisateur2Link1.
     * @return FkUtilisateur2Link1
     */
    public ViewLinkImpl getFkUtilisateur2Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur2Link1");
    }


    /**
     * Container's getter for FkUtilisateur3Assoc1Link1.
     * @return FkUtilisateur3Assoc1Link1
     */
    public ViewLinkImpl getFkUtilisateur3Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur3Assoc1Link1");
    }

    /**
     * Container's getter for FkUtilisateur2Assoc1Link1.
     * @return FkUtilisateur2Assoc1Link1
     */
    public ViewLinkImpl getFkUtilisateur2Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur2Assoc1Link1");
    }

    /**
     * Container's getter for FkUtilisateur1Assoc1Link1.
     * @return FkUtilisateur1Assoc1Link1
     */
    public ViewLinkImpl getFkUtilisateur1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkUtilisateur1Assoc1Link1");
    }
    
    public UserData findutil (String _loginuser, String _passworduser){
        UserData util = null;
        ViewObject vo = this.getUtilisateurView1();
        ViewCriteria vc = vo.createViewCriteria();;
        ViewCriteriaRow vcr = vc.createViewCriteriaRow();
        vcr.setAttribute("Loginuser", _loginuser);
        vcr.setAttribute("Passworduser",_passworduser);
        vc.add(vcr);
        vo.appendViewCriteria(vc);
        vo.executeQuery();
        if (vo.hasNext()){
            String pgs = "";
            util = new UserData();
            Row rr=vo.next();
            util.setLoginuser(rr.getAttribute("Loginuser").toString());
            util.setNonuser(rr.getAttribute("Nomuser").toString());            
            if(rr.getAttribute("Telephone") != null) util.setTelephone(rr.getAttribute("Telephone").toString());
            util.setEmail(rr.getAttribute("Emailuser").toString());
            util.setPassworduser(rr.getAttribute("Passworduser").toString());
            BigDecimal bd;
            BigDecimal b1;
            Boolean bb;
            
            bd= (BigDecimal)rr.getAttribute("Iddepartements");
            util.setIddepartement(bd);
            
            bd= (BigDecimal)rr.getAttribute("Idregions");
            util.setIdregion(bd);
            
            bd= (BigDecimal)rr.getAttribute("Idgroupe");
            util.setIdgroupe(bd);
            b1=new BigDecimal(1);
            if (bd.equals(b1)) util.setEstinfo(true);
            
            b1=new BigDecimal(2);
            if (bd.equals(b1)) {
                util.setEstadmin(true);
                util.setSaisiecollecte(true);
                util.setSaisieexport(true);
                util.setSaisietransit(true);
            }
            
            b1=new BigDecimal(3);
            if (bd.equals(b1)) util.setEstuser(true);
            
            
            bd= (BigDecimal)rr.getAttribute("Idutilisateur");
            util.setIdutilisateur(bd);
            
            int nn = (Integer)rr.getAttribute("Niveauintervention");
            util.setNiveauintervention(nn);
            if (nn == 1) {
                util.setEstcent(true);
                util.setIddepartement(null);
                util.setIdregion(null);
            }
            if (nn == 2) {
                util.setEstreg(true);
                util.setIddepartement(null);
            }
            if (nn == 3) {
                util.setEstdep(true);
                util.setIdregion(null);
            }
            
            bb= (Boolean)rr.getAttribute("Saisieexport");
            util.setSaisieexport(bb);
            
            bb= (Boolean)rr.getAttribute("Saisiecollecte");
            util.setSaisiecollecte(bb);
            
            bb= (Boolean)rr.getAttribute("Saisietransit");
            util.setSaisietransit(bb);
            
            bb= (Boolean)rr.getAttribute("Premiereconnexion");
            util.setPconnect(bb);
            
            ViewObject vo1 = this.getListePages1();
            ViewCriteria vc1 = vo1.createViewCriteria();;
            ViewCriteriaRow vcr1 = vc1.createViewCriteriaRow();
            vcr1.setAttribute("Idgroupe", util.getIdgroupe());
            vc1.add(vcr1);
            vo1.appendViewCriteria(vc1);
            vo1.executeQuery();
            while(vo1.hasNext()){
                Row rr1 = vo1.next();
                pgs = pgs + (String)rr1.getAttribute("Libellepage")+";";
                
            }
            //System.out.println("les pages : "+pgs);
            util.setPagesdugroupe(pgs);
            
        }
        
        return util;
        
    }

    /**
     * Container's getter for NiveauValidationView1.
     * @return NiveauValidationView1
     */
    public NiveauValidationViewImpl getNiveauValidationView1() {
        return (NiveauValidationViewImpl) findViewObject("NiveauValidationView1");
    }

    /**
     * Container's getter for getLastIdUtilisateur1.
     * @return getLastIdUtilisateur1
     */
    public ViewObjectImpl getgetLastIdUtilisateur1() {
        return (ViewObjectImpl) findViewObject("getLastIdUtilisateur1");
    }

    /**
     * Container's getter for TypeacteurView1.
     * @return TypeacteurView1
     */
    public TypeacteurViewImpl getTypeacteurView1() {
        return (TypeacteurViewImpl) findViewObject("TypeacteurView1");
    }


    /**
     * Container's getter for PermisView10.
     * @return PermisView10
     */
    public PermisViewImpl getPermisView10() {
        return (PermisViewImpl) findViewObject("PermisView10");
    }


    /**
     * Container's getter for getLastidCertificatorigine1.
     * @return getLastidCertificatorigine1
     */
    public ViewObjectImpl getgetLastidCertificatorigine1() {
        return (ViewObjectImpl) findViewObject("getLastidCertificatorigine1");
    }

    /**
     * Container's getter for getLastidDetailco1.
     * @return getLastidDetailco1
     */
    public ViewObjectImpl getgetLastidDetailco1() {
        return (ViewObjectImpl) findViewObject("getLastidDetailco1");
    }


    /**
     * Container's getter for PermisView6.
     * @return PermisView6
     */
    public PermisViewImpl getPermisView6() {
        return (PermisViewImpl) findViewObject("PermisView6");
    }


    /**
     * Container's getter for PagepargroupView1.
     * @return PagepargroupView1
     */
    public ViewObjectImpl getPagepargroupView1() {
        return (ViewObjectImpl) findViewObject("PagepargroupView1");
    }

    /**
     * Container's getter for PageprojetView1.
     * @return PageprojetView1
     */
    public ViewObjectImpl getPageprojetView1() {
        return (ViewObjectImpl) findViewObject("PageprojetView1");
    }

    /**
     * Container's getter for PagepargroupView2.
     * @return PagepargroupView2
     */
    public ViewObjectImpl getPagepargroupView2() {
        return (ViewObjectImpl) findViewObject("PagepargroupView2");
    }

    /**
     * Container's getter for PagepargroupView3.
     * @return PagepargroupView3
     */
    public ViewObjectImpl getPagepargroupView3() {
        return (ViewObjectImpl) findViewObject("PagepargroupView3");
    }

    /**
     * Container's getter for PagepargroupView4.
     * @return PagepargroupView4
     */
    public ViewObjectImpl getPagepargroupView4() {
        return (ViewObjectImpl) findViewObject("PagepargroupView4");
    }

    /**
     * Container's getter for PagepargroupView5.
     * @return PagepargroupView5
     */
    public ViewObjectImpl getPagepargroupView5() {
        return (ViewObjectImpl) findViewObject("PagepargroupView5");
    }

    /**
     * Container's getter for FkPagepargroup2Link1.
     * @return FkPagepargroup2Link1
     */
    public ViewLinkImpl getFkPagepargroup2Link1() {
        return (ViewLinkImpl) findViewLink("FkPagepargroup2Link1");
    }

    /**
     * Container's getter for FkPagepargroup1Link1.
     * @return FkPagepargroup1Link1
     */
    public ViewLinkImpl getFkPagepargroup1Link1() {
        return (ViewLinkImpl) findViewLink("FkPagepargroup1Link1");
    }

    /**
     * Container's getter for FkPagepargroup1Assoc1Link1.
     * @return FkPagepargroup1Assoc1Link1
     */
    public ViewLinkImpl getFkPagepargroup1Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkPagepargroup1Assoc1Link1");
    }

    /**
     * Container's getter for FkPagepargroup2Assoc1Link1.
     * @return FkPagepargroup2Assoc1Link1
     */
    public ViewLinkImpl getFkPagepargroup2Assoc1Link1() {
        return (ViewLinkImpl) findViewLink("FkPagepargroup2Assoc1Link1");
    }

    /**
     * Container's getter for GroupeutilisateurView2.
     * @return GroupeutilisateurView2
     */
    public ViewObjectImpl getGroupeutilisateurView2() {
        return (ViewObjectImpl) findViewObject("GroupeutilisateurView2");
    }

    /**
     * Container's getter for PagepargroupView6.
     * @return PagepargroupView6
     */
    public ViewObjectImpl getPagepargroupView6() {
        return (ViewObjectImpl) findViewObject("PagepargroupView6");
    }

    /**
     * Container's getter for PageToGroupeLink.
     * @return PageToGroupeLink
     */
    public ViewLinkImpl getPageToGroupeLink() {
        return (ViewLinkImpl) findViewLink("PageToGroupeLink");
    }

    /**
     * Container's getter for getLastidPagepargroupe1.
     * @return getLastidPagepargroupe1
     */
    public ViewObjectImpl getgetLastidPagepargroupe1() {
        return (ViewObjectImpl) findViewObject("getLastidPagepargroupe1");
    }

    /**
     * Container's getter for ListePages1.
     * @return ListePages1
     */
    public ViewObjectImpl getListePages1() {
        return (ViewObjectImpl) findViewObject("ListePages1");
    }

    /**
     * Container's getter for UtilisateurView8.
     * @return UtilisateurView8
     */
    public UtilisateurViewImpl getUtilisateurView8() {
        return (UtilisateurViewImpl) findViewObject("UtilisateurView8");
    }
    
    public void changepwd(BigDecimal bd, String pwd){
        UtilisateurViewImpl uv = getUtilisateurView8();
        uv.setPwd(bd, pwd);
        
    }
    
    public void modifuser(BigDecimal bd, String nuser, String puser, String muser){
        UtilisateurViewImpl uv = getUtilisateurView8();
        uv.updateUer(bd, nuser, puser, muser);
    }


    /**
     * Container's getter for PermisView11.
     * @return PermisView11
     */
    public PermisViewImpl getPermisView11() {
        return (PermisViewImpl) findViewObject("PermisView11");
    }


    /**
     * Container's getter for CertificatorigineView1.
     * @return CertificatorigineView1
     */
    public ViewObjectImpl getCertificatorigineView1() {
        return (ViewObjectImpl) findViewObject("CertificatorigineView1");
    }

    /**
     * Container's getter for CertificatorigineView2.
     * @return CertificatorigineView2
     */
    public ViewObjectImpl getCertificatorigineView2() {
        return (ViewObjectImpl) findViewObject("CertificatorigineView2");
    }

    /**
     * Container's getter for PermisToCoLink1.
     * @return PermisToCoLink1
     */
    public ViewLinkImpl getPermisToCoLink1() {
        return (ViewLinkImpl) findViewLink("PermisToCoLink1");
    }

    /**
     * Container's getter for CertificatorigineView3.
     * @return CertificatorigineView3
     */
    public ViewObjectImpl getCertificatorigineView3() {
        return (ViewObjectImpl) findViewObject("CertificatorigineView3");
    }

    /**
     * Container's getter for PermisToCoLink2.
     * @return PermisToCoLink2
     */
    public ViewLinkImpl getPermisToCoLink2() {
        return (ViewLinkImpl) findViewLink("PermisToCoLink2");
    }

    /**
     * Container's getter for getLastidCoView1.
     * @return getLastidCoView1
     */
    public ViewObjectImpl getgetLastidCoView1() {
        return (ViewObjectImpl) findViewObject("getLastidCoView1");
    }

    /**
     * Container's getter for LocaliteView3.
     * @return LocaliteView3
     */
    public ViewObjectImpl getLocaliteView3() {
        return (ViewObjectImpl) findViewObject("LocaliteView3");
    }

    /**
     * Container's getter for LocaliteView4.
     * @return LocaliteView4
     */
    public ViewObjectImpl getLocaliteView4() {
        return (ViewObjectImpl) findViewObject("LocaliteView4");
    }

    /**
     * Container's getter for FkLocalite1Link2.
     * @return FkLocalite1Link2
     */
    public ViewLinkImpl getFkLocalite1Link2() {
        return (ViewLinkImpl) findViewLink("FkLocalite1Link2");
    }

    /**
     * Container's getter for PostecontroleView1.
     * @return PostecontroleView1
     */
    public PostecontroleViewImpl getPostecontroleView1() {
        return (PostecontroleViewImpl) findViewObject("PostecontroleView1");
    }

    /**
     * Container's getter for LocaliteView1.
     * @return LocaliteView1
     */
    public ViewObjectImpl getLocaliteView1() {
        return (ViewObjectImpl) findViewObject("LocaliteView1");
    }

    /**
     * Container's getter for LocaliteView2.
     * @return LocaliteView2
     */
    public ViewObjectImpl getLocaliteView2() {
        return (ViewObjectImpl) findViewObject("LocaliteView2");
    }

    /**
     * Container's getter for CollecteMulti1.
     * @return CollecteMulti1
     */
    public CollecteMultiImpl getCollecteMulti1() {
        return (CollecteMultiImpl) findViewObject("CollecteMulti1");
    }

    /**
     * Container's getter for CollMultiCritere1.
     * @return CollMultiCritere1
     */
    public CollMultiCritereImpl getCollMultiCritere1() {
        return (CollMultiCritereImpl) findViewObject("CollMultiCritere1");
    }

    /**
     * Container's getter for LettreVoitureMultiCritere1.
     * @return LettreVoitureMultiCritere1
     */
    public ViewObjectImpl getLettreVoitureMultiCritere1() {
        return (ViewObjectImpl) findViewObject("LettreVoitureMultiCritere1");
    }

    /**
     * Container's getter for ExportMultiCritere1.
     * @return ExportMultiCritere1
     */
    public ViewObjectImpl getExportMultiCritere1() {
        return (ViewObjectImpl) findViewObject("ExportMultiCritere1");
    }

    /**
     * Container's getter for CompilCollecte1.
     * @return CompilCollecte1
     */
    public ViewObjectImpl getCompilCollecte1() {
        return (ViewObjectImpl) findViewObject("CompilCollecte1");
    }

    /**
     * Container's getter for CompilLettreVoiture1.
     * @return CompilLettreVoiture1
     */
    public ViewObjectImpl getCompilLettreVoiture1() {
        return (ViewObjectImpl) findViewObject("CompilLettreVoiture1");
    }

    /**
     * Container's getter for CompilLettreVoitureDestination1.
     * @return CompilLettreVoitureDestination1
     */
    public ViewObjectImpl getCompilLettreVoitureDestination1() {
        return (ViewObjectImpl) findViewObject("CompilLettreVoitureDestination1");
    }

    /**
     * Container's getter for CompilExportDestination1.
     * @return CompilExportDestination1
     */
    public ViewObjectImpl getCompilExportDestination1() {
        return (ViewObjectImpl) findViewObject("CompilExportDestination1");
    }

    /**
     * Container's getter for getIdCategUnitMesureFromProduit1.
     * @return getIdCategUnitMesureFromProduit1
     */
    public ViewObjectImpl getgetIdCategUnitMesureFromProduit1() {
        return (ViewObjectImpl) findViewObject("getIdCategUnitMesureFromProduit1");
    }

    /**
     * Container's getter for getUniteMesureEtCateg1.
     * @return getUniteMesureEtCateg1
     */
    public ViewObjectImpl getgetUniteMesureEtCateg1() {
        return (ViewObjectImpl) findViewObject("getUniteMesureEtCateg1");
    }

    /**
     * Container's getter for CeqeView1.
     * @return CeqeView1
     */
    public ViewObjectImpl getCeqeView1() {
        return (ViewObjectImpl) findViewObject("CeqeView1");
    }

    /**
     * Container's getter for CeqeView2.
     * @return CeqeView2
     */
    public ViewObjectImpl getCeqeView2() {
        return (ViewObjectImpl) findViewObject("CeqeView2");
    }

    /**
     * Container's getter for FkCeqe1Link1.
     * @return FkCeqe1Link1
     */
    public ViewLinkImpl getFkCeqe1Link1() {
        return (ViewLinkImpl) findViewLink("FkCeqe1Link1");
    }

    /**
     * Container's getter for getLastIdCeqe1.
     * @return getLastIdCeqe1
     */
    public ViewObjectImpl getgetLastIdCeqe1() {
        return (ViewObjectImpl) findViewObject("getLastIdCeqe1");
    }

    /**
     * Container's getter for getPermisExportActif1.
     * @return getPermisExportActif1
     */
    public ViewObjectImpl getgetPermisExportActif1() {
        return (ViewObjectImpl) findViewObject("getPermisExportActif1");
    }

    /**
     * Container's getter for getCoParPermisActif1.
     * @return getCoParPermisActif1
     */
    public ViewObjectImpl getgetCoParPermisActif1() {
        return (ViewObjectImpl) findViewObject("getCoParPermisActif1");
    }

    /**
     * Container's getter for getCeqeParPermissionnaire1.
     * @return getCeqeParPermissionnaire1
     */
    public ViewObjectImpl getgetCeqeParPermissionnaire1() {
        return (ViewObjectImpl) findViewObject("getCeqeParPermissionnaire1");
    }
    
  

  

    /**
     * Container's getter for origineView1.
     * @return origineView1
     */
 //   public origineViewImpl getorigineView1() {
 //       return (origineViewImpl) findViewObject("origineView1");
 //   }

    /**
     * Container's getter for RegionView6.
     * @return RegionView6
     */
    public RegionViewImpl getRegionView6() {
        return (RegionViewImpl) findViewObject("RegionView6");
    }

    /**
     * Container's getter for DepartementView12.
     * @return DepartementView12
     */
    public DepartementViewImpl getDepartementView12() {
        return (DepartementViewImpl) findViewObject("DepartementView12");
    }

    /**
     * Container's getter for regiontodeplink.
     * @return regiontodeplink
     */
    public ViewLinkImpl getregiontodeplink() {
        return (ViewLinkImpl) findViewLink("regiontodeplink");
    }

    /**
     * Container's getter for CommuneView6.
     * @return CommuneView6
     */
    public CommuneViewImpl getCommuneView6() {
        return (CommuneViewImpl) findViewObject("CommuneView6");
    }

    /**
     * Container's getter for LocaliteView5.
     * @return LocaliteView5
     */
    public ViewObjectImpl getLocaliteView5() {
        return (ViewObjectImpl) findViewObject("LocaliteView5");
    }

    /**
     * Container's getter for CommuneToLocaliteLink.
     * @return CommuneToLocaliteLink
     */
    public ViewLinkImpl getCommuneToLocaliteLink() {
        return (ViewLinkImpl) findViewLink("CommuneToLocaliteLink");
    }

    /**
     * Container's getter for getLocaliteUser1.
     * @return getLocaliteUser1
     */
    public ViewObjectImpl getgetLocaliteUser1() {
        return (ViewObjectImpl) findViewObject("getLocaliteUser1");
    }

    /**
     * Container's getter for getPosteUserView1.
     * @return getPosteUserView1
     */
    public ViewObjectImpl getgetPosteUserView1() {
        return (ViewObjectImpl) findViewObject("getPosteUserView1");
    }

    /**
     * Container's getter for getDepartementUser1.
     * @return getDepartementUser1
     */
    public ViewObjectImpl getgetDepartementUser1() {
        return (ViewObjectImpl) findViewObject("getDepartementUser1");
    }

    /**
     * Container's getter for getUtilisateur1.
     * @return getUtilisateur1
     */
    public ViewObjectImpl getgetUtilisateur1() {
        return (ViewObjectImpl) findViewObject("getUtilisateur1");
    }

    /**
     * Container's getter for getPermissionnairePermis1.
     * @return getPermissionnairePermis1
     */
    public ViewObjectImpl getgetPermissionnairePermis1() {
        return (ViewObjectImpl) findViewObject("getPermissionnairePermis1");
    }

    /**
     * Container's getter for getComunneUser1.
     * @return getComunneUser1
     */
    public ViewObjectImpl getgetComunneUser1() {
        return (ViewObjectImpl) findViewObject("getComunneUser1");
    }
    
    /**

     * Container's getter for getCodeSigif1.
     * @return getCodeSigif1
     */
    public ViewObjectImpl getgetCodeSigif1() {
        return (ViewObjectImpl) findViewObject("getCodeSigif1");
    }

    /**
     * Container's getter for getCodeSigifCommune1.
     * @return getCodeSigifCommune1
     */
    public ViewObjectImpl getgetCodeSigifCommune1() {
        return (ViewObjectImpl) findViewObject("getCodeSigifCommune1");
    }

    /**
     * Container's getter for getPermisActifParPermissionnaire1.
     * @return getPermisActifParPermissionnaire1
     */
    public ViewObjectImpl getgetPermisActifParPermissionnaire1() {
        return (ViewObjectImpl) findViewObject("getPermisActifParPermissionnaire1");
    }

    /**
     * Container's getter for getTousLesPermis1.
     * @return getTousLesPermis1
     */
    public ViewObjectImpl getgetTousLesPermis1() {
        return (ViewObjectImpl) findViewObject("getTousLesPermis1");
    }

    /**
     * Container's getter for PartiesProduitPfnlComplet1.
     * @return PartiesProduitPfnlComplet1
     */
    public PartiesProduitPfnlCompletImpl getPartiesProduitPfnlComplet1() {
        return (PartiesProduitPfnlCompletImpl) findViewObject("PartiesProduitPfnlComplet1");
    }

    /**
     * Container's getter for PermissionnaireEtPermisFinal1.
     * @return PermissionnaireEtPermisFinal1
     */
    public PermissionnaireEtPermisFinalImpl getPermissionnaireEtPermisFinal1() {
        return (PermissionnaireEtPermisFinalImpl) findViewObject("PermissionnaireEtPermisFinal1");
    }

    /**
     * Container's getter for LocaliteView6.
     * @return LocaliteView6
     */
    public ViewObjectImpl getLocaliteView6() {
        return (ViewObjectImpl) findViewObject("LocaliteView6");
    }

    /**
     * Container's getter for CommuneView9.
     * @return CommuneView9
     */
    public CommuneViewImpl getCommuneView9() {
        return (CommuneViewImpl) findViewObject("CommuneView9");
    }

    /**
     * Container's getter for CommuneToLocaliteLinkPlus1.
     * @return CommuneToLocaliteLinkPlus1
     */
    public ViewLinkImpl getCommuneToLocaliteLinkPlus1() {
        return (ViewLinkImpl) findViewLink("CommuneToLocaliteLinkPlus1");
    }

    /**
     * Container's getter for LocaliteView7.
     * @return LocaliteView7
     */
    public ViewObjectImpl getLocaliteView7() {
        return (ViewObjectImpl) findViewObject("LocaliteView7");
    }

    /**
     * Container's getter for CommuneToLocaliteLinkPlus2.
     * @return CommuneToLocaliteLinkPlus2
     */
    public ViewLinkImpl getCommuneToLocaliteLinkPlus2() {
        return (ViewLinkImpl) findViewLink("CommuneToLocaliteLinkPlus2");
    }

    /**
     * Container's getter for PostecontroleView2.
     * @return PostecontroleView2
     */
    public PostecontroleViewImpl getPostecontroleView2() {
        return (PostecontroleViewImpl) findViewObject("PostecontroleView2");
    }

    /**
     * Container's getter for communeToPosteControleLink1.
     * @return communeToPosteControleLink1
     */
    public ViewLinkImpl getcommuneToPosteControleLink1() {
        return (ViewLinkImpl) findViewLink("communeToPosteControleLink1");
    }

    /**
     * Container's getter for PostecontroleView3.
     * @return PostecontroleView3
     */
    public PostecontroleViewImpl getPostecontroleView3() {
        return (PostecontroleViewImpl) findViewObject("PostecontroleView3");
    }

    /**
     * Container's getter for PosteControleToLocaliteLink1.
     * @return PosteControleToLocaliteLink1
     */
    public ViewLinkImpl getPosteControleToLocaliteLink1() {
        return (ViewLinkImpl) findViewLink("PosteControleToLocaliteLink1");
    }

    /**
     * Container's getter for LocaliteView8.
     * @return LocaliteView8
     */
    public ViewObjectImpl getLocaliteView8() {
        return (ViewObjectImpl) findViewObject("LocaliteView8");
    }

    /**
     * Container's getter for LocaliteView9.
     * @return LocaliteView9
     */
    public ViewObjectImpl getLocaliteView9() {
        return (ViewObjectImpl) findViewObject("LocaliteView9");
    }

    /**
     * Container's getter for PosteControleToLocaliteLink2.
     * @return PosteControleToLocaliteLink2
     */
    public ViewLinkImpl getPosteControleToLocaliteLink2() {
        return (ViewLinkImpl) findViewLink("PosteControleToLocaliteLink2");
    }

    /**
     * Container's getter for LettreVoiturePcView1.
     * @return LettreVoiturePcView1
     */
    public ViewObjectImpl getLettreVoiturePcView1() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView1");
    }

    /**
     * Container's getter for LettreVoiturePcView2.
     * @return LettreVoiturePcView2
     */
    public ViewObjectImpl getLettreVoiturePcView2() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView2");
    }

    /**
     * Container's getter for LettreVoiturePcView3.
     * @return LettreVoiturePcView3
     */
    public ViewObjectImpl getLettreVoiturePcView3() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView3");
    }

    /**
     * Container's getter for LettreVoiturePcView4.
     * @return LettreVoiturePcView4
     */
    public ViewObjectImpl getLettreVoiturePcView4() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView4");
    }

    /**
     * Container's getter for LettreVoiturePcView5.
     * @return LettreVoiturePcView5
     */
    public ViewObjectImpl getLettreVoiturePcView5() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView5");
    }

    /**
     * Container's getter for LettreVoiturePcView6.
     * @return LettreVoiturePcView6
     */
    public ViewObjectImpl getLettreVoiturePcView6() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView6");
    }

    /**
     * Container's getter for LettreVoiturePcView7.
     * @return LettreVoiturePcView7
     */
    public ViewObjectImpl getLettreVoiturePcView7() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView7");
    }

    /**
     * Container's getter for ProduitsPfnlView13.
     * @return ProduitsPfnlView13
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView13() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView13");
    }

    /**
     * Container's getter for LettreVoiturePcView8.
     * @return LettreVoiturePcView8
     */
    public ViewObjectImpl getLettreVoiturePcView8() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView8");
    }

    /**
     * Container's getter for ProduitsPfnlView14.
     * @return ProduitsPfnlView14
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView14() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView14");
    }

    /**
     * Container's getter for LettreVoiturePcView9.
     * @return LettreVoiturePcView9
     */
    public ViewObjectImpl getLettreVoiturePcView9() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView9");
    }

    /**
     * Container's getter for ProduitsPfnlView15.
     * @return ProduitsPfnlView15
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView15() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView15");
    }

    /**
     * Container's getter for LettreVoiturePcView10.
     * @return LettreVoiturePcView10
     */
    public ViewObjectImpl getLettreVoiturePcView10() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView10");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView28.
     * @return PartiesProduitsPfnlView28
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView28() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView28");
    }

    /**
     * Container's getter for LettreVoiturePcView11.
     * @return LettreVoiturePcView11
     */
    public ViewObjectImpl getLettreVoiturePcView11() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView11");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView29.
     * @return PartiesProduitsPfnlView29
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView29() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView29");
    }

    /**
     * Container's getter for LettreVoiturePcView12.
     * @return LettreVoiturePcView12
     */
    public ViewObjectImpl getLettreVoiturePcView12() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView12");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView30.
     * @return PartiesProduitsPfnlView30
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView30() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView30");
    }

    /**
     * Container's getter for LettreVoiturePcView13.
     * @return LettreVoiturePcView13
     */
    public ViewObjectImpl getLettreVoiturePcView13() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView13");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView31.
     * @return PartiesProduitsPfnlView31
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView31() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView31");
    }

    /**
     * Container's getter for PartiesRecolteesView3.
     * @return PartiesRecolteesView3
     */
    public PartiesRecolteesViewImpl getPartiesRecolteesView3() {
        return (PartiesRecolteesViewImpl) findViewObject("PartiesRecolteesView3");
    }

    /**
     * Container's getter for LettreVoiturePcView14.
     * @return LettreVoiturePcView14
     */
    public ViewObjectImpl getLettreVoiturePcView14() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView14");
    }

    /**
     * Container's getter for ProduitsPfnlView16.
     * @return ProduitsPfnlView16
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView16() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView16");
    }

    /**
     * Container's getter for LettreVoiturePcView15.
     * @return LettreVoiturePcView15
     */
    public ViewObjectImpl getLettreVoiturePcView15() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView15");
    }

    /**
     * Container's getter for FamillePfnlView3.
     * @return FamillePfnlView3
     */
    public FamillePfnlViewImpl getFamillePfnlView3() {
        return (FamillePfnlViewImpl) findViewObject("FamillePfnlView3");
    }

    /**
     * Container's getter for LettreVoiturePcView16.
     * @return LettreVoiturePcView16
     */
    public ViewObjectImpl getLettreVoiturePcView16() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView16");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView32.
     * @return PartiesProduitsPfnlView32
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView32() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView32");
    }

    /**
     * Container's getter for LettreVoiturePcView17.
     * @return LettreVoiturePcView17
     */
    public ViewObjectImpl getLettreVoiturePcView17() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView17");
    }

    /**
     * Container's getter for PartiesRecolteesView4.
     * @return PartiesRecolteesView4
     */
    public PartiesRecolteesViewImpl getPartiesRecolteesView4() {
        return (PartiesRecolteesViewImpl) findViewObject("PartiesRecolteesView4");
    }

    /**
     * Container's getter for LettreVoiturePcView18.
     * @return LettreVoiturePcView18
     */
    public ViewObjectImpl getLettreVoiturePcView18() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView18");
    }

    /**
     * Container's getter for ProduitsPfnlView17.
     * @return ProduitsPfnlView17
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView17() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView17");
    }

    /**
     * Container's getter for LettreVoiturePcView19.
     * @return LettreVoiturePcView19
     */
    public ViewObjectImpl getLettreVoiturePcView19() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView19");
    }

    /**
     * Container's getter for FamillePfnlView4.
     * @return FamillePfnlView4
     */
    public FamillePfnlViewImpl getFamillePfnlView4() {
        return (FamillePfnlViewImpl) findViewObject("FamillePfnlView4");
    }

    /**
     * Container's getter for LettreVoiturePcView20.
     * @return LettreVoiturePcView20
     */
    public ViewObjectImpl getLettreVoiturePcView20() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView20");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView33.
     * @return PartiesProduitsPfnlView33
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView33() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView33");
    }

    /**
     * Container's getter for LettreVoiturePcView21.
     * @return LettreVoiturePcView21
     */
    public ViewObjectImpl getLettreVoiturePcView21() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView21");
    }

    /**
     * Container's getter for PartiesRecolteesView5.
     * @return PartiesRecolteesView5
     */
    public PartiesRecolteesViewImpl getPartiesRecolteesView5() {
        return (PartiesRecolteesViewImpl) findViewObject("PartiesRecolteesView5");
    }

    /**
     * Container's getter for LettreVoiturePcView22.
     * @return LettreVoiturePcView22
     */
    public ViewObjectImpl getLettreVoiturePcView22() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView22");
    }

    /**
     * Container's getter for ProduitsPfnlView18.
     * @return ProduitsPfnlView18
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView18() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView18");
    }

    /**
     * Container's getter for LettreVoiturePcView23.
     * @return LettreVoiturePcView23
     */
    public ViewObjectImpl getLettreVoiturePcView23() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView23");
    }

    /**
     * Container's getter for FamillePfnlView5.
     * @return FamillePfnlView5
     */
    public FamillePfnlViewImpl getFamillePfnlView5() {
        return (FamillePfnlViewImpl) findViewObject("FamillePfnlView5");
    }

    /**
     * Container's getter for LettreVoiturePcView24.
     * @return LettreVoiturePcView24
     */
    public ViewObjectImpl getLettreVoiturePcView24() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView24");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView34.
     * @return PartiesProduitsPfnlView34
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView34() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView34");
    }

    /**
     * Container's getter for LettreVoiturePcView25.
     * @return LettreVoiturePcView25
     */
    public ViewObjectImpl getLettreVoiturePcView25() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView25");
    }

    /**
     * Container's getter for FkLettrevoiturepc4Link.
     * @return FkLettrevoiturepc4Link
     */
    public ViewLinkImpl getFkLettrevoiturepc4Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc4Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc1Link.
     * @return FkLettrevoiturepc1Link
     */
    public ViewLinkImpl getFkLettrevoiturepc1Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc1Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc3Link.
     * @return FkLettrevoiturepc3Link
     */
    public ViewLinkImpl getFkLettrevoiturepc3Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc3Link");
    }

    /**
     * Container's getter for fk_ProduitsPfnl1Assoc1Link.
     * @return fk_ProduitsPfnl1Assoc1Link
     */
    public ViewLinkImpl getfk_ProduitsPfnl1Assoc1Link() {
        return (ViewLinkImpl) findViewLink("fk_ProduitsPfnl1Assoc1Link");
    }

    /**
     * Container's getter for fk_ProduitsPfnlAssoc1Link.
     * @return fk_ProduitsPfnlAssoc1Link
     */
    public ViewLinkImpl getfk_ProduitsPfnlAssoc1Link() {
        return (ViewLinkImpl) findViewLink("fk_ProduitsPfnlAssoc1Link");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Assoc5Link.
     * @return ProduitspfnlIbfk1Assoc5Link
     */
    public ViewLinkImpl getProduitspfnlIbfk1Assoc5Link() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Assoc5Link");
    }

    /**
     * Container's getter for fk_PartiesProduitsPfnl1Assoc1Link.
     * @return fk_PartiesProduitsPfnl1Assoc1Link
     */
    public ViewLinkImpl getfk_PartiesProduitsPfnl1Assoc1Link() {
        return (ViewLinkImpl) findViewLink("fk_PartiesProduitsPfnl1Assoc1Link");
    }

    /**
     * Container's getter for fk_PartiesProduitsPfnlAssoc1Link.
     * @return fk_PartiesProduitsPfnlAssoc1Link
     */
    public ViewLinkImpl getfk_PartiesProduitsPfnlAssoc1Link() {
        return (ViewLinkImpl) findViewLink("fk_PartiesProduitsPfnlAssoc1Link");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc5Link.
     * @return FkPartiesproduitspfnl2Assoc5Link
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc5Link() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc5Link");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc5Link.
     * @return FkPartiesproduitspfnl1Assoc5Link
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc5Link() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc5Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc3Assoc11Link.
     * @return FkLettrevoiturepc3Assoc11Link
     */
    public ViewLinkImpl getFkLettrevoiturepc3Assoc11Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc3Assoc11Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc3Assoc19Link.
     * @return FkLettrevoiturepc3Assoc19Link
     */
    public ViewLinkImpl getFkLettrevoiturepc3Assoc19Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc3Assoc19Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc3Assoc32Link.
     * @return FkLettrevoiturepc3Assoc32Link
     */
    public ViewLinkImpl getFkLettrevoiturepc3Assoc32Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc3Assoc32Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc3Assoc35Link.
     * @return FkLettrevoiturepc3Assoc35Link
     */
    public ViewLinkImpl getFkLettrevoiturepc3Assoc35Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc3Assoc35Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc1Assoc11Link.
     * @return FkLettrevoiturepc1Assoc11Link
     */
    public ViewLinkImpl getFkLettrevoiturepc1Assoc11Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc1Assoc11Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc1Assoc19Link.
     * @return FkLettrevoiturepc1Assoc19Link
     */
    public ViewLinkImpl getFkLettrevoiturepc1Assoc19Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc1Assoc19Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc1Assoc32Link.
     * @return FkLettrevoiturepc1Assoc32Link
     */
    public ViewLinkImpl getFkLettrevoiturepc1Assoc32Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc1Assoc32Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc1Assoc35Link.
     * @return FkLettrevoiturepc1Assoc35Link
     */
    public ViewLinkImpl getFkLettrevoiturepc1Assoc35Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc1Assoc35Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc4Assoc11Link.
     * @return FkLettrevoiturepc4Assoc11Link
     */
    public ViewLinkImpl getFkLettrevoiturepc4Assoc11Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc4Assoc11Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc4Assoc19Link.
     * @return FkLettrevoiturepc4Assoc19Link
     */
    public ViewLinkImpl getFkLettrevoiturepc4Assoc19Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc4Assoc19Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc4Assoc32Link.
     * @return FkLettrevoiturepc4Assoc32Link
     */
    public ViewLinkImpl getFkLettrevoiturepc4Assoc32Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc4Assoc32Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc4Assoc35Link.
     * @return FkLettrevoiturepc4Assoc35Link
     */
    public ViewLinkImpl getFkLettrevoiturepc4Assoc35Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc4Assoc35Link");
    }

    /**
     * Container's getter for LettreVoiturePcView26.
     * @return LettreVoiturePcView26
     */
    public ViewObjectImpl getLettreVoiturePcView26() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView26");
    }

    /**
     * Container's getter for LettreVoiturePcView27.
     * @return LettreVoiturePcView27
     */
    public ViewObjectImpl getLettreVoiturePcView27() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView27");
    }

    /**
     * Container's getter for CeqpcToLettreVoiturePcLink1.
     * @return CeqpcToLettreVoiturePcLink1
     */
    public ViewLinkImpl getCeqpcToLettreVoiturePcLink1() {
        return (ViewLinkImpl) findViewLink("CeqpcToLettreVoiturePcLink1");
    }

    /**
     * Container's getter for TypeDocumentView2.
     * @return TypeDocumentView2
     */
    public ViewObjectImpl getTypeDocumentView2() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView2");
    }

    /**
     * Container's getter for LettreVoiturePcView28.
     * @return LettreVoiturePcView28
     */
    public ViewObjectImpl getLettreVoiturePcView28() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView28");
    }

    /**
     * Container's getter for TypeDocumentView3.
     * @return TypeDocumentView3
     */
    public ViewObjectImpl getTypeDocumentView3() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView3");
    }

    /**
     * Container's getter for LettreVoiturePcView29.
     * @return LettreVoiturePcView29
     */
    public ViewObjectImpl getLettreVoiturePcView29() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView29");
    }

    /**
     * Container's getter for TypeDocumentView4.
     * @return TypeDocumentView4
     */
    public ViewObjectImpl getTypeDocumentView4() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView4");
    }

    /**
     * Container's getter for LettreVoiturePcView30.
     * @return LettreVoiturePcView30
     */
    public ViewObjectImpl getLettreVoiturePcView30() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView30");
    }

    /**
     * Container's getter for TypeDocumentView5.
     * @return TypeDocumentView5
     */
    public ViewObjectImpl getTypeDocumentView5() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView5");
    }

    /**
     * Container's getter for LettreVoiturePcView31.
     * @return LettreVoiturePcView31
     */
    public ViewObjectImpl getLettreVoiturePcView31() {
        return (ViewObjectImpl) findViewObject("LettreVoiturePcView31");
    }

    /**
     * Container's getter for TypeDocumentView6.
     * @return TypeDocumentView6
     */
    public ViewObjectImpl getTypeDocumentView6() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView6");
    }

    /**
     * Container's getter for ProduitsPfnlView19.
     * @return ProduitsPfnlView19
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView19() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView19");
    }

    /**
     * Container's getter for TypeDocumentView7.
     * @return TypeDocumentView7
     */
    public ViewObjectImpl getTypeDocumentView7() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView7");
    }

    /**
     * Container's getter for ProduitsPfnlView20.
     * @return ProduitsPfnlView20
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView20() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView20");
    }

    /**
     * Container's getter for TypeDocumentView8.
     * @return TypeDocumentView8
     */
    public ViewObjectImpl getTypeDocumentView8() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView8");
    }

    /**
     * Container's getter for ProduitsPfnlView21.
     * @return ProduitsPfnlView21
     */
    public ProduitsPfnlViewImpl getProduitsPfnlView21() {
        return (ProduitsPfnlViewImpl) findViewObject("ProduitsPfnlView21");
    }

    /**
     * Container's getter for TypeDocumentView9.
     * @return TypeDocumentView9
     */
    public ViewObjectImpl getTypeDocumentView9() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView9");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView35.
     * @return PartiesProduitsPfnlView35
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView35() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView35");
    }

    /**
     * Container's getter for TypeDocumentView10.
     * @return TypeDocumentView10
     */
    public ViewObjectImpl getTypeDocumentView10() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView10");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView36.
     * @return PartiesProduitsPfnlView36
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView36() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView36");
    }

    /**
     * Container's getter for TypeDocumentView11.
     * @return TypeDocumentView11
     */
    public ViewObjectImpl getTypeDocumentView11() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView11");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView37.
     * @return PartiesProduitsPfnlView37
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView37() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView37");
    }

    /**
     * Container's getter for TypeDocumentView12.
     * @return TypeDocumentView12
     */
    public ViewObjectImpl getTypeDocumentView12() {
        return (ViewObjectImpl) findViewObject("TypeDocumentView12");
    }

    /**
     * Container's getter for PartiesProduitsPfnlView38.
     * @return PartiesProduitsPfnlView38
     */
    public PartiesProduitsPfnlViewImpl getPartiesProduitsPfnlView38() {
        return (PartiesProduitsPfnlViewImpl) findViewObject("PartiesProduitsPfnlView38");
    }

    /**
     * Container's getter for fk_LettreVoiturePcLink.
     * @return fk_LettreVoiturePcLink
     */
    public ViewLinkImpl getfk_LettreVoiturePcLink() {
        return (ViewLinkImpl) findViewLink("fk_LettreVoiturePcLink");
    }

    /**
     * Container's getter for FkLettrevoiturepc4Assoc36Link.
     * @return FkLettrevoiturepc4Assoc36Link
     */
    public ViewLinkImpl getFkLettrevoiturepc4Assoc36Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc4Assoc36Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc3Assoc36Link.
     * @return FkLettrevoiturepc3Assoc36Link
     */
    public ViewLinkImpl getFkLettrevoiturepc3Assoc36Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc3Assoc36Link");
    }

    /**
     * Container's getter for FkLettrevoiturepc1Assoc36Link.
     * @return FkLettrevoiturepc1Assoc36Link
     */
    public ViewLinkImpl getFkLettrevoiturepc1Assoc36Link() {
        return (ViewLinkImpl) findViewLink("FkLettrevoiturepc1Assoc36Link");
    }

    /**
     * Container's getter for fk_ProduitsPfnl1Assoc2Link.
     * @return fk_ProduitsPfnl1Assoc2Link
     */
    public ViewLinkImpl getfk_ProduitsPfnl1Assoc2Link() {
        return (ViewLinkImpl) findViewLink("fk_ProduitsPfnl1Assoc2Link");
    }

    /**
     * Container's getter for fk_ProduitsPfnlAssoc2Link.
     * @return fk_ProduitsPfnlAssoc2Link
     */
    public ViewLinkImpl getfk_ProduitsPfnlAssoc2Link() {
        return (ViewLinkImpl) findViewLink("fk_ProduitsPfnlAssoc2Link");
    }

    /**
     * Container's getter for ProduitspfnlIbfk1Assoc6Link.
     * @return ProduitspfnlIbfk1Assoc6Link
     */
    public ViewLinkImpl getProduitspfnlIbfk1Assoc6Link() {
        return (ViewLinkImpl) findViewLink("ProduitspfnlIbfk1Assoc6Link");
    }

    /**
     * Container's getter for fk_PartiesProduitsPfnl1Assoc2Link.
     * @return fk_PartiesProduitsPfnl1Assoc2Link
     */
    public ViewLinkImpl getfk_PartiesProduitsPfnl1Assoc2Link() {
        return (ViewLinkImpl) findViewLink("fk_PartiesProduitsPfnl1Assoc2Link");
    }

    /**
     * Container's getter for fk_PartiesProduitsPfnlAssoc2Link.
     * @return fk_PartiesProduitsPfnlAssoc2Link
     */
    public ViewLinkImpl getfk_PartiesProduitsPfnlAssoc2Link() {
        return (ViewLinkImpl) findViewLink("fk_PartiesProduitsPfnlAssoc2Link");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl2Assoc6Link.
     * @return FkPartiesproduitspfnl2Assoc6Link
     */
    public ViewLinkImpl getFkPartiesproduitspfnl2Assoc6Link() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl2Assoc6Link");
    }

    /**
     * Container's getter for FkPartiesproduitspfnl1Assoc6Link.
     * @return FkPartiesproduitspfnl1Assoc6Link
     */
    public ViewLinkImpl getFkPartiesproduitspfnl1Assoc6Link() {
        return (ViewLinkImpl) findViewLink("FkPartiesproduitspfnl1Assoc6Link");
    }

    /**
     * Container's getter for typeDocViewFinal1.
     * @return typeDocViewFinal1
     */
    public typeDocViewFinalImpl gettypeDocViewFinal1() {
        return (typeDocViewFinalImpl) findViewObject("typeDocViewFinal1");
    }

    /**
     * Container's getter for UniteMesureWithPartieProduitPfnl1.
     * @return UniteMesureWithPartieProduitPfnl1
     */
    public UniteMesureWithPartieProduitPfnlImpl getUniteMesureWithPartieProduitPfnl1() {
        return (UniteMesureWithPartieProduitPfnlImpl) findViewObject("UniteMesureWithPartieProduitPfnl1");
    }

    /**
     * Container's getter for UniteMesureWithPartieProduitPfnl2.
     * @return UniteMesureWithPartieProduitPfnl2
     */
    public UniteMesureWithPartieProduitPfnlImpl getUniteMesureWithPartieProduitPfnl2() {
        return (UniteMesureWithPartieProduitPfnlImpl) findViewObject("UniteMesureWithPartieProduitPfnl2");
    }

    /**
     * Container's getter for LocaliteLettreVoiture1.
     * @return LocaliteLettreVoiture1
     */
    public LocaliteLettreVoitureImpl getLocaliteLettreVoiture1() {
        return (LocaliteLettreVoitureImpl) findViewObject("LocaliteLettreVoiture1");
    }

    /**
     * Container's getter for getCodeSigifPosteControle1.
     * @return getCodeSigifPosteControle1
     */
    public getCodeSigifPosteControleImpl getgetCodeSigifPosteControle1() {
        return (getCodeSigifPosteControleImpl) findViewObject("getCodeSigifPosteControle1");
    }

    /**
     * Container's getter for DepartementEtRegionView1.
     * @return DepartementEtRegionView1
     */
    public DepartementEtRegionViewImpl getDepartementEtRegionView1() {
        return (DepartementEtRegionViewImpl) findViewObject("DepartementEtRegionView1");
    }

    /**
     * Container's getter for getLibelleFixe1.
     * @return getLibelleFixe1
     */
    public getLibelleFixeImpl getgetLibelleFixe1() {
        return (getLibelleFixeImpl) findViewObject("getLibelleFixe1");
    }

    /**
     * Container's getter for getRegionUser1.
     * @return getRegionUser1
     */
    public ViewObjectImpl getgetRegionUser1() {
        return (ViewObjectImpl) findViewObject("getRegionUser1");
    }

    /**
     * Container's getter for getRegion1.
     * @return getRegion1
     */
    public ViewObjectImpl getgetRegion1() {
        return (ViewObjectImpl) findViewObject("getRegion1");
    }

    /**
     * Container's getter for RegionView7.
     * @return RegionView7
     */
    public RegionViewImpl getRegionView7() {
        return (RegionViewImpl) findViewObject("RegionView7");
    }

    /**
     * Container's getter for CollectepfnlView6.
     * @return CollectepfnlView6
     */
    public CollectepfnlViewImpl getCollectepfnlView6() {
        return (CollectepfnlViewImpl) findViewObject("CollectepfnlView6");
    }

    /**
     * Container's getter for RegionToCollecteLink.
     * @return RegionToCollecteLink
     */
    public ViewLinkImpl getRegionToCollecteLink() {
        return (ViewLinkImpl) findViewLink("RegionToCollecteLink");
    }

    /**
     * Container's getter for RegionView8.
     * @return RegionView8
     */
    public RegionViewImpl getRegionView8() {
        return (RegionViewImpl) findViewObject("RegionView8");
    }

    /**
     * Container's getter for CollectepfnlView7.
     * @return CollectepfnlView7
     */
    public CollectepfnlViewImpl getCollectepfnlView7() {
        return (CollectepfnlViewImpl) findViewObject("CollectepfnlView7");
    }

    /**
     * Container's getter for RegToCollLink.
     * @return RegToCollLink
     */
    public ViewLinkImpl getRegToCollLink() {
        return (ViewLinkImpl) findViewLink("RegToCollLink");
    }

    /**
     * Container's getter for RegionView9.
     * @return RegionView9
     */
    public RegionViewImpl getRegionView9() {
        return (RegionViewImpl) findViewObject("RegionView9");
    }

    /**
     * Container's getter for CollectepfnlView8.
     * @return CollectepfnlView8
     */
    public CollectepfnlViewImpl getCollectepfnlView8() {
        return (CollectepfnlViewImpl) findViewObject("CollectepfnlView8");
    }

    /**
     * Container's getter for RegionToCollecteLink1.
     * @return RegionToCollecteLink1
     */
    public ViewLinkImpl getRegionToCollecteLink1() {
        return (ViewLinkImpl) findViewLink("RegionToCollecteLink1");
    }

    /**
     * Container's getter for PosteControleComplet1.
     * @return PosteControleComplet1
     */
    public PosteControleCompletImpl getPosteControleComplet1() {
        return (PosteControleCompletImpl) findViewObject("PosteControleComplet1");
    }

    /**
     * Container's getter for localiteComplet1.
     * @return localiteComplet1
     */
    public localiteCompletImpl getlocaliteComplet1() {
        return (localiteCompletImpl) findViewObject("localiteComplet1");
    }

    /**
     * Container's getter for getExportDocumentsOfficiels1.
     * @return getExportDocumentsOfficiels1
     */
    public getExportDocumentsOfficielsImpl getgetExportDocumentsOfficiels1() {
        return (getExportDocumentsOfficielsImpl) findViewObject("getExportDocumentsOfficiels1");
    }

    /**
     * Container's getter for PermisView12.
     * @return PermisView12
     */
    public PermisViewImpl getPermisView12() {
        return (PermisViewImpl) findViewObject("PermisView12");
    }

    /**
     * Container's getter for DetailpermisView7.
     * @return DetailpermisView7
     */
    public DetailpermisViewImpl getDetailpermisView7() {
        return (DetailpermisViewImpl) findViewObject("DetailpermisView7");
    }

    /**
     * Container's getter for PermisToDetailsPermisLink.
     * @return PermisToDetailsPermisLink
     */
    public ViewLinkImpl getPermisToDetailsPermisLink() {
        return (ViewLinkImpl) findViewLink("PermisToDetailsPermisLink");
    }

    /**
     * Container's getter for DetailpermisView8.
     * @return DetailpermisView8
     */
    public DetailpermisViewImpl getDetailpermisView8() {
        return (DetailpermisViewImpl) findViewObject("DetailpermisView8");
    }

    /**
     * Container's getter for PermisToDetailsPermisLink1.
     * @return PermisToDetailsPermisLink1
     */
    public ViewLinkImpl getPermisToDetailsPermisLink1() {
        return (ViewLinkImpl) findViewLink("PermisToDetailsPermisLink1");
    }
}


