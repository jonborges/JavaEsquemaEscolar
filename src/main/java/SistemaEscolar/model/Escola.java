package main.java.SistemaEscolar.model;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String codigo;
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Boletim> boletins;

    public Escola(String nome, ArrayList<Turma> turmas, String codigo, ArrayList<Aluno> alunos, ArrayList<Professor> professores, ArrayList<Disciplina> disciplinas, ArrayList<Boletim> boletins) {
        this.nome = nome;
        this.turmas = turmas;
        this.codigo = codigo;
        this.alunos = alunos;
        this.professores = professores;
        this.disciplinas = disciplinas;
        this.boletins = boletins;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Boletim> getBoletins() {
        return boletins;
    }

    public void setBoletins(ArrayList<Boletim> boletins) {
        this.boletins = boletins;
    }

    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", turmas=" + turmas +
                ", alunos=" + alunos +
                ", professores=" + professores +
                ", disciplinas=" + disciplinas +
                ", boletins=" + boletins +
                '}';
    }
}
