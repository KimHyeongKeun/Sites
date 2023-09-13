package com.example.site.controller.api;


//import com.example.site.model.User;
import com.example.site.model.Member;
import com.example.site.model.RoleType;
import com.example.site.repository.MemberRepository;
import com.example.site.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserApiController {

    @Autowired  //type으로 의존성 주입(변수, 생성자, Setter메소드, 일반 메소드에서 적용 가능)
    private UserService userService;

    @Autowired
    private MemberRepository memberRepository;


    @PostMapping("/api/user")
    public String save(@RequestBody Member member){
        System.out.println("UserApiController: save호출됨");
//        System.out.println("username"+username);
        System.out.println("");
        System.out.println("username: "+member.getUsername() + "email: "+member.getEmail() + "password: "+member.getPassword());

        member.setRole(RoleType.MEMBER);
        userService.SignUp(member);

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

//    @PostMapping("/api/posttest")
//    public String join(@RequestBody Member member){
//        return "post 요청"+member.getUsername()+" "+ member.getPassword();
//    }

    @GetMapping("/api/gettest")
    public String getTest(Member member){

        return "테스트 완료"+member.getUsername()+" "+ member.getPassword();
    }

    @PostMapping("/Dummy/join")
    public String join(Member member){

        System.out.println("Username: "+member.getUsername());
        System.out.println("Password: "+member.getPassword());
        System.out.println("Email: "+member.getEmail());

        return "회원가입이 완료되었습니다.";

    }


}
