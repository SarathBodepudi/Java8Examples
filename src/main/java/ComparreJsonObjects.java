import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ComparreJsonObjects {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode1 = null;
		JsonNode jsonNode2 = null;
		JsonNode jsonNode3 = null;
		JsonNode jsonNode4 = null;
		JsonNode jsonNode5 = null;

		String json1 = "{\r\n"
				+ "	\"employee\": {\r\n"
				+ "		\"fullName\": \"John Miles\",\r\n"
				+ "		\"age\": 34,\r\n"
				+ "		\"contact\": {\r\n"
				+ "			\"email\": \"john@xyz.com\",\r\n"
				+ "			\"phone\": \"9999999999\"\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "}";
		
		String json2 = "{\r\n"
				+ "	\"employee\": {\r\n"
				+ "		\"id\": \"1212\",\r\n"
				+ "		\"fullName\": \"John Miles\",\r\n"
				+ "		\"age\": 35,\r\n"
				+ "		\"contact\": {\r\n"
				+ "			\"email\": \"john@xyz.com\",\r\n"
				+ "			\"phone\": \"9999999999\"\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "}";
		
		// json 1 and 3 are exact same
		String json3 = "{\r\n"
				+ "	\"employee\": {\r\n"
				+ "		\"fullName\": \"John Miles\",\r\n"
				+ "		\"age\": 34,\r\n"
				+ "		\"contact\": {\r\n"
				+ "			\"email\": \"john@xyz.com\",\r\n"
				+ "			\"phone\": \"9999999999\"\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "}";
		
		// json 3 and 4 are exact same but order different. age and full name reordered
		String json4 = "{\r\n"
				+ "	\"employee\": {\r\n"
				+ "		\"age\": 34,\r\n"
				+ "		\"fullName\": \"John Miles\",\r\n"
				+ "		\"contact\": {\r\n"
				+ "			\"email\": \"john@xyz.com\",\r\n"
				+ "			\"phone\": \"9999999999\"\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "}";
		
		// json 4 and 5 are different in age
		String json5 = "{\r\n"
				+ "	\"employee\": {\r\n"
				+ "		\"age\": 35,\r\n"
				+ "		\"fullName\": \"John Miles\",\r\n"
				+ "		\"contact\": {\r\n"
				+ "			\"email\": \"john@xyz.com\",\r\n"
				+ "			\"phone\": \"9999999999\"\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "}";
		
		
		jsonNode1 = objectMapper.readTree(json1);
		jsonNode2 = objectMapper.readTree(json2);
		jsonNode3 = objectMapper.readTree(json3);
		jsonNode4 = objectMapper.readTree(json4);
		jsonNode5 = objectMapper.readTree(json5);
		
		// Checking if both json objects are same
		System.out.println(jsonNode4.equals(jsonNode5));
	}

}
