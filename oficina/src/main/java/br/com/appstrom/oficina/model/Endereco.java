package br.com.appstrom.oficina.model;

public class Endereco {

    private Integer id;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private Estado estado;
    
    public Endereco(){
    }
    
    public Endereco(String cep, String logradouro, String numero, String bairro, String cidade, Estado estado){
        
        this(null, cep, logradouro, numero, bairro, cidade, estado);
    }
    
    public Endereco(Integer id, String cep, String logradouro, String numero, String bairro, String cidade, Estado estado){
        this.id = id;
        setCep(cep);
        setLogradouro(logradouro);
        setNumero(numero);
        setBairro(bairro);
        setCidade(cidade);
        this.estado = estado;
    }
          
    public Integer getId(){
        return id;
    }
       
    public String getCep(){
        return cep;
    }
            
    public String getLogradouro(){
        return logradouro;
    }
        
    public String getNumero(){
        return numero;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public Estado getEstado(){
        return estado;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public void setCep(String cep){
        if(cep.isEmpty()){
            throw new IllegalArgumentException("CEP não pode ser vazio");
        }
        this.cep = cep;
    }
    
    public void setLogradouro(String logradouro){
       
        if(logradouro.isEmpty()){
            throw new IllegalArgumentException("Logradouro não pode ser vazio");
        } 
        this.logradouro = logradouro;
    }
    
    public void setNumero(String nuemro){
        if(numero.isEmpty()){
            throw new IllegalArgumentException("Numero não pode ser vazio");
        }
        this.numero = nuemro;
    }
    
    public void setBairro(String bairro){
        if(bairro.isEmpty()){
            throw new IllegalArgumentException("Bairro não pode ser vazio");
        }
        this.bairro = bairro;
    }
    
    public void setCidade(String cidade){
        if(cidade.isEmpty()){
            throw new IllegalArgumentException("Cidade não pode ser vazio");
        }
        this.cidade = cidade;
    }
    
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    
    
    
}