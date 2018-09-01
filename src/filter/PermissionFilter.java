package filter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class PermissionFilter implements Filter {
	
	private Set<String> prefixIignores = new HashSet<String>();

	@Override
	public void init(FilterConfig config) throws ServletException {
		String cp = config.getServletContext().getContextPath();  
        String ignoresParam = config.getInitParameter("ignores");  
        String[] ignoreArray = ignoresParam.split(",");  
        for (String s : ignoreArray) {  
            prefixIignores.add(s);  
        }  
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req =  (HttpServletRequest)request;
		
		String url = req.getRequestURI();
		System.out.println(url);
		if (canIgnore(req)) {  
			chain.doFilter(req, response);  
        }
	}

	@Override
	public void destroy() {

	}
	
	private boolean canIgnore(HttpServletRequest request) {  
        String url = request.getRequestURI();
        for (String ignore : prefixIignores) {  
            if (url.endsWith(ignore)) {  
                return true;  
            }  
        }  
        return false;  
    }

}
