var tableName = 'easyweb';  // 本地缓存表名
var base_server = '/v1/';  // 接口地址

// 缓存token
function putToken(token) {
    layui.data(tableName, {
        key: 'token',
        value: token
    });
}

// 获取缓存的token
function getToken() {
    return layui.data(tableName).token;
}

// 清除token
function removeToken() {
    layui.data(tableName, {
        key: 'token',
        remove: true
    });
}

// 封装ajax请求，返回数据类型为json
function req(url, data, success, method) {
    if ('put' == method.toLowerCase()) {
        method = 'POST';
        data._method = 'PUT';
    } else if ('delete' == method.toLowerCase()) {
        method = 'POST';
        data._method = 'DELETE';
    }
    ajax({
        url: base_server + url,
        data: data,
        type: method,
        dataType: 'json',
        success: success
    });
}

// 封装ajax请求
function ajax(param) {
    var successCallback = param.success;
    param.success = function (result, status, xhr) {
        successCallback(result, status, xhr);
    };
    param.error = function (xhr) {
        param.success({code: xhr.status, msg: xhr.statusText});
    };
    param.beforeSend = function (xhr) {
        var headers = getAjaxHeaders();
        for (var i = 0; i < headers.length; i++) {
            xhr.setRequestHeader(headers[i].name, headers[i].value);
        }
    };
    layui.$.ajax(param);
}

function getAjaxHeaders() {
    var headers = [];
    var token = getToken();
    headers.push({
        name: 'Authorization',
        value: 'Bearer ' + token.access_token
    });
    return headers;
}