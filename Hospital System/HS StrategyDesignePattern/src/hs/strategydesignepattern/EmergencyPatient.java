
package hs.strategydesignepattern;

public class EmergencyPatient extends Patient {
   
    public EmergencyPatient(){
        super();
        complaintType = new HeardAttack();
    }
}
