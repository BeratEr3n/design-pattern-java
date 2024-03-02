public class shape {
    private String shapetype;
    
    public shape(String s){
        this.shapetype = s;
    }

    private int kenarSayisi;
    private int kenarUzunluk;
    private int kenarKalinlik;
    private String konum;
    private String kenarRenk;
    private String icRenk;

    public int getKenarSayisi() {
        return kenarSayisi;
    }
    public void setKenarSayisi(int kenarSayisi) {
        this.kenarSayisi = kenarSayisi;
    }
    public int getKenarUzunluk() {
        return kenarUzunluk;
    }
    public void setKenarUzunluk(int kenarUzunluk) {
        this.kenarUzunluk = kenarUzunluk;
    }
    public int getKenarKalinlik() {
        return kenarKalinlik;
    }
    public void setKenarKalinlik(int kenarKalinlik) {
        this.kenarKalinlik = kenarKalinlik;
    }
    public String getKonum() {
        return konum;
    }
    public void setKonum(String konum) {
        this.konum = konum;
    }
    public String getKenarRenk() {
        return kenarRenk;
    }
    public void setKenarRenk(String kenarRenk) {
        this.kenarRenk = kenarRenk;
    }
    public String getIcRenk() {
        return icRenk;
    }
    public void setIcRenk(String icRenk) {
        this.icRenk = icRenk;
    }
    

    public String BilgiGoster() {
        return "Shape "+this.shapetype +
                "  kenar sayisi = " + getKenarSayisi() +
                ", başlangiç konumy = " + getKonum() +
                ", kenar uzunluğu = " + getKenarUzunluk() +
                ", kenar kalinliği = " + getKenarKalinlik() +
                ", kenar rengi = " + getKenarRenk() +
                ", iç rengi = " + getIcRenk();
    }
}
