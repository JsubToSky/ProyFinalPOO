import javax.swing.JOptionPane;

public class Tiramizu extends PostreA {


    public Tiramizu(String Nombre, float CantAzucar, float size, float price, float prodCost) {
        super(Nombre, CantAzucar, size, price, prodCost);
    }

    

    @Override
    void Sell() {
        float revenue = price - prodCost;
        System.out.println(revenue);
    }




    @Override
    void setPrice(float nprice) {
        Integer price = Integer.parseInt(JOptionPane.showInputDialog("Insert the vlaue of the price"));
        this.price = nprice;
    }




    @Override
    void setProdCost(float nprodCost) {
        Integer prodCost = Integer.parseInt(JOptionPane.showInputDialog("Insert the vlaue of the prodcost"));
        this.prodCost = nprodCost;
    }
    
    

}
