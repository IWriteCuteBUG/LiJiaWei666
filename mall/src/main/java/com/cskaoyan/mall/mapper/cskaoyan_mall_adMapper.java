package com.cskaoyan.mall.mapper;


import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface cskaoyan_mall_adMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    long countByExample(com.cskaoyan.mall.bean.cskaoyan_mall_adExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int deleteByExample(com.cskaoyan.mall.bean.cskaoyan_mall_adExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int insert(com.cskaoyan.mall.bean.cskaoyan_mall_ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int insertSelective(com.cskaoyan.mall.bean.cskaoyan_mall_ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    List<com.cskaoyan.mall.bean.cskaoyan_mall_ad> selectByExample(com.cskaoyan.mall.bean.cskaoyan_mall_adExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    com.cskaoyan.mall.bean.cskaoyan_mall_ad selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") com.cskaoyan.mall.bean.cskaoyan_mall_ad record, @Param("example") com.cskaoyan.mall.bean.cskaoyan_mall_adExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int updateByExample(@Param("record") com.cskaoyan.mall.bean.cskaoyan_mall_ad record, @Param("example") com.cskaoyan.mall.bean.cskaoyan_mall_adExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int updateByPrimaryKeySelective(com.cskaoyan.mall.bean.cskaoyan_mall_ad record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cskaoyan_mall_ad
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    int updateByPrimaryKey(com.cskaoyan.mall.bean.cskaoyan_mall_ad record);
}
