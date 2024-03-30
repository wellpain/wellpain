package com.jiayi.reggie.intercretor;

import com.alibaba.fastjson.JSON;
import com.jiayi.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Slf4j
//@Component
public class LoginIntercreptor implements HandlerInterceptor {

    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String requestURI = request.getRequestURI();
        log.info("本次请求路径：{}", requestURI);
        String[] urls = new String[]{

                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**"

        };



        boolean check = check(urls, requestURI);

        if (check){
            log.info("本次请求不需要处理, {}", requestURI);
            return true;
        }

        if (request.getSession().getAttribute("employee") != null){
            log.info("用户已登录，用户id为:{}", request.getSession().getAttribute("employee"));
            return true;
        }

        log.info("用户未登录");
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        response.sendRedirect("/employee/login");
        return false;

    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("posthandle....");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("aftercompletion....");
    }

    public boolean check(String[] urls, String requestUrl) {
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestUrl);
            if (match) {
                return true;
            }
        }
        return false;
    }
}
