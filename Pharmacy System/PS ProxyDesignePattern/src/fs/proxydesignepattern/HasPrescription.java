package fs.proxydesignepattern;

public class HasPrescription implements PharmacyState{
    
    Pharmacy pharmacy;
    
    public HasPrescription(Pharmacy newPharacy){
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
      
    }

    @Override
    public PharmacyState getPharmacyData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMedicineFromPharmacy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
