<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/jstl.jspf" %>
<c:forEach items="${list1 }" var="pro">
	<li><a href="searchProduct/product.do?proId=${pro.proId }">
			<div class="i-pic limit">
				<img src="${pro.proImg }" />
				<p class="title fl">${pro.proName }</p>
				<p class="price fl">
					<b>¥</b> <strong>${pro.proPrice }</strong>
				</p>
				<p class="number fl">
					销量<span>${pro.psNum }</span>
				</p>
			</div>
	</a></li>
</c:forEach>