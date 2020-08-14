define(function(require, exports) {

    var QueryHelper = function () {};

    var QUICK = 0, ADVANCE = 1 ;

    var QUERY_OPTIONS = {
        table : undefined, //table 唯一标识
        advancedForm : undefined, //高级查询form 唯一标识
        quickForm : undefined, //快捷查询form 唯一标识
        default : undefined //初始查询条件
    };

    QueryHelper.deleteNullFields = function(obj) {
        for(key in obj) {
            if(!obj[key]) delete obj[key];
        }
        return obj;
    };

    QueryHelper.prototype.init = function (options) {
        this.options = $.extend({}, QUERY_OPTIONS, options);
        this.$table = $(this.options['table']);
        this.$quickForm = this.options['quickForm'] && $(this.options['quickForm']);
        this.$advancedForm = this.options['advancedForm'] && $(this.options['advancedForm']);
        this.params = this.options['default'] && $(this.options['default']);
        this.model = QUICK;
    };

    QueryHelper.prototype.advance = function() {
        return this.model;
    };

    QueryHelper.prototype.getCurrentParams = function() {
        return this.params;
    };

    QueryHelper.prototype.getQueryParams = function (tableParams) {
        var _this = this;
        return $.extend({}, _this.params, {
            "page.currentPage" : tableParams.pageNumber,
            "page.limitCount" : tableParams.pageSize
        });
    };

    QueryHelper.prototype.quickQuery = function() {
        this.model = QUICK;
        this.params = QueryHelper.deleteNullFields(this.$quickForm.toObject());
        this.$advancedForm.toForm(null);

        this.refresh();
    };

    QueryHelper.prototype.advanceQuery =function () {
        this.model = ADVANCE;
        this.params = QueryHelper.deleteNullFields(this.$advancedForm.toObject());
        this.$quickForm.toForm(null);

        this.refresh();
    };

    QueryHelper.prototype.refresh = function () {
        this.$table.bootstrapTable('refresh');
    };

    return new QueryHelper();
});