package io.github.frostyfunta.aincradpk.scrap.scheduled;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadWhitelist {
   public static int readJSON(String fileToRead){

           //JSON parser object to parse read file
           JSONParser jsonParser = new JSONParser();

           try (FileReader reader = new FileReader(fileToRead))
           {
               //Read JSON file
               Object obj = jsonParser.parse(reader);

               JSONArray users = (JSONArray) obj;
               System.out.println(users);

               //Iterate over employee array
               // employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

           } catch (FileNotFoundException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           } catch (ParseException e) {
               e.printStackTrace();
           }
    return 1;
   }

}
