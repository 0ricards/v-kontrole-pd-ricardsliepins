public class count {
    public static void main(String[] args){
        String txt= "Kad skolēni sabojā git projektu: Nu ko… laiks jaunam klonam.";

        int a =0;

        for (int i=0; i < txt.length();){
            if (txt.charAt(i) == 'a' || txt.charAt(i) == 'ā' ){
                a++;
                i=i+1;
            }
            else {
                i=i+1;
        }
        System.out.println("A skaits " + a);
    }


}}

