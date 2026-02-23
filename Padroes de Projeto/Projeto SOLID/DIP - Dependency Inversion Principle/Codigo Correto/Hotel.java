class Hotel {

    private Pagamento pagamento;

    public Hotel(Pagamento pagamento) {
        this.pagamento = pagamento
    }

    public void realizarPagamento() {
        pagamento.pagar();
    }

}