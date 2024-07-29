package org.example.decorator;

import org.example.model.Quarto;

public abstract class DecoradorQuarto implements Quarto {
    protected Quarto quarto;

    public DecoradorQuarto(Quarto quarto) {
        this.quarto = quarto;
    }
}

