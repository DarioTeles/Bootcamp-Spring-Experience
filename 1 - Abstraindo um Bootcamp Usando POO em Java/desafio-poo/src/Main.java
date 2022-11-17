import com.outlook.teles.dario.dominio.Bootcamp;
import com.outlook.teles.dario.dominio.Curso;
import com.outlook.teles.dario.dominio.Dev;
import com.outlook.teles.dario.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descricao Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev1");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Dev1 : " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Dev1 : " + dev1.getConteudosConcluidos());
        System.out.println("Progredir Dev1");
        dev1.progredir();
        System.out.println("Conteúdos inscritos Dev1 : " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Dev1 : " + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Dev2");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Dev2 : " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Dev2 : " + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());
    }
}
