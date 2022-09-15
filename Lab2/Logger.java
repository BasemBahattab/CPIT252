
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.PrintWriter;
import java.io.FileWriter;

public final class Logger {

    private static Logger logger;
    static DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
    static String currentDateTimeString = LocalDateTime.now().format(myFormatter);
    private static final String logFile = currentDateTimeString + ".txt";
    private static PrintWriter writer;
    static FileWriter fw;
    
    private Logger() {}

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
            try {
                fw = new FileWriter(logFile);
                writer = new PrintWriter(fw, true);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return logger;
    }


    public void info(String message) {
        writer.println("INFO: " + message);
    }

    public void error(String message) {
        writer.println("Error: " + message);
    }
}
