package pacoteclasses;
public class Obra {
    private String titulo;
    private int ano;
    private String status;
    private Avaliador avaliador;
    private Autor autor;
    private String genero;

    public String getTitulo(){
        return titulo;
    }
    public int getAno(){
        return ano;
    }
    public String getStatus(){
        return status;
    }
    public Avaliador getAvaliador(){
        return avaliador;
    }
    public Autor getAutor(){
        return autor;
    }
    public String getGenero(){
        return genero;
    }
    
    public void setTitulo(String titulo){
        if(titulo == null || titulo.trim().isEmpty()){
            System.out.println("Este campo não pode ser vazio");
        }else{
            this.titulo = titulo;
        }
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setStatus(String status){
        if(status == null || status.trim().isEmpty()){
            System.out.println("Este campo não pode ser vazio");
        }else{
            this.status = status;
        }
    }
    public void setAvaliador(Avaliador avaliador){
        if(avaliador == null){
            System.out.println("Este campo não pode ser vazio");
        }else{
            this.avaliador = avaliador;
        }
    }
    public void setAutor(Autor autor){
        if(autor == null){
            System.out.println("Este campo não pode ser vazio");
        }else{
            this.autor = autor;
        }
    }
    public void setGenero(String genero){
        if(genero == null || genero.trim().isEmpty()){
            System.out.println("Este campo não pode ser vazio");
        }else{
            this.genero = genero;
        }
    }
}
