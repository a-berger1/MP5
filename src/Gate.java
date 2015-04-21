/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JLabel;

/**
 *
 * @author Noah
 */
public abstract class Gate extends JLabel {

    public boolean input1;
    public boolean input2;
    public boolean output;
    public boolean source;
    public boolean grounded;

    public Gate() {

    }

    public abstract boolean isConnected();

}
