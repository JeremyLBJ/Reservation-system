package com.lhd.dao;

import com.lhd.entity.Evaluation;
import com.lhd.entity.EvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    long countByExample(EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    int deleteByExample(EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    int insert(Evaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    int insertSelective(Evaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    List<Evaluation> selectByExample(EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    Evaluation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    int updateByExample(@Param("record") Evaluation record, @Param("example") EvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    int updateByPrimaryKeySelective(Evaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation
     *
     * @mbg.generated Thu Oct 24 15:52:53 CST 2019
     */
    int updateByPrimaryKey(Evaluation record);
}