function login() {
	var email = document.getElementById('email').value;
	var password = document.getElementById('password').value;
    var xhr = new XMLHttpRequest();
    var formData = new FormData();
    formData.append('email', email);
    xhr.onreadystatechange = function() { // 요청에 대한 콜백
    if (xhr.readyState === xhr.DONE) { // 요청이 완료되면
        if (xhr.status === 200 || xhr.status === 201) {        	
        	if(xhr.responseText=="") {
        		alert("존재하지 않는 아이디 입니다.");
        	} else {
        		var rValue = JSON.parse(xhr.responseText);
        		if(rValue.password==password) {
        			sessionStorage.setItem("user", rValue.email);
            		window.location.href = "index.html";
            	} else {
            		alert("비밀번호가 일치하지 않습니다.")
            	}
        	}
        	document.getElementById('email').value = "";
    		document.getElementById('password').value = "";
        } else {
        console.error(xhr.responseText);
        }
    }
    };
    xhr.open('GET', 'http://localhost:8080/user/'+ email); // 메소드와 주소 설정
    xhr.send(); // 요청 전송
}