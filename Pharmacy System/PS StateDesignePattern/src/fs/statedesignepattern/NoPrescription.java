
package fs.statedesignepattern;

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
    
}
