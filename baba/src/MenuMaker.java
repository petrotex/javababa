import java.util.ArrayList;

public class MenuMaker {
  // lista que contará as info do menu
  ArrayList<String> listaMenu = new ArrayList<>();

  public int fazerMenu(String... passes) {
    listaMenu = new ArrayList<>();
    // Adicionar opções à lista
    for (String passe : passes) {
      listaMenu.add(passe);
    }
    // Primeiro item da lista será o título e o resto as escolhas do menu
    System.out.println("\n=== " + this.listaMenu.get(0) + " ===");
    this.listaMenu.remove(0); // não imprimir o título
    int numeroMenu = 1; // contador
    for (String i : listaMenu) {
      System.out.println("[" + numeroMenu + "] - " + i);
      numeroMenu += 1; // contador (2)
    }
    System.out.println("[" + numeroMenu + "] - Sair");
    return numeroMenu; // retornar o contador para teste
  }
}
