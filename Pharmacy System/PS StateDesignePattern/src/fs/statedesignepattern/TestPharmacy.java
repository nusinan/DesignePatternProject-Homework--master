
package fs.statedesignepattern;

public class TestPharmacy {
     public static void main(String[] args){
         
         Pharmacy pharmacy = new Pharmacy();
         
         pharmacy.givePrescription();
         pharmacy.takePrescription();
         
         pharmacy.givePrescription();
         pharmacy.sayTCnumber(12345);
         pharmacy.reqestMedicine("Aspirin");

     }
}
