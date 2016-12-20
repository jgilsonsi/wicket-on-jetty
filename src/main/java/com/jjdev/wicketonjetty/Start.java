package com.jjdev.wicketonjetty;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Start {

    public static void main(String[] args) {

        String port = "8080";

        try {
            String webPort = System.getenv("PORT");
            if (webPort == null || webPort.isEmpty()) {
                webPort = port;
            }else{
                System.out.println("---> Port 8080 in use");
            }

            String webappDirLocation = "src/main/webapp/";

            Server server = new Server(Integer.valueOf(webPort));
            WebAppContext root = new WebAppContext();
            root.setContextPath("/jjdev");
            root.setDescriptor(webappDirLocation + "/WEB-INF/web.xml");
            root.setResourceBase(webappDirLocation);
            root.setParentLoaderPriority(true);

            System.out.println("\n\n---> Starting Jetty on port " + port);

            server.setHandler(root);
            server.start();
            server.join();
        } catch (Exception e) {
            System.out.println("---> Jetty can't be started");
        }
    }
}
