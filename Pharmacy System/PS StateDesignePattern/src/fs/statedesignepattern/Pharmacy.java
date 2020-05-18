
package fs.statedesignepattern;

public class Pharmacy {
    PharmacyState  hasPrescription;
    PharmacyState  noPrescription;
    PharmacyState  hasCorrectTc;
    PharmacyState  pharmacyDoNotHaveMedicine;
    
    PharmacyState pharmacyState;
    String existMedicineInPharmacy="Aspirin";
    boolean correctTc=false;

    public Pharmacy() {
    hasPrescription = new HasPrescription(this);
    noPrescription = new NoPrescription(this);
    hasCorrectTc = new HasCorrectTc(this);
    pharmacyDoNotHaveMedicine = new PharmacyDoNotHaveMedicine(this);
    
        pharmacyState = noPrescription;
        if(existMedicineInPharmacy==null){
                
            pharmacyState=pharmacyDoNotHaveMedicine;
        }
        
    }
    public void setPharmacyState(PharmacyState newPharmacyState){
        pharmacyState = newPharmacyState;
        }
    public void setOrderMedicineToPharmacy(String  newPharmacyState){
        existMedicineInPharmacy = newPharmacyState;
        }
    public void givePrescription(){
        pharmacyState.givePrescription();
    }
    public void takePrescription(){
        pharmacyState.takePrescription();
    }
    public void reqestMedicine(String Medicine){
    pharmacyState.reqestMedicine(Medicine);
    }
    public void sayTCnumber(int tc){
    pharmacyState.sayTCnumber(tc);
    }
    
    public PharmacyState getYesPrescription(){
    
        return hasPrescription;
    }
    public PharmacyState getNoPrescription(){
    
        return noPrescription;
    }
    public PharmacyState getHasTc(){
    
        return hasCorrectTc;
    }
    public PharmacyState getYesPharmacyState(){
    
        return hasPrescription;
    }
    
}
