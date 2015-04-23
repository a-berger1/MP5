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

    public boolean input1;
    public boolean input2;
    public boolean output;
    public boolean source;
    public boolean grounded;

    public AndGate() {
        
    }

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

 
}
