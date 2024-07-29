package org.example.factory;

import org.example.model.Quarto;
import org.example.model.Suite;

public class FabricaSuite extends FabricaQuarto {
    public Quarto criarQuarto() {
        return new Suite();
    }
}

