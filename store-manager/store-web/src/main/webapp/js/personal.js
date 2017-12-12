var isToday = function (str) {
    var d = new Date(str.replace(/-/g, "/"));
    var todaysDate = new Date();
    if (d.setHours(0, 0, 0, 0) == todaysDate.setHours(0, 0, 0, 0)) {
        return true;
    } else {
        return false;
    }
};
var getContextFrom = function (url) {
    $.get(url+"?="+Math.random(), {now: new Date(),ajax:true}, function (data) {
        $(".main-wrap").html(data);
    });
};
var getPoints = function () {
    getContextFrom('property/points.do');
};
var singed = function () {
    getContextFrom('property/sign.do');
};
var getCoupon=function(){
    getContextFrom('property/coupon.do');
};
var getBill = function(){
    getContextFrom('property/bill.do');
};
var getBonus = function () {
    getContextFrom('property/bonus.do');
};
var getWalletlist = function () {
    getContextFrom('property/walletlist.do');
};
var getBillList = function () {
    getContextFrom('property/billList.do');
};
var deleteCoupon = function (id) {
    $.post('property/deleteCoupon.do', {now: new Date(),ajax:true,id:id}, function (data) {
        $(".main-wrap").html(data);
    });
};