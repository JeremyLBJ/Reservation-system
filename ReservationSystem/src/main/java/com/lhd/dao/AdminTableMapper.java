package com.lhd.dao;

import com.lhd.entity.AdminTable;
import com.lhd.entity.AdminTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    long countByExample(AdminTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    int deleteByExample(AdminTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    int insert(AdminTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    int insertSelective(AdminTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    List<AdminTable> selectByExample(AdminTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    AdminTable selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") AdminTable record, @Param("example") AdminTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    int updateByExample(@Param("record") AdminTable record, @Param("example") AdminTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    int updateByPrimaryKeySelective(AdminTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin_table
     *
     * @mbg.generated Sun Dec 01 15:03:44 CST 2019
     */
    int updateByPrimaryKey(AdminTable record);
}