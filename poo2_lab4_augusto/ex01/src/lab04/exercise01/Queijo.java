package lab04.exercise01;
/**
 *
 * @author augusto
 */
public class Queijo extends Decorator {

    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 2.50;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " com queijo";
    }

}