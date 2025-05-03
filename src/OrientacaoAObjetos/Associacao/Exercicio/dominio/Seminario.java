package src.OrientacaoAObjetos.Associacao.Exercicio.dominio;

public class Seminario {
    private Aluno[] alunos;
    private String titulo;
    private String local;

    public Seminario(String titulo, String local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
