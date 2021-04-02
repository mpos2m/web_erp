<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>직책추가</title>
</head>
<body>
	<h2>직책 정보 입력 폼</h2>
	<form action="TitleInsertServelt" method="post">
		<fieldset>
			<legend>직책 정보</legend>
			<ul>
				<li><label for="tno">직책번호</label> <input type="number"
					name="tno" size="20" id="tno" autofocus required></li>
				<li><label for="tname">직책명</label> <input type="text"
					name="tname" size="20" id="tname"></li>
				<li><input type="submit" value="추가"> <input
					type="reset" value="취소"></li>
			</ul>
		</fieldset>
	</form>
</body>
</html>