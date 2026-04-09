import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String savetarefas = "";
		String usertypes;
		String nome = "";
		char opcao;
		int derrotas = 0;
		char modos;
		char comandos;
		char tarefas;
		int deveres = 0;
		int tentativas;
		int num1;
		int num2;
		int partidas = 0;
		int vitorias = 0;
		int easymod = 0;
		int mediummod = 0;
		int hardmod = 0;
		int hardcoremod = 0;
		
		System.out.println("Digite seu nome: ");
		nome = leitor.nextLine();
		
		while(true) {
		System.out.println("\n===ATLAS BOT===");
		
		System.out.println("\nOlá " + nome + " Seja bem vindo!");
		
		System.out.println("Como posso te ajudar hoje " + nome + "?");
		
		System.out.println("\nDigite 1 => que eu terei uma conversa com você pra saber como você esta");
		
		System.out.println("\nDigite 2 => que eu te ajudarei com adição subtração divisão e multiplicação");
		
		System.out.println("\nDigite 3 => que eu te ajudarei a organizar algumas tarefas");
		
		System.out.println("\nDigite 4 => que agente vai jogar um jogo de adivinhação");
		
		System.out.println("\nDigite 5 => que o nosso encontro vai encerrar");
		
		System.out.println("\nDigite um dos comandos mostrados na tela: ");
		comandos = leitor.nextLine().charAt(0);
		switch(comandos) {
			case '1':
			System.out.println("\nOlá " + nome + " como você esta se sentindo agora? (triste, Feliz)?: ");
			usertypes = leitor.nextLine();
			
			if (usertypes.equals("triste")) {
				System.out.println("\nSinto muito que você esteja passando por isso mas " + nome + " isso é normal é uma fase dependentemente que você esteja sentindo é bom conversar com alguem de confiança espero que você fique bem " + nome);
			}
			
			else if (usertypes.equals("feliz")) {
				System.out.println("fico feliz que você esteja bem " + nome);
			}
			
			System.out.println("mas então " + nome + " o que você mais gosta de fazer?: ");
			usertypes = leitor.nextLine();
			
			System.out.println("Que interessante você tem um bom gosto");
			
			System.out.println("\no que você gostaria que tivesse no futuro mas que agora nós não temos?: ");
			
			System.out.println("caramba parece que " + nome + " é um(a) grande pensador(a) do futuro👀");
			
			System.out.println("por mais que a nossa conversa seja curta eu gostei de conversar com você " + nome);
			break;
			
			case '2':
			System.out.println("\n===ATLAS CALCULATOR===");
			System.out.println("1- somar");
			System.out.println("2- subtrair");
			System.out.println("3- Multiplicar");
			System.out.println("4- dividir");
			System.out.println("\nEntão " + nome + "por qual operação nós podemos começar?: ");
			opcao = leitor.nextLine().charAt(0);
			switch(opcao) {
				case '1':
				System.out.println("Digite um numero: ");
				num1 = leitor.nextInt();
				leitor.nextLine();
				
				System.out.println("Digite outro numero: ");
				num2 = leitor.nextInt();
				leitor.nextLine();
				
				System.out.println("Resultado: " + (num1 + num2));
				break;
				
				case '2':
				System.out.println("Digite um numero: ");
				num1 = leitor.nextInt();
				leitor.nextLine();
				
				System.out.println("Digite outro numero: ");
				num2 = leitor.nextInt();
				leitor.nextLine();
				
				System.out.println("Resultado: " + (num1 - num2));
				break;
				
				case '3':
					System.out.println("Digite um numero: ");
				num1 = leitor.nextInt();
				leitor.nextLine();
				
				System.out.println("Digite outro numero: ");
				num2 = leitor.nextInt();
				leitor.nextLine();
				
				System.out.println("Resultado: " + (num1 * num2));
				break;
				
				case '4':
				System.out.println("Digite um numero: ");
				num1 = leitor.nextInt();
				leitor.nextLine();
				
				System.out.println("Digite outro numero: ");
				num2 = leitor.nextInt();
				leitor.nextLine();
				
				if (num2 == 0) {
					System.out.println("Impossivel dividir por 0");
				}
				
				System.out.println("Resultado: " + (num1 / num2));
				break;
				
				default:
				System.out.println("operação invalida!");
			}
			
			case '3':
			System.out.println("\n===ATLAS DEVERES===");
			
			System.out.println("\nBoa escolha " + nome + " Vamos organizar algumas tarefas 👀");
			
			System.out.println("1- salvar uma tarefa/dever");
			
			System.out.println("2- verificar tarefas/deveres salvos");
			
			System.out.println("Escolha uma das opções acima: ");
			tarefas = leitor.nextLine().charAt(0);
			switch (tarefas) {
				case '1':
				System.out.println("Vamos salvar uma Tarefa! " + nome + " Digite a tarefa que você quer guardar");
				savetarefas = leitor.nextLine();
				deveres++;
				break;
				
				case '2':
				System.out.println("Total de tarefas salvas = " + deveres);
				System.out.println("nome das tarefas salvas: " + savetarefas);
				
				if (deveres == 0) {
					System.out.println("Você não salvou nenhuma tarefa por agora");
				}	
			}
			
			case '4':
			System.out.println("\n===ATLAS GUESSING GAME===");
			
			System.out.println("Bora jogar " + nome + "?");
			
			System.out.println("\n1- modo Facil (1/10)");
			
			System.out.println("2- Modo médio (1/50)");
			System.out.println("3- Modo dificil (1/100)");
			System.out.println("4- Modo HARDCORE (1/1000) ");
			System.out.println("5 - ver estatisticas");
			
			System.out.println("\nEscolha um modo " + nome);
			modos = leitor.nextLine().charAt(0);
			switch(modos) {
				case '1':
				int vidas1 = 4;
				int secretnumber1 = (int)(Math.random() * 10) + 1;
				System.out.println("Escolha um numero de (1/10): ");tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber1) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}

else if (tentativas > secretnumber1) {
	System.out.println("Erro! este numero é menor");
	vidas1--;
}

else if (tentativas < secretnumber1) {
	System.out.println("Erro! este numero é maior");
	vidas1--;
}

// 2 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas1);
System.out.println("Escolha outro numero de (1/10): ");tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber1) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}

