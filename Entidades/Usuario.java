package Entidades;

import java.util.List;

public class Usuario {

    private String nome;
    private String sobreNome;
    private Credencial credencial;
    private List<Usuario> amigos;
    private List<Mensagem> mensagensRecebidas;

    public void setMensagensRecebidas(List<Mensagem> mensagensRecebidas) {
        this.mensagensRecebidas = mensagensRecebidas;
    }

    public Usuario(String nome, String sobreNome, Credencial credencial) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.credencial = credencial;
    }

    public Usuario(String nome, String sobreNome, Credencial credencial, List<Usuario> amigos, List<Mensagem> mensagensRecebidas) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.credencial = credencial;
        this.amigos = amigos;
        this.mensagensRecebidas = mensagensRecebidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public void adicionarAmigo(Usuario  novoAmigo){
        this.amigos.add(novoAmigo);
    }

    public  void removerAmigo (Usuario amigoRemovido){
        this.amigos.remove(amigoRemovido);
    }

    public List<Mensagem> getMensagensRecebidas() {
        return mensagensRecebidas;
    }

    public void enviarMensagem(Mensagem mensagem){
        mensagem.getDestinario().getMensagensRecebidas().add(mensagem);
    }
}
