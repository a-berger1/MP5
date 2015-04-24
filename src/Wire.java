/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.geom.Line2D;
import java.awt.Point;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author andy
 */
public class Wire extends Line2D.Double {

    private Color color;

    public Wire() {
        super();
        color = Color.BLACK;
    }

    public Wire(Point start, Point end, Color c, ArrayList<Gate> g) {
        super(start, end);
        this.color = c;
        this.snapWire(g);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color c) {
        color = c;
    }

    public void snapWire(ArrayList<Gate> gates) {

        for (Gate g : gates) {
            for (Point2D.Double node : g.nodes) {
                if ((node.getX() - x2) * (node.getX() - x2) + (node.getY() - y2) * (node.getY() - y2) <= 625) {
                    x2 = node.getX();
                    y2 = node.getY();
                }
            }

        }
    }

}
