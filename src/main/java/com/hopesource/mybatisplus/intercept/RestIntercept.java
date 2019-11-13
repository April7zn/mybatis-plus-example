package com.hopesource.mybatisplus.intercept;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j
@Aspect
@Component
public class RestIntercept {
    private static final String POINT_CUT = "execution(public * com.hopesource.mybatisplus.controller.*.*(..))";
    @Pointcut(POINT_CUT)
    public void restController(){}

    @Around(value = POINT_CUT)
    public Object doAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("---请求参数---：", JSONObject.toJSONString(proceedingJoinPoint.getArgs()));
        Object data = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        Map<String, Object> rtn = new LinkedHashMap<>();
        rtn.put("result","true");
        rtn.put("resultCode","200");
        rtn.put("resultMsg","成功");
        rtn.put("data", data);
        return JSONObject.toJSONString(rtn);
    }
}
