
package hs.adapterdesignepattern;

import java.util.Random;
        

public class ProfDoctor implements Doctor{
    
    

    @Override
    public void operation() {
        
        System.out.println("surgery operation is making");
    }

    @Override
    public void writingPatientReport() {
        
        System.out.println(" Patient Report is writing");
    }
   
   
     @Override
    public void requestMedicine(String medicineName) {
        System.out.println(medicineName+ " is writing to prescription");
    }
    
}
