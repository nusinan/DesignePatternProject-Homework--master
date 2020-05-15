
package hs.prototypedesignepattern;

public class TestCloning {
    public static void main(String[] args){
    
    CloneFactory bacteriumMaker = new CloneFactory();
    BacteriumA bacteriumA = new BacteriumA();
    BacteriumA clonedBacteriumA = (BacteriumA) bacteriumMaker.getClone(bacteriumA);
        System.out.println(bacteriumA);
        System.out.println(clonedBacteriumA);
        System.out.println("BacteriumA Hashcode: "+ System.identityHashCode(bacteriumA));
        System.out.println("Cloned BacteriumA Hashcode: "+ System.identityHashCode(clonedBacteriumA));
    }  
}