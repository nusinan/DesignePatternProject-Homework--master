
package BuilderDesingePattern;


public class TestMedicineBuilder {
    public static void main(String[] args){
        MedicineBuilder defectiveMedicine = new DefectiveMedicineRebuilder();
        MedicineDoctor  medicineDoctor = new MedicineDoctor(defectiveMedicine);
        
        medicineDoctor.makeMedicine();
        
        Medicine firstMedicine = medicineDoctor.getMedicine();
        System.out.println(" medicine Produce");
        
        System.out.println("Produce Medicine MatterA  : "+ firstMedicine.getMedicineMatterA());
        System.out.println("Produce Medicine MatterB  : "+ firstMedicine.getMedicineMatterB());
        System.out.println("Produce Medicine MatterC  : "+ firstMedicine.getMedicineMatterC());
        System.out.println("Produce Medicine MatterD  : "+ firstMedicine.getMedicineMatterD());
    
    }
    
}
