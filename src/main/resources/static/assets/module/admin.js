/** 封装admin模块 */
layui.define(['layer'], function (exports) {
    var $ = layui.jquery;
    var layer = layui.layer;

    var admin = {
        // 缓存token
        putToken: function (token) {
            layui.data(admin.getTableName(), {
                key: 'token',
                value: token
            });
        },
        // 获取缓存的token
        getToken: function () {
            return layui.data(admin.getTableName()).token;
        },
        // 清除token
        removeToken: function () {
            layui.data(admin.getTableName(), {
                key: 'token',
                remove: true
            });
        },
        // 封装ajax请求，返回数据类型为json
        req: function (url, data, success, method) {
            if ('put' == method.toLowerCase()) {
                method = 'POST';
                data._method = 'PUT';
            } else if ('delete' == method.toLowerCase()) {
                method = 'POST';
                data._method = 'DELETE';
            }
            admin.ajax({
                url: (base_server ? base_server : '') + url,
                data: data,
                type: method,
                dataType: 'json',
                success: success
            });
        },
        // 封装ajax请求
        ajax: function (param) {
            var successCallback = param.success;
            param.success = function (result, status, xhr) {
                successCallback(result, status, xhr);
            };
            param.error = function (xhr) {
                param.success({code: xhr.status, msg: xhr.statusText});
            };
            param.beforeSend = function (xhr) {
                var headers = admin.getAjaxHeaders();
                for (var i = 0; i < headers.length; i++) {
                    xhr.setRequestHeader(headers[i].name, headers[i].value);
                }
            };
            $.ajax(param);
        },
        // ajax自动传递header
        getAjaxHeaders: function () {
            var headers = [];
            var token = admin.getToken();
            headers.push({
                name: 'Authorization',
                value: 'Bearer ' + token.access_token
            });
            return headers;
        },
        getTableName: function () {
            return tableName ? tableName : 'easyweb-open';
        }
    };

    // 所有ew-event
    $('body').on('click', '*[ew-event]', function () {
        var event = $(this).attr('ew-event');
        if (event == 'closeDialog') {
            var id = $(this).parents('.layui-layer').attr('id').substring(11);
            layer.close(id);
        }
    });

    exports('admin', admin);
});
