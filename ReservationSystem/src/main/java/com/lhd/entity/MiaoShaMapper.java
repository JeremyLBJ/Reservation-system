package com.lhd.entity;

import com.lhd.entity.MiaoSha;
import com.lhd.entity.MiaoShaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiaoShaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    long countByExample(MiaoShaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByExample(MiaoShaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insert(MiaoSha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insertSelective(MiaoSha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    List<MiaoSha> selectByExample(MiaoShaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    MiaoSha selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExampleSelective(@Param("record") MiaoSha record, @Param("example") MiaoShaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExample(@Param("record") MiaoSha record, @Param("example") MiaoShaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKeySelective(MiaoSha record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miao_sha
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKey(MiaoSha record);
}