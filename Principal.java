package trabalholucas;

/**
 *
 * @author aluno
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vendedor u1 = new Vendedor();
        Cliente c1 = new Cliente();
        
        u1.menu();
        c1.addCarrinho();
        
    }
    
}
