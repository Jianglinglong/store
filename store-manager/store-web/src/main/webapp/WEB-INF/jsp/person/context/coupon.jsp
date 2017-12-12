<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/jstl.jspf" %>
<link href="css/cpstyle.css" rel="stylesheet" type="text/css">
<div class="user-coupon">
    <!--标题 -->
    <div class="am-cf am-padding">
        <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">优惠券</strong> /
            <small>Coupon</small>
        </div>
    </div>
    <hr/>
    <div class="am-tabs-d2 am-tabs  am-margin" data-am-tabs>
        <ul class="am-avg-sm-2 am-tabs-nav am-nav am-nav-tabs">
            <li class="am-active"><a href="/#tab1">可用优惠券</a></li>
            <li><a href="/#tab2">已用/过期优惠券</a></li>
        </ul>
        <div class="am-tabs-bd">
            <div class="am-tab-panel am-fade am-in am-active" id="tab1">
            <c:forEach items="${couponList}" var="coupon">
                <c:if test="${coupon.couponEndtime.time >= now && coupon.couponState eq 0}">
                    <div class="coupon-items">
                        <div class="coupon-item coupon-item-d">
                            <div class="coupon-list">
                                <div class="c-type">
                                    <div class="c-class">
                                        <strong>购物券</strong>
                                    </div>
                                    <div class="c-price">
                                        <strong>￥${coupon.couponPrice}</strong>
                                    </div>
                                    <div class="c-limit">
                                        【消费满&nbsp;${coupon.couponCondition}元&nbsp;可用】
                                    </div>
                                    <div class="c-time">
                                        <fmt:formatDate value="${coupon.couponStarttime}"
                                                        pattern="yyyy-MM-dd"/>-<fmt:formatDate
                                            value="${coupon.couponEndtime}" pattern="yyyy-MM-dd"/>
                                    </div>
                                    <div class="c-type-top"></div>
                                    <div class="c-type-bottom"></div>
                                </div>

                                <div class="c-msg">
                                    <div class="c-range">
                                        <div class="range-all">
                                            <div class="range-item">
                                                <span class="label">券&nbsp;编&nbsp;号：</span>
                                                <span class="txt">${coupon.couponId}</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="op-btns">
                                        <a href="javascript:;" class="btn"><span class="txt">立即使用</span><b></b></a>
                                    </div>
                                </div>
                                <li class="td td-usestatus">
                                    <div class="item-usestatus">
                                        <span><img src="images/gift_stamp_1.png"/></span>
                                    </div>
                                </li>
                            </div>
                        </div>
                    </div>
                </c:if>
                </c:forEach>
            </div>
            <div class="am-tab-panel am-fade" id="tab2">
                <c:forEach items="${couponList}" var="coupon">
                    <c:if test="${coupon.couponEndtime.time < now || coupon.couponState eq 1}">
                        <div class="coupon-items">
                            <div class="coupon-item coupon-item-d">
                                <div class="coupon-list">
                                    <div class="c-type">
                                        <div class="c-class">
                                            <strong>购物券</strong>
                                        </div>
                                        <div class="c-price">
                                            <strong>￥${coupon.couponPrice}</strong>
                                        </div>
                                        <div class="c-limit">
                                            【消费满&nbsp;${coupon.couponCondition}元&nbsp;可用】
                                        </div>
                                        <div class="c-time">
                                            <fmt:formatDate value="${coupon.couponStarttime}"
                                                            pattern="yyyy-MM-dd"/>-<fmt:formatDate
                                                value="${coupon.couponEndtime}" pattern="yyyy-MM-dd"/>
                                        </div>
                                        <div class="c-type-top"></div>
                                        <div class="c-type-bottom"></div>
                                    </div>

                                    <div class="c-msg">
                                        <div class="c-range">
                                            <div class="range-all">
                                                <div class="range-item">
                                                    <span class="label">券&nbsp;编&nbsp;号：</span>
                                                    <span class="txt">${coupon.couponId}</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="op-btns">
                                            <a href="javascript:deleteCoupon(${coupon.couponId});" class="btn"><span
                                                    class="txt">删除</span><b></b></a>
                                        </div>
                                    </div>
                                    <li class="td td-usestatus">
                                        <div class="item-usestatus">
                                                <span>
                                                    <c:choose>
                                                        <c:when test="${coupon.couponState eq 1}">
                                                            <img src="images/gift_stamp_31.png"/>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <img src="images/gift_stamp_21.png"/>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </span>
                                        </div>
                                    </li>
                                </div>
                            </div>
                        </div>
                    </c:if>
                </c:forEach>
            </div>
            <%--<c:if test="${coupon.couponEndtime.time >= now}">--%>
            <%----%>
            <%--</c:if>--%>
            <%--<c:if test="${coupon.couponEndtime.time < now}">--%>

            <%--</c:if>--%>
        </div>
    </div>
</div>

