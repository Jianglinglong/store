package com.team.store.interceptors;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class PersonContextInterceptor implements HandlerInterceptor {
    @Resource(name = "jedis")
    private Jedis jedis;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String parameter = request.getParameter("now");
        String ajax = request.getParameter("ajax");
        StringBuffer requestURL = request.getRequestURL();
        HttpSession session = request.getSession();

        Object attribute = session.getAttribute("user");
        if (attribute==null) {
        	response.sendRedirect(request.getContextPath()+ "/login.jsp");
			return false;
		}else {
			return true;
		}
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
