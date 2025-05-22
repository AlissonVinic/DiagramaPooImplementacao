package pacoteclasses;
public class Avaliador {
    private String nome;
    private String cpf;
    private String endereco;
    private Obra obraParaAvaliar;

    public String getNome()
    {
        return nome;
    }
    public String getCpf()
    {
        return cpf;
    }
    public String getEndereco()
    {
        return endereco;
    }
    public Obra getObraParaAvaliar()
    {
        return obraParaAvaliar;
    }//

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    public void setObraParaAvaliar(Obra obraParaAvaliar)
    {
        this.obraParaAvaliar = obraParaAvaliar;
    }
    public void avaliarObra(String titulo, String comentario)
    {
        System.out.println("Avaliando obra: " + titulo + "\n Comentário: " + comentario);
    }
}

