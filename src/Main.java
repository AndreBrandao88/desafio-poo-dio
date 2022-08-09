
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

/**
 *
 * @author André
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso de WEB");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        // TODO code application loggitic here
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();

        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
            System.out.println("---");
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " +devCamila.calcularXp());
        
        System.out.println("------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
            System.out.println("---");
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos" + devJoao.getConteudosConcluidos());
          System.out.println("XP: " +devJoao.calcularXp());

    }

}
