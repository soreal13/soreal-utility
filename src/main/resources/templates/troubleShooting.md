

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



