import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LibraryLogger {

    private List<String> logs = new ArrayList<>();

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public String logActivity(String activity) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        String entry = timestamp + " " + activity;
        logs.add(entry);
        return entry;
    }

    public String getLogs() {
        if (logs.isEmpty())
            return "Belum ada log aktivitas.";

        StringBuilder sb = new StringBuilder();
        for (String log : logs) {
            sb.append(log).append("\n");
        }
        return sb.toString();
    }

    // Kosongkan semua log
    public void clearLogs() {
        logs.clear();
    }
}