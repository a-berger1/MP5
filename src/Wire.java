/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.geom.Line2D;
import java.awt.Point;
import java.awt.Color;

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

    public Wire(Point start, Point end, Color c) {
        super(start, end);
        this.color = c;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color c) {
        color = c;
    }
}
