package com.test.service.Impl;

import com.test.domain.User;
import com.test.mapper.SampleMapper;
import com.test.service.SampleService;
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
