package org.example;

import org.example.decorator.DecoradorCafeDaManha;
import org.example.factory.FabricaQuarto;
import org.example.factory.FabricaSuite;
import org.example.model.Quarto;
import org.example.singleton.ReservaHotel;

public class Main {
    public static void main(String[] args) {
        ReservaHotel reserva = ReservaHotel.getInstance();

        FabricaQuarto fabrica = new FabricaSuite();

        Quarto quarto = fabrica.criarQuarto();

        quarto = new DecoradorCafeDaManha(quarto);

        reserva.fazerReserva(quarto.getDescricao());
    }
}
