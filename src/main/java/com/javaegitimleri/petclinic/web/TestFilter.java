package com.javaegitimleri.petclinic.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(urlPatterns = "/TestServlet")
public class TestFilter implements Filter {


    public TestFilter() {
    }


    public void destroy() {

    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        response.getWriter().write("before...");
        chain.doFilter(request, response);
        response.getWriter().write("after...");
    }


    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
    }

}
