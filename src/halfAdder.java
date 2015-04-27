
import java.awt.Graphics;
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
public class halfAdder extends Gate {

    public halfAdder() {

    }

    @Override
    public void addNodes() {
        nodes.add(new Point2D.Double(this.getX() + 75, this.getY()));
        nodes.add(new Point2D.Double(this.getX() + 25, this.getY()));
        nodes.add(new Point2D.Double(this.getX() + 50, this.getY() + 100));
    }

    @Override
    public boolean isConnected() {
        if (input1 && input2) {
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
        g1.drawLine(25,0,25,5);
        g1.drawLine(75,0,75,5);
        g1.drawLine(0,50,5,50);
        g1.drawLine(50,100,50,95);


    }

}
