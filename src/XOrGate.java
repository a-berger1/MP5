
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Noah
 */
public class XOrGate extends Gate {

    public XOrGate() {
        input1 = false;
        input2 = false;
        output = false;

        grounded = false;
    }

    @Override
    public boolean isConnected() {
        if ((input1 ^ input2) && output) {
            return true;
        }
        return false;

    }

    @Override
    public void paint(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;
        super.paint(g1);
        g1.drawLine(30, 0, 30, 38);
        g1.drawLine(70, 0, 70, 38);

        g1.drawArc(5, -25, 90, 70, 220, 100);
        g.setStroke(new BasicStroke(5));
        g1.drawArc(5, -45, 90, 70, 220, 100);
        g.setStroke(new BasicStroke(10));
        g1.drawLine(15, 60, 15, 32);
        g1.drawLine(85, 60, 85, 32);
        g1.drawArc(15, 25, 70, 70, 180, 180);

    }

    @Override
    public void addNodes() {
        nodes.add(new Point2D.Double(this.getX() + 70, this.getY()));
        nodes.add(new Point2D.Double(this.getX() + 30, this.getY()));
        nodes.add(new Point2D.Double(this.getX() + 50, this.getY() + 100));
    }

}
