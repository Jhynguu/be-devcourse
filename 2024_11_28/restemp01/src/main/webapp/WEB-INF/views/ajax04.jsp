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
                request.open( "GET", "/rest/emp/response", true );
                request.send();
            };

            document.getElementById('btn2').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if ( request.readyState == 4 ) {
                        if ( request.status == 200 ) {
                            console.log( request.responseText );
                        } else {
                            alert( "[에러] 페이지 오류(404, 500)" );
                        }
                    }
                }
                request.open( "POST", "/rest/emp/response", true );
                request.setRequestHeader( 'Content-Type', 'application/x-www-form-urlencoded' );
                request.send( 'empno=8000&ename=CLARK&job=MANAGER&mgr=7839&hiredate=2011-06-09&sal=2450.00&come=&deptno=10' );
            };

            document.getElementById('btn3').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if ( request.readyState == 4 ) {
                        if ( request.status == 200 ) {
                            console.log( request.responseText );
                        } else {
                            alert( '[에러] 페이지 오류(404, 500)' );
                        }
                    }
                }
                request.open( 'PUT', '/rest/emp/response/7839', true );
                request.setRequestHeader( 'Content-Type', 'application/x-www-form-urlencoded' );
                request.send( 'ename=CLARK&job=MANAGER&mgr=7839&hiredate=2011-06-09&sal=2450.00&come=&deptno=10' );
            };

            document.getElementById('btn4').onclick = function () {
                const request = new XMLHttpRequest();
                request.onreadystatechange = function () {
                    if ( request.readyState == 4 ) {
                        if ( request.status == 200 ) {
                            console.log( request.responseText );
                        } else {
                            alert( "[에러] 페이지 오류(404, 500)" );
                        }
                    }
                }
                request.open( "DELETE", "/rest/emp/response/7934", true );
                request.send();
            };
        };
    </script>
</head>
<body>
ajax03.jsp
<br /><br />
<input type="button" id="btn1" value="GET" />
<input type="button" id="btn2" value="POST" />
<input type="button" id="btn3" value="PUT" />
<input type="button" id="btn4" value="DELETE" />
<br /><hr /><br />
<div id="result"></div>
</body>