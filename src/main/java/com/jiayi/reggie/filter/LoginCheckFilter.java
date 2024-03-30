package com.jiayi.reggie.filter;

import com.alibaba.fastjson.JSON;
import com.jiayi.reggie.common.BaseContext;
import com.jiayi.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
@WebFilter(filterName = "LoginCheckFilter", urlPatterns = "/*")
public class LoginCheckFilter implements Filter {

    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String requestURI = request.getRequestURI();
        log.info("本次请求路径：{}", requestURI);
        String[] urls = new String[]{

                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**",
                "/common/**"

        };



        boolean check = check(urls, requestURI);

        if (check){
            log.info("本次请求不需要处理, {}", requestURI);
            filterChain.doFilter(request, response);
            return;
        }

        if (request.getSession().getAttribute("employee") != null){
            log.info("用户已登录，用户id为:{}", request.getSession().getAttribute("employee"));
            Long emId = (Long) request.getSession().getAttribute("employee");
            BaseContext.setCurrentId(emId);

            filterChain.doFilter(request, response);
            return;
        }

        log.info("用户未登录");
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;
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
