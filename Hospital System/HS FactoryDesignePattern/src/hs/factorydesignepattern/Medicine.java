
package hs.factorydesignepattern;
public abstract class Medicine {
    
    String name;
    int MedicineDegree; // this is strage of medicine degree between 1-10

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMedicineDegree() {
        return MedicineDegree;
    }

    public void setMedicineDegree(int MedicineDegree) {
        this.MedicineDegree = MedicineDegree;
    }

    public void prepareMedicine(){
    
        System.out.println(getName()+" is preparing");
    }
    public void creatingMedicine(){
    
        System.out.println(getName()+" is creating");
    }
    
    public void orderMedicine(){
        System.out.println(getName()+ " is ordering");
  
    }
}
