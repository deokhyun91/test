const joinBtn = document.querySelector('.joinBtn2');
const userInfo = document.querySelectorAll('input');

joinBtn.onclick = () => {
	
   let signupData = {
            name : userInfo[0].value,   
            id : userInfo[1].value,
            phone : userInfo[2].value,
           
            
            
   }
   console.log(signupData);
   $.ajax({
           type: "post",
           url: "/",
           contentType: "application/Json",
           data: JSON.stringify(signupData),
           async : false, // false 동기
           dataType: "json",
           success: (response) => {
              if(response.data){
   			   	
   			   	alert('회원가입되었습니다.');
   				location.replace("/");
   			
   		   }
              
           },
            error : (error) => {
               if(error.status == 400){
   				alert(JSON.stringify(error.responseJSON.data));
   				console.log("요청실패");
   			}else{
   				console.log("요청실패");
   				console.log(error);
   			}
           }
       })    
}