
package hs.prototypedesignepattern;

public class CloneFactory {
    public Bacterium getClone(Bacterium bacteriumX){
    
    return bacteriumX.makeCopy();
    }
    
}
