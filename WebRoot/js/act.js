var uList = document.getElementsByClassName('sx-activity-list')[0];
var li = document.getElementsByTagName('li')[1];
var a = document.getElementById('aOne');
$(document).ready(function() {
    $(li).addClass("sx-click");
    $(a).addClass("sx-a-one");
})
var t = li;
console.log(t);
uList.onclick = function(e) {
    var event = e || window.event;
    var target = e.target || e.srcElement;
    if(target.innerText == "Home") {
       changClass(target,t);
    } else if(target.innerText == "所有活动") {
       changClass(target,t);
       
    } else if(target.innerText == "创建活动") {
       changClass(target,t)
       
    } else if(target.innerText == "我的活动") {
        changClass(target,t);
    } else if(target.innerText == "我的申请") {
        changClass(target,t);
    }
    t = target;
    return false;
}
function changClass(target,t) {
    $(t).removeClass("sx-click");
    $(t).find("a").removeClass("sx-a-one");
    $(target).addClass("sx-click");
    $(target).find("a").addClass("sx-a-one");
}