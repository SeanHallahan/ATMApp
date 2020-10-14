/*RowanATM
18/11/2019
Language.java*/
import java.util.*;
import javax.*;
import java.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;
import com.fasterxml.jackson.core.JsonParser;
import org.json.*;
import jdk.nashorn.internal.parser.JSONParser;
import com.fasterxml.javkson.core.JsonParser;


public class LanguageSelection {

    private String fileName = "language.json";
    JSONObject jsonObject ;

    public LanguageSelection(){


        JSONParser jsonParser = new JSONParser();

    try (FileReader reader = new FileReader("language.json")){

        jsonObject = jsonParser.parse(reader);
    }
} 


public String getLanguageOption (String language,String parameter){

    JSONObject buttonObject = (JSONObject) jsonObject.get(language);

    String properties = (String) jsonObject.get(parameter);

    return properties; 
}


