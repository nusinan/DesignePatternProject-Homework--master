
package fs.statedesignepattern;

public class HasCorrectTc implements PharmacyState{
    
    Pharmacy pharmacy;
    
    public HasCorrectTc(Pharmacy newPharacy){
        pharmacy = newPharacy;
    }

    @Override
    public void givePrescription() {
        System.out.println("tc no cout cant be less than 11");
    }


    @Override
    public void takePrescription() {
        System.out.println("Prescriptions giving back");
        pharmacy.setPharmacyState(pharmacy.getNoPrescription());
    }

    @Override
    public void sayTCnumber(int tc) {
        
        if(tc == 12345){
            System.out.println("Correct Tc");
            pharmacy.correctTc=true;
            pharmacy.setPharmacyState(pharmacy.getHasTc());
        }
        else{
        System.out.println("Wrong Tc");
            pharmacy.correctTc=false;
         System.out.println("Prescriptions giving back");
         pharmacy.setPharmacyState(pharmacy.getYesPharmacyState());
        
        }
    }

    @Override
    public void reqestMedicine(String Medicine) {
        
         if(Medicine==null){
            System.out.println("this medicine is not exist");
            System.out.println("Prescription giving  back");
            pharmacy.setPharmacyState(pharmacy.getNoPrescription());
        }else{
        System.out.println("this medicine is exist  medicine giving");
            pharmacy.setOrderMedicineToPharmacy(pharmacy.existMedicineInPharmacy);
            System.out.println("Prescription giving  back");
            pharmacy.setPharmacyState(pharmacy.getNoPrescription());
        }
    }
    
}