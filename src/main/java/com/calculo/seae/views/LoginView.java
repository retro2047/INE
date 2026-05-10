package com.calculo.seae.views;

import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class LoginView extends VerticalLayout {

    public LoginView() {

        LoginForm login = new LoginForm();

        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);

        add(login);
        //<theme-editor-local-classname>
        addClassName("login-view-vertical-layout-1");
getStyle().setWidth("1285px");
    }
    
}
