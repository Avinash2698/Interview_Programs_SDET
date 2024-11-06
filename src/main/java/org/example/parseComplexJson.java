package org.example;
import io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
public class parseComplexJson {

	public static void main(String[] args) {
		String response = returnsJson();
		JsonPath js = new JsonPath(response);
		System.out.println(js.getInt("Value_Information.Platform_Compensation[0].Platform_mission_Id"));
	}
	
	public static String returnsJson() {
		String json = "    {\r\n"
				+ "    \"Platform Parent Dato Id\": \"23768\",\r\n"
				+ "    \"Platform Dato Id\": \"24138\",\r\n"
				+ "    \"Platform Dato Name\": \"Random Europe\",\r\n"
				+ "    \"Platform mission Id\": \"111112\",\r\n"
				+ "    \"Platform submission Id\": \"638687\",\r\n"
				+ "    \"Platform submission Flight Id\": \"863524\",\r\n"
				+ "    \"Start Date\": \"2017-12-01\",\r\n"
				+ "    \"End Date\": \"2017-12-02\",\r\n"
				+ "    \"Platform Compensation\": 109.0909,\r\n"
				+ "    \"Total Value\": 909.0909,\r\n"
				+ "    \"Goal\": \"200000.0000\",\r\n"
				+ "    \"Value_Information\": {\r\n"
				+ "      \"Platform_Compensation\": [\r\n"
				+ "        {\r\n"
				+ "          \"Platform_mission_Id\": \"111112\",\r\n"
				+ "          \"Platform submission Id\": \"638687\",\r\n"
				+ "          \"Platform submission Flight Id\": \"863524\",\r\n"
				+ "          \"Value Rate\": \"14.0000\",\r\n"
				+ "          \"Value\": 109.0909\r\n"
				+ "        }\r\n"
				+ "      ]\r\n"
				+ "    }\r\n"
				+ "  }";
		return json;
	}

}
