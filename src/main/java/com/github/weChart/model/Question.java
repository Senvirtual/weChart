package com.github.weChart.model;

import javax.persistence.*;

@Table(name = "question")
public class Question {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String question;

    @Column(name = "questionnaire_id")
    private Integer questionnaireId;

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
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return questionnaire_id
     */
    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    /**
     * @param questionnaireId
     */
    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }
}