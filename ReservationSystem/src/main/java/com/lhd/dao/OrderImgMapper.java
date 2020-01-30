package com.lhd.dao;

import com.lhd.entity.OrderImg;
import com.lhd.entity.OrderImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    long countByExample(OrderImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByExample(OrderImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insert(OrderImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insertSelective(OrderImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    List<OrderImg> selectByExample(OrderImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    OrderImg selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExampleSelective(@Param("record") OrderImg record, @Param("example") OrderImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExample(@Param("record") OrderImg record, @Param("example") OrderImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKeySelective(OrderImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_img
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKey(OrderImg record);
}