public class Klima {
    private int sicaklik;

    public void Güncelle(int _sicaklik){
        this.sicaklik = _sicaklik;
        System.out.println("Sicaklik:"+sicaklik);
    } 
    public void KlimaAc(){
        System.out.println("Klima Açildi");
    }
    public void KlimaKapat(){
        System.out.println("Klima Kapatildi");
    }
}