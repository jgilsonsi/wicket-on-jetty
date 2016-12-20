package com.jjdev.wicketonjetty.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 *
 * @author jgilson
 */
public class JHomePage extends WebPage {

    public JHomePage() {
        super();

        add(new Label("lblTitle", "Olá! Este é um exemplo de uso do framework Apache Wicket com Jetty embarcado."));
    }

}
