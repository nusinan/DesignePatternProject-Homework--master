
package fs.proxydesignepattern;

public class NoPrescription implements PharmacyState{
    
     Pharmacy pharmacy;
    
    public NoPrescription(Pharmacy newPharacy){
        pharmacy = newPharacy;
    }

    @Override
    public void givePrescription() {
       System.out.println("please say your tc ");
       pharmacy.setPharmacyState(pharmacy.getYesPharmacyState());
       
    }

    @Override
    public void takePrescription() {
         System.out.println("give your Prescription first" );
    }

    @Override
    public void sayTCnumber(int tc) {
       System.out.println("give your Prescription first" );
    }

    @Override
    public void reqestMedicine(String Medicine) {
        System.out.println("give your Prescription first" );
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
