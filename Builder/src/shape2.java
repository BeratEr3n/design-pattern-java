public class shape2 implements IBuilder{
    private shape shape2;

    public shape2(){
        this.shape2 = new shape("Shape-2");
    }

    @Override
    public void kenarSayisi() {
        shape2.setKenarSayisi(7);
    }

    @Override
    public void baslangicKonum() {
        shape2.setKonum("2.konum");
    }

    @Override
    public void kenarKalinlik() {
        shape2.setKenarKalinlik(3);
    }

    @Override
    public void kenarUzunluk() {
        shape2.setKenarUzunluk(12);
    }

    @Override
    public void kenarRenk() {
        shape2.setKenarRenk("yesil");
    }

    @Override
    public void icRenk() {
        shape2.setIcRenk("siyah");
    }
    
    @Override
    public shape getShape() {
        return shape2;
    }
}
