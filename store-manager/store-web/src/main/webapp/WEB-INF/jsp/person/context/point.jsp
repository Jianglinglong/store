<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/jstl.jspf" %>
<link href="css/point.css" rel="stylesheet" type="text/css">
<div class="points">
    <!--标题 -->
    <div class="am-cf am-padding">
        <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">我的积分</strong> /
            <small>My&nbsp;Point</small>
        </div>
    </div>
    <hr/>
    <div class="pointsTitle">
        <div class="usable">可用积分<span>${points}</span></div>
        <div class="pointshop"><a href="javascript:void(0);"><i><img src="images/u5.png"/></i>积分商城</a></div>
        <div class="signIn"><a href="javascript:singed();"><i class="am-icon-calendar"></i><em>+5</em>每日签到</a></div>
    </div>
    <div class="pointlist am-tabs" data-am-tabs>
        <ul class="am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs">
            <li class="am-active"><a href="/#tab1">全部</a></li>
            <li><a href="/#tab2">获得</a></li>
            <li><a href="/#tab3">支出</a></li>
        </ul>
        <div class="am-tabs-bd">
            <div class="am-tab-panel am-fade am-in am-active" id="tab1">
                <table>
                    <b></b>
                    <thead>
                    <tr>
                        <th class="th1">积分详情</th>
                        <th class="th2">积分变动</th>
                        <th class="th3">日期</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${records}" var="point">
                        <tr>
                            <td class="pointType">${point.pointopType}</td>
                            <td class="pointNum">${point.pointNum}</td>
                            <td class="pointTime"><fmt:formatDate value="${point.pointopTime}"
                                                                  pattern="yyyy-MM-dd hh:mm"/></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="am-tab-panel am-fade" id="tab2">
                <table>
                    <b></b>
                    <thead>
                    <tr>
                        <th class="th1">积分详情</th>
                        <th class="th2">获取积分</th>
                        <th class="th3">日期</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${records}" var="point">
                        <c:if test="${point.pointNum>0}">
                            <tr>
                                <td class="pointType">${point.pointopType}</td>
                                <td class="pointNum">${point.pointNum}</td>
                                <td class="pointTime"><fmt:formatDate value="${point.pointopTime}"
                                                                      pattern="yyyy-MM-dd hh:mm"/></td>
                            </tr>
                        </c:if>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="am-tab-panel am-fade" id="tab3">
                <table>
                    <b></b>
                    <thead>
                    <tr>
                        <th class="th1">积分详情</th>
                        <th class="th2">消耗积分</th>
                        <th class="th3">日期</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${records}" var="point">
                        <c:if test="${point.pointNum<0}">
                            <tr>
                                <td class="pointType">${point.pointopType}</td>
                                <td class="pointNum">${point.pointNum}</td>
                                <td class="pointTime"><fmt:formatDate value="${point.pointopTime}"
                                                                      pattern="yyyy-MM-dd hh:mm"/></td>
                            </tr>
                        </c:if>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">

    $(function () {
        var text = $("tr:contains('签到')").find('.pointTime').first().html();
        if (isToday(text)){
            $(".signIn a").attr('href','javascript:void(0);');
        }

    })
</script>