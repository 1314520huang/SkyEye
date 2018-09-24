package com.skyeye.model;

import java.util.Date;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.real_name
     *
     * @mbggenerated
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.login_name
     *
     * @mbggenerated
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.salt
     *
     * @mbggenerated
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.school
     *
     * @mbggenerated
     */
    private String school;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.major
     *
     * @mbggenerated
     */
    private String major;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.stuNo
     *
     * @mbggenerated
     */
    private String stuno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column student.image
     *
     * @mbggenerated
     */
    private byte[] image;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.id
     *
     * @return the value of student.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.id
     *
     * @param id the value for student.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.real_name
     *
     * @return the value of student.real_name
     *
     * @mbggenerated
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.real_name
     *
     * @param realName the value for student.real_name
     *
     * @mbggenerated
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.login_name
     *
     * @return the value of student.login_name
     *
     * @mbggenerated
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.login_name
     *
     * @param loginName the value for student.login_name
     *
     * @mbggenerated
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.password
     *
     * @return the value of student.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.password
     *
     * @param password the value for student.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.salt
     *
     * @return the value of student.salt
     *
     * @mbggenerated
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.salt
     *
     * @param salt the value for student.salt
     *
     * @mbggenerated
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.school
     *
     * @return the value of student.school
     *
     * @mbggenerated
     */
    public String getSchool() {
        return school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.school
     *
     * @param school the value for student.school
     *
     * @mbggenerated
     */
    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.major
     *
     * @return the value of student.major
     *
     * @mbggenerated
     */
    public String getMajor() {
        return major;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.major
     *
     * @param major the value for student.major
     *
     * @mbggenerated
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.stuNo
     *
     * @return the value of student.stuNo
     *
     * @mbggenerated
     */
    public String getStuno() {
        return stuno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.stuNo
     *
     * @param stuno the value for student.stuNo
     *
     * @mbggenerated
     */
    public void setStuno(String stuno) {
        this.stuno = stuno == null ? null : stuno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.create_time
     *
     * @return the value of student.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.create_time
     *
     * @param createTime the value for student.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column student.image
     *
     * @return the value of student.image
     *
     * @mbggenerated
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column student.image
     *
     * @param image the value for student.image
     *
     * @mbggenerated
     */
    public void setImage(byte[] image) {
        this.image = image;
    }
}