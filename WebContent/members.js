/**
 * 
 */

function infoConfirm() {
	if(document.reg_frm.id.value.length == 0) {
		alert("아이디를 입력 해주세요.");
		reg_frm.id.focus();
		return;
	}
	
	if(document.reg_frm.id.value.length < 4) {
		alert("아이디는 4자 이상입니다.");
		reg_frm.id.focus();
		return;
	}
	
	if(document.reg_frm.pw.value.length == 0) {
		alert("비밀번호를 입력 해주세요.");
		reg_frm.pw.focus();
		return;
	}
	
	if(document.reg_frm.pw.value != document.reg_frm.pw_check.value) {
		alert("비밀번호가 일치하지 않습니다.");
		reg_frm.pw.focus();
		return;
	}
	
	if(document.reg_frm.name.value.length == 0) {
		alert("이름을 입력 해주세요.");
		reg_frm.name.focus();
		return;
	}
	
	if(document.reg_frm.tel.value.length == 0) {
		alert("휴대폰 번호를 입력 해주세요.");
		reg_frm.birth.focus();
		return;
	}
	
	document.reg_frm.submit();
}

function updateInfoConfirm() {
	if(document.reg_frm.pw.value.length == 0) {
		alert("패스워드를 입력 해주세요.");
		document.reg_frm.pw.focus();
		return;
	}
	
	if(document.reg_frm.pw.value != document.reg_frm.pw_check.value) {
		alert("패스워드가 일치하지 않습니다.");
		reg_frm.pw.focus();
		return;
	}
	
	if(document.reg_frm.name.value.length == 0) {
		alert("이름을 입력 해주세요.");
		reg_frm.birth.focus();
		return;
	}
	
	document.reg_frm.submit();
	
}