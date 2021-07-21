package cm.gov.minfof.view;

import cm.gov.minfof.model.entity.UserData;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.servlet.http.HttpSession;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;

import oracle.jbo.ApplicationModule;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewCriteriaRow;
import oracle.jbo.ViewObject;

public class CollecteBeanSession implements Serializable {
    @SuppressWarnings("compatibility:5058748498732772355")
    private static final long serialVersionUID = 1L;

    public CollecteBeanSession() {
        System.out.println("Je suis dans le constructeur de CollecteBeanSession");

    }

}
