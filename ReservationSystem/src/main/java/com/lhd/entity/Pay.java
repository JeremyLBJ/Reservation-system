package com.lhd.entity;

import java.util.Date;

public class Pay {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.id
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.username
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.roid
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    private String roid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.payTime
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    private Date paytime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.payStatue
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    private Integer paystatue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pay.payClass
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    private Integer payclass;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay.id
     *
     * @return the value of pay.id
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay.id
     *
     * @param id the value for pay.id
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay.username
     *
     * @return the value of pay.username
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay.username
     *
     * @param username the value for pay.username
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay.roid
     *
     * @return the value of pay.roid
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public String getRoid() {
        return roid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay.roid
     *
     * @param roid the value for pay.roid
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void setRoid(String roid) {
        this.roid = roid == null ? null : roid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay.payTime
     *
     * @return the value of pay.payTime
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay.payTime
     *
     * @param paytime the value for pay.payTime
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay.payStatue
     *
     * @return the value of pay.payStatue
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public Integer getPaystatue() {
        return paystatue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay.payStatue
     *
     * @param paystatue the value for pay.payStatue
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void setPaystatue(Integer paystatue) {
        this.paystatue = paystatue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pay.payClass
     *
     * @return the value of pay.payClass
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public Integer getPayclass() {
        return payclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pay.payClass
     *
     * @param payclass the value for pay.payClass
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    public void setPayclass(Integer payclass) {
        this.payclass = payclass;
    }
}