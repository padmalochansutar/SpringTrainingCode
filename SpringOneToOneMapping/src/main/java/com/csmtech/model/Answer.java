package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Answer implements Serializable {
	@Id
	private Integer answerId;
	
	private String answerName;
     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name="question_id")
	private Question question;
	public Integer getAnswerId() {
		return answerId;
	}
	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answerName=" + answerName + ", question=" + question + "]";
	}
	
	

}
