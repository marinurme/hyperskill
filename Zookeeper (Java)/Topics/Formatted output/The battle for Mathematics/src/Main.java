import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        double pi = Math.PI;
        String text = """
              The compiler \\n
              cannot handle \\n
              the truth\\n""";
        System.out.println(text );
    }
}