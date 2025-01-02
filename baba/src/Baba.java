public class Baba {

    private String nome, idade, cpf, telefone;
    private String[] endereco;
    private String salario;
    private String trabalho;
  
    public Baba(String nome, String idade, String cpf, String telefone, String[] endereco, String salario,
        String trabalho) {
      this.nome = nome.isEmpty() ? "Sem Informação" : nome;
      this.idade = idade.isEmpty() ? "Sem Informação" : idade;
      this.cpf = cpf.isEmpty() ? "Sem Informação" : cpf;
      this.telefone = telefone.isEmpty() ? "Sem Informação" : telefone;
      this.endereco = new String[2];
      this.endereco[0] = endereco[0].isEmpty() ? "Sem Informação" : endereco[0];
      this.endereco[1] = endereco[1].isEmpty() ? "Sem Informação" : endereco[1];
      this.salario = salario.isEmpty() ? "Sem Informação" : salario;
      this.trabalho = trabalho.isEmpty() ? "Sem Informação" : trabalho;
    }
  
    public String getNome() {
      return nome;
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public String getIdade() {
      return idade;
    }
  
    public void setIdade(String idade) {
      this.idade = idade;
    }
  
    public String getCpf() {
      return cpf;
    }
  
    public void setCpf(String cpf) {
      this.cpf = cpf;
    }
  
    public String getTelefone() {
      return telefone;
    }
  
    public void setTelefone(String telefone) {
      this.telefone = telefone;
    }
  
    public String getSalario() {
      return salario;
    }
  
    public void setSalario(String salario) {
      this.salario = salario;
    }
  
    public String[] getEndereco() {
      return endereco;
    }
  
    public void setEndereco(String[] endereco) {
      this.endereco = endereco;
    }
  
    public String getTrabalho() {
      return trabalho;
    }
  
    public void setTrabalho(String trabalho) {
      this.trabalho = trabalho;
    }
  
  }
  