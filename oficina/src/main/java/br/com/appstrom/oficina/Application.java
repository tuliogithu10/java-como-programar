package br.com.appstrom.oficina;

import br.com.appstrom.oficina.model.Empregado;
import br.com.appstrom.oficina.model.Endereco;
import br.com.appstrom.oficina.model.Estado;




public class Application {

    public static void main(String[] args) {
      
     Endereco endereco1 = new Endereco("33236-522", "Alameda das figueiras", "310", "Visão", "Lagoa Santa", Estado.MINAS_GERAIS);
     
     Endereco endereco2 = new Endereco();
     endereco2.setCep("22420-006");
     endereco2.setLogradouro("Avenida Vieira Souto");
     endereco2.setNumero("3142");
     endereco2.setBairro("Ipanema");
     endereco2.setCidade("Rio de Janeiro");
     endereco2.setEstado(Estado.RIO_DE_JANEIRO);
    
        System.out.println(endereco1);
        System.out.println(endereco2);
        
    }
}
