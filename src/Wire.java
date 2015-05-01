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

/**
 *Wire class, extends LIne2D.DOuble, and also contains color information, and the snapping of wires to nodes.
 * @author andy
 */
public final class Wire extends Line2D.Double {

    private Color color;

    /**
     * COnstructor == sets color to a default of black.
     */
    public Wire() {
        super();
        color = Color.BLACK;
    }

    /**
     *Constructor that draws a wire based on both start and end points, as well as the color, and arraylist of gates to check nodes to snap to.
     * @param start start point
     * @param end end point
     * @param c WIre color
     * @param g gate Arraylist
     */
    public Wire(Point start, Point end, Color c, ArrayList<Gate> g) {
        super(start, end);
        this.color = c;
        this.snapWire(g);
    }

    /**
     *Gets the color of the wire
     * @return Returns the color of the wire
     */
    public Color getColor() {
        return color;
    }

    /**
     *Sets Wire Color
     * @param c Sets the color of the wire
     */
    public void setColor(Color c) {
        color = c;
    }
    
    /**
     *Snaps wire to nodes of gates from an arraylist.
     * @param gates the arraylist of gates to check nodes from
     */
    public void snapWire(ArrayList<Gate> gates) {

        for (Gate g : gates) {
            for (Point2D.Double node : g.nodes) {
                if ((node.getX() - x2) * (node.getX() - x2) + (node.getY() - y2) * (node.getY() - y2) <= 625 ) {
                    x2 = node.getX();
                    y2 = node.getY();
                }
                 if ((node.getX() - x1) * (node.getX() - x1) + (node.getY() - y1) * (node.getY() - y1) <= 625) {
                    x1 = node.getX();
                    y1 = node.getY();
                }
            }

        }
    }

}
