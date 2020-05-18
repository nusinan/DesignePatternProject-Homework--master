
package fs.statedesignepattern;
public class PharmacyDoNotHaveMedicine implements PharmacyState{
    
     Pharmacy pharmacy;
    
    public PharmacyDoNotHaveMedicine(Pharmacy newPharacy){
        pharmacy = newPharacy;
    }

    @Override
    public void givePrescription() {
       System.out.println("this medicine is not exist");
       
    }

    @Override
    public void takePrescription() {
         System.out.println("this medicine is not exist you did not give Prescription");
    }

    @Override
    public void sayTCnumber(int tc) {
       System.out.println("this medicine is not exist");
    }

    @Override
    public void reqestMedicine(String Medicine) {
        System.out.println("this medicine is not exist");
    }
}