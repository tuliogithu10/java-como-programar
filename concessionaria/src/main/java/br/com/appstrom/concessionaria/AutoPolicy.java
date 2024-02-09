
package br.com.appstrom.concessionaria;


public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;
    
    public AutoPolicy(int accountnumber, String makeAndModel, String state){
         this.accountNumber = accountnumber;
         this.makeAndModel = makeAndModel;
         this.state = state;
    }
    
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
     public int getAccountNumber(){
         return accountNumber;
     }
    
     
     public void setMakeAndModel(String makeAndModel){
         this.makeAndModel = makeAndModel;
     }
     
     public String getMakeAndModel(){
         return makeAndModel;
     }
     
    public void setState(String state) {
        this.state = state;
    }
    
    public String getState() {
        return state;
    }
    
    public boolean isNoFaultState(){
        boolean noFaultState;
    
        // determina se o estado tem seguros de automóvel “sem culpa”
        switch (getState()) // obtém a abreviatura do estado do objeto AutoPolicy
        {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
  
        return noFaultState;
    }
} 
   

