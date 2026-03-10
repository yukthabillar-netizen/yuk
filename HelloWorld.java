package example1.example1;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Example1 {
    public static void main(String[] args)throws IOException,ParseException, org.json.simple.parser.ParseException {
        JSONParser jsonparser=new JSONParser();
        FileReader filereader=new FileReader("W:\\json5\\emp.json");
        Object obj=jsonparser.parse(filereader);
        JSONObject empobj=(JSONObject)obj;
        String fname=(String) empobj.get("firstname");
        String lname=(String) empobj.get("lastname");

        System.out.println("firstname:"+fname);
        System.out.println("lastname:"+lname);
    }
}
