package com.skyline.note.dao;

import com.skyline.note.entity.UserInfo;

public interface UserInfoMapper {
    int insert(UserInfo record);

    int insertSelective(UserInfo record);
}