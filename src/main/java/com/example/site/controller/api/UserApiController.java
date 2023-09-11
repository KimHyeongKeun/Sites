package com.example.site.controller.api;


import com.example.site.dto.ResponseDto;
//import com.example.site.model.User;
import com.example.site.model.Member;
import com.example.site.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {

    @Autowired  //type으로 의존성 주입(변수, 생성자, Setter메소드, 일반 메소드에서 적용 가능)
    private UserService userService;


    @PostMapping("/api/user")
    public String save(@RequestBody Member member){
        System.out.println("UserApiController: save호출됨");
//        System.out.println("username"+username);
        System.out.println("");
        return "UserApiController: save호출됨";
    }

//    @PostMapping("/api/test")
//    public String join(@RequestBody String username, String password, String email){
////        System.out.println("username"+ username);
////        System.out.println("password"+ password);
////        System.out.println("email"+ email);
//
//        return "회원가입이 완료되었습니다.";
//    }

    @PostMapping("/api/test")
    public String join(){
        return "회원가입이 완료되었습니다.";
    }

}
