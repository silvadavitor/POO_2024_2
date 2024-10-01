/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author vitor-nuvme
 */
public class Turma {
    private String disciplina;
    private Professor professor;
    private Turno turno;
    private ArrayList<Aluno> alunos;

    
    public Turma (){
        this.alunos = new ArrayList<>();
    }
    public String getDisciplina() {
        return disciplina;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }


    
    public void incluirAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        alunos.remove(aluno);
    }
    
    public Aluno obterAlunoMelhorNotaEnem() {
        if (alunos.isEmpty()) {
            return null;  
        }
        
        // Assume que o aluno com a maior nota é o primeiro
        Aluno melhorNota = alunos.get(0);  
        
        // Varre o arraylist alunos comparando a nota deles, se for maior guarda na env alunoMelhorNota
        for (Aluno aluno : alunos) {
            if (aluno.getNotaEnem() > melhorNota.getNotaEnem()) {
                melhorNota = aluno; 
            }
        }
        // Retorna a env alunoMelhorNota
        return melhorNota;
    }
}
