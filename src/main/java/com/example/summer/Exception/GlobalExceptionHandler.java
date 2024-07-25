package com.example.summer.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//나 모든 컨트롤러에 참견할거야
// 컨트롤러가 request를 히면서 예외를 받는데
// 내가 모든 컨트롤러에 예외가 발생하면 낚아챌거야!
@RestControllerAdvice
public class GlobalExceptionHandler { //나 이 예외 발생하면 아래 메소드 실행할거야
    @ExceptionHandler(value = RoomNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String catchRoomNotFoundException(RoomNotFoundException e){
        System.out.println(e.getClass());
        return e.getMessage();
    }
}
