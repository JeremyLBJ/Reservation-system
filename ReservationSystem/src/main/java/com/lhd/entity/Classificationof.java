package com.lhd.entity;

import java.util.List;

public class Classificationof {
	private List<ClassificationType> classificationtype;
	
	private List<ClassificationofGoodsItem> classificationofGoodsItems ;
	
	
    public List<ClassificationType> getClassificationtype() {
		return classificationtype;
	}

	public void setClassificationtype(List<ClassificationType> classificationtype) {
		this.classificationtype = classificationtype;
	}

	

	public List<ClassificationofGoodsItem> getClassificationofGoodsItems() {
		return classificationofGoodsItems;
	}

	public void setClassificationofGoodsItems(List<ClassificationofGoodsItem> classificationofGoodsItems) {
		this.classificationofGoodsItems = classificationofGoodsItems;
	}



	@Override
	public String toString() {
		return "Classificationof [classificationtype=" + classificationtype + ", classificationofGoodsItems="
				+ classificationofGoodsItems + ", id=" + id + ", cid=" + cid + ", cOfName=" + cOfName + "]";
	}





	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof.cId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof.c_Of_Name
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String cOfName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof.id
     *
     * @return the value of classificationof.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
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
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
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
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
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
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
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
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
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
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setcOfName(String cOfName) {
        this.cOfName = cOfName == null ? null : cOfName.trim();
    }
}