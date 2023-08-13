package Homes.Registration.hospitalmain;
import Homes.Registration.hospitalmain.Basic.*;
import javax.swing.*;
import java.util.*;

public class Doctor extends Person{
	private static int count=100;
	private String speciality, qualification;
	private boolean full_time;
	private int years_exp;
	//ArrayList<Patient> patients;
	//ArrayList<Schedule> schedule = new ArrayList<>();

	public Doctor(String name,int age,String gender,String phone_no, String mail_id, String spl, String qual, boolean f_time, int yoe){
		super(name,age, gender, phone_no, mail_id);
		speciality = spl;
		qualification = qual;
		full_time = f_time;
		years_exp = yoe;

	}
	
	//public void setSchedule(String slot){
	//	schedule.add(new Schedule( this.getId(), slot, true));
	//}

	public String getSpeciality(){
		return speciality;
	}

	public String getQualification(){
		return qualification;
	}

	public int getYearsExp(){
		return years_exp;
	}

	public boolean getFull_time(){
		return full_time;
	}

}
