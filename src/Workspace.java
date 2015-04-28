
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andy
 */
public class Workspace extends JPanel {

    private Point pointStart;
    private Point pointEnd;
    public ArrayList<Wire> wires;
    public boolean undoWire = false;
    public Color wireColor = Color.BLACK;
    public boolean lockGates;
    private boolean dragGate = false;
    private boolean isDrawingWire;
    int dx, dy;
    public ArrayList<Gate> gates;
    Gate current;
    public int currentNumAndGates;
    public int maxAndGates = 10;
    public int currentNumOrGates;
    public int maxOrGates = 10;
    public int currentNumTransistors;
    public int maxTransistors = 10;
    public int currentNumXORGates;
    public int maxXORGates = 10;
    public int currentNumHalfAdder;
    public int maxHalfAdder = 10;
    public int currentNumFullAdder;
    public int maxFullAdder = 10;

    /**
     * Creates new form Workspace1
     */
    public Workspace() {
        this.lockGates = false;
        this.wires = new ArrayList<>();
        this.gates = new ArrayList<>();
        initComponents();
        Gate t = new halfAdder();
        add(t);
        t.setSize(100, 100);
        t.setLocation(300, 300);
        t.addNodes();
        currentNumTransistors++;
        gates.add(t);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        boolean inGate = false;
        boolean inNodeZone = false;

        for (Gate gate : gates) {
            if (gate.getBounds().contains(evt.getLocationOnScreen())) {

                inGate = true;
                current = gate;
                System.out.println(gates.size());
                //Right click to remove the gate
                if (evt.isMetaDown()) {
                    switch (gate.getClass().toString()) {
                        case "class halfAdder":
                            currentNumHalfAdder--;
                            break;
                        case "class fullAdder":
                            currentNumFullAdder--;
                            break;
                        case "class AndGate":
                            currentNumAndGates--;
                            break;
                        case "class OrGate":
                            currentNumOrGates--;
                            break;
                        case "class XORGate":
                            currentNumXORGates--;
                            break;
                        case "class Transistor":
                            currentNumTransistors--;
                            break;

                    }
                    gate.removeGate();
                    System.out.println(gates.size());
                }
            }

        }

        for (Point2D.Double node : current.nodes) {
            if (node.distance(evt.getLocationOnScreen()) < 20) {
                inNodeZone = true;
            }

        }
        if (inGate) {
            dragGate = true;
            dx = evt.getXOnScreen() - current.getX();
            dy = evt.getYOnScreen() - current.getY();

        }
        if (inNodeZone && lockGates) {
            pointStart = evt.getPoint();
            pointEnd = pointStart;
        }


    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged

        if (dragGate && !lockGates) {
            for (Point2D.Double node : current.nodes) {
                if (node.distance(evt.getLocationOnScreen()) > 25) {
                    current.setLocation(evt.getXOnScreen() - dx, evt.getYOnScreen() - dy);
                    if (current.getLocation().x <= 0) {
                        current.setLocation(new Point(0, current.getLocation().y));

                    }
                    if (current.getLocation().y <= 50) {
                        current.setLocation(new Point(current.getLocation().x, 50));

                    }
                    if (current.getLocation().y <= 50) {
                        current.setLocation(new Point(current.getLocation().x, 50));

                    }
                    if (current.getLocation().x >= current.getParent().getWidth() - 250) {
                        current.setLocation(new Point(current.getParent().getWidth() - 240, current.getY()));

                    }
                    if (current.getLocation().y >= current.getParent().getHeight() - 150) {
                        current.setLocation(new Point(current.getX(), current.getParent().getHeight() - 150));

                    }
                    if (current.getLocation().y >= current.getParent().getHeight() - 150) {
                        current.setLocation(new Point(current.getX(), current.getParent().getHeight() - 150));

                    }
                    current.updateNodes();
                }
            }
        }
        for (Point2D.Double node : current.nodes) {
            if (node.distance(evt.getLocationOnScreen()) <= 20 || isDrawingWire) {
                pointEnd = evt.getPoint();
                isDrawingWire = true;
            }

        }

        repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        dragGate = false;
        isDrawingWire = false;

        for (Point2D.Double node : current.nodes) {
            if (node.distance(evt.getLocationOnScreen()) <= 20) {

            }

        }

        if (pointStart != pointEnd) {
            for (Gate gate : gates) {

                for (Point2D.Double node : gate.nodes) {
                    if (node.distance(evt.getLocationOnScreen()) <= 25) {
                        Wire temp = new Wire(pointStart, pointEnd, wireColor, gates);
                        temp.snapWire(gates);
                        if (temp.x1 == temp.x2 && temp.y1 == temp.y2) {
                            break;
                        }
                        wires.add(temp);
                        repaint();
                        this.checkConnections();
                    }
                }
            }
        }

        repaint();

        pointStart = null;
        pointEnd = null;

    }//GEN-LAST:event_formMouseReleased

    public void clearCurrentColorWires() {
        for (int i = wires.size() - 1; i >= 0; i--) {
            if (wires.get(i).getColor() == wireColor) {
                wires.remove(i);
            }
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        //Only runs while the mouse is being dragged. Constantly draws wires while the mouse is being dragged.
        if (pointStart != null && pointEnd != null) {
            g.setColor(wireColor);
            g2.setStroke(new BasicStroke(10));
            g2.drawLine(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);
        }
        //Only runs if the mouse was just released or if the undoLastWireBtn is pressed. Keeps wires drawn on the screen

        g2.setStroke(new BasicStroke(10));
        for (Wire wire : wires) {
            g.setColor(wire.getColor());
            g2.draw(wire);
        }

    }

    public void checkConnections() {
        halfAdder d = new halfAdder();
        for (Wire wire : wires) {
            for (Gate gate : gates) {

                for (int i = 0; i < gate.nodes.size(); i++) {

                    if ((wire.x1 == gate.nodes.get(i).x || wire.x2 == gate.nodes.get(i).x) && (wire.y1 == gate.nodes.get(i).y || wire.y2 == gate.nodes.get(i).y)) {
                        switch (i) {
                            case 0:
                                gate.input2 = true;
                                break;
                            case 1:
                                gate.input1 = true;
                                break;
                            case 2:
                                gate.output = true;
                                break;
                        }

                    }
                }

            }
        }
    }

}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

