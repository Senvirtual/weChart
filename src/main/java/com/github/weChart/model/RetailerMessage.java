package com.github.weChart.model;

import javax.persistence.*;

@Table(name = "retailer_message")
public class RetailerMessage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String content;

    @Column(name = "object_id")
    private Integer objectId;

    @Column(name = "object_type")
    private String objectType;

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
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return object_id
     */
    public Integer getObjectId() {
        return objectId;
    }

    /**
     * @param objectId
     */
    public void setObjectId(Integer objectId) {
        this.objectId = objectId;
    }

    /**
     * @return object_type
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * @param objectType
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
}