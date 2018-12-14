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