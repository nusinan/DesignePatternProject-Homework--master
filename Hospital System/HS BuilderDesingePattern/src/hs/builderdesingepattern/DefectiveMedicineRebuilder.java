
package BuilderDesingePattern;
    public class DefectiveMedicineRebuilder implements MedicineBuilder{
    private Medicine medicine;

    public DefectiveMedicineRebuilder() {
        medicine = new Medicine();
    }
    
    

    @Override
    public void builderMedicineMatterA() {
        medicine.setMedicineMatterA("Aspirin's MatterA");
    }

    @Override
    public void builderMedicineMatterB() {
        medicine.setMedicineMatterB("Aspirin's MatterB");
    }

    @Override
    public void builderMedicineMatterC() {
        medicine.setMedicineMatterC("Aspirin's MatterC");
    }

    @Override
    public void builderMedicineMatterD() {
        medicine.setMedicineMatterD("Aspirin's MatterD");
    }

    @Override
    public Medicine getMedicine() {
        return this.medicine;
    }
   
    
}
