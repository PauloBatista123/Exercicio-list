package com.dio.exemploList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdencaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("john", 33, "Preto"));
            add(new Gato("simba", 6, "tigrado"));
            add(new Gato("jon", 12, "branco"));
        }};

        System.out.println("Ordem de inserção: " + gatos);
        System.out.println("Ordem aleatoria");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println("Ordem natural");
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println("Ordem");
        Collections.sort(gatos, new CompartorIdade());
        System.out.println(gatos);
        Collections.sort(gatos, new CompartorCor());
        System.out.println(gatos);
        Collections.sort(gatos, new ComparatorNomeCOrIdade());
        System.out.println(gatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    //comparação por nome
    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}

class CompartorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}

class CompartorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeCOrIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato o1, Gato o2) {
        int nome = o1.getNome().compareToIgnoreCase(o2.getNome());
        if(nome != 0) return nome;

        int cor = o1.getCor().compareToIgnoreCase(o2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}