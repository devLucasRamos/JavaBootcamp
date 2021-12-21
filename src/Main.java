import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
