package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Users;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("----Filter销毁----");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		// 获得在下面代码中要用的request,response,session对象
		  HttpServletRequest servletRequest = (HttpServletRequest) request;
		  HttpServletResponse servletResponse = (HttpServletResponse) response;
		  HttpSession session = servletRequest.getSession();
		  // 获得用户请求的URI
		  String path = servletRequest.getRequestURI();
		  //System.out.println(path);
		  // 从session里取用户信息
		  String User = (String) session.getAttribute("User");
		  /*创建类Constants.java，里面写的是无需过滤的页面
		  for (int i = 0; i < Constants.NoFilter_Pages.length; i++) {
		   if (path.indexOf(Constants.NoFilter_Pages[i]) > -1) {
		    chain.doFilter(servletRequest, servletResponse);
		    return;
		   }
		  }*/
		  // 登陆页面无需过滤
		  if(path.indexOf("/activity/login.jsp") > -1) {
			  filterChain.doFilter(servletRequest, servletResponse);
		   return;
		  }
		  // 判断如果没有取到员工信息,就跳转到登陆页面
		  if (User == null || "".equals(User)) {
		   // 跳转到登陆页面
		   servletResponse.sendRedirect("/travel/activity/login.jsp");
		  } else {
		   // 已经登陆,继续此次请求
			  filterChain.doFilter(request, response);
		  }
        
//原始过滤器内容
//		 // 对request、response进行一些预处理
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        
//        System.out.println("----调用service之前执行一段代码----");
//        filterChain.doFilter(request, response); // 执行目标资源，放行
//        System.out.println("----调用service之后执行一段代码----");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("----Filter初始化----");

	}

}
