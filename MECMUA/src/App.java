public class App {
    public static void main(String[] args) throws Exception {

        Mecmua hobbit  = new Kitap(new Kirmizi(), new a4());
        hobbit.RenkUygula();
        hobbit.BoyutUygula();
        
        Mecmua bilim = new Dergi(new Mavi(), new a5());
        bilim.RenkUygula();
        bilim.BoyutUygula();

    }
}

abstract class Mecmua{
    
    RenkImplementor renkI;
    BoyutImplementor boyutI;
    
    public Mecmua(RenkImplementor renk,BoyutImplementor boyut){
        this.renkI = renk;
        this.boyutI = boyut;
    }
    abstract void RenkUygula();
    abstract void BoyutUygula();


}
class Dergi extends Mecmua{

    public Dergi(RenkImplementor renk,BoyutImplementor boyut){
        super(renk, boyut);
        System.out.println("Dergi");
    }

    @Override
    void RenkUygula() {
        renkI.B0ya();
    }

    @Override
    void BoyutUygula() {
        boyutI.B0yut();
    }

}
class Kitap extends Mecmua{
    
    public Kitap(RenkImplementor renk,BoyutImplementor boyut){
        super(renk, boyut);
        System.out.println("Kitap");
    }

    @Override
    void RenkUygula() {
        renkI.B0ya();
    }

    @Override
    void BoyutUygula() {
        boyutI.B0yut();
    }
}




// Renk İmplementor
interface RenkImplementor{
    void B0ya();
}
class Kirmizi implements RenkImplementor{
    @Override
    public void B0ya() {
        System.out.println("Kirmiziya Boyandi");
    }
} 
class Mavi implements RenkImplementor{
    @Override
    public void B0ya() {
        System.out.println("Maviye Boyandi");
    }
}

// Boyut İmplementor
interface BoyutImplementor{
    void B0yut();
}
class a4 implements BoyutImplementor{
    @Override
    public void B0yut() {
        System.out.println("a4");
    }
} 
class a5 implements BoyutImplementor{
    @Override
    public void B0yut() {
        System.out.println("a5");
    }
}