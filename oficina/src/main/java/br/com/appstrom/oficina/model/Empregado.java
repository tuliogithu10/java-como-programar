package br.com.appstrom.oficina.model;

import java.time.LocalDate;

public class Empregado {

    public final String GERENTE = "Gerente";
    public final String SECRETARIA = "Secretaria";
    public final String MECANICO = "Mecânico";
    
    private Integer id;
    private String nome;
    private Double salario;
    private String cargo;
    private String cpf;
    private String rg;
    private String pis;
    private String carteiraTrabalho;
    private LocalDate dataNascimento;
    private LocalDate dataContratacao;
    private LocalDate dataDesligamento;
    
    public Empregado(){
    }
    
    public Empregado(String nome, Double salario, String cargo, String cpf, String rg, String pis, 
            String carteiraTrabalho, LocalDate dataNascimento, LocalDate dataContratacao){
        
        this(null, nome, salario, cargo, cpf, rg, pis, carteiraTrabalho, dataNascimento, dataContratacao);
    }
    
     public Empregado(Integer id, String nome, Double salario, String cargo, String cpf, String rg, String pis, 
            String carteiraTrabalho, LocalDate dataNascimento, LocalDate dataContratacao){
       
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.cpf = cpf;
        this.rg = rg;
        this.pis = pis;
        this.carteiraTrabalho = carteiraTrabalho;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao; 
    }
    
    public Integer getId(){
        return id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Double getSalario(){
        return salario;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getRg(){
        return rg;
    }
    
    public String getPis(){
        return pis;
    }
    
    public String getCarteiraTrabalho(){
        return carteiraTrabalho;
    }
    
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    
    public LocalDate getDataContratacao(){
        return dataContratacao;
    }
    
    public LocalDate getDataDesligamento(){
        return dataDesligamento;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSalario(Double salario){
        this.salario = salario;
    }
    
    public void setCargo(String cargo){
         this.cargo = cargo;
    }  
    
    public void setCpf(String cpf){
       this.cpf = cpf; 
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public void setPis(String pis){
        this.pis = pis;
    }
    
    public void setCarteiraTrabalho(String carteiraTrabalho){
        this.carteiraTrabalho = carteiraTrabalho;
    }
    
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public void setDataContratacao(LocalDate dataContratacao){
        this.dataContratacao = dataContratacao;
    }
    
    public void setDataDesligamento(LocalDate dataDesligamento){
        this.dataDesligamento = dataDesligamento;
    }
    
    
}