define(function(require, exports, module) {
    var queryHelper = require("{template-web}/common/js/query-helper");

    var $roleTable = null;
    /***************************角色列表 start******************************/


    var queryParams = function(tableParams) {
        return queryHelper.getQueryParams(tableParams);
    };
    function getColumns() {
        var columns = [ {
            checkbox : 'true'
        }, {
            field : 'esroRoleCode',
            title : '代码',
            width : 200
        }, {
            field : 'esroRoleName',
            title : '中文名称',
            width : 200
        }, {
            field : 'esroType',
            title : '类型',
            width : 200,
            cfgKey : 'SYS_ROLE_TYPE'
        }, {
            field : 'esroStatus',
            title : '状态',
            width : 100
        }, {
            field : 'esroDesc',
            title : '描述'
        } ];
        return columns;
    }
    var roleTableOpting = {
        uniqueId : '_index',
        url : phoenix.utils.resolve("{template-control}/esRoleController/findRoles.shtml"),
        queryParams : queryParams,
        singleSelect : false,
        isScroll : true,
        columns : getColumns()
    };

    var advancedQueryPopWindowHandle = function () {
        $("#roleQueryMoreModalId").on('shown.bs.modal', function () {
            if(queryHelper.advance()) {
                $('#roleQueryMoreForm').toForm(queryHelper.getCurrentParams());
            }
        }).modal('show');

    };

    var resetAdvancedQueryConditionHandle = function () {
        $('#roleQueryMoreForm').reset();
    };

    var refreshHandle = function () {
        queryHelper.refresh();
    };
    var quickQueryHandle = function () {
        queryHelper.quickQuery();
    };
    var advancedQueryHandle = function () {
        queryHelper.advanceQuery();
        $("#roleQueryMoreModalId").modal('hide');
    };
    var init = function() {
        queryHelper.init({
            table : '#roleTable',
            advancedForm :'#roleQueryMoreForm',
            quickForm :'#roleGridForm'
        });
        $roleTable = $('#roleTable');
        $roleTable.bootstrapTable(roleTableOpting);
        $('#roleGridForm').phxEnter(quickQueryHandle);
        $('#roleQueryMoreForm').phxEnter(advancedQueryHandle);
    };

    var buttonConfigs = {
        '#role_refresh_btn' : {
            name : '刷新',
            eventType : 'click',
            proxy : true,
            authority : '10110030114',
            event :  refreshHandle
        },
        '#role_more_btn' : {
            name : '更多',
            eventType : 'click',
            proxy : true,
            authority : '10110030115',
            event : advancedQueryPopWindowHandle
        },
        "#roleQueryMoreModal_query" : {
            name : '查询',
            eventType : 'click',
            proxy : true,
            event : advancedQueryHandle
        },
        "#roleQueryMoreModal_reset" : {
            name : '重置',
            eventType : 'click',
            proxy : true,
            event : resetAdvancedQueryConditionHandle
        }
    };
    /***************************按钮权限 end******************************/
        // 页面启动入口
    var run = function(args) {
        // 载入公司维护模块
        var html = require("{template-web}/organize/html/esRoleManagerList.html");
        $('#page-content').loadHtml(html);
        loadPagePermission(buttonConfigs, function(data) {
            bindEvent(data);
        });
        init();
    };
    exports.run = run;
});
