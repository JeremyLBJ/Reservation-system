package com.lhd.entity;

import java.io.Serializable;

public class Classificationof implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof.id
     *
     * @mbg.generated Thu Nov 14 11:46:13 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof.cId
     *
     * @mbg.generated Thu Nov 14 11:46:13 CST 2019
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof.c_Of_Name
     *
     * @mbg.generated Thu Nov 14 11:46:13 CST 2019
     */
    private String cOfName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof.id
     *
     * @return the value of classificationof.id
     *
     * @mbg.generated Thu Nov 14 11:46:13 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationof.id
     *
     * @param id the value for classificationof.id
     *
     * @mbg.generated Thu Nov 14 11:46:13 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof.cId
     *
     * @return the value of classificationof.cId
     *
     * @mbg.generated Thu Nov 14 11:46:13 CST 2019
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationof.cId
     *
     * @param cid the value for classificationof.cId
     *
     * @mbg.generated Thu Nov 14 11:46:13 CST 2019
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof.c_Of_Name
     *
     * @return the value of classificationof.c_Of_Name
     *
     * @mbg.generated Thu Nov 14 11:46:13 CST 2019
     */
    public String getcOfName() {
        return cOfName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationof.c_Of_Name
     *
     * @param cOfName the value for classificationof.c_Of_Name
     *
     * @mbg.generated Thu Nov 14 11:46:13 CST 2019
     */
    public void setcOfName(String cOfName) {
        this.cOfName = cOfName == null ? null : cOfName.trim();
    }
}