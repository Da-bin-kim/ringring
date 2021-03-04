<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/join.css">
    <title>RingRing : 회원가입</title>
</head>
<body>

    <div id="container">
        <div id="content">
            <div class="joinhead">
                <h2 class="tt">회원가입</h2>
            </div>
             <form method="post" id="authForm" action="/joinAction">
            <div class="status"></div>
            <table class="joinform">
                <tr>
                    <th class="tt">아이디</th>
                    <td>
                        <input type="text" name="id" value maxlength="16" label="아이디" placeholder="6자 이상의  영문과 숫자를 조합해주세요">
                        <a href="" class="btn default">중복확인</a>
                    </td>
                </tr>
                <tr>
                    <th class="tt">비밀번호</th>
                    <td><input type="text" name="password" value maxlength="16" label="비밀번호" placeholder="비밀번호를 입력해주세요"></td>
                </tr>
                <tr>
                    <th class="tt">비밀번호 확인</th>
                    <td><input type="text" name="" value maxlength="16" label="비밀번호 확인" placeholder="비밀번호를 한번 더 입력해주세요"></td>
                </tr>
                <tr>
                    <th class="tt">이름</th>
                    <td><input type="text" name="name" value maxlength="16" label="이름" placeholder="이름을 입력해주세요"></td>
                </tr>
                <tr>
                    <th class="tt">이메일</th>
                    <td>
                        <input type="text" name="email" value maxlength="30" label="이메일" placeholder="예 : RingRing@dessert.com">
                        <a href="" class="btn default">중복확인</a>
                    </td>
                    
                </tr>
                <tr>
                    <th class="tt">휴대폰</th>
                    <td><input type="text" name="phone" value maxlength="16" label="휴대폰" placeholder="숫자만 입력해주세요"></td>
                </tr>
                <tr>
                    <th class="tt">주소</th>
                    <td class="abcd"><a href="address" class="addressSearch"><i class="fa fa-search"></i>주소검색</a></td>
                </tr>
                <tr class="reg_agree">
                    <th class="tt">이용약관 동의</th>
                    <td>
                        <div class="bg_dim"></div>
                        <div class="check">
                            <label for="" class="check_agree label_all_check label_block">
                                <input type="checkbox" value name="agree_allcheck">
                                <p>전체 동의합니다.</p>
                            </label>
                        </div>
                        <div class="check_view">
                            <label for="" class="check_agree label_block">
                                <input type="checkbox" value name="agree" required label="이용약관">
                                <p>이용약관 동의 (필수)</p>
                            </label>
                            <a href="#" class="link btn_link btn_agreement">
                                <p class="st">약관보기</p>
                            </a>
                        </div>
                        <div class="check_view">
                            <label for="" class="check_agree label_block">
                                <input type="checkbox" id="private1" name="private1"
                                value="n" required label="개인정보처리방침" checked="checked">
                                <p>개인정보처리방침 동의 (필수)</p>
                            </label>
                            <a href="#" class="link btn_link btn_agreement">
                                <p class="st">약관보기</p>
                            </a>
                        </div>
                        <div class="check_view">
                            <label for="" class="check_agree label_block">
                                <input type="checkbox" name="marketing">
                                <p>무료배송, 할인쿠폰 등 혜택/정보 수신 동의 (선택)</p>
                            </label>
                        </div>
                        <div class="check_view">
                            <label for="" class="check_agree label_block">
                                <input type="checkbox" name="fourteen_chk" required label="만 14세 이상">
                                <p>본인은 만 14세 이상입니다. (필수)</p>
                            </label>
                        </div>
                    </td>
                </tr>
            </table>
            <div id="formSubmit">
                <button type="submit" class="btn active btn_join tt">가입하기</button>
            </div>
             </form>
        </div>
    </div>
</body>
</html>
