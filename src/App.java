import java.util.Scanner;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá, serei seu assistente na criacao da sua conta no banco Database!");
        System.out.println("Por favor digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Por favor " + nome + " insira o seu CPF sem espaço, virgulas ou pontos");
        long cpf = Long.parseLong(input.nextLine());
        System.out.println(nome + " preciso que você me informe seu melhor Email");
        String email;
        email = input.nextLine();
        System.out.println("Agora digite sua data de nascimento sem espaço nem virgulas ou / no formato 'ddmmaa'");
        Integer dataDeNascimento = Integer.parseInt(input.nextLine());
        System.out.println("Para finalizar o seu cadastro escolha uma senha forte contendo letras e números");
        String senha = input.nextLine();
        System.out.println("Obrigado " + nome + " Seu cadastro está concluido! Ative sua conta confirando o Email enviado para " + email);
    }
}
