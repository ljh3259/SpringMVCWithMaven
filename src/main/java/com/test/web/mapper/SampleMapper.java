package com.test.web.mapper;

import com.test.web.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleMapper {


    List<User> getUserList();
}
