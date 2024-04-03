package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
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
     ReusableMethods.scrollWithUiScrollableAndClick("TCL");
     page.sonculariGoserButonu.click();

    }
    @Given("siralama sayfasından {string} siralamasi secilir")
    public void siralama_yapilirak_azalan_fiyat_secilir(String siralamaIsmi) {
    ReusableMethods.scrollWithUiScrollableAndClick(siralamaIsmi);
    }
    @Given("fiyatlarin azalan duzende oldugu test edilir")
    public void fiyatlarin_azalan_duzende_oldugu_test_edilir() {

    }

}
