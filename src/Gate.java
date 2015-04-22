/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
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
    int dx, dy;

    public Gate() {
        this.adapter = new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                dx = e.getXOnScreen() - getX();
                dy = e.getYOnScreen() - getY();
            }

            public void mouseDragged(MouseEvent e) {
                setLocation(e.getXOnScreen() - dx, e.getYOnScreen() - dy);
            }

        };
        setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        setMaximumSize(gateDim);
        setMinimumSize(gateDim);
        setPreferredSize(gateDim);
        addMouseListener(adapter);
        addMouseMotionListener(adapter);

    }

    public void paint(Graphics2D g) {
        g.setColor(Color.RED);
        g.drawLine(50, 3, 50, 20);
        paintBorder(g);
    }

    public abstract boolean isConnected();

}
