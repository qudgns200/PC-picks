// 메인 화면 이미지 출력
function callMainImagePage() {
	var xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() { // 요청에 대한 콜백
	    if (xhr.readyState === xhr.DONE) { // 요청이 완료되면
	        if (xhr.status === 200 || xhr.status === 201) { 
	        	var jsonXhr = JSON.parse(xhr.responseText);
	        	// Paging 버튼
	        	var pageCount = jsonXhr.length/9;
	        	for(var i=0; i<pageCount; i++) {
		        	var pageButton = document.createElement('button');
		        	pageButton.className = 'btn btn-default';
		        	pageButton.type = 'button';
		        	pageButton.value = i+1;
		        	pageButton.innerHTML += i+1;
		        	pageButton.onclick = callSelectImagePage(i+1, jsonXhr);
	        		document.getElementById('pageSection').append(pageButton);
	        	}
	        	callSelectImagePage(1, jsonXhr);
	        } else {
	        	console.error(xhr.responseText);
	        }
	    }
    };
    xhr.open('GET', 'http://localhost:8080/image');
    xhr.send(); // 요청 전
}

// 선택 페이지 이미지 출력
function callSelectImagePage(startPage, jsonList) {
	var end = startPage * 9;
	var start = end-8;
	if(end>jsonList.length) {
		end = jsonList.length;
	}
	
	for(var i=start; i<end; i++) {
		var str = document.createElement('div');
	    str.className = 'col-sm-6 col-md-4';
	    str.innerHTML += "<a href='#' class='thumbnail'>" + "<img src='image/" + jsonList[i].image + "'>" + "</a>";
	    document.getElementById('bodySection').append(str);
	}
}