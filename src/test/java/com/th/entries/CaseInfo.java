package com.th.entries;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

/**
 * @param
 * @author th
 * @create 2022-10-21
 * @return
 * @description  Excel测试用例所有列信息
 */

@Data
public class CaseInfo {
    @Excel(name="序号(caseId)")
    private int caseId;

    @Excel(name = "接口模块(interface)")
    private String interfaceName;

    @Excel(name = "用例标题(title)")
    private String title;

    @Excel(name = "请求头(requestHeader)")
    private String requestHeader;

    @Excel(name = "请求方式(method)")
    private String method;

    @Excel(name = "接口地址(url)")
    private String url;

    @Excel(name = "参数输入(inputParams)")
    private String inputParams;

    @Excel(name = "期望返回结果(expected)")
    private String expected;

    @Excel(name = "数据库断言")
    private String dbAssert;

    @Excel(name="提取表达式(extractExper)")
    private String extractExper;

    @Override
    public String toString(){
        return "CaseInfo{" +
                "caseId=" + caseId +
                ", interfaceName='" + interfaceName + '\'' +
                ", title='" + title + '\'' +
                ", requestHeader='" + requestHeader + '\'' +
                ", method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", inputParams='" + inputParams + '\'' +
                ", expected='" + expected + '\'' +
                ", dbAssert='" + dbAssert + '\'' +
                ", extractExper='" + extractExper + '\'' +
                '}';
    }
}
