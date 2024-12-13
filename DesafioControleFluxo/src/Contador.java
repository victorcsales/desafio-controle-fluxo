import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNumero = scanner.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O primeiro numero não deve ser maior que o segundo");

        }
    }

    static void contar(int primeiroNumero, int segundoNumero ) throws ParametrosInvalidosException {

        if (primeiroNumero>segundoNumero) {
            throw new ParametrosInvalidosException();
            
        }else{

            int numeroIteracoes = segundoNumero-primeiroNumero;
            System.out.println("Numero de interações: " + numeroIteracoes);

        }
        
    }
}