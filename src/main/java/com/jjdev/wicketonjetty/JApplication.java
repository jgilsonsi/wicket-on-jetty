package com.jjdev.wicketonjetty;

import com.jjdev.wicketonjetty.pages.JHomePage;
import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.protocol.http.WebApplication;

/**
 *
 * @author jgilson
 */
public class JApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return JHomePage.class;
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    public RuntimeConfigurationType getConfigurationType() {
        return RuntimeConfigurationType.DEVELOPMENT;
    }

}
