package ddp;


public abstract class CarDecorator implements Saleable
{
   private final Saleable saleable;
   
   public CarDecorator(Saleable saleable)
   {
       this.saleable = saleable;
   }
   
   public Saleable getSaleable()
   {
      return saleable; 
   }
}
