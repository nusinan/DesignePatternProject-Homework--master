package fs.proxydesignepattern;

public class TestPharmacy {
     public static void main(String[] args){
         Pharmacy pharmacy = new Pharmacy();
         pharmacy.givePrescription();
         pharmacy.takePrescription();
         pharmacy.givePrescription();
         pharmacy.sayTCnumber(12345);
         pharmacy.reqestMedicine("Aspirin");
         
         GetPharmacyData realPharmacy = new Pharmacy();
         GetPharmacyData proxyPharmacy = new PharmacyProxy();
         
         System.out.println("\nCurrent Pharmacy State "+ proxyPharmacy.getPharmacyData());
         
         System.out.println("\nMedicine From  Pharmacy State "+ proxyPharmacy.getMedicineFromPharmacy());
        
     
     }
}
