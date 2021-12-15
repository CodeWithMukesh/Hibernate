package com.mukesh.mapping;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@Column(name = "question_id")
	private int quesid;
	private String question;

	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name="a_id") private Answer answer; private Answer answer;
	 */
	
	//mappedBy --> alag se Question_Answer separate table ko create nahi hone dega 
	
	@OneToMany(mappedBy = "Question")
	private List<Answer> answer;

	// Constructor-->default
	public Question() {
		super();

	}

	// Constructor--> using fields
	public Question(int quesid, String question, List<Answer> answer) {
		super();
		this.quesid = quesid;
		this.question = question;
		this.answer = answer;
	}

	// Getter and Setter method create

	public int getQuesid() {
		return quesid;
	}

	public void setQuesid(int quesid) {
		this.quesid = quesid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [quesid=" + quesid + ", question=" + question + ", answer=" + answer + "]";
	}

	
}
