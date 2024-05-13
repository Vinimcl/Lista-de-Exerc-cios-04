package br.edu.up;

public class Livro {

private String codigo;
private String titulo;
private String autores;
private String ISBN;
private int ano;

public Livro(String codigo, String titulo, String autores, String ISBN, int ano) {
    this.codigo = codigo;
    this.titulo = titulo;
    this.autores = autores;
    this.ISBN = ISBN;
    this.ano = ano;
}

public String getCodigo() {
    return codigo;
}

public void setCodigo(String codigo) {
    this.codigo = codigo;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutores() {
    return autores;
}

public void setAutores(String autores) {
    this.autores = autores;
}

public String getISBN() {
    return ISBN;
}

public void setISBN(String ISBN) {
    this.ISBN = ISBN;
}

public int getAno() {
    return ano;
}

public void setAno(int ano) {
    this.ano = ano;
}

public void exibirInformacoes() {
    System.out.println("Código: " + codigo);
    System.out.println("Título: " + titulo);
    System.out.println("Autores: " + autores);
    System.out.println("ISBN: " + ISBN);
    System.out.println("Ano: " + ano);
    System.out.println();
}
}