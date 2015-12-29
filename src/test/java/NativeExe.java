package test.java;


import io.appium.java_client.AppiumDriver;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Map;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.asserts.Assertion;



public class NativeExe {

	communityTest test= null;
	HTMLReporter _rep ;
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println(" *** OpenRep");
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		 
		String date = sdf.format(cal.getTime());
		
		_rep = new HTMLReporter("CommStats"+date+".html", "/Users/uzie/doc/PMRepos/commTests/", "Perfecto");

		// add one reporter in the before test will be used by all the tests

	}



	@AfterSuite
	public void AfterSuite(){
		System.out.println("**  End Rep");
		_rep.closeRep();

	}

	// com.united.UnitedCustomerFacingIPhone
	// PackageName: com.android.launcher


	@DataProvider(name = "Devices" , parallel = true)
	public Object[][] testSumInput() {
		return new Object[][] { 
			 // public cloud devices
				{"Android","com.bloomfire.android.perfecto","02157DF28335A818",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","0FD429DE",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","032C5868AA6AE58656AFE39FC7A624904EE60F78",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","E34152EBEEB21B518D865BE1A521EA52A65AB76E",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","HT33XW904670",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","D877417E7A3CC6511020A41DB682B8BC2A910AD9",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","ZX1G22Q85G",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","D9191557",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","E26B9B00CEA8F16E9E86FF57D0E7AC08915D037C",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","3A7F6C2BC554B6F042A9D9C32F194C4A694A98DA",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","1DABB259863F2CCA27823FDE91AB97F3E2074BB0",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","C6EB13F83EB7470AED51CA44A8E78B7390C04674",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","0715F779C91C3438",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","4DF16047113E5F9B",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","99F530C413FA465358689E6C4595E3411C2BDF6A",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","TA62609I16",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","LGMS500-7199D6E",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","0E33B993",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","B0F3070634740B9P",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","SH3C5WK02028",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","E08FC6A451C7C7017C6205BEBA095CE81131267F",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","75B3B8695C77CF29CB48ECDB099BB46588DEA00E",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","47900869FA2290C5",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","342D8E92AF656B4ED874E914DB402D8956CAA156",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","C00C1551",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","5205F0974EB211C3",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","C6474BC4CE275F902BFF044284E7E5EABBBF9D3A",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","2778A9D98552A99FC70C022ED3D174A17ECF26AF",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","HT5ASSZ00579",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","3200E18ECBAE9000",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","C1607C4DD1A5311",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","81B6E4B90D76CB2584E2AA35DDEC7CB8F77CD043",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","LGMS659-2A6D3E6",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","LGH815ECBFB014",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","ZX1B225H7Q",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","D0C09B94A45BFD181CA399281FA667832EBB378A",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","0CE5753F",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","94016B41096266B99E75B6F5423393800E15C0A7",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","02157DF2682BD717",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","3204279EB89711C1",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","HT54BYJ00780",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","5B2825CD0DDD2CE0CF68FAA33CE490AA7EF08846",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","BX903GMZJ9",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","TA8830MFLG",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","HT54RSV01495",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","08AF2EB17F755F963E9562B7DFFD0774346361D2",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","32048A1B8BD11191",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","41001809130D2100",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","091CB9CE",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","0019319E7B0A9E",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","5A93A98CC552B2D3290D822D476A9655D85FFE29",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","SH43PWM00164",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","BH908MZ716",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","00EE284518D6140201F24A22C5D09C3E252729B6",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","4D797AD2B11BB921D970CC93430949FDCBF8BFC5",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","EBEFBA33",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","41062E40320390A9",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","5EC9BE76",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","4D4C2E2258FFB6DA30F33DE435C9A4A371B60D25",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","VS9854GDB219A7",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","E1B9438BF78CFEE89602C273C4CF482DB7A597C3",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","00BC891B96D53F56",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","FA9CD0261BD6E501189A72AAB1B7F4E29883605B",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","15790A52D2DFF6808C657186F3A369DD5461C39E",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","ZX1G2239HT",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","72DD6472",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","VS986A49E8F78",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","1162041836",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","5A3A40BE",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","7441F0CF8005B848750A53346FF5D587E178CC36",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","0750E0A4",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","CB51242XNH",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","HT33NLE04051",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","47900AD78C5BD000",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","YT9100UWYW",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","E206B58DE11F2EDD3340B72039B1E21B87F669F0",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","144F90DE476A7DADFF791DFA8AB667ADABE8B5A9",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","8DBB7B2A5DB3311D48BA977AC7DA5160E3FC1307",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","A3249609B92AA865D09492C92D6CCA91D882236C",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","686E5891CBAD67345BB0738B1AE89DC203BCB4EE",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","06B5E0DB",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","041C21A12523FF86",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","84B5T15A15005556",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","62DAEDCB",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","F9E9651C",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","6949848EF1117FCF1DFEC7884F4EC69E404E77FF",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","03157DF383883C03",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","3024FBEC0DF899F9E9CA0029D5CBF463830A9979",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","4D0087C5C23BC100",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","02157DF27927BE01",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","918A9BD1",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","TA6270EON5",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","FA452WW03078",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","04157DF434ED5924",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","EB559BAB",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","068B0B644F5010C1",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","614D35153F60D9CC138AD166595FF94145E691B8",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","62B0EC427B990D36B0C13F71DA732E74B40EC4FD",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","B54BA7AE51CD9AB182E26DE2ADDB09825E05BA17",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","C18313C7060FF85C703E2DF0AA027BB096681F3D",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","T01130J4SB",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","A8B73293AB91BCEA9E165A6BDF86EF785B7F0940",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","B0ADBAF5D0C76DAB7F2AF2053EAC5FEFF17812CE",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","HT4BLJT00462",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","TA62705NTE",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","921958A1",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","ZHONP7CIFQGEUGW8",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","02157DF21DFAAC2B",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","827CE418017CBE7CACCA4E23E57A235338094549",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","0712935B",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","LGD62099C2A30",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","6B64C597C5EE6FCF2F58F3AC1FF75F6729C1AA4C",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","330044B1985082CB",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","6B88182BE82274D2C69D4179BFB147F9969EF6F5",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","3355E3CD3BD3F112E2FA52378EB1B5AD33A35B50",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","HT24DW408033",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","12075B9C",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","FA53RYJ05553",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","42F72902B8E59FF3",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","3E83C9A8",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","01467D5406006014",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","714A51A7E95A2012E73C41406DD7A1895F0D42E3",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","HT14FS015729",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","HT24DW300572",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","4DF1B6722E845F71",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","D28A8C20",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","TA59700G1K",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","015D4906BF07FA01",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","EE4324D120F3A87B2148AE2C64EDD22A2900313F",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","FA53TYJ16132",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","FD13F75F",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","TA6260HRRE",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","17E62A82172A36293D316B522623430FD9D7EA0C",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","DA9D8D20",null,"PRIVATE:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","ABA6DB5BF4B0F70CF94934359F427DFD64279C5C",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","CC2387AF55F14362AA8EA5093D95CB83A0CAE6B8",null,"PRIVATE:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
};
	}


	//@Parameters({ "deviceID" })
	@Test (dataProvider="Devices" )

	public void testDevices(String platform,String app,String deviceID,String persona,String applocation) {
		boolean rc =false;

		test= new communityTest(_rep,deviceID,app,platform,persona,applocation);



		AppiumDriver _RWD = test.getWebDriver();

		if (_RWD==null)
		{
			Assert.assertTrue(_RWD==null);
		} 
		
		if (platform.equalsIgnoreCase("ios"))
		{
			rc = test.execI(_RWD);

		}else
		{
			rc = test.execA(_RWD);

		}

		 

		try {

			_RWD.closeApp();
			_RWD.close();	
			String repName = "test_comm_"+deviceID;
			util.downloadReport(_RWD, "pdf",repName);	
			_rep.addline(deviceID, String.valueOf(rc)  ,util.getReprtName(repName, true));

		} catch (Exception e) {
		
		}finally
		{
			 try{
				_RWD.quit();

			}catch(Exception e)
			{
				//  driver closed 
			}
			if  (!rc)
			{
				Assert.fail("Test Ended with error");

			}

		}
	}

}