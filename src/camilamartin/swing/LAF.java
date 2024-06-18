package camilamartin.swing;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author 2004c
 */
public class LAF {
    
     /**
     * Cambia el diseño del JFrame, segun el SO estemos
     */
    public static void disenoGUI(){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
            System.out.println("Error setting Java LAF: "+e);
        }
    }
}

