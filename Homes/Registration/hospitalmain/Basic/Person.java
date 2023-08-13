package Homes.Registration.hospitalmain.Basic;
import java.util.*;



public class Person{

	private String name;
	private int id;
	private int age;
	private String gender;
	private String phone_no;
	private String mail_id;


    public Person(String name,int age,String gender,String phone_no, String mail_id){
   	this.name = name;
   	this.age = age;
   	this.gender = gender;
   	this.phone_no = phone_no;
   	this.mail_id = mail_id;
   }



    public void setId(int id){
       this.id=id;
     }


	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public int getAge(){
		return age;
	}

	public String getGender(){
		return gender;
	}

	public String getPhone_no(){
		return phone_no;
	}

    public String getMail_id(){
    	return mail_id;
    }

}



/*class PersonDrvr{
	public static void main(String []args){
		Person p = new Person("JAVA",123,18,"Male","7546892244","hello@gmail.com");
		System.out.print(p.getName()+p.getAge()+p.getMail_id());
	}
}*/