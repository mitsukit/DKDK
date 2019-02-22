<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="MyPage.css">
<title>ＭＹ ＰＡＧＥ</title>
</head>
<body>

	<p>マイプロフィール</p>
	<br></br>
	<img alt="自画像" src="">
	<br> ニックネーム:
	<br> 年齢:
	<br> 血液型:
	<select data-js="submit" name="profile_basic_form[blood]"
		id="profile_basic_form_blood"><option selected="selected"
			value="0">未設定</option>
		<option value="1">A型</option>
		<option value="2">B型</option>
		<option value="3">O型</option>
		<option value="4">AB型</option>
		<option value="5">分からない</option></select>

	<br> 居住地:
	<select data-js="submit" name="profile_basic_form[address]"
		id="profile_basic_form_address"><option selected="selected"
			value="13">東京</option>
		<option value="14">神奈川</option>
		<option value="11">埼玉</option>
		<option value="12">千葉</option>
		<option value="8">茨城</option>
		<option value="9">栃木</option>
		<option value="10">群馬</option></select>
	<br> 年収:
	<select data-js="submit" name="profile_basic_form[income]"
		id="profile_basic_form_income"><option selected="selected"
			value="0">未設定</option>
		<option value="1">200万円未満</option>
		<option value="2">200?〜400万円</option>
		<option value="3">400?〜600万円</option>
		<option value="4">600?〜800万円</option>
		<option value="5">800?〜1000万円</option>
		<option value="6">1000?〜1500万円</option>
		<option value="7">1500?〜2000万円</option>
		<option value="8">2000?〜3000万円</option>
		<option value="9">3000万円以上</option></select>

	<br> 身長:
	<select data-js="submit" name="profile_basic_form[height]"
		id="profile_basic_form_height"><option selected="selected"
			value="0">未設定</option>
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
		<option value="200">200cm 以上</option></select>

	<br> 体型:
	<select data-js="submit" name="profile_basic_form[habitus]"
		id="profile_basic_form_habitus"><option selected="selected"
			value="0">未設定</option>
		<option value="1">スリム</option>
		<option value="2">やや細め</option>
		<option value="3">普通</option>
		<option value="4">グラマー</option>
		<option value="5">筋肉質</option>
		<option value="6">ややぽっちゃり</option>
		<option value="7">太め</option></select>

	<br> 学歴:
	<select data-js="submit" name="profile_basic_form[education]"
		id="profile_basic_form_education"><option selected="selected"
			value="0">未設定</option>
		<option value="2">高校卒</option>
		<option value="1">短大/専門学校卒</option>
		<option value="3">大学卒</option>
		<option value="4">大学院卒</option>
		<option value="5">その他</option></select>

	<br> 職種:
	<select data-js="submit" name="profile_basic_form[job]"
		id="profile_basic_form_job"><option selected="selected"
			value="0">未設定</option>
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
		<option value="39">その他</option></select>

	<br> 休日:
	<select data-js="submit" name="profile_basic_form[holiday]"
		id="profile_basic_form_holiday"><option selected="selected"
			value="0">未設定</option>
		<option value="1">土日</option>
		<option value="2">平日</option>
		<option value="3">不定期</option>
		<option value="4">その他</option></select>

	<br>タバコ:
	<select data-js="submit" name="profile_basic_form[smoking]"
		id="profile_basic_form_smoking"><option selected="selected"
			value="0">未設定</option>
		<option value="4">吸わない</option>
		<option value="3">相手が嫌ならやめる</option>
		<option value="2">非喫煙者の前では吸わない</option>
		<option value="1">吸う</option>
		<option value="5">吸う（電子タバコ）</option></select>

	<br> 子供が欲しいか:
	<select data-js="submit" name="profile_basic_form[want_children]"
		id="profile_basic_form_want_children"><option
			selected="selected" value="0">未設定</option>
		<option value="2">はい</option>
		<option value="1">いいえ</option>
		<option value="3">わからない</option></select>

	<br> 自由記入:
	<br>
	<br>
	<br>
	<p>
	<form>
		<input type="button" value="プロフィールを更新" onClick="window.close()">
	</form>
	</p>
	<br>
</body>
</html>
</html>