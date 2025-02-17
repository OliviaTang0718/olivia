package com.example.springboot_mysql_demo.exception;

import com.example.springboot_mysql_demo.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {
    @ExceptionHandler({Exception.class})
    public ResponseMessage handlerRxception(Exception e, HttpServletRequest request, HttpServletResponse servletResponse){
        //记录日志
        Logger log= LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
        log.error("统一异常：",e);

        return new ResponseMessage(500,"error",null);
    }

}
