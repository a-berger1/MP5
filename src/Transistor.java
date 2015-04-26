
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
public class Transistor extends Gate {
    
    public Transistor() {
        
    }
    
    @Override
    public void addNodes() {
        nodes.add(new Point2D.Double(this.getX(), this.getY()+50));
        nodes.add(new Point2D.Double(this.getX()+50, this.getY()));
        nodes.add(new Point2D.Double(this.getX()+50, this.getY()+100));
    }
    
    @Override
    public boolean isConnected() {
        return false;
    }
    
    @Override
    public void paint(Graphics g1) {
        super.paint(g1);
        g1.drawLine(50, 0, 50, 25);
        g1.drawLine(50, 25, 25, 50);
        g1.drawLine(25, 50, 50, 75);
        g1.drawLine(50, 75, 50, 100);
        g1.drawLine(0, 50, 25, 50);
        
    }
}
