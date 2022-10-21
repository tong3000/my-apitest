package com.th.testcases;

import com.th.common.BaseTest;
import com.th.config.Contants;
import com.th.config.Environment;
import com.th.entries.CaseInfo;
import com.th.utils.EasyPoiExcelUtil;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class Test02 extends BaseTest {
    @BeforeClass
    public void setUp(){
        //向环境变量设置key
        Environment.envMap.put("token", Contants.KEY);
    }

    @Test(dataProvider = "readCases")
    public void test01(CaseInfo caseInfo){
        //将测试用例做整体替换，只要遇到${}数据，就替换为环境变量中的实际数据
        caseInfo=paramsReplace(caseInfo);
        //发起请求
        Response res = request(caseInfo);
        //断言请求
        assertResponse(res,caseInfo);
        //将测试用例的提取表达式保存到环境变量中
        extractToEnvironment(res,caseInfo);
    }

    @DataProvider
    //向测试用例提供Excel数据
    public Object[] readCases(){
        List<CaseInfo> listDatas = EasyPoiExcelUtil.readExcel(0);
        return listDatas.toArray();
    }

}
