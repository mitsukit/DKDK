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
					<h3>ニックネーム: ${loginUser.name}</h3>
					<div class="outter">
						<img src="MyPhoto.jpg" class="image-circle" />
					</div>
					<div class="d-flex justify-content-end social_icon">
						<span><i class="fab fa-facebook-square"></i></span> <span><i
							class="fab fa-google-plus-square"></i></span> <span><i
							class="fab fa-twitter-square"></i></span>
					</div>
				</div>


<div class="data" style="white-space:pre-wrap;">


				<h4>♪自己紹介♪</h4>
		${loginUser.userfree}

				<h4>♪基本情報♪</h4>
		年齢 ${loginUser.age}

		居住地   ${loginUser.area}

		年収   ${loginUser.income}

		身長   ${loginUser.height}

		体型   ${loginUser.body}

		学歴 ${loginUser.school}

		職種  ${loginUser.job}

		休日   ${loginUser.holiday}

		タバコは吸いますか   ${loginUser.cigar}

		子供はほしいですか  ${loginUser.child}



<A HREF="serch">戻る</a>
</div>



</body>

</html>