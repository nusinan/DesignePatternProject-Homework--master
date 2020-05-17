
package fs.proxydesignepattern;

    public class PharmacyProxy implements GetPharmacyData{
    
    @Override
        public PharmacyState getPharmacyData() {
        Pharmacy realPharmacy = new Pharmacy();
        return realPharmacy.getPharmacyData();
    }

    @Override
    public String getMedicineFromPharmacy() {
        Pharmacy realPharmacy = new Pharmacy();
        return realPharmacy.getMedicineFromPharmacy();
    }
    
}
