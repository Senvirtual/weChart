package com.github.weChart.model;

import javax.persistence.*;

@Table(name = "permission")
public class Permission {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String permission;

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
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    /**
     * @param permission
     */
    public void setPermission(String permission) {
        this.permission = permission;
    }
}