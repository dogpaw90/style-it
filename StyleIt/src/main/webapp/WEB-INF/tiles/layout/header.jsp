<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript">
$(document).ready(function() {
	
	$("#logo").click(function() {
		location.href="/main";
	});
	
});

</script>

<!-- Start Header Area -->
<nav class="navbar navbar-default navbar-fixed-top" style="background-image:linear-gradient(to bottom, #fff 100%, #f8f8f8 100%);position: sticky; z-index: 9999;margin-bottom: 0;">
      <div class="container">
      <div class="row">
        <div class="navbar-header" style="margin-left: 45%">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <h1 style="color:#009994;font-family: 'Permanent Marker', cursive;margin-bottom: 15px;">style it</h1>
        </div>
        <div id="navbar" class="navbar-right">
          <ul class="nav navbar-nav" style="font-size: 0.85em;">
            <li><a href="#">CREATE+&nbsp;<span><img alt="faq" src="/resources/image/main/hanger.png" style="width: 20px;"></span></a></li>
            
			  <c:if test="${login eq true }">
			  <li><a href="#">MYPAGE</a></li>
			  <li><a href="#">LOGOUT</a></li>
			  </c:if>
			  <c:if test="${login ne true }">
			  <li><a href="#">JOIN</a></li>
			  <li><a href="#">LOGIN</a></li>			  
			  </c:if>
			  
			  <li><a href="#"><span><img alt="faq" src="/resources/image/main/faq.png" style="width: 20px;"></span></a></li>
          </ul>
        </div>
      </div>
      
      </div>
    </nav>
  
 <!-- End Header Area -->  
