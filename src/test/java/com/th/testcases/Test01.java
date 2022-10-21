package com.th.testcases;

import com.th.entries.CaseInfo;
import com.th.utils.EasyPoiExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class Test01 {

    @Test(dataProvider = "readCases")
    public void test01(CaseInfo caseInfo){
        System.out.println(caseInfo);
    }

    @DataProvider
    public Object[] readCases(){
        List<CaseInfo> listDatas = EasyPoiExcelUtil.readExcel(0);
        return listDatas.toArray();
    }
}
