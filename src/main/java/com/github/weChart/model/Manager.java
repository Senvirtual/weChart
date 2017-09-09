package com.github.weChart.model;

import javax.persistence.*;

@Table(name = "manager")
public class Manager {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String manager;

    private String company;

    @Column(name = "company_place")
    private String companyPlace;

    private String tel;

    private String account;

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
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * @param manager
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * @return company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return company_place
     */
    public String getCompanyPlace() {
        return companyPlace;
    }

    /**
     * @param companyPlace
     */
    public void setCompanyPlace(String companyPlace) {
        this.companyPlace = companyPlace;
    }

    /**
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }
}