package fds.manuel;

import java.time.LocalDate;
import java.util.Hashtable;

public class CodificadorMorse implements Codificador {
    public String getNome() {
        return "Codificador de Código Morse";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 8, 14);
    }

    public int getNivelSeguranca(){//teria que ver bem isso
        return 1;
    }


    public Hashtable<Character, String> letraMorse(){
        Hashtable<Character, String> letraMorse = new Hashtable<>();
        //minúsculas
        letraMorse.put('a', ".– ");
        letraMorse.put('b', "–... ");
        letraMorse.put('c', "–.–. ");
        letraMorse.put('d', "–.. ");
        letraMorse.put('e', ". ");
        letraMorse.put('f', "..–. ");
        letraMorse.put('g', "––. ");
        letraMorse.put('h', ".... ");
        letraMorse.put('i', ".. ");
        letraMorse.put('j', ".––– ");
        letraMorse.put('k', "–.– ");
        letraMorse.put('l', ".–.. ");
        letraMorse.put('m', "–– ");
        letraMorse.put('n', "–. ");
        letraMorse.put('o', "––– ");
        letraMorse.put('p', ".––. ");
        letraMorse.put('q', "––.– ");
        letraMorse.put('r', ".–. ");
        letraMorse.put('s', "... ");
        letraMorse.put('t', "– ");
        letraMorse.put('u', "..– ");
        letraMorse.put('v', "...– ");
        letraMorse.put('w', ".–– ");
        letraMorse.put('x', "–..– ");
        letraMorse.put('y', "–.–– ");
        letraMorse.put('z', "––.. ");

        //Maiúsculas
        letraMorse.put('A', ".– ");
        letraMorse.put('B', "–... ");
        letraMorse.put('C', "–.–. ");
        letraMorse.put('D', "–.. ");
        letraMorse.put('E', ". ");
        letraMorse.put('F', "..–. ");
        letraMorse.put('G', "––. ");
        letraMorse.put('H', ".... ");
        letraMorse.put('I', ".. ");
        letraMorse.put('J', ".––– ");
        letraMorse.put('K', "–.– ");
        letraMorse.put('L', ".–.. ");
        letraMorse.put('M', "–– ");
        letraMorse.put('N', "–. ");
        letraMorse.put('O', "––– ");
        letraMorse.put('P', ".––. ");
        letraMorse.put('Q', "––.– ");
        letraMorse.put('R', ".–. ");
        letraMorse.put('S', "... ");
        letraMorse.put('T', "– ");
        letraMorse.put('U', "..– ");
        letraMorse.put('V', "...– ");
        letraMorse.put('W', ".–– ");
        letraMorse.put('X', "–..– ");
        letraMorse.put('Y', "–.–– ");
        letraMorse.put('Z', "––.. ");
        letraMorse.put(' ', "_ ");
        return letraMorse;
    }

public Hashtable<String, Character> morseLetra(){
        Hashtable<String, Character> morseLetra = new Hashtable<>();
        /*minúsculas
        morseLetra.put(".– ",'a');
        morseLetra.put("–... ",'b');
        morseLetra.put("–.–. ",'c');
        morseLetra.put("–.. ",'d');
        morseLetra.put(". ",'e');
        morseLetra.put("..–. ",'f');
        morseLetra.put("––. ",'g');
        morseLetra.put(".... ",'h');
        morseLetra.put(".. ",'i');
        morseLetra.put(".––– ",'j');
        morseLetra.put("–.– ",'k');
        morseLetra.put(".–.. ",'l');
        morseLetra.put("–– ",'m');
        morseLetra.put("–. ",'n');
        morseLetra.put("––– ",'o');
        morseLetra.put(".––. ",'p');
        morseLetra.put("––.– ",'q');
        morseLetra.put(".–. ",'r');
        morseLetra.put("... ",'s');
        morseLetra.put("– ",'t');
        morseLetra.put("..– ",'u');
        morseLetra.put("...– ",'v');
        morseLetra.put(".––  ",'w');
        morseLetra.put("–..– ",'x');
        morseLetra.put("–.–– ",'y');
        morseLetra.put("––.. ",'z');*/
        //MAIÚSCULA
        morseLetra.put(".– ",'A');
        morseLetra.put("–... ",'B');
        morseLetra.put("–.–. ",'C');
        morseLetra.put("–.. ",'D');
        morseLetra.put(". ",'E');
        morseLetra.put("..–. ",'F');
        morseLetra.put("––. ",'G');
        morseLetra.put(".... ",'H');
        morseLetra.put(".. ",'I');
        morseLetra.put(".––– ",'J');
        morseLetra.put("–.– ",'K');
        morseLetra.put(".–.. ",'L');
        morseLetra.put("–– ",'M');
        morseLetra.put("–. ",'N');
        morseLetra.put("––– ",'O');
        morseLetra.put(".––. ",'P');
        morseLetra.put("––.– ",'Q');
        morseLetra.put(".–. ",'R');
        morseLetra.put("... ",'S');
        morseLetra.put("– ",'T');
        morseLetra.put("..– ",'U');
        morseLetra.put("...– ",'V');
        morseLetra.put(".–– ",'W');
        morseLetra.put("–..– ",'X');
        morseLetra.put("–.–– ",'Y');
        morseLetra.put("––.. ",'Z');
        morseLetra.put("_ ",' ');
        return morseLetra;
    }


    public String codifica(String str){
        StringBuilder encoded = new StringBuilder();
        Hashtable<Character, String> codMorse = letraMorse();

        for (char c : str.toCharArray()){
                encoded.append(codMorse.get(c));
        }
        return encoded.toString();
    }

    public String decodifica(String str){
        StringBuilder encoded = new StringBuilder();
        StringBuilder morse = new StringBuilder();
        Hashtable<String, Character> codMorse = morseLetra();

        for (char c : str.toCharArray()) {
            morse.append(c);
            if (c==' '){
                    encoded.append(codMorse.get(morse.toString()));
                    morse.setLength(0);
            }
            
        }
        
        return encoded.toString();
    }
}