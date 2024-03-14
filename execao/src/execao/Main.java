package execao;

/**
 *
 * @author Walisson
 */
public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 2;
        /*int div = n1/n2;
        System.out.println("A divisão é: " + div);*/
        //Não dá pra dividir por 0, então o java tem um negócio pra isso:
        //tipo do erro: ArithmeticException
        //Modo correto:
        try {
           int div = n1/n2;
        System.out.println("A divisão é: " + div); 
        } catch (ArithmeticException ae){
            System.out.println("Deu erro ;-;");
        }
        //Frase sem frase:
            String frase = null;
        try {
            metodoMaiuculo(frase);
        } catch (NullPointerException npe){
            System.out.println("Deu erro de novo ;-;");
        } finally {
            System.out.println("Esse comando sempre será executado!!");
        }
        //O comando "throws" é meio bugado de fazer mas eu acho que entendi
    }
    public static void metodoMaiuculo(String frase)throws NullPointerException{
        String fraseMaiuscula = null;
        fraseMaiuscula = frase.toUpperCase();
        System.out.println("A frase normal: " + frase);
        System.out.println("A frase toda em maiúscula: " + fraseMaiuscula);        
    }
    
}
