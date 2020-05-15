
package hs.prototypedesignepattern;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BacteriumA implements Bacterium{

    public BacteriumA() {
        System.out.println("BacteriumA is Made");
    }

    
    @Override
    public Bacterium makeCopy() {
        System.out.println("BacteriumA is Being Made");
        
        BacteriumA bacteriumAObject =null;
        
        try {
            bacteriumAObject= (BacteriumA) super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(BacteriumA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bacteriumAObject;
    }
    public String toString(){
    
    return "Bacterium A is Active ";
    }
}
