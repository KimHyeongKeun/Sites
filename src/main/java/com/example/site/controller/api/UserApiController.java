package com.example.site.controller.api;



import com.example.site.dto.ResponseDto;
import com.example.site.model.Member;
import com.example.site.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserApiController {

    @Autowired
    private UserService userService;

//    @Autowired
//    private HttpSession session;


    @PostMapping("/api/user")
    public ResponseDto<Integer> save(@RequestBody Member member){   //username, password, email
        System.out.println("UserApiController: save호출됨");
        //실제 DB에 insert를 하고 아래에서 return이 되면된다.

//        member.setRole(RoleType.USER);
         userService.SignUp(member);
        return new ResponseDto<Integer>(HttpStatus.OK.value(),1); //
    }

//    @PostMapping("/api/user/login")
//    public ResponseDto<Integer> login(@RequestBody Member member, HttpSession session){
//        System.out.println("UserApiContoller: login호출됨");
////        Member principal = userService.SignIn(member);     //principal(접근주체)
//
//        if(principal!=null){
//            session.setAttribute("principal", principal);
//        }
//        return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
//    }
}
