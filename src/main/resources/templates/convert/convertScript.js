
// 파일 입력
var file;

var rawFile = new XMLHttpRequest();
rawFile.open("GET", fileURL, false);
rawFile.onreadystatechange = function () {
    if(rawFile.readyState ==4) {
        if(rawFile.status == 200 || rawFile.status == 0) {
            file = rawFile[0];
        }
    }
}

console.log(typeof(file));

var reader = new FileReader();
var text = reader.readAsText(file, "UTF-8");


var script = text.match(RegExp);

for (var i=0; i<script.length; i++ ){
    console.log(script[i].replace(/\[.+]/, " "));
}