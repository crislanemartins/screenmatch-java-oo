package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import javax.sound.midi.Soundbank;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal () {
        return this.tempoTotal;
    }

//    public void inclui (Filme f) {
//        this.tempoTotal += f.getDuracaoEmMinuto();
//    }
//
//
//    public void inclui (Serie s) {
//        this.tempoTotal += s.getDuracaoEmMinuto();
//    }

    public void inclui (Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinuto();
    }

}
