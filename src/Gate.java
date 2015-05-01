/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Noah
 */
public abstract class Gate extends JLabel {

    /**
     *Upper right input.
     */
    public boolean input1=false;

    /**
     *NExt input moving in the counter clockwise direction
     */
    public boolean input2=false;

    /**
     * next input in the counter clockwise direction
     */
    public boolean output=false;

    /**
     * if gate is a source gate
     */
    public boolean source=false;

    /**
     * if gate is a grounded gate
     */
    public boolean grounded=false;

    /**
     * the dimension of a gate
     */
    private final Dimension gateDim = new Dimension(100, 100);

    /**
     *the arraylist of nodes in a gate
     */
    public ArrayList<Point2D.Double> nodes;

    
    int dx, dy;

    /**
     * Default constructor
     */
    public Gate() {
        this.nodes = new ArrayList<>();

        setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));

        setMaximumSize(gateDim);
        setMinimumSize(gateDim);
        setPreferredSize(gateDim);

    }

    /**
     *OVerride of paint to draw gate specific parts.
     * @param g1 graphics to paint
     */
    @Override
    public void paint(Graphics g1) {

        super.paint(g1);
        Graphics2D g = (Graphics2D) g1;
        g.setStroke(new BasicStroke(10));
  // set color to draw gate lines with
        if(isConnected()) {
            g.setColor(Color.RED);
        }
        else {
            g.setColor(Color.BLACK);
        }

    }

    /**
     *Abstract class that checks to see if the current gate is connected
     * @return if gate is connected
     */
    public abstract boolean isConnected();

    /**
     *abstract class to add nodes to the gate arraylist
     */
    public abstract void addNodes();

    /**
     * removes all the nodes, then adds new nodes calculated based on current position
     */
    public void updateNodes() {
        while (this.nodes.size() > 0) {
            this.nodes.remove(0);
        }
        this.addNodes();
    }

    /**
     * removes current gate from its parent workspace
     */
    public void removeGate() {
        Workspace parent = (Workspace) this.getParent();
        parent.remove(this);
        parent.gates.remove(this);
        parent.revalidate();
        parent.repaint();
    }

}
