package trabalholucas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Vendedor{
    
    public void menu(){
         String [] opcao = {"Cadastrar produtos"};
             
             
        int op = JOptionPane.showOptionDialog(null, "Cadastre seus produtos:", "Vendedor", 0, JOptionPane.QUESTION_MESSAGE, null,opcao,"");
        switch (op){
           case 0:
               this.cadastrarProduto();
               break;
           default:
               throw new AssertionError();
       }
    }
    public void formulario(){
        JOptionPane.showMessageDialog(null, "Deu certo");
        
        
        
    }
      
    public void cadastrarProduto(){
        
        int qtdprodutos = Integer.parseInt(JOptionPane.showInputDialog("Quantos produtos vc deseja cadastrar?"));
        String [] arrayprodutos = new String [qtdprodutos];
        String [] arrayvalores = new String [qtdprodutos];
        
       
        for(int i = 0; i < arrayprodutos.length; i++){
            String input = JOptionPane.showInputDialog("Quais os produtos?");
            arrayprodutos[i] = input;
            
            
                
        }
        for(int i = 0; i < arrayvalores.length; i++){
                    String valores = JOptionPane.showInputDialog("Qual o valor do(a): "+arrayprodutos[i]+"?");
                    arrayvalores[i] = valores;
                }
        
        StringBuilder sb = new StringBuilder();
        sb.append("Produtos cadastrados:\n ");
        for(int i = 0; i < arrayprodutos.length; i++){
            sb.append("\n"+arrayprodutos[i]);
            sb.append("  "+arrayvalores[i]+" R$");  
            }
         JOptionPane.showMessageDialog(null, sb.toString()); 
    }
    public void receberPagamento(){
        
    }
   
}
