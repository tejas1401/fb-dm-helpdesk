package com.richpanel.fbhelpdesk.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FBDMhelpdeskWebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("inside root config");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("inside get servlet config classes");
        return new Class[]{FBDMHelpdeskConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("inside servlet mapping");
        return new String[]{"/"};
    }
}
