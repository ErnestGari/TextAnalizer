public class veiksmai {


    public static int zodziuSkait(String text) { // zodziu skaiciavimas

        int zodziai = 1;
        for (int i = 0; i < text.length(); i++) { // jei yra tarpas tai reiskia kad reikia prideti zodi.
            if (text.charAt(i) == ' ') {
                zodziai += 1;
            }
        }
        return zodziai;
    }

    public static int charSkait(String text) { // simboliu skaiciavimas

        int charSk = 0;

        for(int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ' || text.charAt(i) == ',' || text.charAt(i) == ';' || text.charAt(i) == '!' || text.charAt(i) == '?' || text.charAt(i) == '.') {
                continue; // jei nera specialiu simboliu praleidzia for ciklo ejima
            }
            charSk += 1;

        }
        return charSk;
    }

    public static char daznChar(String text) {
        char daznChar = 0;
        int maks = 0;

        for(int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);// kas nauja eile nustatytas naujas simbolis
            int pasikartojimas = 0; // kiekviena cikla grizta atgal i nuli

            for(int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) { // jei simbolis lygus kitam is teksto prisideda pasikartojimas
                    pasikartojimas += 1;
                }
            }

            if (pasikartojimas > maks) {// ziuri ar didziausia pasikartojimo reiksme
                maks = pasikartojimas; // jei didziausia prideda prie maks ir vel kartoja cikla
                daznChar = c;
            }
        }
        return daznChar;
    }


    public static String reverseText(String text) {

        StringBuilder atvirkstinis = new StringBuilder(); //sukuriame stringbuilder
        atvirkstinis.append(text); //pridedame teksta
        atvirkstinis.reverse(); // naudojam reverse funkcija

        return atvirkstinis.toString(); // graziname pavirtusi i string

    }
}
