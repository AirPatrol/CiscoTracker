/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import oauth.RequestsManager;
import position.PositionManager;

/**
 *
 * @author Daan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        //CiscoTracker t = new CiscoTracker();
        //t.addImage();
        //t.setVisible(true);
        
        RequestsManager m = new RequestsManager();
        PositionManager p = new PositionManager();
        System.out.println(p.translateToImageXY(382.45, 332.23));
        
        CiscoTracker t = new CiscoTracker();
        t.setVisible(true); 
        t.getImagePanel().setPoint(p.translateToImageXY(382.45, 332.23));
        
        System.out.println(m.getName("8bab983efc317349cae7e4db6fb0b355"));
        System.out.println(m.getHistory("8bab983efc317349cae7e4db6fb0b355"));        
    }
}
