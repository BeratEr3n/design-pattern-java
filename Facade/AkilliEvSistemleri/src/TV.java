public class TV {
    private int sesSeviye;
    private int kanalNumara;

    //Constructer
    public TV(){
        setSesSeviye(30);
        setKanalNumara(1);
    }
    //Aç-Kapat
    public void TVAc(){
        System.out.println("TV Açildi");
    }
    public void TVKapat(){
        System.out.println("TV Kapatiliyor");
    }
    //Ses işlemleri
    public void sesAzalt(){
        if(getSesSeviye()>0)
            setSesSeviye(getSesSeviye() - 2);
        System.out.println("Ses Seviyesi: "+ getSesSeviye());
    }
    public void sesArttir(){
        if(getSesSeviye()<100)
            setSesSeviye(getSesSeviye() + 2);
        System.out.println("Ses Seviyesi: "+ getSesSeviye());
    }
    //Kanal işlemleri
    public void kanalAzalt(){
        setKanalNumara(getKanalNumara() - 1);
    System.out.println("Kanal : "+ getKanalNumara());
    }
    public void kanalArttir(){
        setKanalNumara(getKanalNumara() + 1);
    System.out.println("Kanal : "+ getKanalNumara());
    }
    //Getter-Setter
    public int getSesSeviye() {
        return sesSeviye;
    }
    public void setSesSeviye(int sesSeviye) {
        this.sesSeviye = sesSeviye;
    }
    public int getKanalNumara() {
        return kanalNumara;
    }
    public void setKanalNumara(int kanalNumara) {
        this.kanalNumara = kanalNumara;
    }
}