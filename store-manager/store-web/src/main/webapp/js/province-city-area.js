/**
 * 
 */
var jsonObeject;
$(function(){
	$.ajaxSetup({ async: false }); 
	$.getJSON('json/address.json',function(data) {jsonObeject = data;});
	$.ajaxSetup({ async: true });
	$("#pro").append("<option value='-1'>请选择</option>");
	for(var i = 0 ; i<jsonObeject.length;i++){
		$("#pro").append("<option value="+i+">"+jsonObeject[i].name+"</option>");
	}
	$("#pro").change(function(){
		var index =  $("#pro").get(0).selectedIndex - 1;
		$("#citys").empty(); 
		var city = jsonObeject[index].city;
		$("#area").empty(); 
		$("#area").append("<option value='-1'>请选择</option>")
		$("#citys").append("<option value='-1'>请选择</option>")
		for(var i = 0 ; i <city.length; i ++){
			$("#citys").append("<option value="+i+">"+city[i].name+"</option>")
		}
	});
	
	$("#citys").change(function(){
		var s= $("#pro").get(0).selectedIndex - 1;
		var c= $(this).get(0).selectedIndex - 1;
		$("#area").empty(); 
		$("#area").append("<option value='-1'>请选择</option>")
		var area = jsonObeject[s].city[c].area;
		for(var i = 0 ; i <area.length; i ++){
			$("#area").append("<option value="+i+">"+area[i]+"</option>")
		}
	});
	
});