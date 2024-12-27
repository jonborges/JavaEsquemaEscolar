package main.java.SistemaEscolar.model;

import java.sql.Array;
import java.util.ArrayList;

public class EcossistemaEscolar {
    private ArrayList<Escola> escolas;

    public EcossistemaEscolar() {
        this.escolas = new ArrayList<>();
    }

    public void adicionarEscola(Escola escola){
        escolas.add(escola);
    }

    public void removerEscola(Escola escola){
        escolas.remove(escola);
    }
}
