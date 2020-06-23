// session 체크하여 login 태그 텍스트 변경
function sessionCheck() {
	if(sessionStorage.getItem("user") != null) {
		document.getElementById("log").innerHTML = "Logout";
		document.getElementById("log").value = "Logout";
	} else {
		document.getElementById("log").innerHTML = "Login";
		document.getElementById("log").value = "Login";
	}
}