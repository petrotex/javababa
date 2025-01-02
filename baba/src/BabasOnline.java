import java.util.Random;

public class BabasOnline {

  private Baba babaOnline;

  private String[] nomeBaba = new String[] { "Antônia", "Maria", "Neide" };
  private String[] idadeBaba = new String[] { "31", "24", "29" };
  private String[] cpfBaba = new String[] { "16154234756", "14125486412", "181264724642" };
  private String[] telefoneBaba = new String[] { "8399423145", "8399131347", "83999112456" };
  private String[] ruaBaba = new String[] { "Bela Vista", "Augusta", "Santa Rita" };
  private String[] bairroBaba = new String[] { "Mirante", "São José", "Beira Rua" };
  private String[] salarioBaba = new String[] { "R$20", "R$30", "R$27" };

  private String nomeBabaEscolhido;
  private String idadeBabaEscolhido;
  private String cpfBabaEscolhido;
  private String telefoneBabaEscolhido;
  private String ruaBabaEscolhido;
  private String bairroBabaEscolhido;
  private String salarioBabaEscolhido;

  private Random rand = new Random();

  public Baba gerarBaba() {
    String escolherNome = encontrarNome();
    String escolherIdade = encontrarIdade();
    String escolherCpf = encontrarCpf();
    String escolherTelefone = encontrarTelefone();
    String escolherRua = encontrarRua();
    String escolherBairro = encontrarBairro();
    String escolherSalario = encontrarSalario();

    nomeBabaEscolhido = escolherNome;
    idadeBabaEscolhido = escolherIdade;
    cpfBabaEscolhido = escolherCpf;
    telefoneBabaEscolhido = escolherTelefone;
    ruaBabaEscolhido = escolherRua;
    bairroBabaEscolhido = escolherBairro;
    String[] enderecoBabaEscolhido = { ruaBabaEscolhido, bairroBabaEscolhido };
    salarioBabaEscolhido = escolherSalario;

    Baba babaOnline = new Baba(nomeBabaEscolhido, idadeBabaEscolhido, cpfBabaEscolhido,
        telefoneBabaEscolhido, enderecoBabaEscolhido, salarioBabaEscolhido, "Repouso");

    return babaOnline;
  }

  public String encontrarNome() {
    return nomeBaba[rand.nextInt(nomeBaba.length)];
  }

  public String encontrarIdade() {
    return idadeBaba[rand.nextInt(idadeBaba.length)];
  }

  public String encontrarCpf() {
    return cpfBaba[rand.nextInt(cpfBaba.length)];
  }

  public String encontrarTelefone() {
    return telefoneBaba[rand.nextInt(telefoneBaba.length)];
  }

  public String encontrarRua() {
    return ruaBaba[rand.nextInt(ruaBaba.length)];
  }

  public String encontrarBairro() {
    return bairroBaba[rand.nextInt(bairroBaba.length)];
  }

  public String encontrarSalario() {
    return salarioBaba[rand.nextInt(salarioBaba.length)];
  }

  public String getNomeBabaEscolhido() {
    return nomeBabaEscolhido;
  }

  public void setNomeBabaEscolhido(String nomeBabaEscolhido) {
    this.nomeBabaEscolhido = nomeBabaEscolhido;
  }

  public String getIdadeBabaEscolhido() {
    return idadeBabaEscolhido;
  }

  public void setIdadeBabaEscolhido(String idadeBabaEscolhido) {
    this.idadeBabaEscolhido = idadeBabaEscolhido;
  }

  public String getCpfBabaEscolhido() {
    return cpfBabaEscolhido;
  }

  public void setCpfBabaEscolhido(String cpfBabaEscolhido) {
    this.cpfBabaEscolhido = cpfBabaEscolhido;
  }

  public String getTelefoneBabaEscolhido() {
    return telefoneBabaEscolhido;
  }

  public void setTelefoneBabaEscolhido(String telefoneBabaEscolhido) {
    this.telefoneBabaEscolhido = telefoneBabaEscolhido;
  }

  public String getRuaBabaEscolhido() {
    return ruaBabaEscolhido;
  }

  public void setRuaBabaEscolhido(String ruaBabaEscolhido) {
    this.ruaBabaEscolhido = ruaBabaEscolhido;
  }

  public String getBairroBabaEscolhido() {
    return bairroBabaEscolhido;
  }

  public void setBairroBabaEscolhido(String bairroBabaEscolhido) {
    this.bairroBabaEscolhido = bairroBabaEscolhido;
  }

  public String getSalarioBabaEscolhido() {
    return salarioBabaEscolhido;
  }

  public void setSalarioBabaEscolhido(String salarioBabaEscolhido) {
    this.salarioBabaEscolhido = salarioBabaEscolhido;
  }

  public Baba getBabaOnline() {
    return babaOnline;
  }

  public void setBabaOnline(Baba babaOnline) {
    this.babaOnline = babaOnline;
  }

}