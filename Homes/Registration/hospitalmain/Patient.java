package Homes.Registration.hospitalmain;
import Homes.Registration.hospitalmain.Basic.*;
import java.util.*;

public class Patient extends Person{
	Scanner sc = new Scanner(System.in);

     
  private	String blood_grp;
  //private	String diseases;     //BP|Diabetes|Stroke|Fatigue|Heart blocks
  private	String allergies;    //drug|skin|food|pollen|pet
  //ArrayList<Prescription>Prescription = new ArrayList<>();


   public Patient(String name,int age,String gender,String phone_no, String mail_id,String blood_grp,String allergies){
    	super(name,age,gender,phone_no,mail_id);
        this.blood_grp = blood_grp;
        //this.diseases = diseases;
        this.allergies = allergies;

    }


  

   public String getBlood_grp(){
    	return blood_grp;
    }

  // public String getDiseases(){
    //	return diseases;
    //}
  public  String getAllergies(){
    	return allergies;
    }
    
}