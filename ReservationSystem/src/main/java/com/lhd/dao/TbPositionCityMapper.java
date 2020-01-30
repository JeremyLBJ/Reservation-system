package com.lhd.dao;

import com.lhd.entity.TbPositionCity;
import com.lhd.entity.TbPositionCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbPositionCityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    long countByExample(TbPositionCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByExample(TbPositionCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insert(TbPositionCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insertSelective(TbPositionCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    List<TbPositionCity> selectByExample(TbPositionCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    TbPositionCity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbPositionCity record, @Param("example") TbPositionCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExample(@Param("record") TbPositionCity record, @Param("example") TbPositionCityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKeySelective(TbPositionCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_position_city
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKey(TbPositionCity record);
}