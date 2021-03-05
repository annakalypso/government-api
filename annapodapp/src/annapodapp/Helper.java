package annapodapp;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;


import com.google.gson.*;


public class Helper {
	
	public static String GetAPIData() throws Exception {

        // Sending get request
        URL url = new URL("https://data.gov.gr/api/v1/query/mcp_crime");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestProperty("Authorization","Token "+"86c28da102725029cd0f04dd548cedb8bd1defc9");               
        conn.setRequestProperty("Content-Type","application/json; charset=UTF-8");           
        conn.setRequestMethod("GET");
        
        conn.connect();
        int responsecode = conn.getResponseCode();
        
        if(responsecode != 200) throw new RuntimeException();
        else
        {
        	BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
            String output;

            StringBuffer response = new StringBuffer();
            
            while ((output = in.readLine()) != null) {
                response.append(output);   
            
            }
            in.close();
            //System.out.println(response.toString());
            return response.toString();
        }                     
	}
	
	public static Data[] TurnToDataFormat(String response_from_apiBuffer)  
	{
		GsonBuilder builder = new GsonBuilder(); 
	    builder.setPrettyPrinting(); 
	    Gson gson = builder.create(); 
		Data[] data = gson.fromJson(response_from_apiBuffer, Data[].class);
		//System.out.println(data[2].attempted);
		return data;
	}
	
}
