
import java.awt.Graphics;

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

    private boolean input1;
    private boolean input2;
    private boolean output;
    private boolean source;
    private boolean grounded;

    public AndGate() {

    }

    @Override
    public boolean isConnected() {
        if (source && grounded && output && input1 && input2) {
            return true;
        }
        return false;
    }

    public boolean setInput1() {
        input1 ^= true;
        return input1;
    }

    public boolean setInput2() {
        input2 ^= true;
        return input2;
    }

    public boolean setOutput() {
        output ^= true;
        return output;
    }

    public boolean setSource() {
        source ^= true;
        return source;
    }

    public boolean setGrounded() {
        grounded ^= true;
        return grounded;
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
