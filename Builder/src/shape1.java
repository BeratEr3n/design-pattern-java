public class shape1 implements IBuilder{
    private shape shape1;

    public shape1(){
        this.shape1 = new shape("Shape-1");
    }

    @Override
    public void kenarSayisi() {
        shape1.setKenarSayisi(5);
    }

    @Override
    public void baslangicKonum() {
        shape1.setKonum("1.konum");
    }

    @Override
    public void kenarKalinlik() {
        shape1.setKenarKalinlik(2);
    }

    @Override
    public void kenarUzunluk() {
        shape1.setKenarUzunluk(10);
    }

    @Override
    public void kenarRenk() {
        shape1.setKenarRenk("siyah");
    }

    @Override
    public void icRenk() {
        shape1.setIcRenk("sari");
    }

    @Override
    public shape getShape() {
        return shape1;
    }
}