else if (tentativas > secretnumber1) {
	System.out.println("Erro! este numero é menor");
	vidas1--;
}

else if (tentativas < secretnumber1) {
	System.out.println("Erro! este numero é maior");
	vidas1--;
}

// 3 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas1);
System.out.println("Escolha outro numero de (1/10): ");tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber1) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}

else if (tentativas > secretnumber1) {
	System.out.println("Erro! este numero é menor");
	vidas1--;
}

else if (tentativas < secretnumber1) {
	System.out.println("Erro! este numero é maior");
	vidas1--;
}
// 4 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas1);
System.out.println("Escolha outro numero de (1/10): ");tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber1) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}

else {
	System.out.println("Erro! " + nome + " perdeu no modo facil o numero secreto era = " + secretnumber1);
	derrotas++;
	partidas++;
}
break;

case '2':
int vidas2 = 5;
int secretnumber2 = (int)(Math.random() * 50) + 1;
System.out.println("Escolha um numero de (1/50): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber2) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber2) {
	System.out.println("Erro! este numero é menor");
	vidas2--;
}

else if (tentativas < secretnumber2) {
	System.out.println("Erro! este numero é maior");
	vidas2--;
}

// 2 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas2);

System.out.println("Escolha outro numero de (1/50): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber2) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber2) {
	System.out.println("Erro! este numero é menor");
	vidas2--;
}

else if (tentativas < secretnumber2) {
	System.out.println("Erro! este numero é maior");
	vidas2--;
}
// 3 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas2);

System.out.println("Escolha outro numero de (1/50): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber2) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber2) {
	System.out.println("Erro! este numero é menor");
	vidas2--;
}

else if (tentativas < secretnumber2) {
	System.out.println("Erro! este numero é maior");
	vidas2--;
}
// 4 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas2);

System.out.println("Escolha outro numero de (1/50): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber2) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber2) {
	System.out.println("Erro! este numero é menor");
	vidas2--;
}

