package org.example.factory;

import org.example.model.Quarto;
import org.example.model.QuartoPadrao;

public class FabricaQuartoPadrao extends FabricaQuarto {
    public Quarto criarQuarto() {
        return new QuartoPadrao();
    }
}

