

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

    public boolean input;
    public boolean output;
    public boolean source;
    public boolean grounded;

    public Transistor() {
    }


    public boolean isInput() {
        return input;
    }

    public void setInput(boolean input) {
        this.input = input;
    }

    public boolean isOutput() {
        return output;
    }

    public void setOutput(boolean output) {
        this.output = output;
    }

    public boolean isSource() {
        return source;
    }

    public void setSource(boolean source) {
        this.source = source;
    }

    public boolean isGrounded() {
        return grounded;
    }

    public void setGrounded(boolean grounded) {
        this.grounded = grounded;
    }

    public void setInput() {
        input ^= true;
    }

    public void setOutput() {
        output ^= true;
    }

    public void setSource() {
        source ^= true;
    }

    public void setGrounded() {
        grounded ^= true;
    }

    public boolean isConnected() {
        return false;
    }

}
