package br.com.gustavoromao.minhasmusica.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado um sucesso e o mais prederido!");
        } else {
            System.out.println(audio.getTitulo() + " também é uma ótima opção!");
        }
    }
}
