package org.example;

public class Respuesta {

    private String texto;
    private boolean correcta;

    public Respuesta(String texto, boolean correcta, Pregunta pregunta) {
        this.texto = texto;
        this.correcta = correcta;
        this.pregunta = pregunta;
    }

    private Pregunta pregunta;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
}
