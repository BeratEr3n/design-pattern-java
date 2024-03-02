public class Director {
    public shape BuildShape(IBuilder builder){
            builder.kenarSayisi();
            builder.baslangicKonum();
            builder.kenarKalinlik();
            builder.kenarUzunluk();
            builder.kenarRenk();
            builder.icRenk();
            return builder.getShape();
    }
}