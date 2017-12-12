<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/jstl.jspf" %>
<script src="${basePath}/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
<script src="${basePath}/AmazeUI-2.4.2/assets/js/amazeui.js"></script>
<link href="${basePath}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css">
<link href="${basePath}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css">
<link href="${basePath}/css/personal.css" rel="stylesheet" type="text/css">
<link href="${basePath}/css/wallet.css" rel="stylesheet" type="text/css">
<div class="am-cf am-padding">
    <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">账单明细</strong> /
        <small>Electronic&nbsp;bill</small>
    </div>
</div>
<hr>
<div class="finance">
    <div class="financeText">
        <p>可用余额:<span>${money.monMoney}</span></p>
        <p>账户状态:<span>有效</span></p>
        <a href="personalData/initSafety.do">安全中心：保护账户资产安全</a>
    </div>
</div>

<!--交易时间 -->

<div class="order-time">
    <label class="form-label">交易时间：</label>
    <div class="show-input">
        <select id="time" class="am-selected" data-am-selected value="${select}">
            <option value="1">今天</option>
            <option value="2">最近一个月</option>
            <option value="3">最近三个月</option>
            <option value="4" >最近一周</option>
            <%--<option class="date-trigger">自定义时间</option>--%>
        </select>
    </div>
    <div class="clear"></div>
</div>

<div class="walletList">

    <div class="walletTitle">
        <li class="time">创建时间</li>
        <li class="name">详情</li>
        <li class="amount">金额</li>
        <li class="balance">余额</li>
    </div>
    <div class="clear"></div>
    <div class="walletCont">
        <c:forEach items="${costList.list}" var="record">
            <li class="cost">
                <div class="time">
                    <p><fmt:formatDate value="${record.moneyopTime}" pattern="yyyy-MM-dd"/></p>
                    <p class="text-muted"><fmt:formatDate value="${record.moneyopTime}" pattern="hh:mm"/></p>
                </div>
                <div class="title name">
                    <p class="content"> ${record.moneyopType}</p>
                </div>
                <div class="amount">
                    <span class="amount-pay">${record.moneyopMoney}</span>
                </div>
                <div class="balance">
                    <span>余额：</span><em>${record.remainMoney}</em>
                </div>
            </li>
        </c:forEach>
    </div>
    <!--分页-->
    <ul class="am-pagination am-pagination-right" style="position: absolute;right: 25px;bottom: 0px;">
        <c:set var="crt" value="${costList.pageNum}"/>
        <c:choose>
            <c:when test="${crt eq 1}">
                <li class="am-disabled"><a href="javascript:void(0);">&laquo;</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="javascript:void(0);">&laquo;</a></li>
            </c:otherwise>
        </c:choose>
        <c:forEach var="index" begin="1" end="${costList.pages}">
            <%-- 是否为选中--%>
            <c:choose>
                <c:when test="${index eq crt}">
                    <li class="am-disabled choiced"><a href="javascript:void(0);">${index}</a></li>
                </c:when>
                <c:otherwise>
                    <li><a href="javascript:void(0);">${index}</a></li>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        <c:choose>
            <c:when test="${crt eq costList.pages}">
                <li class="am-disabled"><a href="javascript:void(0);">&raquo;</a></li>
            </c:when>
            <c:otherwise>
                <li><a href="javascript:void(0);">&raquo;</a></li>
            </c:otherwise>
        </c:choose>
    </ul>
</div>

<script type="text/javascript">
        $("#time").val("${select}");
        var totalPage = 0;
        <c:if test="${costList.pages != null}">
        totalPage = ${costList.pages};
        </c:if>
        $(".am-pagination li").click(function () {
            if($(this).hasClass('am-disabled')){
                return;
            }
            var page = $(this).index();
            if (page == 0 ){
                page = 1;
            }
            if (page>totalPage){
                page = page-1;
            }
            var condition =  $("#time").val();
            getContext(page,condition);
        });
        $("#time").change(function () {
            var page =  $(".choiced").find('a').html();
            var time =  $(this).val();
            getContext(page,time);
        });
        var getContext = function (page,time) {
            $.get('${basePath}/property/walletlist.do', {now:new Date(),ajax:true,page: page,time:time}, function (data) {
                $(".main-wrap").html(data);
            });
        };
</script>
