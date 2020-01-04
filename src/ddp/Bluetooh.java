package ddp;


public class Bluetooh extends CarDecorator
{

    public Bluetooh(Saleable saleable) { super(saleable); }

    @Override
    public String getDescription()
    {
       return getSaleable().getDescription() + " with Bluettoh";
    }

    @Override
    public Double getPrice() 
    {
      return getSaleable().getPrice() + 222323;
    }
    
}
