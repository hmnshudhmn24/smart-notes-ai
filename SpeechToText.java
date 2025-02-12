import javax.speech.Central;
import javax.speech.recognition.*;
import java.util.Locale;

public class SpeechToText {
    public void startListening() {
        try {
            Recognizer recognizer = Central.createRecognizer(new Locale("en", "US"));
            recognizer.allocate();
            System.out.println("Listening for notes...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}