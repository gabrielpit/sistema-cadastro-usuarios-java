public class Usuario {

    private String nome;
    private int idade;
    private String email;
    private String  senha;
    
    public Usuario(String nome, int idade, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void exibiDados(){
        System.out.println("Dados do usuario");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Email: "+ email);
        System.out.println("Senha: " + senha);   
    }
}
