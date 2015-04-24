/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Noah
 */
public class OrGate extends Gate {

    public OrGate() {
        input1 = false;
        input2 = false;
        output = false;

        grounded = false;
    }

    @Override
    public boolean isConnected() {

        if (input1 || input2) {
            return true;
        }
        return false;

    }

}
