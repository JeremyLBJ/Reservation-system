package com.lhd.entity;

import java.util.List;

public class Classificationofgoods {
	
	private List<Classificationof> classificationof;
	
	
    public List<Classificationof> getClassificationof() {
		return classificationof;
	}

	public void setClassificationof(List<Classificationof> classificationof) {
		this.classificationof = classificationof;
	}


	@Override
	public String toString() {
		return "Classificationofgoods [classificationof=" + classificationof + ", id=" + id + ", ctypename=" + ctypename
				+ "]";
	}


	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationofgoods.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationofgoods.cTypeName
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String ctypename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationofgoods.id
     *
     * @return the value of classificationofgoods.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationofgoods.id
     *
     * @param id the value for classificationofgoods.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationofgoods.cTypeName
     *
     * @return the value of classificationofgoods.cTypeName
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public String getCtypename() {
        return ctypename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationofgoods.cTypeName
     *
     * @param ctypename the value for classificationofgoods.cTypeName
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setCtypename(String ctypename) {
        this.ctypename = ctypename == null ? null : ctypename.trim();
    }
}