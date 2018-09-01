var userName=document.getElementById('userName');
  var nameValid=document.getElementById('nameValid')
  userName.addEventListener('input',function(){
    var inputValue=this.value;
    if(inputValue==""||inputValue.length>10){
      nameValid.style.display='inline-block';
//      this.setCustomValidity('输入的数值范围需在10-20之间')
    }else{
      nameValid.style.display='none';
//      this.setCustomValidity('')
    }
  })
  
var userPhone=document.getElementById('userPhone');
  var userPhoneValid=document.getElementById('userPhoneValid')
  userPhone.addEventListener('input',function(){
    var inputValue2=this.value;
    if(inputValue2.length!=11||isNaN(inputValue2)){
      userPhoneValid.style.display='inline-block';
    }else{
      userPhoneValid.style.display='none';
    }
  })
  
var userPwd=document.getElementById('userPwd');
  var userPwdValid=document.getElementById('userPwdValid')
  userPwd.addEventListener('input',function(){
    var inputValue1=this.value;
    if(inputValue1.length>7||inputValue1.length<4){
      userPwdValid.style.display='inline-block';
    }else{
      userPwdValid.style.display='none';
    }
  })