package test.java;


import io.appium.java_client.AppiumDriver;

import java.io.IOException;
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

		_rep = new HTMLReporter("CommStats.html", "/Users/uzie/doc/PMRepos/commTests/", "Perfecto");

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
				{"ios","com.bloomfire.enterprise.perfecto","B187DA890752D02463279FCA08C63390A76B33DA",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","61F28E0775D8B0B57388E72D176AFE91A6248B39",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","1ACB3A0F",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","2FC00D086052C606D2D57EA757B7450A216D3832",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","897864D5",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","02157DF2AC2D7520",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","DD992AFA0B69A5E2C2006A7A657690476B0086FE",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","B5DED881",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","3050BE36",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","769BCE321F14DCF504614AB737BEE6F865E15AA4",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","CB1BF44CFEB5C6E1DC52FBC21973B76517820ED3",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","6C8E27EB5B619CC743ADE9578163063A54642DB7",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","2A56E99775698D2F1BABD7C1F9D57CA06AF0C7F6",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","30E9D3E3",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","1E674EB8",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","95E0EEA907ECC690914C7ABE68786B3EDE4343DF",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","C37BAE1934AE7DD0AE3355F77146C7A65579CAA3",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","21FA87D12F5451B436E9918C6FA1800918696394",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","03157DF35175BE01",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","A7493312BB4627B1F1D79F6426581A84AE273F9C",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","5CDCB21A",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","DBBABA52",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","04157DF4535E050F",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","4EC7F3A2FA62E31A81C64FE30AA719225E2492F2",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","CEA5D5FBEAC16BA80707F8B5F370F24A08DBAC97",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","03157DF34AD58C3A",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","C460C46835B52F88D112C6FD1DCD2305CD8FFDA6",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","8E1CBC7E90168A3A7CFDA2712A8C20DD15517F89",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","C22111B00BABC2C33655C75CE25440A0BCF3C665",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","A3D514773D0ED638A992F36DFF0909C7EFE9DAE5",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","06B25936007418BB",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","3F51A02E5C56CB1D9CB57681CA6A0D145F0F0C9B",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","4DC6A06C2A95B979FB0FCB76FD695DADA51AE40E",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","E56B27C10589F676BBB3AD684B2BF45FAD6F160C",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","06157DF6B882E232",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","HT54CSV03077",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","41EEF156EA10EDAB41632651F7AD2A4C4CB502ED",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","8C30BFE5",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","04157DF4C454EC06",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","05157DF532C1D40F",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","BA77631CDD65B0124F241488209BB741F30AA98A",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","CD6C2ED905F210B1",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","4B9BD305",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","06157DF63C579013",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","542AFD9A6E63484B0DD17F8FE173F47F88FD224E",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","02157DF272D13612",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","65256B3C",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","7DE396A2",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","0915F990353F2F05",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","03157DF38B85882A",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","B803C085",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","1D246E164CE780E46A161C9D288B613C7525CD5A",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","FA53XYJ18872",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","52003C354EAE122D",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","49221559C4F6B6C4739323EA491A3A67A4E7D7BE",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","DBF70BF4BE6919E583D19619B6DC773A37269561",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","AA88CEB52C1FFB5C3C112D518746C6C9AB79344E",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","DBBABA96",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","BC19BA60",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","39F3DA5531ADBE2A05CFF4D65E43A2C38D3D595A",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","CD9BE4E0",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","067C0546439C8F54",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","D42F708D",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","F15118A63C51D54E3CEA474B32CFE2ECDAF1AB70",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","04157DF4E959AA15",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","E20DE68F3D3554B90AB5503E57A28BE0270AF70D",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","C08DAC73FB1E0EEBEF1A29B403A0B78E9F05F41C",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","R3AG1013AVM",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","9B84A84A1DA11E5166B240B95FA8FF8E02D50158",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","EBB620E023B3FA0A72CAF31B46A21A51213C590E",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","02157DF2AB41E718",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","4A4C6703DD193AE89495246D652DD76A60425241",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","6040AEC0802CFC958BABCD4B075D79DB1AD723E8",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","06157DF6AD8A2531",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","AA7EEEAADD92242C665D2807B538BDACFAA5A0DB",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","5CDDB2F1",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","4ACCE39BE01401CCE309639F87DE2ADA8861962B",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","03157DF3800C0537",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","59755674D0CCBC97A39C07E70527BD6B88B8ED79",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","78020CF91272BCCC014C39212A19C5CF002C1FA7",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","67E59957",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","AA4B9E35795760DFBEDB8C7D4CAFCC261044ED50",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","05157DF5399ED633",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","05157DF53B1BA11F",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","EE290C0C50EE5E20ECBCE4BEB26AC859893C34E5",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","5BC74EA732F30014F8AFA35D3C45849EBDB99EC5",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","0A1DE373",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","09E079DC",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","D46F153EC7AA6A2C5D6FA15F3CBF31A1FAF7C0C5",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","3F1E7CA450E5ED1F9275A86C2037D8025EA90627",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","71EDDAE8C07850B0A910F2CF9E69A93095B996DA",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","D5B3B672",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","6D0250B1CECE7730CE322AD9CD7209665AB909BB",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","06157DF6C9C4D131",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","0EBB685F790C8F230A8B1FA00AA8E42A35DC655A",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","2D273556EFC6546ED976B3E23F67F12EDDFE52E3",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","8AF8F6AFBC0F6CF46617EE6EFA70D140DA8D8965",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","06157DF643532240",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","0615F6F16FB13932",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","3133BB296C46FA2250362A227BA462A56ED11A45",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","3C596BAE91226273BD652CF7920466130F8A276A",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","06157DF6E3F85514",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","1C3B401545D2CDBEC9D323460D914AD7319F31D9",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","04157DF43A656B1A",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","0415C23001A25812",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"Android","com.bloomfire.android.perfecto","0149BCA71700D01F",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","4ADA45843AD76545C1D4F9730D978D5FFD609A8F",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","57B94E3A",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","94855E97F1D94284821B38ECF27142B7F457C5A9",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","F41FB514D76C4374B983F4285C7C1BE60DA12E36",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","0F318FA00B4C22A5339A00481AAC13B344273D19",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","CEC63D6236866DD8AA617904D40E0F3A8154376E",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","B846BE7EC9B0D735783083591209E27C87DDB3CB",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","ADADB879",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","030FB4BA028AFB24D4800B3715516A680E022C5D",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","8F46591E26620649A03F66F3693FC3DBC719F01F",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","A1A54311",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},
				{"ios","com.bloomfire.enterprise.perfecto","FD9F4CC08F6E4637ADC5D3443193978D7B8E4942",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"ios","com.bloomfire.enterprise.perfecto","66E6218BE33270BDAA38F0A04FF11EEB5AF4ADFC",null,"PUBLIC:PMcommunity\\perfecto-enterprise-2.11(20151117.1).ipa"},
				{"Android","com.bloomfire.android.perfecto","93C74BC6",null,"PUBLIC:PMcommunity\\Bloomfire-perfecto-release.apk"},


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
			_rep.addline(deviceID, String.valueOf(rc)  ,	 	util.getReprtName(repName, true));

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