else if (tentativas < secretnumber2) {
	System.out.println("Erro! este numero é maior");
	vidas2--;
}
// 5 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas2);

System.out.println("Escolha outro numero de (1/50): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber2) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else {
	System.out.println("Erro! " + nome + " perdeu no modo Medio o numero secreto era = " + secretnumber2);
	derrotas++;
	partidas++;
}
break;

case '3':
int vidas3 = 7;
int secretnumber3 = (int)(Math.random() * 100) + 1;
// 1 TENTATIVA
System.out.println("Escolha um numero de (1/100): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber3) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}
else if (tentativas > secretnumber3) {
			System.out.println("Erro! este numero é menor");
			vidas3--;
}
else if (tentativas < secretnumber3) {
			System.out.println("Erro! este numero é maior");
			vidas3--;
}

// 2 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas3);
System.out.println("Escolha outro numero de (1/100): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber3) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}
else if (tentativas > secretnumber3) {
			System.out.println("Erro! este numero é menor");
			vidas3--;
}
else if (tentativas < secretnumber3) {
			System.out.println("Erro! este numero é maior");
			vidas3--;
}
// 3 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas3);
System.out.println("Escolha outro numero de (1/100): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber3) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}
else if (tentativas > secretnumber3) {
			System.out.println("Erro! este numero é menor");
			vidas3--;
}
else if (tentativas < secretnumber3) {
			System.out.println("Erro! este numero é maior");
			vidas3--;
}
// 4 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas3);
System.out.println("Escolha outro numero de (1/100): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber3) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}
else if (tentativas > secretnumber3) {
			System.out.println("Erro! este numero é menor");
			vidas3--;
}
else if (tentativas < secretnumber3) {
			System.out.println("Erro! este numero é maior");
			vidas3--;
}
// 5 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas3);
System.out.println("Escolha outro numero de (1/100): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber3) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}
else if (tentativas > secretnumber3) {
			System.out.println("Erro! este numero é menor");
			vidas3--;
}
else if (tentativas < secretnumber3) {
			System.out.println("Erro! este numero é maior");
			vidas3--;
}
// 6 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas3);
System.out.println("Escolha outro numero de (1/100): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber3) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}
else if (tentativas > secretnumber3) {
			System.out.println("Erro! este numero é menor");
			vidas3--;
}
else if (tentativas < secretnumber3) {
			System.out.println("Erro! este numero é maior");
			vidas3--;
}
// 7 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas3);
System.out.println("Escolha outro numero de (1/100): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber3) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	partidas++;
	vitorias++;
	break;
}
else {
			System.out.println("Erro! " + nome + " Perdeu no Modo Dificil o numero secreto era = " + secretnumber3);
			partidas++;
			derrotas++;
}
break;

case '4':
int vidas4 = 10;
int secretnumber4 = (int)(Math.random() * 1000) + 1;

// 1 TENTATIVA
System.out.println("Escolha um numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 2 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 3 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 4 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 5 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 6 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 7 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 7 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 8 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 9 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else if (tentativas > secretnumber4) {
	System.out.println("Erro! este numero é menor");
	vidas4--;
}

else if (tentativas < secretnumber4) {
	System.out.println("Erro! este numero é maior");
	vidas4--;
}
// 10 TENTATIVA
System.out.println("\nNumero de vidas que " + nome + " possui = " + vidas4);
System.out.println("Escolha outro numero de (1/1000): ");
tentativas = leitor.nextInt();
leitor.nextLine();

if (tentativas == secretnumber4) {
	System.out.println("Parabens pelo acerto ✓ " + nome);
	vitorias++;
	partidas++;
	break;
}

else {
	System.out.println("Erro! " + nome +  " Perdeu no modo HARDCORE o numero secreto era = " + secretnumber4);
	partidas++;
	derrotas++;
}
break;

case '5':
System.out.println("\nEstatisticas do(a) " + nome);

System.out.println("Numero de vitórias = " + vitorias);

System.out.println("Numero de derrotas = " + derrotas);

System.out.println("Numero de partidas = " + partidas);
break;
			}
			
			case '5':
			System.out.println("Tchau " + nome);
			System.exit(0);
	
			
		}
		
		}
		
	}
	
}