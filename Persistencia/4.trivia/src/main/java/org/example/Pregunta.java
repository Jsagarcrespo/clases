package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {

    private String texto;

    public Pregunta(int id, String texto) {
        this.texto = texto;
        respuestas = new ArrayList<>();
    }

    private List<Respuesta> respuestas;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
}
