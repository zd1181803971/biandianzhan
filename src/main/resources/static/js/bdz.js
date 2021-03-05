
const Surl = "http://101.132.138.101:80";
var proId;//当前的公司id
var subId;//当前供电站id
var equId;//当前设备id

    function checkByPidOrSidOrEid(){
    if (proId === undefined){
    alert("请选择公司后操作")
    return false;
}else  if (subId === undefined){
    alert("请选择供电站后操作")
    return false;
}else if(equId === undefined){
    alert("请选择供电设备后操作")
    return false;
}else{
    return true
}
}
    function checkByPidOrSid(){
    if (proId === undefined){
    alert("请选择公司后操作")
    return false;
}else  if (subId === undefined){
    alert("请选择供电站后操作")
    return false;
}else {
    return true
}
}
    function checkByPid(){
    if (proId === undefined){
    alert("请选择公司后操作")
    return false;
}else {
    return true
}
}

    //查询设备
    function getEqu(){
    if (checkByPidOrSid()){
    var s1 = $("#sb1").val()
    var s2 = $("#sb2").val()
    var s3 = $("#sb3").val()
    var s4 = $("#sb4").val()
    if (s1 == ''){
    alert("请输入设备名称")
}else {
    var te = {"mc": s1,"sblx": s2,"sfzy": s3,"ssbm": subId,"sfwx": s4}
    $.ajax({
    url: Surl+"/equ/list",
    data: JSON.stringify(te),
    type: "post",
    contentType:"application/json",
    dataType: "json",
    success: function(data) {
    console.log(data)
    $("#equList").html('')
    $.each(data.data,function (i,n){
    $("#equList").append("<div id="+"shebei"+ n.objId +" class=\"huiC3Add\" onclick=\"equCK("+n.objId+")\">"+"<div>"+n.mc+"</div>"+"<div>"+n.sblx+"</div>"+"<div>"+n.sfzy+"</div>"+"<div>"+n.sfwx+"</div>"+"</div>");
})
}
});

}
}
}
    //删除设备
    function delEqu(){
    if (checkByPidOrSidOrEid()){
    $.ajax({
    url: Surl+"/equ/"+equId,
    type: "get",
    dataType: "json",
    success: function(data) {
    if (confirm("确定删除设备："+data.data.mc+"吗")){
    $.ajax({
    url: Surl+"/equ/delEqu/"+equId,
    type: "post",
    contentType:"application/json",
    dataType: "json",
    success: function(data) {
    alert("删除成功！")
    getEquBySubID(subId)
}
});
}
}
});
}
}

    //编辑设备
    function updateEqu(){
    if (checkByPidOrSidOrEid()){
    var s1 = $("#sb1").val()
    var s2 = $("#sb2").val()
    var s3 = $("#sb3").val()
    var s4 = $("#sb4").val()
    if (s1 == ''){
    alert("请输入设备名称")
}else {
    var te = {"objId": equId,"mc": s1,"sblx": s2,"sfzy": s3,"ssbm": subId,"sfwx": s4}
    $.ajax({
    url: Surl+"/equ/updateEqu",
    data: JSON.stringify(te),
    type: "post",
    contentType:"application/json",
    dataType: "json",
    success: function(data) {
    alert("修改成功")
    getEquBySubID(subId)
    $("#sb1").val('')
}
});
}
}
}
    //添加设备
    function addEqu(){
    if (checkByPidOrSid()){
    var s1 = $("#sb1").val()
    var s2 = $("#sb2").val()
    var s3 = $("#sb3").val()
    var s4 = $("#sb4").val()
    if (s1 == ''){
    alert("请输入设备名称")
}else {
    var te = {"mc": s1,"sblx": s2,"sfzy": s3,"ssbm": subId,"sfwx": s4}
    $.ajax({
    url: Surl+"/equ",
    data: JSON.stringify(te),
    type: "post",
    contentType:"application/json",
    dataType: "json",
    success: function(data) {
    alert("添加成功")
    getEquBySubID(subId)
    $("#sb1").val('')
}
});

}
}

}

    //保存==添加公司
    function addPro(){
    const proname = $("#proname").val()
    const proartdesc = $("#proartdesc").val()
    const powercon = $("#powercon").val()
    if (proname == '' || proartdesc == '' || powercon == ''){
    alert("请输入全部信息！")
}else if (isNaN(Number(powercon))){
    alert("请输入数字！")
}else {
    var te = {"proname": proname,"proartdesc": proartdesc,"powercon": powercon}
    $.ajax({
    url: Surl+"/vice",
    data: JSON.stringify(te),
    type: "post",
    contentType:"application/json",
    dataType: "json",
    success: function(data) {
    quitHidden()
    location.reload();
}
});

}
}
    //取消添加公司
    function quitHidden(){
    $("#right").show()
    $("#hideAddPro").hide()

}
    //去添加公司页面
    function gotoAddPro(){
    $("#right").hide()
    $("#hideAddPro").show()

}
    //供电所查询
    function getSubByName(){
    if (checkByPid()) {
    var name = $("#subNameBTN").val()
    if (name !== null) {
    $.ajax({
    url: Surl + "/sub/list",
    type: "get",
    dataType: "json",
    success: function (data) {
    $.each(data.data, function (i, n) {
    if (n.wSubstationmc == name && n.proid == proId) {
    $("#subList").html(null)
    $("#subList").append("<div id=" + "subCk" + n.id + " class=\"huiC3\" onclick=\"getEquBySubID(" + n.id + ")\">" + n.wSubstationmc + "</div>")
} else {
    $("#subList").html(null)
}
})
}
});
} else {
    alert("请输入供电站名称！")
}
}
}
    //供电站查询重置
    function clearSub(){
    console.log("clear")
    getSubByProId(proId)
}
    //删除供电站
    function delSub(){
    if (checkByPidOrSid()){
    let SubName = null;
    $.ajax({
    url: Surl+"/sub/"+subId,
    type: "get",
    contentType:"application/json",
    dataType: "json",
    success: function(data) {
    SubName = data.data.wSubstationmc
    console.log(SubName)
    if (confirm("确定要删除："+SubName+"吗")){
    $.ajax({
    url: Surl+"/sub/del/"+subId,
    type: "post",
    contentType:"application/json",
    dataType: "json",
    success: function(data) {
    getSubByProId(proId)
}
})
}
}
});

}
}
    //修改供电站
    function  updateSub(){
    if (checkByPidOrSid()){
    var subName  =  prompt("请更改变电站名称：")
    var te = {"id": subId,"proid": proId,"wSubstationmc": subName}
    if (subName !== null){
    $.ajax({
    url: Surl+"/sub/update",
    data: JSON.stringify(te),
    type: "post",
    contentType:"application/json",
    dataType: "json",
    success: function(data) {
    getSubByProId(proId)
}
});
}else {
    alert("请输入名称")
}
}
}
    //添加供电站
    function addSub(){
    if (checkByPid()){
    var subName  =  prompt("请输入变电站名称：")
    var te = {"proid": proId,"wSubstationmc": subName}
    if (subName !== null){
    $.ajax({
    url: Surl+"/sub",
    data: JSON.stringify(te),
    type: "post",
    contentType:"application/json",
    dataType: "json",
    success: function(data) {
    getSubByProId(proId)
}
});
}else {
    alert("请输入名称")
}
}
}

    function showDW(){
    $("#company").stop().slideToggle();
}
    //供电设备被点击事件
    function equCK(oId){
    equId = oId
    //清空样式，只能选一个
    $("#equList div").each(function (i,item){
    $(item).removeClass("subListBK")
})
    //添加选中背景
    var val = "shebei"+oId
    if ($("#"+val).hasClass("subListBK")){
    $("#"+val).removeClass("subListBK")
}else{
    $("#"+val).addClass("subListBK")
}
    $.ajax({
    url: Surl+"/equ/"+oId,
    // data: {name: 'jenny'},
    type: "get",
    dataType: "json",
    success: function(data) {
    $("#sb1").val(data.data.mc)
    $("#sb2").val(data.data.sblx)
    $("#sb3").val(data.data.sfzy)
    $("#sb4").val(data.data.sfwx)

}
});
}
    //通过供电站获取其下的设备
    function getEquBySubID(i){
    //清空样式，只能选一个
    $("#subList div").each(function (i,item){
        $(item).removeClass("subListBK")
    })
    //添加选中背景
    var val = "subCk"+i
    if ($("#"+val).hasClass("subListBK")){
    $("#"+val).removeClass("subListBK")
}else{
    $("#"+val).addClass("subListBK")
}
    subId = i;
    $("#equList").html(null)
    $.ajax({
    url: Surl+"/equ/ssbmid/"+i,
    // data: {name: 'jenny'},
    type: "get",
    dataType: "json",
    success: function(data) {
    $.each(data.data,function (i,n){
    $("#equList").append("<div id="+"shebei"+ n.objId +" class=\"huiC3Add\" onclick=\"equCK("+n.objId+")\">"+"<div>"+n.mc+"</div>"+"<div>"+n.sblx+"</div>"+"<div>"+n.sfzy+"</div>"+"<div>"+n.sfwx+"</div>"+"</div>");

})
}
});
}
    //通过点击公司获取详细信息和关联的供电站
    function getSubByProId(i){
    proId = i;
    $("#subList").html(null)
    $.ajax({
    url: Surl+"/vice/"+i,
    // data: {name: 'jenny'},
    type: "get",
    dataType: "json",
    success: function(data) {
    $("#input1").attr("value",data.data.proname)
    $("#input2").attr("value",data.data.parproid)
    $("#input3").attr("value",data.data.proartdesc)
    $("#input4").attr("value",data.data.powercon)
}
});
    $.ajax({
    url: Surl+"/sub/proId/"+i,
    // data: {name: 'jenny'},
    type: "get",
    dataType: "json",
    success: function(data) {
    $.each(data.data,function (i,n){
    $("#subList").append("<div id="+"subCk"+ n.id +" class=\"huiC3\" onclick=\"getEquBySubID("+n.id+")\">"+n.wSubstationmc+"</div>")
})
}
});

}
    //加载左侧电力公司列表
    $(function() {
    $.ajax({
        url: Surl+"/vice/list",
        // data: {name: 'jenny'},
        type: "get",
        dataType: "json",
        success: function(data) {
            $.each(data.data,function (i,n){
                if (n.parproid !== null){
                    $("#company").append("<li onclick=\"getSubByProId("+n.proid+")\"><img src=\"img/img5.png\">"+n.proname+"</li>")
                }
            })
        }
    });
})
