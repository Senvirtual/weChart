package com.github.weChart.model;

import javax.persistence.*;

@Table(name = "answer")
public class Answer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String answer;

    @Column(name = "question_id")
    private Integer questionId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * @return question_id
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * @param questionId
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}