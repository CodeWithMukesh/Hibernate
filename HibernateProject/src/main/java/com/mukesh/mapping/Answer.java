package com.mukesh.mapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int ansid;
	private String answer;
	
	@ManyToOne
	private Question question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int ansid, String answer, Question question) {
		super();
		this.ansid = ansid;
		this.answer = answer;
		this.question = question;
	}

	public int getAnsid() {
		return ansid;
	}

	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [ansid=" + ansid + ", answer=" + answer + ", question=" + question + "]";
	}
	

}
