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
import java.awt.Point;
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
            @Override
            public void mousePressed(MouseEvent e) {
                dx = e.getXOnScreen() - getX();
                dy = e.getYOnScreen() - getY();
            }

            @Override
            public void mouseDragged(MouseEvent e) {

                setLocation(e.getXOnScreen() - dx, e.getYOnScreen() - dy);
                if (getLocation().x <= 0) {
                    setLocation(new Point(0, getLocation().y));
                }
                if (getLocation().y <= 50) {
                    setLocation(new Point(getLocation().x, 50));
                }
                if (getLocation().y <= 50) {
                    setLocation(new Point(getLocation().x, 50));
                }
                if (getLocation().x >= getParent().getWidth() - 250) {
                    setLocation(new Point(getParent().getWidth() - 240, getY()));
                }
                if (getLocation().y >= getParent().getHeight() - 150) {
                    setLocation(new Point(getX(), getParent().getHeight() - 150));
                }
                if (getLocation().y >= getParent().getHeight() - 150) {
                    setLocation(new Point(getX(), getParent().getHeight() - 150));
                }
            }

        };
        setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        setMaximumSize(gateDim);
        setMinimumSize(gateDim);
        setPreferredSize(gateDim);
        addMouseListener(adapter);
        addMouseMotionListener(adapter);

    }

    @Override
    public void paint(Graphics g1) {

        super.paint(g1);
        Graphics2D g = (Graphics2D) g1;
        g.setStroke(new BasicStroke(10));

    }

    public abstract boolean isConnected();

}
