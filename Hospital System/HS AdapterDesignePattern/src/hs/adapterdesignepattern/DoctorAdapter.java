package hs.adapterdesignepattern;


public class DoctorAdapter implements Doctor{
    
    Nurse nurse;

    public DoctorAdapter(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public void operation() {
        nurse.BringPatient();
    }

    @Override
    public void writingPatientReport() {
        nurse.giveInform();
    }

    @Override
    public void requestMedicine(String MedicineName) {
        nurse.prepareMedicine(MedicineName);
    }

 
    

    
    
}
