
package hs.adapterdesignepattern;

public class TestDoctor {
    public static void main(String[] args){
    Nurse nurse = new Nurse();
    ProfDoctor profDoctor =new ProfDoctor();
    Doctor doctorAdaptor = new DoctorAdapter(nurse);
    
    System.out.println(" the Nurse ");
    
    nurse.BringPatient();
    nurse.giveInform();
    nurse.prepareMedicine("enjection");
    
    System.out.println(" the profDoctor ");
    

    profDoctor.requestMedicine("enjection");
    profDoctor.operation();
    profDoctor.writingPatientReport();
    
    System.out.println(" Doctor with Adapter ");
    
   
    doctorAdaptor.requestMedicine("enjection");
    doctorAdaptor.operation();
    doctorAdaptor.writingPatientReport();
    
    
    }
}
