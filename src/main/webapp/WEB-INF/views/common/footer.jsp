<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
    <style>
		.container{
			padding: 20px 0;
			border-top: 1px solid #ddd;
			background-color: #f9f9f9;
		}
        #content{
            max-width: 1200px; 
            margin: 0 auto; 
            display: flex; 
            justify-content: space-between; 
            font-family: Arial, sans-serif; 
            font-size: 14px; 
            color: #333;
        }
        p>a {
            color: #333;
        }
	</style>
</head>
<body>
	<footer class="container">
        <div id="content">
            <div style="flex: 1; text-align: left; line-height: 1.8;">
                <p style="font-size: 24px"><strong>Gojeuneok Inc. CEO  Park Min Kyu</strong></p>
                <p>주소: 서울시 양천구 중앙로36길 15</p>
                <p>사업자 등록번호 : 111-11-11111</p>
                <p>통신판매번호 : 2017-서울양천-11111</p>
                <p>관광사업자 등록번호 : 제1111-11호</p>
            </div>
            <div style="flex: 1; text-align: right; line-height: 1.8;">
                <p style="font-size: 24px"><string>Contact Us</string></p>
                <p id="call">
                    <a href="" style="text-decoration-line: none">
                        고객행복센터 (전화) 09시~03시 운영
                    </a>
                </p>
                <p id="talk">
                    <a href="" style="text-decoration-line: none">
                        카카오톡 문의 24시간 운영
                    </a>
                </p>
            </div>
        </div>
	</footer>
</body>
</html>