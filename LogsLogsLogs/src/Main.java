//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    enum LogLevel {
        TRACE(1),
        DEBUG(2),
        INFO(4),
        WARNING(5),
        ERROR(6),
        FATAL(42),
        UNKNOWN(0);

        private final int encodedLevel;

        LogLevel(int encodedLevel) {
            this.encodedLevel = encodedLevel;
        }

        public int getEncodedLevel() {
            return encodedLevel;
        }
    }

    public class LogsLogsLogs {
        private final String logLine;

        public LogsLogsLogs(String logLine) {
            this.logLine = logLine;
        }

        public LogLevel getLogLevel() {
            if (logLine.startsWith("[TRC]")) return LogLevel.TRACE;
            if (logLine.startsWith("[DBG]")) return LogLevel.DEBUG;
            if (logLine.startsWith("[INF]")) return LogLevel.INFO;
            if (logLine.startsWith("[WRN]")) return LogLevel.WARNING;
            if (logLine.startsWith("[ERR]")) return LogLevel.ERROR;
            if (logLine.startsWith("[FTL]")) return LogLevel.FATAL;
            return LogLevel.UNKNOWN;
        }

        public String getOutputForShortLog() {
            LogLevel level = getLogLevel();
            String message = logLine.substring(logLine.indexOf("]: ") + 3);
            return level.getEncodedLevel() + ":" + message;
        }
    }
}
