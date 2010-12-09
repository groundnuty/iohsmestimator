import javax.ws.rs.core.MultivaluedMap;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import com.sun.jersey.client.*;
import com.sun.jersey.client.apache.ApacheHttpClient;
import com.sun.jersey.client.apache.config.DefaultApacheHttpClientConfig;

public class MainClient {

	public static void main(String [ ] args)
	{
		Gson transformer = new Gson();
		DefaultApacheHttpClientConfig config = new DefaultApacheHttpClientConfig();
		config.getProperties().put(config.PROPERTY_HANDLE_COOKIES, Boolean.TRUE);
		Client client = ApacheHttpClient.create(config);
		
		WebResource webRes = client.resource("http://localhost:8080/iohsmestimator/rest/test/hello");
		MultivaluedMap queryParams = new MultivaluedMapImpl();
		queryParams.add("login", "login1");
		String jsonResponse = (String) webRes.queryParams(queryParams).get(String.class);
		String response =  (String) transformer.fromJson(jsonResponse, String.class);
		
		System.out.println("[json:] " + jsonResponse + " [normal:] " + response);
	}
}
