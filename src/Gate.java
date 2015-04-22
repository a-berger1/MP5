/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Noah
 */
public abstract class Gate extends JLabel {

    public boolean input1;
    public boolean input2;
    public boolean output;
    public boolean source;
    public boolean grounded;
    public Dimension gateDim = new Dimension(100, 100);
    MouseAdapter adapter;

    



    public Gate() {
        this.adapter = new MouseAdapter() {          
            public void mousePressed(MouseEvent e) {
                System.out.println("Yes");
            }
             public void mouseReleased(MouseEvent e) {
                setLocation(e.getXOnScreen(),e.getYOnScreen());
            }
        };
        setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        setMaximumSize(gateDim);
        setMinimumSize(gateDim);
        setPreferredSize(gateDim);
        addMouseListener(adapter);
        addMouseMotionListener(adapter);

    }

    public abstract boolean isConnected();

}
