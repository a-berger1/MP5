
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
public class groundGate extends Gate{

    @Override
    public void addNodes() {

        nodes.add(new Point2D.Double(this.getX() + this.getWidth() / 2, this.getY()));

    }

    @Override
    public boolean isConnected() {
        if(input2)
            return true;
        return false;
    }

    @Override
    public void paint(Graphics g1) {
        super.paint(g1);
        g1.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, 0);

    }

}
