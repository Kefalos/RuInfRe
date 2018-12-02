package tim2015.ruinfre.util;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;

import tim2015.ruinfre.model.Resource;

/**
 * Serijalizator baziran na paketu GSON
 * @author Aleksandar Karpuzov
 *
 */

public class GsonSerializer implements Serializer {

	Gson gson;
	Class<?> class_;
	
	public Class<?> getClass_() {
		return class_;
	}

	public void setClass_(Class<?> class_) {
		this.class_ = class_;
	}

	public GsonSerializer(Class<?> class_) {
		this.class_ = class_;
		gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(Resource.class, new AbstractAdapter()).create();
	}
	
	private static class AbstractAdapter implements JsonSerializer<Resource>, JsonDeserializer<Resource> {
		@Override
		public JsonElement serialize(Resource src, Type typeOfSrc, JsonSerializationContext context) {
			JsonObject result = new JsonObject();
			result.add("type", new JsonPrimitive(src.getClass().getSimpleName()));
			result.add("properties", context.serialize(src, src.getClass()));

			return result;
		}

		@Override
		public Resource deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
				throws JsonParseException {
			JsonObject jsonObject = json.getAsJsonObject();
			String type = jsonObject.get("type").getAsString();
			JsonElement element = jsonObject.get("properties");

			try {
				return context.deserialize(element, Class.forName("tim2015.ruinfre.model." + type));
			} catch (ClassNotFoundException cnfe) {
				throw new JsonParseException("Unknown element type: " + type, cnfe);
			}
		}
	}
	
	
	@Override
	public String toJson(Resource res) {
		return gson.toJson(res);
	}

	@Override
	public Resource fromJson(String str) {
		try {
			return (Resource) gson.fromJson(str, class_);
		} catch (JsonSyntaxException e) {
			return null;
		}
		
	}

	@Override
	public boolean validateSyntax(String text) {
		return (fromJson(text) != null) ;
	}

	@Override
	public boolean validateData(String text) {
		return validateSyntax(text);
	}

}
