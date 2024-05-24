abstract class PostreA {

    private String Nombre;
    private float CantAzucar;
    private float size;
    protected float price;
    protected float prodCost;
    
    public PostreA(String Nombre, float CantAzucar, float size, float price, float prodCost){
        this.Nombre = Nombre;
        this.CantAzucar = CantAzucar;
        this.size = size;
        this.price = price;
        this.prodCost = prodCost;
    }

    public void setNombre(String nNombre){
        this.Nombre = nNombre;
    }
    public void setCantAzucar(float nCantAzucar){
        this.CantAzucar = nCantAzucar;
    }
    public void setSize(float nSize){
        this.size = nSize;
    }
    abstract void setPrice(float nprice);
    abstract void setProdCost(float nprodCost);
    abstract void  Sell();

    public String getNombre(){
        return this.Nombre;
    }

    public float getCantAzucar(){
        return this.CantAzucar;
    }
    public float getSize(){
        return this.size;
    }
    public float getPrice(){
        return this.price;
    }
    public float getProdCost(){
        return this.prodCost;
    }
}