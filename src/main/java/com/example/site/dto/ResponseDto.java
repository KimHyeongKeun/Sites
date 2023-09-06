package com.example.site.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  //기본 생성자를 생성해준다.(자바는 생성자가 없으면 자동으로 NoArgsConstructor를 생성한다.
@AllArgsConstructor //전체 변수를 생성하는 생성자를 만들어준다.
@Builder
public class ResponseDto<T> {
    int status;
    T data;
}
