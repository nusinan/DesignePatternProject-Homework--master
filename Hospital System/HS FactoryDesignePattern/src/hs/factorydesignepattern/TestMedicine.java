
package hs.factorydesignepattern;

import java.util.Scanner;

public class TestMedicine {
    public static void main(String[] args){
    
    MedicineFactory mfactory = new MedicineFactory();
    Medicine medicine=null;
    
    Scanner input = new Scanner(System.in);
    
    String medic="";
    System.out.println("which medicine is your need? ( Pill(hap),Vaccine(sşı),Serum)");
    if(input.hasNextLine()){
    
        medic = input.nextLine();
        medicine = mfactory.createMedicine(medic);
    }
    if(medicine!=null){
        ProcessMedicine(medicine);
    }
    else{
        System.out.println("enter Pill,Vaccine or Serum");
    }
    
    }
    
    
    public static void ProcessMedicine(Medicine medicine){
       
        medicine.orderMedicine();
        medicine.creatingMedicine();
        medicine.prepareMedicine();
    
    }
    
}
