package keos_crypto_alg;

public class encryption {

    public static String encrypt(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder res = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
            char c = new Character(input.charAt(i));

            switch (c) {
                case 'a': res.append("andiamo "); break;
                case 'b': res.append("bousselem "); break;
                case 'c': res.append("c_la_donya "); break;
                case 'd': res.append("d0wn "); break;
                case 'e': res.append("enami "); break;
                case 'f': res.append("fratello "); break;
                case 'g': res.append("gooba "); break;
                case 'h': res.append("hawa5i "); break;
                case 'i': res.append("irawa7 "); break;
                case 'j': res.append("jicombeur "); break;
                case 'k': res.append("kalala "); break;
                case 'l': res.append("ladra3 "); break;
                case 'm': res.append("M3kky "); break;
                case 'n': res.append("necrophillia "); break;
                case 'o': res.append("oralando_pirates "); break;
                case 'p': res.append("parker&psycom "); break;
                case 'q': res.append("qtkeos "); break;
                case 'r': res.append("russo "); break;
                case 's': res.append("salangaty "); break;
                case 't': res.append("ty_brr_zammer "); break;
                case 'u': res.append("uomo "); break;
                case 'v': res.append("viagra "); break;
                case 'w': res.append("wiou "); break;
                case 'x': res.append("xta "); break;
                case 'y': res.append("yaghortyab "); break;
                case 'z': res.append("zorro_5ou_borro "); break;

                case 'A': res.append("amad_diallot "); break;
                case 'B': res.append("boch_ye_grandi "); break;
                case 'C': res.append("crappo "); break;
                case 'D': res.append("d0wnix "); break;
                case 'E': res.append("ehnarrek "); break;
                case 'F': res.append("firas_zatoulic "); break;
                case 'G': res.append("goobewi "); break;
                case 'H': res.append("harcoul "); break;
                case 'I': res.append("inarry "); break;
                case 'J': res.append("jigou_l7am "); break;
                case 'K': res.append("kala "); break;
                case 'L': res.append("ladra3_bou_felss "); break;
                case 'M': res.append("M3kouk "); break;
                case 'N': res.append("zouphilia "); break;
                case 'O': res.append("ooo_l3atba_w_threrehe "); break;
                case 'P': res.append("pedophilie "); break;
                case 'Q': res.append("qobra "); break;
                case 'R': res.append("racouuuun "); break;
                case 'S': res.append("sel3a_kess7a "); break;
                case 'T': res.append("taki_ye_hmaida"); break;
                case 'U': res.append("urrrrrrrrra "); break;
                case 'V': res.append("viros "); break;
                case 'W': res.append("wiouuu_rabi3 "); break;
                case 'X': res.append("xta_lirica "); break;
                case 'Y': res.append("ya_lemby "); break;
                case 'Z': res.append("zelenskyy "); break;


                case '1': res.append("lowell "); break;
                case '2': res.append("ethenny "); break;
                case '3': res.append("etheleth "); break;
                case '4': res.append("erraba3 "); break;
                case '5': res.append("el5amess_najar "); break;
                case '6': res.append("saxo "); break;
                case '7': res.append("el_7ayya "); break;
                case '8': res.append("elthemen "); break;
                case '9': res.append("ettesse3 "); break;
                case '0': res.append("wethnin 9athy"); break;
                case ' ': res.append("_ "); break;

                default:
                    res.append(input.charAt(i)).append(" ");
            }
        }

        return res.toString().trim();
    }
}