
package br.com.dio.desafio.dominio;

/**
  * @author André Brandão
 */
public class Curso {
    
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public Curso() {
    }
    
    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

       
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
    
}