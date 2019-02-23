<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<!--Made with love by Mutiullah Samim -->

<!--Bootsrap 4 CDN-->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="myPage.css">
</head>

<body>
	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card">
				<div class="card-header">
					<h3>ニックネーム: ${user.name}</h3>
					<div class="outter">
						<img src="MyPhoto.jpg" class="image-circle" />
					</div>
					<div class="d-flex justify-content-end social_icon">
						<span><i class="fab fa-facebook-square"></i></span> <span><i
							class="fab fa-google-plus-square"></i></span> <span><i
							class="fab fa-twitter-square"></i></span>
					</div>
				</div>
				<div class="card-body">
					<h4>♪自己紹介♪</h4>
					<form>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="my_prof"></i></span>
							</div>
							${user.userfree}
						</div>

						<h5>♪基本情報♪</h5>

						<div class="data" style="white-space:pre-wrap;">



年齢 ${user.age}

居住地   ${user.area}

年収   ${user.income}

身長   ${user.height}

体型   ${user.body}

学歴 ${user.school}

職種  ${user.job}

休日   ${user.holiday}

タバコは吸いますか   ${user.cigar}

子供はほしいですか  ${user.child}



<A HREF="serch">戻る</a>
</div>



</body>

</html>