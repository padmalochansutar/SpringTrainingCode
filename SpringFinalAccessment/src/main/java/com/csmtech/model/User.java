package com.csmtech.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;
	
	private Long mobileno;
	@Column(name="father_name")
	private String fatherName;
	
	private String caddress;
	
	private String gender;
	
	private Long age;
     
	private String username;
	
     @ManyToMany(cascade = CascadeType.ALL)
     @JoinTable(name="member_user",joinColumns=@JoinColumn(name="userid"),inverseJoinColumns = @JoinColumn(name="mid"))
    private List<Member> member;
     
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Member> getMember() {
		return member;
	}
	public void setMember(List<Member> member) {
		this.member = member;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", mobileno=" + mobileno + ", fatherName=" + fatherName + ", caddress="
				+ caddress + ", gender=" + gender + ", age=" + age + ", username=" + username + ", member=" + member
				+ "]";
	}
     

}
