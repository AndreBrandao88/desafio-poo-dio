/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 *
 * @author André
 */
public class Mentoria {
    
    private String titulo;
    private String desricao;
    private LocalDate data;

    public Mentoria() {
    }
    
    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDesricao(String desricao) {
        this.desricao = desricao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public String getDesricao() {
        return desricao;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + titulo + ", desricao=" + desricao + ", data=" + data + '}';
    }
    
    
    
    
}
