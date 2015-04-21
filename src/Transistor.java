

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
    
    
    
    
}
