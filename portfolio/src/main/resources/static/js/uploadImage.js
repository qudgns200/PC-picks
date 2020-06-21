function uploadImage() {
	var fileInput = document.getElementById('fileInput');
	var file = fileInput.files[0];
    var xhr = new XMLHttpRequest();
    var email = "1";
    var title = "1";
    var desc = "1";
    
    formData = new FormData();
    formData.append("uploadImage", file);
    formData.append("email", email);
    formData.append("title", title);
    formData.append("desc", desc);
    
    xhr.onreadystatechange = function() { // 요청에 대한 콜백
    if (xhr.readyState === xhr.DONE) { // 요청이 완료되면
        if (xhr.status === 200 || xhr.status === 201) {        	
        	console.error(xhr.responseText);
        } else {
        	console.error(xhr.responseText);
        }
    }
    };
    xhr.open('POST', 'http://localhost:8080/image');
    xhr.send(formData); // 요청 전송
}