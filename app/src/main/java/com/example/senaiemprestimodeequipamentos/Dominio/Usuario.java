package com.example.senaiemprestimodeequipamentos.Dominio;

public class Usuario {
    private int cod_usuario;
    private String nome;
    private String senha;
    private String funcao;
    private String email;

    public Usuario(int cod_usuario, String nome, String senha, String funcao, String email) {
        this.setCod_usuario(cod_usuario);
        this.setNome(nome);
        this.setSenha(senha);
        this.setFuncao(funcao);
        this.setEmail(email);
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
