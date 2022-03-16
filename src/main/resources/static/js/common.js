var sLib = new sorealLibrary();

var sorealLibrary = function () {

    this.dateFormatter = function(date, format){
        if(date == undefined){
            return null;
        }
        var arr =[];
        if(typeof(date) === "string"){
            arr = date.split(/\D/),
                seperator = ["","",""];
            if(arr.length == 1){ // 월일년을 따로 넣는다.
                arr = [date.substr(0,4), date.substr(4,2), date.substr(-2)];
            }
        }else if(typeof date == "object"){ // instanceof 는 안될거 같음 string or date로만
            var year = date.getFullYear(), month = date.getMonth()+1, date = date.getDate();
            arr.push(year);
            arr.push(month<10? "0"+""+month:month);
            arr.push(date<10? "0"+date: date);
        }
        switch(format.toLowerCase()){
            case "array":
                return arr;
            case "yyyy":
                seperator=[""];
                var str = arr[0]+seperator[0];
                return str;
            case "yyyy-mm":
                seperator=["-"];
                var str = arr[0]+seperator[0]+arr[1];
                return str;
            case "yyyymmdd" :
                seperator =["","",""];
                break;
            case "yyyy-mm-dd" :
                seperator =["-","-",""];
                break;
            case "yyyy.mm.dd" :
                seperator =[".",".",""];
                break;
            case "mm/dd/yyyy":
            case "en":
                seperator =["/","/","/"];
                var str = arr[1]+seperator[0]+arr[2]+seperator[1]+arr[0]+seperator[2];
                return str;
            case "ko" : //navigator 에 있는 언어설정값이랑 동일 @@@@
            case "ko-kr" :
                seperator =["년","월","일"];
                break;
        }
        var str= arr[0]+seperator[0]+arr[1]+seperator[1]+arr[2]+seperator[2];
        return str;
    }
    this.timeFormatter = function(time, format){
        if(!time){
            return "";
        }
        var arr = [];
        if(typeof(time) === "string"){
            arr = time.split(/\D/),
                seperator = ["",""];
            if(arr.length == 1){ // 시분을 분리
                arr = [time.substr(0,2), time.substr(2,2)];
            }
        }else if(typeof time === "object"){ // object로 오면 date 라고 봄. instanceof 는 안될 수 있음
            var hours = time.getHours().toString(), min = time.getMinutes().toString(), sec = time.getSeconds().toString();
            arr = [hours.length < 2 ? "0"+hours : hours, min.length < 2 ? "0"+ min : min, sec.length<2 ? "0"+sec : sec ];
        }
        switch(format.toLowerCase()){
            case "array":
                return arr;
            case "hhmmss":
                return arr.join("");
            case "hh:mm:ss" :
                return arr.join(":");
            case "hhmm" :
                seperator =["",""];
                break;
            case "hh:mm" :
            case "en":
                seperator =[":",""];
                break;
            case "ko" : //navigator 에 있는 언어설정값이랑 동일 @@@@
            case "ko-kr" :
                seperator =["시","분"];
                break;
        }
        var str= arr[0].toString()+seperator[0]+arr[1].toString()+seperator[1];
        return str;
    }
    this.util = {
        setParameter: function(paramObj) {
            try {
                var param = [];
                $.each(paramObj, function(key, value){
                    param.push(key + "=" + value);
                })
                return param.join("&");
            } catch (e) {
                console.log(e, "setParameter");
            }
        },
        formatter: function(template, args){
            return template.replace(/\?\d/gi,function(match){
                return args[Number(match.match(/\d/)[0])];
            })
        },
        loading : function(target, type){
            var element = $(target);
            if(type == "off"){
                element.trigger('loading-overlay:hide');
            }else{
                element.trigger('loading-overlay:show');
            }
        },
    }
}

Array.prototype.division = function (n) {
    var arr = this;
    var len = arr.length;
    var cnt = Math.floor(len / n) + (Math.floor(len % n) > 0 ? 1 : 0);
    var tmp = [];

    for (var i = 0; i < cnt; i++) {
        tmp.push(arr.splice(0, n));
    }

    return tmp;
}