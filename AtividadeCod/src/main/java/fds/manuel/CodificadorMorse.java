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
        letraMorse.put('w', ".– ");
        letraMorse.put('x', "–..– ");
        letraMorse.put('y', "–.–– ");
        letraMorse.put('z', "––.. ");
        return letraMorse;
    }



    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            encoded.append((char) (c + 1));
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            encoded.append((char) (c - 1));
        }
        
        return encoded.toString();
    }
}