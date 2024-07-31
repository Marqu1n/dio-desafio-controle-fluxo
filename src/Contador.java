import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try{

            Scanner terminal = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException ex)
        {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem;i++){
            System.out.println(String.format("Imprimindo o número %d",i));
        }
	}
}

class ParametrosInvalidosException extends Exception {

    ParametrosInvalidosException(){
        super();
    }

    ParametrosInvalidosException(String msg){
        super(msg);
    }
}
