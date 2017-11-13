package com.test.mapper;

import com.test.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleMapper {


    List<User> getUserList();
}
