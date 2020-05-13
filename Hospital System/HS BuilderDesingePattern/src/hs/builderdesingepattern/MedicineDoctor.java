
package BuilderDesingePattern;

public class MedicineDoctor {
    private  MedicineBuilder sMBuilder;

    public MedicineDoctor(MedicineBuilder sMBuilder) {
        this.sMBuilder = sMBuilder;
    }
    public Medicine getMedicine(){
        return this.sMBuilder.getMedicine();
    
    }
     public void makeMedicine(){
    
        this.sMBuilder.builderMedicineMatterA();
        this.sMBuilder.builderMedicineMatterB();
        this.sMBuilder.builderMedicineMatterC();
        this.sMBuilder.builderMedicineMatterD();
    }
    
}
