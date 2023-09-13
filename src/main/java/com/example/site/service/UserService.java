package com.example.site.service;


//import com.example.site.model.User;
//import com.example.site.repository.UserRepository;
//import com.example.site.repository.UserRepository;
import com.example.site.model.Member;
//import com.example.site.repository.UserRepository;
import com.example.site.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService{


    @Autowired
    private MemberRepository memberRepository;

    @Transactional
    public void SignUp(Member member){
        memberRepository.save(member);
    }
//
//    @Autowired
//    private BCryptPasswordEncoder encoder;
//    @Transactional
//    public void SignUp(Member member){
//        String rawPassword = member.getPassword();
//        String encPassword = encoder.encode(rawPassword);
//        member.setPassword();
//
//        userRepository.save(member);
//
//    }


}
