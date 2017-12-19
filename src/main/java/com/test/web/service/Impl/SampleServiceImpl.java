package com.test.web.service.Impl;

import com.test.web.domain.User;
import com.test.web.mapper.SampleMapper;
import com.test.web.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService{

    private final SampleMapper sampleMapper;


    @Autowired
    public SampleServiceImpl(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }

    @Override
    public List<User> getUserList() {
        return sampleMapper.getUserList();
    }
}
