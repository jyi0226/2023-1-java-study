import java.util.ArrayList;
import java.util.Arrays;
public class _3_7 {
    public static void main(String[] args){
        ArrayList<String> List=new ArrayList<String>(Arrays.asList(
                "Life","is","too","short"));
        System.out.println("\""+String.join(" ",List)+"\"");
    }
}
