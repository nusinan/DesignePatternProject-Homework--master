
package hs.factorydesignepattern;


public class MedicineFactory {
    public Medicine createMedicine(String newmedicine){
        Medicine newMedic=null;
        if(newmedicine.equals("Pill")){
        
            return new Pill();
        }
        else if(newmedicine.equals("Vaccine")){
        
            return new Vaccine();
        }
        else if( newmedicine.equals("Serum")){
        
            return new Serum();
        }else
        {
        
        return null;
        }
    
    }
    
}
