package com.test.config.security;

import com.test.web.domain.AdminUserInfo;
import com.test.web.mapper.SignInMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Slf4j
public class AdminUserDetailServiceImpl implements UserDetailsService {

    private final SignInMapper signInMapper;

    @Autowired
    public AdminUserDetailServiceImpl(SignInMapper signInMapper) {
        this.signInMapper = signInMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String adminName) {

        log.debug("loadUserByUsername(adminName : {})", adminName);

        HashMap<String, Object> adminUserInfo = signInMapper.getAdminInfo(adminName);

        if (adminUserInfo == null) {
            throw new UsernameNotFoundException("No user found with username");
        }

        return new AdminUserInfo(adminUserInfo.get("ADMINID").toString()
                , adminUserInfo.get("ADMINPASSWORD").toString()
                , adminUserInfo.get("ADMINNAME").toString()
                , this.getAuthorization(adminUserInfo));
    }


    //SimpleGrantedAuthority 클래스는 권한을 저장하기 위한 구조는 단순하게 되어있다.
    // 예를들어 "ROLE_ADMIN"이란 문자열값을 생성자 파라미터로 넣어주는것으로 권한설정이 끝난다.
    private List<GrantedAuthority> getAuthorization(HashMap adminUserInfo) {
        List<GrantedAuthority> aurhorities = new ArrayList<>();
        aurhorities.add(new SimpleGrantedAuthority(adminUserInfo.get("role").toString()));
        return aurhorities;
    }

}
