package com.csmtech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="my_user_form_data")
public class UserFormData implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="form_id")
	//@SequenceGenerator(name="formidseq",sequenceName = "my_user_form_seq",initialValue = 1,allocationSize = 1)
	//@GeneratedValue(generator = "formidseq")
	
	private Integer formId;
	
	private String name;
	
	@Column(name="applied_date")
	private Date appliedDate;
	
	@Column(name="user_pic")
	private String userPic;
	
	@Column(name="is_delete")
	private Boolean isDelete;

	public Integer getFormId() {
		return formId;
	}

	public void setFormId(Integer formId) {
		this.formId = formId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public String getUserPic() {
		return userPic;
	}

	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	

}
