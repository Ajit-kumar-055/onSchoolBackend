package com.onSchool.onSchool.Entity;
import java.util.List;

public class QuestionEntity {
    private String question;
    private List<String> answers;
    private int correctAnswerIndex;
    
 // Getters and Setters
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public int getCorrectAnswerIndex() {
		return correctAnswerIndex;
	}
	public void setCorrectAnswerIndex(int correctAnswerIndex) {
		this.correctAnswerIndex = correctAnswerIndex;
	}

    
    
}
