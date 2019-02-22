<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!DOCTYPE html>
<html>
    <head>
        <title>メッセージ</title>
        <style type="text/css">
            textarea
            {
                width: 100%;
                height: 150px;
                padding: 12px 20px;
                box-sizing: border-box;
                border: 2px solid #ccc;
                border-radius: 4px;
                background-color: #f8f8f8;
                font-size: 16px;
                resize: none;
            }
        </style>
    </head>
    <body>
        <p><img src="kapibara.jpg" alt="プロファイル" style="float:left" width="30" height="30">＠名前(送信先)</p>
        <hr>

        <form  action="send">
            <textarea placeholder="メッセージ内容"></textarea><button>Send</button>
        </form>
    </body>
</html>

</body>
</html>