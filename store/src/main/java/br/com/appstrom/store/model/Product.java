package br.com.appstrom.store.model;

import java.time.LocalDate;

public class Product {
    
    private Long id;
    private String name;
    private Double price;
    private String brand;
    private LocalDate fabricationDate;
    
    public Product(){
    }
    
    public Product(Long id, String name, Double price, String brand, LocalDate fabricationDate){
        
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.fabricationDate = fabricationDate; 
    }
    
   public Product(String name, Double price, String brand, LocalDate fabricationDate){
       
       this.name = name;
       this.price = price;
       this.brand = brand;
       this.fabricationDate = fabricationDate;
   }
   
   public  void setId(Long id){
       this.id = id;
   }
   
   public void setName(String name){
       
       if(name.isEmpty()){
           throw new IllegalArgumentException("Value Invalid");
       }
       this.name = name;
   }
   
   public void setPrice(Double price){
       this.price = price;
   }

   public void setBrand(String brand){
       this.brand = brand;
   }
    
   public void setFabricationDate(LocalDate fabricationDate){
       this.fabricationDate = fabricationDate;
   }
    
  public Long getId(){
      return id;
  } 
  
  public String getName(){
      return name;
  }
  
  public Double getPrice(){
      return price;
  }
           
  public String getBrand(){
      return brand;
  }
  
  public LocalDate getFabricationDate(){
      return fabricationDate;
  }
  
}