package pacoteclasses;
public class Dono {

    private String nome;
    private String endereco;
    private String cpf;
    private String field;
    /*getters e seetters*/
    public String getNome()
    {
        return nome;
    }
    public String getEndereco()
    {
        return endereco;
    }
    public String getCpf()
    {
        return cpf;
    }
    public String getField()
    {
        return field;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public void setField(String field)
    {
        this.field = field;
    }
    /*metodos*/
    public void cadastrarAvaliador(Avaliador avaliador)
    {
        System.out.println("Avaliador cadastrado: " + avaliador.getNome());
    }

    public void definirAvaliador(Avaliador avaliador, String obraTitulo)
    {
        System.out.println("o avaliador avaliador" + avaliador.getNome() + " foi definido para a obra: " + obraTitulo);
    }
    public void registrarObra(Obra obra)
    {
        System.out.println("Obra registrada: " + obra.getTitulo());
    }
}
