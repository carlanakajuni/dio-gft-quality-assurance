import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

// [1] criação das classes Curso e Mentoria
// [2] criação dos objetos a partir da classe Main (curso1, curso2 e mentoria

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarla = new Dev();
        devCarla.setNome("Carla");
        devCarla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carla: " + devCarla.getConteudosInscritos());
        devCarla.progredir();
        devCarla.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carla: " + devCarla.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carla: " + devCarla.getConteudosConcluidos());
        System.out.printf("XP:" + devCarla.calcularTotalXp());

        System.out.println("\n-------------------");

        Dev devElizabete = new Dev();
        devElizabete.setNome("Elizabete");
        devElizabete.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Elizabete: " + devElizabete.getConteudosInscritos());
        devElizabete.progredir();
        devElizabete.progredir();
        devElizabete.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Elizabete: " + devElizabete.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Elizabete: " + devElizabete.getConteudosConcluidos());
        System.out.printf("XP:" + devElizabete.calcularTotalXp());

    }
}