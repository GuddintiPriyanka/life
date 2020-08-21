package com.management.LifeMS.dto;

import java.time.LocalDate;

import com.management.LifeMS.entity.Life;

public class LifeDTO {

    String name;
	
	String email;

	String phonenumber;
	
	String password;
	
	String policynumber;
	
	Double dueamount;
	
	LocalDate duration;

	
	public LifeDTO() {
		super();
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(String policynumber) {
		this.policynumber = policynumber;
	}
	
	public Double getDueamount() {
		return dueamount;
	}
	public void setDueamount(Double dueamount) {
		this.dueamount = dueamount;
	}
	
	public LocalDate getDuration() {
		return duration;
	}



	public void setDuration(LocalDate duration) {
		this.duration = duration;
	}


	// Converts Entity into DTO
	public static LifeDTO valueOf(Life life) {
		LifeDTO motordto=new LifeDTO();
		motordto.setDueamount(life.getDueamount());
		motordto.setEmail(life.getEmail());
		motordto.setName(life.getName());
		motordto.setPassword(life.getPassword());
		motordto.setPhonenumber(life.getPhonenumber());
		motordto.setPolicynumber(life.getPolicynumber());
		motordto.setDuration(life.getDuration());
		return motordto;
	}
	
	//creates an entity
	public Life createEntity(){
        Life life = new Life();
        life.setPhonenumber(this.getPhonenumber());
        life.setPolicynumber(this.getPolicynumber());
        life.setDueamount(this.getDueamount());
        life.setEmail(this.getEmail());
        life.setName(this.getName());
        life.setPassword(this.getPassword());
        life.setDuration(this.getDuration());
        return life;
    }

	@Override
	public String toString() {
		return "LifeDTO [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + ", password=" + password
				+ ", policynumber=" + policynumber + ", dueamount=" + dueamount + ", duration=" + duration + "]";
	}



	

}
