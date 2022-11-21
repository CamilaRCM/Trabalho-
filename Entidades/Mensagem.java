package Entidades;

public class Mensagem {
    private String texto;
    private String remetente;
    private Usuario Destinario;

    public Mensagem(String texto, String remetente, Usuario destinario) {
        this.texto = texto;
        this.remetente = remetente;
        Destinario = destinario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public Usuario getDestinario() {
        return Destinario;
    }

    public void setDestinario(Usuario destinario) {
        Destinario = destinario;
    }

}
