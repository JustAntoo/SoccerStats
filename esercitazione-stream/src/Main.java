import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] coloriArray = new String[]{"bianco", "rosso", "giallo", "blu", "verde"};

      Arrays.stream(coloriArray).forEach(s -> s.toString());

    }


}