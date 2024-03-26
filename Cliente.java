package trabalholucas;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Cliente extends Vendedor{
    private String nome;
    private String senha;
    private String endereco;
    private int cep;
    private String formaPagamento;
    private float preco;
    private String produto;
    
   

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
     public void addCarrinho(){
         Vendedor v1 = new Vendedor();
        JOptionPane.showMessageDialog(null, "Produtos disponíveis:");
        
        
        //setProduto(JOptionPane.showInputDialog("Qual produto você deseja?"));
    }
    public void finalizarCompra(){
    
    }
    public void formulario(){
        
        
        
        
    }
    
}
