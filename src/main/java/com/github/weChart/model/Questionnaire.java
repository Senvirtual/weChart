package com.github.weChart.model;

import javax.persistence.*;

@Table(name = "questionnaire")
public class Questionnaire {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Column(name = "question_id")
    private String questionId;

    @Column(name = "answer_id")
    private String answerId;

    private String author;

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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return question_id
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * @param questionId
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    /**
     * @return answer_id
     */
    public String getAnswerId() {
        return answerId;
    }

    /**
     * @param answerId
     */
    public void setAnswerId(String answerId) {
        this.answerId = answerId;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}