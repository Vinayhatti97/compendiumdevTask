package readFromfile;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.ous.jtoml.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class Readfromjson {

    /*
    This method will read from json and return the value from the json file
     */
    public String readFile(String attribute) throws IOException, ParseException {
        JsonParser jsonParser = new JsonParser();
        FileReader read = new FileReader(System.getProperty("user.dir") + "/TestData/FormDetails.json");
        Object obj = jsonParser.parse(read);

        JsonObject jsonObject = (JsonObject) obj;
        String value = jsonObject.get(attribute).getAsString();
        return value;
    }
}