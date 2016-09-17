package com.skyline.innofarms.domain;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface barnDao {
	
	@Select("SELECT *FROM BARN_INFO WHERE BARN_NAME = #{#barnName}")
	barn findByName(@Param("name") String name);
	
	@Insert("INSERT INTO BARN_INFO (BARN_ID,BARN_NAME,BARN_TYPE,LAST_UP_TIME) VALUES (#{barnId},#{barnName},#{barnType},#{lastUpTime})")
	int insert(@Param("id") String id,@Param("name") String name,@Param("type") String type,@Param("upTime") String upTime);
}
