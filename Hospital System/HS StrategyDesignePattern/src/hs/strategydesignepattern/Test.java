
package hs.strategydesignepattern;

public class Test {
    
    public static void main(String[] args){
    
    Patient ep = new EmergencyPatient();
    Patient kp = new KidPatient();
        
        System.out.println("EmergencyPatient : " +ep.complaint());
        System.out.println("KidPatientPatient : " +kp.complaint());
        
        ep.setHeardAttack(new HeadAche());
        System.out.println("EmergencyPatient : " +ep.complaint());
        
        kp.setheadache(new HeardAttack());
        System.out.println("KidPatientPatient : " +kp.complaint());
    }
}
