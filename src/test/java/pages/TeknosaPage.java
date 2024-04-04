package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class TeknosaPage {
    public TeknosaPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }


    @AndroidFindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement markaKutusu;

    @AndroidFindBy(xpath = "//*[@text='Sonuçları Göster']")
    public WebElement sonculariGoserButonu;

    @AndroidFindBy(xpath = "//*[@bounds='[75,686][114,725]']")
    public WebElement kutucuk;

    @AndroidFindBy(xpath = "(//*[@index='7'])[2]")
    public WebElement birinciUrunFiyati;
    @AndroidFindBy(xpath = "//*[@index='8']")
    public WebElement ikinciUrunFiyati;
}
