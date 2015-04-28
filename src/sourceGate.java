
import java.awt.BasicStroke;
import java.awt.Color;
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
public class sourceGate extends Gate {
    
    @Override
    public void addNodes() {
        
        nodes.add(new Point2D.Double(this.getX() + this.getWidth()/2, this.getY() + 50));
        
    }
    
    @Override
    public boolean isConnected(){
        if(input2)
            return true;
        return false;
    }
     @Override
     public void paint(Graphics g1) {
        super.paint(g1);
        g1.drawLine(this.getWidth()/2,50, this.getWidth()/2,50);


    }
}
