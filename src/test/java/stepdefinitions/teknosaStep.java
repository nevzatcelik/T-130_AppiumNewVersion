package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.TeknosaPage;
import utils.Driver;
import utils.ReusableMethods;

public class teknosaStep {
        AndroidDriver driver= Driver.getAndroidDriver();
        TeknosaPage page=new TeknosaPage();
    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
      Driver.getAndroidDriver();
    }
    @Given("ilk ekran bolumunden {string} tiklanir")
    public void ılk_ekran_bolumunden_atlaya_tiklanir(String girisSecenegi) {
        ReusableMethods.scrollWithUiScrollableAndClick(girisSecenegi);
    }
    @Given("footer bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumune_tiklanir(String footerSecenek) {
      ReusableMethods.scrollWithUiScrollableAndClick(footerSecenek);
    }
    @Given("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_telefon_bolumune_tiklanir(String kategoriTuru) {
     ReusableMethods.scrollWithUiScrollableAndClick(kategoriTuru);
    }
    @Given("telefon sayfasindan cihaz secimi {string} yapilir")
    public void telefon_sayfasindan_cihaz_secimi_yapilir(String cihazIsmi) {
    ReusableMethods.scrollWithUiScrollableAndClick(cihazIsmi);
    }
    @Given("cep telefonu sayfasinda {string} bolumune tiklanir")
    public void filtrele_bolumune_tiklanir(String cepTelefonBolumu) {
     ReusableMethods.scrollWithUiScrollableAndClick(cepTelefonBolumu);
    }
    @Given("filtrele sayfasindan herhangi bir {string} filtreleme yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String filtremeleTuru) {
       ReusableMethods.scrollWithUiScrollableAndClick(filtremeleTuru);
    }

    @Given("marka bolumunden bir cihaz {string} filtrelemesi yapilir")
    public void marka_bolumunden_bir_cihaz_filtrelemesi_yapilir(String cihazIsmi) {
     page.markaKutusu.sendKeys(cihazIsmi);
     page.kutucuk.click();
     page.sonculariGoserButonu.click();

    }
    @Given("siralama sayfasından {string} siralamasi secilir")
    public void siralama_yapilirak_azalan_fiyat_secilir(String siralamaIsmi) {
    ReusableMethods.scrollWithUiScrollableAndClick(siralamaIsmi);
    }
    @Given("fiyatlarin azalan duzende oldugu test edilir")
    public void fiyatlarin_azalan_duzende_oldugu_test_edilir() {
        ReusableMethods.wait(3);
        ReusableMethods.ekranKaydirmaMethodu(530,2032,750,530,667);
        String birinciUrunFiyatiText=page.birinciUrunFiyati.getText(); // 4.529,00 TL
        String ikinciUrunFiyatiText= page.ikinciUrunFiyati.getText();
        birinciUrunFiyatiText=birinciUrunFiyatiText.replaceAll("\\D","");
        System.out.println(birinciUrunFiyatiText);
        ikinciUrunFiyatiText=ikinciUrunFiyatiText.replaceAll("\\D","");
        System.out.println(ikinciUrunFiyatiText);
        Assert.assertTrue(Integer.parseInt(birinciUrunFiyatiText)>Integer.parseInt(ikinciUrunFiyatiText));
    }

    @Given("en ucuz cihaz a tiklanir")
    public void en_ucuz_cihaz_a_tiklanir() {
        page.enUcuzSamsung.click();
    }
    @Given("cihaz sepete eklenir")
    public void cihaz_sepete_eklenir() {
   page.sepeteEkle.click();
    }
    @Given("sepetime git bolumune tiklanir")
    public void sepetime_git_bolumune_tiklanir() {
page.sepetimeGit.click();
    }
    @Given("urunun sayisi arttirildiginda fiyatinin arttirildigi dogrulanir")
    public void urunun_sayisi_arttirildiginda_fiyatinin_arttirildigi_dogrulanir() {
      String urununILKfiyati= page.urunFiyati.getText();
      urununILKfiyati=urununILKfiyati.replaceAll("\\D","");
        System.out.println(urununILKfiyati); // 569900
      page.artiButonu.click();

      String urununIKINCIfiyati=page.urunFiyati.getText();
      urununIKINCIfiyati=urununIKINCIfiyati.replaceAll("\\D","");
        System.out.println(urununIKINCIfiyati); // 1139800

        Assert.assertEquals(1139800,Integer.parseInt(urununILKfiyati)*2);

    }

}
