package com.github.weChart.model;

import javax.persistence.*;

@Table(name = "retailer")
public class Retailer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String account;

    private String license;

    @Column(name = "license_date")
    private String licenseDate;

    private String name;

    private String tel;

    @Column(name = "native_place")
    private String nativePlace;

    private String representative;

    @Column(name = "business_type")
    private String businessType;

    @Column(name = "operation_scale")
    private String operationScale;

    private String formats;

    private String photo;

    @Column(name = "place_x")
    private String placeX;

    @Column(name = "place_y")
    private String placeY;

    @Column(name = "manager_id")
    private Integer managerId;

    private String score;

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

    /**
     * @return license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return license_date
     */
    public String getLicenseDate() {
        return licenseDate;
    }

    /**
     * @param licenseDate
     */
    public void setLicenseDate(String licenseDate) {
        this.licenseDate = licenseDate;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return native_place
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * @param nativePlace
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    /**
     * @return representative
     */
    public String getRepresentative() {
        return representative;
    }

    /**
     * @param representative
     */
    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    /**
     * @return business_type
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * @param businessType
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    /**
     * @return operation_scale
     */
    public String getOperationScale() {
        return operationScale;
    }

    /**
     * @param operationScale
     */
    public void setOperationScale(String operationScale) {
        this.operationScale = operationScale;
    }

    /**
     * @return formats
     */
    public String getFormats() {
        return formats;
    }

    /**
     * @param formats
     */
    public void setFormats(String formats) {
        this.formats = formats;
    }

    /**
     * @return photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return place_x
     */
    public String getPlaceX() {
        return placeX;
    }

    /**
     * @param placeX
     */
    public void setPlaceX(String placeX) {
        this.placeX = placeX;
    }

    /**
     * @return place_y
     */
    public String getPlaceY() {
        return placeY;
    }

    /**
     * @param placeY
     */
    public void setPlaceY(String placeY) {
        this.placeY = placeY;
    }

    /**
     * @return manager_id
     */
    public Integer getManagerId() {
        return managerId;
    }

    /**
     * @param managerId
     */
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    /**
     * @return score
     */
    public String getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(String score) {
        this.score = score;
    }
}