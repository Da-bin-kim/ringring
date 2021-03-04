<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/login.css">
    <title>Login</title>
</head>
<body>
    
    <div class="status"></div>
    <div class="inner_login">
        <div class="login_ringring">
            <form method="post" id="authForm" action="/loginAction">
                <input type="hidden" name="redirectUrl" value="https://blogpack.tistory.com/manage">
                <fieldset>
                <legend class="screen_out">로그인 정보 입력폼</legend>
                <h2 class="LL_tt tt">로그인</h2>
                <div class="box_login">
                    <div class="inp_text id">
                    <label for="loginId" class="screen_out">아이디</label>
                    <input type="id" id="loginId" name="id" placeholder="아이디를 입력해주세요" >
                    </div>
                    <div class="inp_text pw">
                    <label for="loginPw" class="screen_out">비밀번호</label>
                    <input type="password" id="loginPw" name="password" placeholder="비밀번호를 입력해주세요" >
                    
                    </div>
                </div>
                <button type="submit" class="btn_login" >로그인</button>
                <div class="login_append">
                    <div class="inp_chk"> <!-- 체크시 checked 추가 -->
                    <input type="checkbox" id="keepLogin" class="inp_radio"  name="keepLogin">
                    <label for="keepLogin" class="lab_g">
                    <span class="img_top ico_check"></span>
                    <span class="txt_lab">로그인 상태 유지</span>
                    </label>
                    </div>
                    <span class="txt_find">
                    <a href="/member/find/loginId" class="link_find">아이디</a>
                       
                    <a href="/member/find/password" class="link_find">비밀번호 찾기</a>
                    </span>
                </div>
                </fieldset>
            </form>
        </div>
    </div>
    <span class="status"></span>
    
</body>
</html>