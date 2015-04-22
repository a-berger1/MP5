
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;
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

    Point pointStart;
    Point pointEnd;
    ArrayList<Wire> wires = new ArrayList<Wire>();
    boolean mouseReleased = false;
    boolean undoWire = false;
    Color wireColor = Color.BLACK;
    MouseAdapter adapter;

    /**
     * Creates new form Workspace1
     */
    public Workspace() {
        initComponents();

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
        pointStart = evt.getPoint();
        pointEnd= pointStart;
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        pointEnd = evt.getPoint();
        repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        mouseReleased = true;
        if(pointStart !=pointEnd){
        wires.add(new Wire(pointStart, pointEnd, wireColor));
        }
        repaint();
        pointStart = null;//To change body of generated methods, choose Tools | Templates.
    }//GEN-LAST:event_formMouseReleased

    public void clearCurrentColorWires() {
        for (int i = wires.size()-1; i >= 0; i--) {
            if (wires.get(i).getColor() == wireColor) {
                wires.remove(i);
            }
        }
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        //Only runs while the mouse is being dragged. Constantly draws wires while the mouse is being dragged.
        if (pointStart != null) {
            g.setColor(wireColor);
            g2.setStroke(new BasicStroke(10));
            g2.drawLine(pointStart.x, pointStart.y, pointEnd.x, pointEnd.y);

        }
        //Only runs if the mouse was just released or if the undoLastWireBtn is pressed. Keeps wires drawn on the screen

        for (int i = 0; i < wires.size(); i++) {
            g.setColor(wires.get(i).getColor());
            g2.setStroke(new BasicStroke(10));
            g2.draw(wires.get(i));
        }
        mouseReleased = false;
        undoWire = false;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
