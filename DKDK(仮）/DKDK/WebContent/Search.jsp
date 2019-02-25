<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Search</title>

<!--Bootsrap 4 CDN-->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<!--Custom styles-->
<link rel="stylesheet" type="text/css" href="profile.css">

</head>
<body>

	<div class="container">
		<div class="d-flex justify-content-center h-100">
			<div class="card">
				<div class="card-header">
					<h3>条件を入れてお相手を検索！</h3>

					<div class="d-flex justify-content-end social_icon">
						<span><i class="fab fa-facebook-square"></i></span> <span><i
							class="fab fa-google-plus-square"></i></span> <span><i
							class="fab fa-twitter-square"></i></span>
					</div>
				</div>
				<div class="card-body">
					<form action="Search" method="post">
						<h4>♪基本情報選択♪</h4>

						<table>
							<tr>
								<th class="myPage">年齢</th>
								<td><select name="age">
										<option selected value="">年齢を選択</option>
										<option value="20">20歳</option>
										<option value="30">30歳</option>
								</select></td>
							</tr>

							<tr>
								<th class="myPage">居住地</th>
								<td><select name="address">
										<option value="13">東京</option>
										<option value="14">神奈川</option>
										<option value="11">埼玉</option>
										<option value="12">千葉</option>
										<option value="27">大阪</option>
										<option value="26">京都</option>
										<option value="23">愛知</option>
										<option value="21">岐阜</option>
										<option value="24">三重</option>
										<option value="40">福岡</option>
										<option value="1">北海道</option>
										<option value="4">宮城</option>
										<option value="2">青森</option>
										<option value="3">岩手</option>
										<option value="5">秋田</option>
										<option value="6">山形</option>
										<option value="7">福島</option>
										<option value="8">茨城</option>
										<option value="9">栃木</option>
										<option value="10">群馬</option>
										<option value="15">新潟</option>
										<option value="19">山梨</option>
										<option value="20">長野</option>
										<option value="22">静岡</option>
										<option value="16">富山</option>
										<option value="17">石川</option>
										<option value="18">福井</option>
										<option value="25">滋賀</option>
										<option value="28">兵庫</option>
										<option value="29">奈良</option>
										<option value="30">和歌山</option>
										<option value="34">広島</option>
										<option value="33">岡山</option>
										<option value="31">鳥取</option>
										<option value="32">島根</option>
										<option value="35">山口</option>
										<option value="37">香川</option>
										<option value="36">徳島</option>
										<option value="38">愛媛</option>
										<option value="39">高知</option>
										<option value="41">佐賀</option>
										<option value="44">大分</option>
										<option value="43">熊本</option>
										<option value="45">宮崎</option>
										<option value="42">長崎</option>
										<option value="46">鹿児島</option>
										<option value="47">沖縄</option>
										<option value="48">海外</option>
								</select></td>
							</tr>
							<tr>
								<th class="myPage">年収</th>
								<td><select name="income">
										<option value="1">200万円未満</option>
										<option value="2">200〜400万円</option>
										<option value="3">400〜600万円</option>
										<option value="4">600〜800万円</option>
										<option value="5">800〜1000万円</option>
										<option value="6">1000〜1500万円</option>
										<option value="7">1500万円以上</option>
								</select></td>
							</tr>
							<tr>
								<th class="myPage">身長</th>
								<td><select name="height">
										<option value="130">130cm 以下</option>
										<option value="131">131cm</option>
										<option value="132">132cm</option>
										<option value="133">133cm</option>
										<option value="134">134cm</option>
										<option value="135">135cm</option>
										<option value="136">136cm</option>
										<option value="137">137cm</option>
										<option value="138">138cm</option>
										<option value="139">139cm</option>
										<option value="140">140cm</option>
										<option value="141">141cm</option>
										<option value="142">142cm</option>
										<option value="143">143cm</option>
										<option value="144">144cm</option>
										<option value="145">145cm</option>
										<option value="146">146cm</option>
										<option value="147">147cm</option>
										<option value="148">148cm</option>
										<option value="149">149cm</option>
										<option value="150">150cm</option>
										<option value="151">151cm</option>
										<option value="152">152cm</option>
										<option value="153">153cm</option>
										<option value="154">154cm</option>
										<option value="155">155cm</option>
										<option value="156">156cm</option>
										<option value="157">157cm</option>
										<option value="158">158cm</option>
										<option value="159">159cm</option>
										<option value="160">160cm</option>
										<option value="161">161cm</option>
										<option value="162">162cm</option>
										<option value="163">163cm</option>
										<option value="164">164cm</option>
										<option value="165">165cm</option>
										<option value="166">166cm</option>
										<option value="167">167cm</option>
										<option value="168">168cm</option>
										<option value="169">169cm</option>
										<option value="170">170cm</option>
										<option value="171">171cm</option>
										<option value="172">172cm</option>
										<option value="173">173cm</option>
										<option value="174">174cm</option>
										<option value="175">175cm</option>
										<option value="176">176cm</option>
										<option value="177">177cm</option>
										<option value="178">178cm</option>
										<option value="179">179cm</option>
										<option value="180">180cm</option>
										<option value="181">181cm</option>
										<option value="182">182cm</option>
										<option value="183">183cm</option>
										<option value="184">184cm</option>
										<option value="185">185cm</option>
										<option value="186">186cm</option>
										<option value="187">187cm</option>
										<option value="188">188cm</option>
										<option value="189">189cm</option>
										<option value="190">190cm</option>
										<option value="191">191cm</option>
										<option value="192">192cm</option>
										<option value="193">193cm</option>
										<option value="194">194cm</option>
										<option value="195">195cm</option>
										<option value="196">196cm</option>
										<option value="197">197cm</option>
										<option value="198">198cm</option>
										<option value="199">199cm</option>
										<option value="200">200cm 以上</option>
								</select></td>
							</tr>
							<tr>
								<th class="myPage">体型</th>
								<td><select name="body">
										<option value="1">スリム</option>
										<option value="2">やや細め</option>
										<option value="3">普通</option>
										<option value="4">グラマー</option>
										<option value="5">筋肉質</option>
										<option value="6">ややぽっちゃり</option>
										<option value="7">太め</option>
								</select></td>
							</tr>
							<tr>
								<th class="myPage">学歴</th>
								<td><select name="education">
										<option value="1">高校卒</option>
										<option value="2">短大/専門学校卒</option>
										<option value="3">大学卒</option>
										<option value="4">大学院卒</option>
										<option value="5">その他</option>
								</select></td>
							</tr>
							<tr>
								<th class="myPage">職種</th>
								<td><select name="job">
										<option value="1">上場企業</option>
										<option value="2">金融</option>
										<option value="3">公務員</option>
										<option value="40">自衛隊</option>
										<option value="41">消防士</option>
										<option value="4">コンサル</option>
										<option value="5">経営者・役員</option>
										<option value="6">大手企業</option>
										<option value="7">大手外資</option>
										<option value="8">大手商社</option>
										<option value="9">外資金融</option>
										<option value="42">営業・販売</option>
										<option value="10">医師</option>
										<option value="43">医療関係</option>
										<option value="44">看護師</option>
										<option value="45">美容関係</option>
										<option value="11">弁護士</option>
										<option value="12">公認会計士</option>
										<option value="13">航空関係</option>
										<option value="14">広告</option>
										<option value="15">マスコミ</option>
										<option value="16">教育関係</option>
										<option value="17">IT関係</option>
										<option value="18">食品関係</option>
										<option value="19">製薬</option>
										<option value="20">保険</option>
										<option value="21">不動産</option>
										<option value="22">建築関係</option>
										<option value="23">通信</option>
										<option value="46">製造業</option>
										<option value="24">WEB業界</option>
										<option value="47">エンジニア</option>
										<option value="48">デザイナー</option>
										<option value="25">クリエイター</option>
										<option value="26">サービス業</option>
										<option value="27">調理師・栄養士</option>
										<option value="28">アパレル</option>
										<option value="29">エンタメ</option>
										<option value="31">芸能・モデル</option>
										<option value="32">事務</option>
										<option value="33">福祉</option>
										<option value="34">保育士</option>
										<option value="35">会社員</option>
										<option value="36">学生</option>
										<option value="37">自営業</option>
										<option value="49">自由業</option>
										<option value="38">ブライダル</option>
										<option value="39">その他</option>
								</select></td>
							</tr>
							<tr>
								<th class="myPage">休日</th>
								<td><select name="holiday">
										<option value="1">土日</option>
										<option value="2">平日</option>
										<option value="3">不定期</option>
										<option value="4">その他</option>
								</select></td>
							</tr>
							<tr>
								<th class="myPage">タバコ</th>
								<td><select name="smoking">
										<option value="1">吸わない</option>
										<option value="2">吸う</option>
								</select></td>
							</tr>
							<tr>
								<th class="myPage">子供が欲しいか</th>
								<td><select name="children">
										<option value="1">はい</option>
										<option value="2">いいえ</option>

								</select></td>
							</tr>
						</table>
                      <br>
                      <h4>♪フリーワード入力♪</h4>
                      <div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="my_prof"></i></span>
							</div>
							<input type="text" class="form-control" placeholder="趣味など">
						</div>.
						<input type="submit" value="検索">
					</form>
				</div>
				<div class="card-footer">
					<div class="d-flex justify-content-center links">
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>