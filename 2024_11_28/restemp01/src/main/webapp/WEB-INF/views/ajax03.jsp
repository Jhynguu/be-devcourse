<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript">
        window.onload = function () {
            document.getElementById('btn1').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if ( request.readyState == 4 ) {
                        if ( request.status == 200 ) {
                            const jsonData = JSON.parse( request.responseText.trim() );

                            // 1.
                            console.log(jsonData);
                            console.log(jsonData.boxOfficeResult.weeklyBoxOfficeList);
                            console.log(jsonData.boxOfficeResult.weeklyBoxOfficeList[0].movieNm);

                            // 2.
                            const weeklyBoxOfficeList = jsonData.boxOfficeResult
                            document.getElementById('result').innerHTML = result;
                        } else {
                            alert( "[에러] 페이지 오류(404, 500)" );
                        }
                    }
                }
                request.open( "GET", "/rest/emp/json", true );
                request.send();
            };

            document.getElementById('btn2').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if ( request.readyState == 4 ) {
                        if ( request.status == 200 ) {
                            const jsonData = JSON.parse( request.responseText.trim() );

                            let result = '<table border="1" cellspacing="0">'
                            for ( let i=0 ; i<jsonData.length ; i++ ) {
                                result += '<tr>';
                                result += '<td>' + jsonData[i].empno + '</td>';
                                result += '<td>' + jsonData[i].ename + '</td>';
                                result += '<td>' + jsonData[i].job + '</td>';
                                result += '<td>' + jsonData[i].mgr + '</td>';
                                result += '<td>' + jsonData[i].hiredate + '</td>';
                                result += '<td>' + jsonData[i].sal + '</td>';
                                result += '<td>' + jsonData[i].comm + '</td>';
                                result += '<td>' + jsonData[i].deptno + '</td>';
                                result += '</tr>';
                            }
                            result += '</table>';

                            document.getElementById('result').innerHTML = result;
                        } else {
                            alert( "[에러] 페이지 오류(404, 500)" );
                        }
                    }
                }
                request.open( "GET", "http://192.168.0.40:8080/rest/emp/json", true );
                request.send();
            };

            document.getElementById('btn3').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if ( request.readyState == 4 ) {
                        if ( request.status == 200 ) {
                            const jsonData = JSON.parse( request.responseText.trim() );
                            console.log( jsonData )
                        } else {
                            alert( "[에러] 페이지 오류(404, 500)" );
                        }
                    }
                }
                request.open( "GET", "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=0922875c4972b9e538fb0f6dbfc75533&targetDt=20120101", true );
                request.send();
            };
        };
    </script>
</head>
<body>
ajax02.jsp
<br /><br />
<input type="button" id="btn1" value="요청1" />
<input type="button" id="btn2" value="요청2" />
<input type="button" id="btn3" value="영화진흥위원회" />
<br /><hr /><br />
<div id="result"></div>
</body>