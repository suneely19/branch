package com.telecommunication.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telecommunication.bo.Person;
import com.telecommunication.bo.SimBo;
import com.telecommunication.controller.TelecommunicationController;

public class TelecommunicationTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/telecommunication/conf/application-context.xml");
		/*SimBo simBo=new SimBo();
			  simBo.setId(3);
			  simBo.setSize("1*8");
			  simBo.setType("normal");
			  simBo.setSimSerialNumber("19237464354747");
			  simBo.setSimName("airtel");
			  
		TelecommunicationController controller=(TelecommunicationController) context.getBean("telecommunicationController");
		boolean flag=controller.saveSim(simBo);
		if(flag==true) {
			System.out.println("your sim configured success fully");
		}else {
			System.out.println("while configuring have some problem, please try again later");
		}*/
		
		SimBo simBo=new SimBo();
		  simBo.setId(11);
		  simBo.setSize("1*8");
		  simBo.setType("normal");
		  simBo.setSimSerialNumber("96873648463");
		  simBo.setSimName("jio");
		Person person=new Person();
		person.setId(9);
		person.setFirstName("john");
		person.setLastName("michale");
		person.setMiddleName("joh");
		person.setIdProof("aadhar");
		person.setGender("male");
		person.setAge(30);
		person.setRole("customer");
		person.setActivities("customer");
		
		TelecommunicationController controller=(TelecommunicationController) context.getBean("telecommunicationController");
		//boolean flag=controller.saveAdvisor(person);
		boolean flag=controller.saveCustomer(person, simBo);
		if(flag==true) {
			System.out.println("customer details saved in jio db and sim details saved in TRAI Db successfully");
			System.out.println("Thank you your details saved in our jio DB");
		}else {
			System.out.println("Sorry please try again may be your data is incorrect");
		}
		
		
		
	}

}
