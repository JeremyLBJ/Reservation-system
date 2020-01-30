package com.lhd.entity;

import java.sql.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotations.TableField;

public class ClassificationofGoodsItem {
	
	//第一个价格
	@TableField(exist=false)
	private Double priceOne ;
	//第二个价格
	@TableField(exist=false)
	private Double priceTow ; 
	
	private Date createTime ;
	
	private List<Imginfo> imginfos ;
	
    public List<Imginfo> getImginfos() {
		return imginfos;
	}

	public void setImginfos(List<Imginfo> imginfos) {
		this.imginfos = imginfos;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Double getPriceOne() {
		return priceOne;
	}

	public void setPriceOne(Double priceOne) {
		this.priceOne = priceOne;
	}

	public Double getPriceTow() {
		return priceTow;
	}

	public void setPriceTow(Double priceTow) {
		this.priceTow = priceTow;
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof_goods_item.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof_goods_item.cId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof_goods_item.cName
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String cname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof_goods_item.inventory
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Double inventory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof_goods_item.images
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String images;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classificationof_goods_item.price
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Double price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof_goods_item.id
     *
     * @return the value of classificationof_goods_item.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private String orderNo;
    
    private String brand;
    
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationof_goods_item.id
     *
     * @param id the value for classificationof_goods_item.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof_goods_item.cId
     *
     * @return the value of classificationof_goods_item.cId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationof_goods_item.cId
     *
     * @param cid the value for classificationof_goods_item.cId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof_goods_item.cName
     *
     * @return the value of classificationof_goods_item.cName
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationof_goods_item.cName
     *
     * @param cname the value for classificationof_goods_item.cName
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof_goods_item.inventory
     *
     * @return the value of classificationof_goods_item.inventory
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public Double getInventory() {
        return inventory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationof_goods_item.inventory
     *
     * @param inventory the value for classificationof_goods_item.inventory
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setInventory(Double inventory) {
        this.inventory = inventory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof_goods_item.images
     *
     * @return the value of classificationof_goods_item.images
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public String getImages() {
        return images;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationof_goods_item.images
     *
     * @param images the value for classificationof_goods_item.images
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classificationof_goods_item.price
     *
     * @return the value of classificationof_goods_item.price
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classificationof_goods_item.price
     *
     * @param price the value for classificationof_goods_item.price
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "ClassificationofGoodsItem [priceOne=" + priceOne + ", priceTow=" + priceTow + ", createTime="
				+ createTime + ", imginfos=" + imginfos + ", id=" + id + ", cid=" + cid + ", cname=" + cname
				+ ", inventory=" + inventory + ", images=" + images + ", price=" + price + ", orderNo=" + orderNo
				+ ", brand=" + brand + "]";
	}


}