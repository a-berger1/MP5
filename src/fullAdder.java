
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andy
 */
public class fullAdder extends Gate {

    public boolean input3;

    public fullAdder() {

    }

    @Override
    public void addNodes() {

        nodes.add(new Point2D.Double(this.getX() + 15, this.getY()));
        nodes.add(new Point2D.Double(this.getX() + 50, this.getY()));
        nodes.add(new Point2D.Double(this.getX() + 85, this.getY()));
        nodes.add(new Point2D.Double(this.getX() + 50, this.getY() + 100));
        nodes.add(new Point2D.Double(this.getX(), this.getY() + 50));

    }

    @Override
    public boolean isConnected() {
        return false;
    }

    public boolean isS() {
        if ((input1 && !input2) || (!input1 && input2) || (input1 && input2 && input3)) {
            return true;
        }
        return false;
    }

    public boolean isC() {
        if ((input1 && input2) || (input1 && input2) || (input1 && input2 && input3)) {
            return true;
        }
        return false;
    }

    @Override
    public void paint(Graphics g1) {
        super.paint(g1);
//        g1.drawLine(0, 0, 100, 0);
//        g1.drawLine(0, 0, 0, 100);
//        g1.drawLine(100, 0, 100, 100);
//        g1.drawLine(0, 100, 100, 100);

        if (this.input1) {
            g1.setColor(Color.RED);
            g1.drawLine(85, 0, 85, 5);
            g1.setColor(Color.BLACK);
        } else {
            g1.drawLine(85, 0, 85, 5);
        }
        if (this.input2) {
            g1.setColor(Color.RED);
            g1.drawLine(50, 0, 50, 5);
            g1.setColor(Color.BLACK);
        } else {
            g1.drawLine(50, 0, 50, 5);
        }
        if (this.input3) {
            g1.setColor(Color.RED);
            g1.drawLine(15, 0, 15, 5);
            g1.setColor(Color.BLACK);
        } else {
            g1.drawLine(15, 0, 15, 5);
        }
        if (this.isS()) {
            g1.setColor(Color.RED);
            g1.drawLine(50, 100, 50, 95);
            g1.setColor(Color.BLACK);
        } else {
            g1.drawLine(50, 100, 50, 95);
        }

        if (this.isC()) {
            g1.setColor(Color.RED);
            g1.drawLine(0, 50, 5, 50);
            g1.setColor(Color.BLACK);
        } else{ g1.drawLine(0, 50, 5, 50);}

    }

}
