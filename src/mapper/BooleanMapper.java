package mapper;

import writer.JsonWriter;

public class BooleanMapper implements JsonMapper{
    @Override
    public void write(Object obj, JsonWriter writer) {
	
	Boolean bool = (Boolean) obj;
	writer.writeBoolean(bool);
    }
}
