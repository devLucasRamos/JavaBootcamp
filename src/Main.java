import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: curso legal quase parece c#");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descrição: curso legal");
        curso2.setCargaHoraria(16);

        mentoria.setTitulo("Curso C#");
        mentoria.setDescricao("Descrição: curso legal");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ devCamila.getConteudosInscritos());
        devCamila.progredir();

        System.out.println("Conteudos Inscritos: "+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularXp());

        Dev devRenato = new Dev();
        devRenato.setNome("Renato");
        devRenato.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: "+ devRenato.getConteudosInscritos());
        devRenato.progredir();

        System.out.println("Conteudos Inscritos: "+ devRenato.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: "+ devRenato.getConteudosConcluidos());
        System.out.println("XP: "+devRenato.calcularXp());
    }
}


