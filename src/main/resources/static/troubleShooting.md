

## 트러블 슈팅 목록


### 번역 페이지

- JSON 컨버팅 문제

``` com.fasterxml.jackson.core.JsonParseException: Unexpected character ('%' (code 37)): expected a valid value (JSON String, Number, Array, Object or token 'null', 'true' or 'false') ```

의심 : 1) URL 인코딩 문제 % 문자 2) JSON stringfy 형식 문제

시도 : requestBody를 dto로 받아봄 -> 

```Resolved [org.springframework.web.HttpMediaTypeNotSupportedException: Content type 'application/x-www-form-urlencoded;charset=UTF-8' not supported] 문제 터짐```

해결 : contentType: 'application/json', 추가함



- 파파고 API 응답 translatedText 한줄번역 문제

줄바꿈 첫문장만 번역 되어서 옴;



- innerHTML 문제

<pre></pre> 태그 넣어주면 중간에 <BR> 삽입 안되고 줄바꿔져서 그대로 나옴.



- GBK 문제

못읽어온다... 라이브러리 GBK 부터 웬만한거 임포트 해서 써보고 textDecoder도 해봤찌만 안된다...........


비쥬얼 코드에서 확장 익스텐션으로 돌렸는데.... 2000개중에 900개만 돌고 나머지는 안돌았다
심지어 섞여있어서 매크로도 일률적으로 못돌린다...
MD 파일에 실패 한 파일 나와서.....
그걸 배열로 뽑아서.. curl로 폴더를 옮겨보자....

