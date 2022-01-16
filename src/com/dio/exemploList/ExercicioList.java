package com.dio.exemploList;

import java.util.*;

public class ExercicioList {
    public static void main(String[] args) {
//        List<Temperaturas> temperaturas = new ArrayList<>(){{
//            add(new Temperaturas(35.5d, "Janeiro"));
//            add(new Temperaturas(37.8d, "Fevereiro"));
//            add(new Temperaturas(42.5d, "Março"));
//            add(new Temperaturas(38.9d, "Abril"));
//            add(new Temperaturas(35.4d, "Maio"));
//            add(new Temperaturas(12.6d, "Junho"));
//        }};
//
//        System.out.println(temperaturas);
//
//        System.out.println("--- media semestral --- ");
//        Iterator<Temperaturas> iterator = temperaturas.iterator();
//        double soma = 0d;
//        while (iterator.hasNext()){
//            double temp = iterator.next().getTemperaturaMedia();
//            soma += temp;
//        }
//        double media = (soma / temperaturas.size());
//        System.out.println("Media:" + media);
//        //percorrer list
//        for (int i = 0; i <= temperaturas.size(); i++) {
//            if(temperaturas.get(i).getTemperaturaMedia() < media){
//                System.out.println(temperaturas.remove(i));
//            }
//        }
//        System.out.println(temperaturas);
        Scanner scanner = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        System.out.println("1 - Telefone para a vitima?");
        respostas.add(scanner.next());
        System.out.println("2 - Esteve local do crime?");
        respostas.add(scanner.next());
        System.out.println("3 - Mora perto da vitima?");
        respostas.add(scanner.next());
        System.out.println("4 - Devia para a vitima?");
        respostas.add(scanner.next());
        System.out.println("5 - Ja trabalhou com a vitima?");
        respostas.add(scanner.next());

        int sim = 0;
        for (int i = 0; i < respostas.size(); i++){
            if(respostas.get(i).toString().equals("sim")){
                sim++;
            }
        }
        if (sim == 2){
            System.out.println("Suspeita");
        }else if(sim >= 3 && sim <= 4){
            System.out.println("Cumplice");
        }else if(sim == 5){
            System.out.println("Assassina");
        }else{
            System.out.println("Inocente");
        }
    }

}

class Temperaturas {
    private Double temperaturaMedia;
    private String mes;

    public Temperaturas(Double temperaturaMedia, String mes) {
        this.temperaturaMedia = temperaturaMedia;
        this.mes = mes;
    }

    public Double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(Double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Temperaturas{" +
                "temperaturaMedia=" + temperaturaMedia +
                ", mes='" + mes + '\'' +
                '}';
    }
}
