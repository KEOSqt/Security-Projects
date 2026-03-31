package keos_crypto_alg;

import java.util.HashMap;
import java.util.Map;

public class decryption {

    private static final Map<String, Character> decryptionMap = new HashMap<>();

    static {

        decryptionMap.put("andiamo", 'a');
        decryptionMap.put("bousselem", 'b');
        decryptionMap.put("c_la_donya", 'c');
        decryptionMap.put("d0wn", 'd');
        decryptionMap.put("ezahi", 'e');
        decryptionMap.put("fratello", 'f');
        decryptionMap.put("gooba", 'g');
        decryptionMap.put("hanarri", 'h');
        decryptionMap.put("irawa7", 'i');
        decryptionMap.put("jicombeur", 'j');
        decryptionMap.put("kalala", 'k');
        decryptionMap.put("ladra3", 'l');
        decryptionMap.put("M3kky", 'm');
        decryptionMap.put("necrophillia", 'n');
        decryptionMap.put("oralando_pirates", 'o');
        decryptionMap.put("parker&psycom", 'p');
        decryptionMap.put("qtkeos", 'q');
        decryptionMap.put("russo", 'r');
        decryptionMap.put("salangaty", 's');
        decryptionMap.put("ty_brr_zammer", 't');
        decryptionMap.put("uomo", 'u');
        decryptionMap.put("viagra", 'v');
        decryptionMap.put("wiou", 'w');
        decryptionMap.put("xta", 'x');
        decryptionMap.put("yaghortyab", 'y');
        decryptionMap.put("zorro_5ou_borro", 'z');

        decryptionMap.put("amad_diallot", 'A');
        decryptionMap.put("boch_ye_grandi", 'B');
        decryptionMap.put("crappo", 'C');
        decryptionMap.put("d0wnix", 'D');
        decryptionMap.put("ehnarrek", 'E');
        decryptionMap.put("firas_zatoulic", 'F');
        decryptionMap.put("goobewi", 'G');
        decryptionMap.put("harcoul", 'H');
        decryptionMap.put("inarry", 'I');
        decryptionMap.put("jigou_l7am", 'J');
        decryptionMap.put("kala", 'K');
        decryptionMap.put("ladra3_bou_felss", 'L');
        decryptionMap.put("M3kouk", 'M');
        decryptionMap.put("zouphilia", 'N');
        decryptionMap.put("ooo_l3asba_w_threrehe", 'O');
        decryptionMap.put("pedophilie", 'P');
        decryptionMap.put("qobra", 'Q');
        decryptionMap.put("racouuuun", 'R');
        decryptionMap.put("sel3a_5raaa", 'S');
        decryptionMap.put("taki_ye_hmaida", 'T');
        decryptionMap.put("urrrrrrrrra", 'U');
        decryptionMap.put("viros", 'V');
        decryptionMap.put("wiouuu_rabi3", 'W');
        decryptionMap.put("xta_lirica", 'X');
        decryptionMap.put("ya_lemby", 'Y');
        decryptionMap.put("zelenskyy", 'Z');

        decryptionMap.put("lowell", '1');
        decryptionMap.put("ethenny", '2');
        decryptionMap.put("etheleth", '3');
        decryptionMap.put("erraba3", '4');
        decryptionMap.put("el5amess_najar", '5');
        decryptionMap.put("saxo", '6');
        decryptionMap.put("el_7ayya", '7');
        decryptionMap.put("elthemen", '8');
        decryptionMap.put("ettesse3", '9');
        decryptionMap.put("wethnin 9athy", '0');

        decryptionMap.put("_", ' ');
    }

    public static String decrypt(String encryptedInput) {
        if (encryptedInput == null || encryptedInput.isEmpty()) {
            return "";
        }

        String[] tokens = encryptedInput.split("\\s+");
        StringBuilder res = new StringBuilder();

        for (String token : tokens) {

            if (token.isEmpty()) {
                continue;
            }

            Character decryptedChar = decryptionMap.get(token);

            if (decryptedChar != null) {

                res.append(decryptedChar);
            } else {
                res.append(token);
            }
        }


        return res.toString();
    }
}