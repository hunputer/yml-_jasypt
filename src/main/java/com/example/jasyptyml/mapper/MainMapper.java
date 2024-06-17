package com.example.jasyptyml.mapper;

import com.example.jasyptyml.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {

    List<UserVO> selectUser();
}
