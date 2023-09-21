package Steps;

import Base.BaseStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.UUID;

public class CreditCalculationStep extends BaseStep {
    String uuid = UUID.randomUUID().toString();

    @Given("^a web browser is at the Vakifbank page$")
    public void aWebBrowserIsAtTheVakifbankPage() {
        geturl();
    }

    @When("^the user clicks the Bireysel tab$")
    public void theUserClicksBireysel() {
        findElementClick("//ul[@class='clearfix visible-lg-block']/li/a/span[text()='Bireysel']",Pather.xPath);

    }

    @And("^the user clicks on the Bireysel Krediler tab from the menu that opens$")
    public void userClicksBireyselKrediler() {
        findElementClick("//ul[@class='clearfix visible-lg-block']/li[@class='level2 selected']/ul/li/a/span[text()='Bireysel Krediler ']",Pather.xPath);
    }

    @Then("^the user checks that the Hesaplama Araçları link exists$")
    public void userSeesHesaplamaAraclariLink() {
        PageScrolldown();
        waitElement(findElement("//div[@class='shortLinks']/a[text()='Hesaplama Araçları']",Pather.xPath,""),TimeOut.HIGH);

    }

    @And("^the user clicks the Hesaplama Araçları link$")
    public void userClicksHesaplamaAraclariLink() {

       findElementClick("//div[@class='shortLinks']/a[text()='Hesaplama Araçları']",Pather.xPath);


    }

    @Then("^the user checks that the Kredi Hesaplama Aracı field is on the screen$")
    public void userChecksKrediHesaplamaAraciField() {
        waitElement(findElement("//h2[text()='Kredi Hesaplama Aracı']",Pather.xPath,""),TimeOut.HIGH);


    }

    @And("^the user clicks the Hesapla button in the Kredi Hesaplama Aracı$")
    public void userClicksHesapla() {
        findElementClick("(//a[@class='black-btn big wide' and text()='Hesapla'])[1]",Pather.xPath);

    }

    @And("^the user selects Taksitli Ek Hesap option from the credit dropbox$")
    public void userSelectsTaksitliEkHesap() {
        findElementClick("select2-selection",Pather.className);
        waitElement(findElement("//li[text()='TAKSİTLİ EK HESAP']",Pather.xPath,""),TimeOut.HIGH);
        findElementClick("//li[text()='TAKSİTLİ EK HESAP']",Pather.xPath);

    }

    @And("^the user writes 10 in the maturity field$")
    public void userWritesMaturity() {

        findElementClick("vadeValue",Pather.className);
        waitElement(findElement("vadeValue",Pather.className,""),TimeOut.HIGH);
        findElement("vadeValue",Pather.className,"").clear();
        findElement("vadeValue",Pather.className,"").sendKeys("10");
    }

    @Then("^200 must be set in the Tutar field$")
    public void userSeesTutar() {
        //HTML kodlarındaki fonksiyon min kredi tutarını baz aldığı için bu değer okunuyor.
        Assert("minKrediTutar",Pather.className,TimeOut.HIGH,"200");
        PageScrolldown();


    }

    @Then("^the user checks field Toplam Ödenecek Tutar$")
    public void userSeesToplamOdenecekTutar() {

        Assert("  (//td[@class='borderRight'])[5]",Pather.xPath,TimeOut.LOW,"252,64 TL");



    }
    @Then("^driver close$")
    public void driverClose() {
        DriverQuit();
    }
}
