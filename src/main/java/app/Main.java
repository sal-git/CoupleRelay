/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import io.javalin.Javalin;
import io.javalin.core.util.RouteOverviewPlugin;

/**
 *
 * @author Stephen
 */
public class Main {
    
    public static void main(String[] args){
        Javalin app = Javalin.create(config -> {
//            config.addStaticFiles("/public");
//            config.registerPlugin(new RouteOverviewPlugin("/routes"));
        }).start(8000);

        app.routes(() -> {
            
        });

    }
    
}
