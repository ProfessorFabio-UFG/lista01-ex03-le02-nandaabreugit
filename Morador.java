public class Morador {
    private static int contador = 1;
    private int codigoSequencial;
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private String apartamento;
    private String codigoAcesso;

    public Morador() {
        this.codigoSequencial = contador++;
    }
  
    public int getCodigoSequencial() {
        return codigoSequencial;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getBloco() {
        return bloco;
    }

    public String getApartamento() {
        return apartamento;
    }

    public String getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public void setCodigoAcesso(String codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }

    public void mostrarDados() {
        return "Codigo Sequencial: " + codigoSequencial + "\n"
             + "Nome: " + nome + "\n"
             + "CPF: " + cpf + "\n"
             + "Celular: " + celular + "\n"
             + "Data de Nascimento: " + dataNascimento + "\n"
             + "Sexo: " + sexo + "\n"
             + "Bloco: " + bloco + "\n"
             + "Apartamento: " + apartamento + "\n"
             + "Codigo de Acesso: " + codigoAcesso + "\n"
    }
}
