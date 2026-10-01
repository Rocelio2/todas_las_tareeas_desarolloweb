class SqueakyClean {

    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < identifier.length(); i++) {
            char ch = identifier.charAt(i);

            // 1. Reemplazar espacios por guiones bajos
            if (ch == ' ') {
                result.append('_');
                capitalizeNext = false;
            }
            // 2. Reemplazar caracteres de control por "CTRL"
            else if (Character.isISOControl(ch)) {
                result.append("CTRL");
                capitalizeNext = false;
            }
            // 3. Convertir kebab-case a camelCase (al encontrar un guión '-')
            else if (ch == '-') {
                capitalizeNext = true;
            }
            // 4. Convertir Leetspeak a vocales/letras
            else if (Character.isDigit(ch)) {
                char decoded = ch;
                switch (ch) {
                    case '4': decoded = 'a'; break;
                    case '3': decoded = 'e'; break;
                    case '0': decoded = 'o'; break;
                    case '1': decoded = 'l'; break;
                    case '7': decoded = 't'; break;
                    default:
                        // Los demás números no mapeados se descartan
                        capitalizeNext = false;
                        continue;
                }

                if (capitalizeNext) {
                    result.append(Character.toUpperCase(decoded));
                    capitalizeNext = false;
                } else {
                    result.append(decoded);
                }
            }
            // 5. Procesar letras válidas
            else if (Character.isLetter(ch)) {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(ch));
                    capitalizeNext = false;
                } else {
                    result.append(ch);
                }
            }
            // 6. Omitir cualquier otro símbolo o carácter no deseado
            else {
                capitalizeNext = false;
            }
        }

        return result.toString();
    }
}