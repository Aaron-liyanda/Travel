<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%--System.out.print("有运行jsp ");--%>
  <c:if test="${empty senicList}">
  	<font size="6"></font><p>很抱歉,未找到相关景点</p></font>
  </c:if>
  
<c:forEach items="${senicList}" var="_senic" varStatus="i">
	    <c:choose>
          <c:when test="${i.count%3==0}">
	        <div class="grid last-grid">
	        <br>
	      </c:when>
	      <c:otherwise>
	        <div class="grid"> 
	      </c:otherwise>
	    </c:choose>
	   
	    <a href="${pageContext.request.contextPath}/toShowServlet?id=${_senic.sen_id}"><img src="${pictures[i.index]}" title="${_senic.sen_name}示例图" /></a>
			<h3>${_senic.sen_name}</h3>
			<p>${_senic.sen_desc}</p>
			<a class="button" href="${pageContext.request.contextPath}/toShowServlet?id=${_senic.sen_id}">More</a>
			
		</div>		    
</c:forEach>
			

	    
