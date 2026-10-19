public class Main {




    public static void main(String[] args) {
        String[] names = new String[3];
        String name1 = "Samm" ;
        names[0] = "Sam";
        names[1] = "Sch" ;
        names[2] = "All" ;
        System.out.println(names[0] + " " + names[1] + " " + names[2]);
        splitwords(name1);
    }

    private static void splitwords(String names[]){
        String words[] = names[1].split("");
        for(int i=0 ; i< words.length ; i++){
            String s=words[i];
            System.out.println(s.charAt(i));
        }

    }

}