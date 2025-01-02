import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {

  Menu() {
    MenuMaker menumakers = new MenuMaker();
    Scanner scanner = new Scanner(System.in);
    ArrayList<Baba> babas = new ArrayList<>();
    BabasOnline babaEncontrada = new BabasOnline();
    ArrayList<Crianca> kids = new ArrayList<>();

    Random rand = new Random();

    do {
      // Exibir o menu principal
      menumakers.fazerMenu("Menu de Delivery Babá",
          "Contratar Babás",
          "Verificar Babás",
          "Demitir Babás",
          "Babás Cuidando",
          "ADM || Criar Babá",
          "ADM || consolelog");
      // Instanciar scanner do menu Principal
      int escolhaMenuMain = scanner.nextInt();

      // Escolhas do Menu
      switch (escolhaMenuMain) {

        case 1:
          System.out.println("\nUma babá foi encontrada");
          babaEncontrada.gerarBaba();
          babaEncontrada.getBabaOnline();

          System.out.println("Nome: " + babaEncontrada.getNomeBabaEscolhido());
          System.out.println("Idade: " + babaEncontrada.getIdadeBabaEscolhido());
          System.out.println("CPF: " + babaEncontrada.getCpfBabaEscolhido());
          System.out.println("Telefone: " + babaEncontrada.getTelefoneBabaEscolhido());
          System.out.println("Endereço: Rua " + babaEncontrada.getRuaBabaEscolhido() + ", Bairro "
              + babaEncontrada.getBairroBabaEscolhido());
          System.out.println("Salario: " + babaEncontrada.getSalarioBabaEscolhido());
          System.out.println("Trabalho: " + "Repouso");

          System.out.println("\nDeseja contratá-la?");
          System.out.println("[11] - Sim");
          System.out.println("[22] - Não");
          int escolhaMenuPrimeiro = scanner.nextInt();

          switch (escolhaMenuPrimeiro) {
            case 11:
              String[] enderecoBabaOnline = { babaEncontrada.getRuaBabaEscolhido(),
                  babaEncontrada.getBairroBabaEscolhido() };
              // Instanciar baba e colocar na lista
              Baba babaOnline = new Baba(babaEncontrada.getNomeBabaEscolhido(), babaEncontrada.getIdadeBabaEscolhido(),
                  babaEncontrada.getCpfBabaEscolhido(),
                  babaEncontrada.getTelefoneBabaEscolhido(), enderecoBabaOnline,
                  babaEncontrada.getSalarioBabaEscolhido(), "Repouso");
              babas.add(babaOnline);
              System.out.println("Babá contratada com sucesso");
              break;
          }

        case 22:
          break;

        case 2:
          System.out.println("\n===== Lista de Babás =====");
          if (babas.isEmpty()) {
            System.out.println("Nenhuma babá cadastrada.");
          } else {
            for (Baba Baba : babas) {
              System.out.println("Nome: " + Baba.getNome());
              System.out.println("Idade: " + Baba.getIdade());
              System.out.println("CPF: " + Baba.getCpf());
              System.out.println("Telefone: " + Baba.getTelefone());
              System.out.println("Endereço: Rua " + Baba.getEndereco()[0] + ", Bairro " + Baba.getEndereco()[1]);
              System.out.println("Salario: " + Baba.getSalario());
              System.out.println("Trabalho: " + Baba.getTrabalho());
              System.out.println("--------------------------");
            }
          }
          System.out.println();
          break;

        case 3:
          System.out.println("===== Remover Babá =====");
          if (babas.isEmpty()) {
            System.out.println("Nenhuma babá cadastrada.");
          } else {
            scanner.nextLine();

            System.out.print("Digite o nome da babá a ser removida: ");
            String nomeRemover = scanner.nextLine();

            boolean babaRemovida = false;
            for (int i = 0; i < babas.size(); i++) {
              Baba baba = babas.get(i);

              if (baba.getNome().equalsIgnoreCase(nomeRemover)) {
                babas.remove(i);
                babaRemovida = true;
                System.out.println("Babá removida com sucesso!");
                break;
              }
            }

            // se o scanner não encontrar na lista um paramêtro equivalente
            if (!babaRemovida) {
              System.out.println("Babá não encontrada.");
            }
          }
          System.out.println();
          break;

        case 4:
          // Fazer um if kids.isEmpty() Futuramente

          // criar um indice aleatorio
          kids.add(new Crianca("Marlene", 11));
          kids.add(new Crianca("Jonas", 10));

          int ii = rand.nextInt(kids.size());

          Crianca criancaPega = kids.get(ii);

          if (babas.isEmpty()) {
            System.out.println("Nenhuma babá cadastrada.");
          } else {
            for (int i = 0; i < babas.size(); i++) {
              Baba babaPega = babas.get(i);
              System.out.println("A babá " + babaPega.getNome() + " está trabalhando."
                  + " A criança cuidada é: " + criancaPega.getNomeCrianca() + " de "
                  + criancaPega.getIdadeCrianca() + " anos");
              // Fazer um remove ii Futuramente
              i = +8;
            }

          }
          break;

        case 5:
          scanner.nextLine(); // Limpar o buffer do scanner

          System.out.print("Digite o nome da Babá: ");
          String nome = scanner.nextLine();

          System.out.print("Digite a idade da Babá: ");
          String idade = scanner.nextLine();

          System.out.print("Digite o CPF da Babá: ");
          String cpf = scanner.nextLine();

          System.out.print("Digite o telefone da Babá: ");
          String telefone = scanner.nextLine();

          System.out.print("Digite a rua do endereço da Babá: ");
          String rua = scanner.nextLine();

          System.out.print("Digite o bairro do endereço da Babá: ");
          String bairro = scanner.nextLine();

          System.out.print("Digite o salario da Babá: ");
          String salario = scanner.nextLine();

          String[] endereco = { rua, bairro };

          Baba novaBaba = new Baba(nome, idade, cpf, telefone, endereco,
              salario, "Repouso");
          babas.add(novaBaba);

          System.out.println("Babá cadastrada com sucesso");
          break;

        case 6:
           System.out.println("Teste");
           break;

        case 7:
          break;

        default:
          System.out.println("Opção inválida! Tente novamente.");
          continue;
      }

      if (escolhaMenuMain == 7) {
        break;
      }

    } while (true);

    scanner.close();
  }
}
