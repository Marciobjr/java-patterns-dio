package org.example.singleton;


public class ReservaHotel {
    private static ReservaHotel instance;

    private ReservaHotel() {}

    public static synchronized ReservaHotel getInstance() {
        if (instance == null) {
            instance = new ReservaHotel();
        }
        return instance;
    }

    public void fazerReserva(String tipoQuarto) {
        System.out.println("Reserva feita para: " + tipoQuarto);
    }
}

