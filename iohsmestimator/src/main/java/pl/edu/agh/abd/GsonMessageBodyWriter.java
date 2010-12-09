package pl.edu.agh.abd;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class GsonMessageBodyWriter implements MessageBodyWriter<Object> {

	private static final Gson transformer = new Gson();
	private Map<Object, String> cacheJSON = new HashMap<Object, String>();
	protected final static Logger LOGGER = LoggerFactory.getLogger(GsonMessageBodyWriter.class);
	
	private String lazyAsJSON(Object obj) {
		if (!cacheJSON.containsKey(obj))
			cacheJSON.put(obj, transformer.toJson(obj));
		return cacheJSON.get(obj);
	}
	
	@Override
	public long getSize(Object obj, Class<?> clazz, Type type,
			Annotation[] annotations, MediaType mediaType) {
		return lazyAsJSON(obj).length();
	}

	@Override
	public boolean isWriteable(Class<?> clazz, Type type, Annotation[] annotations,
			MediaType mediaType) {
		return true;
	}

	@Override
	public void writeTo(Object obj, Class<?> clazz, Type type,
			Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> headers, OutputStream stream)
			throws IOException, WebApplicationException {
		LOGGER.debug("wrapping in JSON");
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(stream));
		pw.print(lazyAsJSON(obj));
		pw.close();
	}
}
