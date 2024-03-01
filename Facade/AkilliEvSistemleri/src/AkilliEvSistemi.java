//Facade Sınıf 
public class AkilliEvSistemi {
    Kapi kapi;
    Klima klima;
    Isik  isik;
    TV tv;
    KahveMakinesi kahve;

    public AkilliEvSistemi(){
        kapi = new Kapi();
        klima = new Klima();
        isik = new Isik(false);
        tv  = new TV(); 
        kahve = new KahveMakinesi(); 
    }

    public void isikAc(){isik.IsikAc();}
    public void isikKapat(){isik.IsikKapat();}
    public void TVAc(){tv.TVAc();}
    public void TVKapat(){tv.TVKapat();}
    public void tvSesAzalt(){tv.sesAzalt();}
    public void tvSesArttir(){tv.sesArttir();}
    public void tvKanalAzalt(){tv.kanalAzalt();}
    public void tvKanalArttir(){tv.kanalArttir();}
    public void klimaGüncelle(int _sicaklik){klima.Güncelle(_sicaklik);} 
    public void KlimaAc(){klima.KlimaAc();}
    public void KlimaKapat(){klima.KlimaKapat();}
    public void kapiKilitle(){kapi.Kilitle();}
    public void kapiKilitAc(){kapi.KilitAc();}
    //Eklediğim Modlar
    public void SinamaModu(String _kahve,int kanal){
        isik.IsikKapat();
        kahve.KahveYap(_kahve);
        klima.Güncelle(27);
        tv.setKanalNumara(kanal);
        tv.setSesSeviye(40);
        System.out.println("iyi seyirler...");
    }
    
    public void EvdenCikma(){
        System.out.println("\n\nEvden Çikma...");
        isik.IsikKapat();
        tv.TVKapat();
        klima.KlimaKapat();
        kapi.Kilitle();
    }
}
