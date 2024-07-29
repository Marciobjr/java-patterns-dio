package org.example.decorator;

import org.example.model.Quarto;

public class DecoradorCafeDaManha extends DecoradorQuarto {
    public DecoradorCafeDaManha(Quarto quarto) {
        super(quarto);
    }

    public String getDescricao() {
        return quarto.getDescricao() + " com Café da Manhã";
    }
}

