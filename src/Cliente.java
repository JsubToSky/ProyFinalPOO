class Cliente{
    private Integer cantidad;
    private String pedido;
    private Integer ID;
    
    public Cliente(Integer cantidad, String pedido, Integer ID){
        this.cantidad = cantidad;
        this.pedido = pedido;
        this.ID = ID;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.cantidad = Cantidad;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String npedido) {
        this.pedido = npedido;
    }
    public Integer ID() {
        return ID;
    }

    public void setId(Integer nID) {
        this.ID = nID;
    }

}