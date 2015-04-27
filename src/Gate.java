/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Noah
 */
public abstract class Gate extends JLabel {

    public boolean input1=false;
    public boolean input2=false;
    public boolean output=false;
    public boolean source=false;
    public boolean grounded=false;
    public Dimension gateDim = new Dimension(100, 100);
    public ArrayList<Point2D.Double> nodes;

    
    int dx, dy;

    public Gate() {
        this.nodes = new ArrayList<>();

        setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));

        setMaximumSize(gateDim);
        setMinimumSize(gateDim);
        setPreferredSize(gateDim);

    }

    @Override
    public void paint(Graphics g1) {

        super.paint(g1);
        Graphics2D g = (Graphics2D) g1;
        g.setStroke(new BasicStroke(10));
        g.setColor(Color.BLACK);
        if(isConnected()) {
            g.setColor(Color.GREEN);
        }

    }

    public abstract boolean isConnected();

    public abstract void addNodes();

    public void updateNodes() {
        while (this.nodes.size() > 0) {
            this.nodes.remove(0);
        }
        this.addNodes();
    }

    public void removeGate() {
        Container parent = this.getParent();
        parent.remove(this);
        parent.revalidate();
        parent.repaint();
    }

}
