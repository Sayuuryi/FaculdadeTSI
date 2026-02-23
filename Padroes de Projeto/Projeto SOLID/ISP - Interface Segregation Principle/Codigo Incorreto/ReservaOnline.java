class ReservaOnline implements IServicoHotel {

    public void reservarQuarto() {
        System.out.println("Reserva online realizada com sucesso.");
    }

    public void servirCafeDaManha() {
        throw new UnsupportedOperationException("Reserva online não serve cafe.")
    }

}