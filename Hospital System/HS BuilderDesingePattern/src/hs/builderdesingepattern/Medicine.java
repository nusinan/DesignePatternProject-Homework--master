
package BuilderDesingePattern;

public class Medicine implements MedicinePlan{
    private String MatterA;
    private String MatterB;
    private String MatterC;
    private String MatterD;

    @Override
    public void setMedicineMatterA(String MatterA) {
        this.MatterA=MatterA;
    }
    public String getMedicineMatterA(){
    return MatterA;
    }

    @Override
    public void setMedicineMatterB(String MatterB) {
        this.MatterB=MatterB;
    }
    public String getMedicineMatterB(){
    return MatterB;
    }

    @Override
    public void setMedicineMatterC(String MatterC) {
        this.MatterC=MatterC;
    }
    public String getMedicineMatterC(){
    return MatterC;
    }

    @Override
    public void setMedicineMatterD(String MatterD) {
        this.MatterD=MatterD;
    }
    public String getMedicineMatterD(){
    return MatterD;
    }
    
}
