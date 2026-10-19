import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] names={"Alex", "Rechael", "Laurent", "peter"};
        String result="";

        for(int i=0; i<names.length;i++){
            
            char[] letters=names[i].toCharArray();
            result +=letters[0];

        }
        System.out.println(result);
    }
}