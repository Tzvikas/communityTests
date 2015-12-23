package test.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

public class BuildDeviesList {


	public static void main(String[] args) {


		//String devList = getData();
		String iosApp = "com.bloomfire.enterprise.perfecto";
		String AndroidApp = "com.bloomfire.android.perfecto";
		
		String apkLocation = "PUBLIC:PMcommunity\\\\Bloomfire-perfecto-release.apk";
		String ipaLocation = "PUBLIC:PMcommunity\\\\perfecto-enterprise-2.11(20151117.1).ipa";
 		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(getFdata());

			NodeList handsets = doc.getElementsByTagName("handset");

			
			
			for (int temp = 0; temp < handsets.getLength(); temp++) {

				Node handset = handsets.item(temp);

				NodeList handsetData = handset.getChildNodes();
				String id =null ;
				String os = null;
				for (int data = 0; data < handsetData.getLength(); data++) {
					
					
					Node d = handsetData.item(data);
					if (d.getNodeName().equals("deviceId"))
					{
						id = d.getTextContent();
					}
					if (d.getNodeName().equals("os"))
					{
						os = d.getTextContent();
					}
 	 				 
				}
				if (os.equals("iOS"))
				{
					System.out.println("{\"ios\",\""+iosApp+"\",\""+id+"\",null,\""+ipaLocation+"\"},");

				}
				else if ((os.equals("Android")))
				{
					System.out.println("{\"Android\",\""+AndroidApp+"\",\""+id+"\",null,\""+apkLocation+"\"},");

				}
				else
				{
					// does not support window or BB
				}
				// String platform,String app,String deviceID,String persona,String applocation) {
				//{"iOS","com.united.UnitedCustomerFacingIPhone","39F3DA5531ADBE2A05CFF4D65E43A2C38D3D595A",null,null},
			 
				 
			}

		} catch (Exception e) {
			System.out.println("ccan parse XML ");
			e.printStackTrace();
		}


	}

	private static InputStream getFdata()
	{
		File initialFile = new File("/Users/uzie/Downloads/handsets.xml");
		try {
			InputStream targetStream = new FileInputStream(initialFile);
			return targetStream;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			return null;	
		}
	}


	private static InputStream getData() {
		try {
			String URLDevices =  "https://demo.perfectomobile.com/services/handsets?operation=list&user=uzie@perfectomobile.com&password=@Perfecto1&status=connected";

			URL obj = new URL(URLDevices);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();
			System.out.println("Response Code : " + responseCode);

			return con.getInputStream();
		
		} catch (Exception e) {
			System.out.println("cant get data ");
			return null;
		}		
	}

}
