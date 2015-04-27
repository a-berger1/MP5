
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
 * @author Noah
 */
public class AndGate extends Gate {

    

    public AndGate() {

    }
    @Override
    public void addNodes() {
        nodes.add(new Point2D.Double(this.getX()+75, this.getY()));
        nodes.add(new Point2D.Double(this.getX()+25, this.getY()));
        nodes.add(new Point2D.Double(this.getX()+50, this.getY()+100));
    }

    @Override
    public boolean isConnected() {
        if(input1 && input2 && output){
            return true;
        }
        return false;
    }

    @Override
    public void paint(Graphics g1) {
        super.paint(g1);
        g1.drawLine(25, 0, 25, 20);
        g1.drawLine(75, 0, 75, 20);
        g1.drawLine(15, 20, 85, 20);
        g1.drawLine(15, 60, 15, 20);
        g1.drawLine(85, 60, 85, 20);
        g1.drawArc(15,25,70,70,180,180);

    }

}
