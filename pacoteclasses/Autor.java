package pacoteclasses;
public class Autor {
    private String nome;
    private String endereco;
    private String cpf;
    private Obra obra;

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
    public Obra getObra()
    {
        return obra;
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
    public void setObra(Obra obra)
    {
        this.obra = obra;
    }
    public void verObra(Obra obra)
    {
        System.out.println("Título: " + obra.getTitulo());
        System.out.println("autor: " + obra.getAutor());
        System.out.println("Ano: " + obra.getAno());
        System.out.println("Genero: " + obra.getGenero());
        System.out.println("Status: " + obra.getStatus());
        System.out.println("");
    }
}

