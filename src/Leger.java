import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface Leger {
    InputStreamReader inputStream = new InputStreamReader(System.in);
    BufferedReader bufferedInput = new BufferedReader(inputStream);

    String read();
}
