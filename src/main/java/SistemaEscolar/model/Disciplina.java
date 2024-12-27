package main.java.SistemaEscolar.model;

import java.util.ArrayList;

public class Disciplina {
    private String codigo;
    private ArrayList<Aluno> alunos;
    private Professor professor;
    private ArrayList<Boletim> boletins;

    public Disciplina(String codigo, ArrayList<Boletim> boletins, Professor professor, ArrayList<Aluno> alunos) {
        this.codigo = codigo;
        this.boletins = boletins;
        this.professor = professor;
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "codigo='" + codigo + '\'' +
                ", alunos=" + alunos +
                ", professor=" + professor +
                ", boletins=" + boletins +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Boletim> getBoletins() {
        return boletins;
    }

    public void setBoletins(ArrayList<Boletim> boletins) {
        this.boletins = boletins;
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }

    public void pesquisarAluno(String nome, String codigo){

    }

    public void adicionarBoletim(Boletim boletim){
        boletins.add(boletim);
    }

    public void removerBoletim(Boletim boletim){
        boletins.remove(boletim);
    }
}
