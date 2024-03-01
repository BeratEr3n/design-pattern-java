public class Isik {
    private boolean durum;

    public Isik(Boolean a){
        this.durum = a; 
    }

    public void IsikAc(){
        durum = true;
        System.out.println("Isik Açildi");
    }
    public void IsikKapat(){
        System.out.println("Isik Kapatildi");
        durum = false;
    }

}
