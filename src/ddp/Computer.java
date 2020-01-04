package ddp;


public class Computer extends CarDecorator
{

    public Computer(Saleable saleable) { super(saleable); }

    @Override
    public String getDescription() 
    {
       return getSaleable().getDescription() + " with Computer";
    }

    @Override
    public Double getPrice() 
    {
       return getSaleable().getPrice() + 423222.323;
    }
    
}
