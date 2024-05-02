package regexp;

public class RegExp {

    public static void main(String[] args) {
        String str = "          asa    ifjoi  asxas       ljd    dwad   ";
        str = str.replaceAll("\\s+", " ").trim();
        System.out.println(str);
        String words[] = str.split("\\s");
        System.out.println(words.length);
    }
    
}
