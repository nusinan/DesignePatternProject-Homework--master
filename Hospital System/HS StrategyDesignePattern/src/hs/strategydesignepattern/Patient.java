
package hs.strategydesignepattern;


public class Patient {
    
    private String name;
    private String surname;
    private int tc;
    private Boolean insurange;
    private int age;
    private String complaint;
    public Complaint complaintType;


    public String complaint(){
    
        return complaintType.HeadAche(); 
    }
    public void setComplaintType(Complaint newComplaint){
        complaintType=newComplaint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public Boolean getInsurange() {
        return insurange;
    }

    public void setInsurange(Boolean insurange) {
        this.insurange = insurange;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String headache(){
        return complaintType.HeadAche();
    }
    public void setheadache(Complaint newcomplaintType ){
        complaintType = newcomplaintType; 
    }
    
    public String heardAttack(){
        return complaintType.HeardAttack();
    }
    public void setHeardAttack(Complaint newcomplaintType ){
        complaintType = newcomplaintType; 
    }

   
    
    
}

