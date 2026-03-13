// Nesse desafio aprendi sobre StringBuilder e outras funcoes que não conhecia
// como a indexOf e substring
// Logica para resolucao, foi fazer com que o encode que envia todas strings num array só
// a separacao de palavras vem com um numero que é seu tamanho e depois o caractere #
class Solution {

    public String encode(List<String> strs) {
        StringBuilder pacote = new StringBuilder(); // StringBuilder é um arraylist para strings
        for (String s : strs){
            pacote.append(s.length()); // descubro tamanho da string e coloco ela no StringBuilder
            pacote.append("#");  // caractere # depois do tamanho e antes da palavra
            pacote.append(s);
        }
        return pacote.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0; 
        while ( i < str.length()){
            int j = str.indexOf("#", i); // acho a posicao do caractere identificador
            String textoDoTamanho = str.substring(i,j); // descubro o tamanho do texto, pois recorto substring da posicao do numero ate o #
            int tamanho = Integer.parseInt(textoDoTamanho); // transformo em int
            String palavra = str.substring(j+1, j+1+tamanho); // pego a string depois do caractere # ate o seu final
            strs.add(palavra); 
            i = j+1+tamanho; // pulo para posicao depois do final da string lida e adicionada
        }
        return strs;
    }
}
