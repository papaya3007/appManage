package me.app.dao;

import me.app.pojo.AppVersion;

public interface AppVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated
     */
    int insert(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated
     */
    int insertSelective(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated
     */
    AppVersion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AppVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_version
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AppVersion record);
}