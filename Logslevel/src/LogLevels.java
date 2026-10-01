public class LogLevels {

    public static String message(String logLine) {
        // Divide por el caracter ':' y toma la segunda parte (el mensaje),
        // eliminando espacios al inicio y al final con trim()
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
        // Extrae el texto entre el corchete de apertura '[' y el de cierre ']'
        // y lo convierte a minúsculas
        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        return logLine.substring(start, end).toLowerCase();
    }

    public static String reformat(String logLine) {
        // Combina el mensaje procesado con el nivel entre paréntesis
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}