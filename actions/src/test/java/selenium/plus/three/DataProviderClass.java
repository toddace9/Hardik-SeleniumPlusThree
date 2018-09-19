package selenium.plus.three;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@Test(dataProvider="getdata")
	public void testcase(String cname,String cpass) {
		System.out.println(cname+"====="+cpass);
	}
	
	@DataProvider
	public Object[][] getdata(){
		Object obj[][] = {{"Name1","Pass1"},
				{"Name2","Pass2"}
		};
		return obj;
		
	}
}
