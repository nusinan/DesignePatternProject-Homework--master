
package hs.strategydesignepattern;

public class EmergencyPation extends Patient {
   
    public EmergencyPation(){
        super();
        complaintType = new HeardAttack();
    }
}
