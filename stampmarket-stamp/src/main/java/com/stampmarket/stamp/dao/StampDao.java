package com.stampmarket.stamp.dao;

import com.stampmarket.stamp.pojo.Stamp;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StampDao {
    @Insert("insert into stamp( name, description, width, height, publish_date, price) values" +
            "(#{name}, #{description}, #{width}, #{height}, #{publishDate}, #{price})")
    void add(Stamp stamp);

    @Delete("delete from stamp where id = #{id}")
    void delete(Integer id);

    @Select("select * from stamp")
    List<Stamp> listAllStamp();

    @Update("update stamp set price = #{price} where id = #{id}")
    void updatePrice(Integer id, Double price);

    @Select("select price from stamp where id = #{id}")
    Integer queryPriceForStampId(Integer id);
}
