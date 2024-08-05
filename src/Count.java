import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Type the first parameter:");
		int firstParameter = terminal.nextInt();
		System.out.println("Type the second parameter:");
		int secondParameter = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de counting
			counter(firstParameter, secondParameter);
		
		}catch (InvalidParametersException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("ERROR: The first number must be lower than the second!");
		}
		
	}
	static void counter(int firstParameter, int secondParameter ) throws InvalidParametersException {
		//validar se firstParameter é MAIOR que secondParameter e lançar a exceção
		if (firstParameter > secondParameter) {

			throw new InvalidParametersException();

		} else {	

			int counting = secondParameter - firstParameter;
			int index = 1;
			//realizar o for para imprimir os números com base na variável counting
			for (int i = counting; i > 0; i --) {
				System.out.println("Printing number: " + index);
				index ++;
			}
		}
	}
}