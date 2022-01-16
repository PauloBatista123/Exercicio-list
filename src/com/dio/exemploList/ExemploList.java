package com.dio.exemploList;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Crie uma lista com 7 notas");
        List<Double> notas = new ArrayList<>(); //diamond operator <>

//        for (int i = 0; i <= 7; i++){
//            System.out.println("Digite a nota " + i + ":");
//            notas.add(scan.nextDouble());
//        }
        notas.add(5.5);
        notas.add(5.8);
        notas.add(5.2);
        notas.add(5.4);
        notas.add(5.3);

        System.out.println(notas);
        System.out.println("Exibir a posição 4:" + notas.indexOf(5.4d));
        notas.add(4, 8.0d);
        System.out.println(notas);
        System.out.println("Substitua nota 6:" + notas.set(1, 6.0d));
        System.out.println(notas);
        System.out.println("Nota 5 esta na lista:" + notas.contains(6.0d)); //contem o valor
        System.out.println("Notas na ordem:" + notas); //padrão da list em ordem
        System.out.println("Terceira nota:" + notas.get(3)); //por posição
        System.out.println("Exibir menor nota:" + Collections.min(notas));
        System.out.println("Exibir maior nota:" + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma:" + soma);
        System.out.println("Media:" + (soma / notas.size()));
        System.out.println("Remover:" + notas.remove(0));
    }
}
