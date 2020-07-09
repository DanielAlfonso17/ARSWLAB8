package edu.escuelaing.arsw.tallerInteractivo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication app = new SpringApplication(App.class);
        
        String puerto = getPort()+"";
		System.setProperty("server.port", puerto);
              app.run(args);
    }
    
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000; //returns default port if heroku-port isn't set (i.e. on localhost)
    }
}
