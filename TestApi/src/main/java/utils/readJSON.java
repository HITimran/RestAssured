package utils;

import java.io.*;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readJSON {

    public static void main(String[] args) throws
            IOException, ParseException {

        JSONParser parser = new JSONParser();

        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(
                "TestApi\\src\\main\\resources\\read.json"  )  );

        for (Object o : jsonArray) {
            JSONObject person = (JSONObject) o;

            String strName = (String) person.get("name");
            System.out.println("Name::::" + strName);

            String strCity = (String) person.get("city");
            System.out.println("City::::" + strCity);

            JSONArray arrays = (JSONArray) person.get("cars");
            for (Object object : arrays) {
                System.out.println("cars::::" + object);
            }
            String strJob = (String) person.get("job");
            System.out.println("Job::::" + strJob);
            System.out.println();

        }

    }

    public void loadJSON()
    {
        InputStream in = getClass().getResourceAsStream("/1.txt");
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
    }
}
