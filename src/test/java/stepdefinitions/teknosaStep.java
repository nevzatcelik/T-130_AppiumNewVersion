package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import utils.Driver;
import utils.ReusableMethods;

public class teknosaStep {
        AndroidDriver driver= Driver.getAndroidDriver();
    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
      Driver.getAndroidDriver();
    }
    @Given("Ilk ekran bolumunden {string} tiklanir")
    public void ılk_ekran_bolumunden_atlaya_tiklanir(String girisSecenegi) {
        ReusableMethods.scrollWithUiScrollableAndClick(girisSecenegi);
    }
    @Given("footer bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumune_tiklanir(String footerSecenek) {
      ReusableMethods.scrollWithUiScrollableAndClick(footerSecenek);
    }
    @Given("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_telefon_bolumune_tiklanir() {

    }
    @Given("telefon sayfasindan cihaz secimi {string} yapilir")
    public void telefon_sayfasindan_cihaz_secimi_yapilir() {

    }
    @Given("cep telefonu sayfasinda {string} bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {

    }
    @Given("Filtrele sayfasindan herhangi bir {string} filtreleme yapilir")
    public void marka_bolumunden_marka_secimi_yapilir() {

    }
    @Given("siralama yapilirak azalan fiyat secilir")
    public void siralama_yapilirak_azalan_fiyat_secilir() {

    }
    @Given("fiyatlarin azalan duzende oldugu test edilir")
    public void fiyatlarin_azalan_duzende_oldugu_test_edilir() {

    }

}
