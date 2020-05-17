
package fs.proxydesignepattern;


    public interface PharmacyState {
     void givePrescription();
     void takePrescription();   
     void sayTCnumber(int tc);
     void reqestMedicine(String Medicine);
      public PharmacyState getPharmacyData();
      public String getMedicineFromPharmacy();
    
}
