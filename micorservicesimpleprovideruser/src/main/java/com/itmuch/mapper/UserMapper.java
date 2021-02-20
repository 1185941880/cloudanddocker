package com.itmuch.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itmuch.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
