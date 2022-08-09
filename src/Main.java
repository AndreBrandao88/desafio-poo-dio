
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
        mentoria.setDesricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());
        
        
        
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        
        // TODO code application logic here
    }
    
}
