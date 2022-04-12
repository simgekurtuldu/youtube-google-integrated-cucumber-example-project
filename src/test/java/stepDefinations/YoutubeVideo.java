package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class YoutubeVideo {
    private static int number;
    private static WebDriver driver;
    private static By numberLocator = By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input");

    @Given("Chrome tarayicisi acilmis olmali")
    public static void chrome_tarayicisi_acilmis_olmali() {
        System.setProperty("webdriver.chrome.driver","s rc/test/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("Random number arattigimda")
    public static void random_number_arattigimda() {
        driver.get("https://www.google.com/search?q=random+number&oq=random+number&aqs=chrome.0.69i59j0i131i433i512j0i512l8.2298j0j9&sourceid=chrome&ie=UTF-8");
    }

    @Then("Random number sayfasi acilmis olmali")
    public static void random_number_sayfasi_acilmis_olmali() {
        boolean status = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/block-component/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div\n")).isDisplayed();
        Assert.assertTrue(status);
    }
    @When("Min alanina {int} yazdigim zaman")
    public static void min_alanina_yazdigim_zaman(Integer int1) throws InterruptedException {
        WebElement minNumber= driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/block-component/div/div[1]/div/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/input"));
        minNumber.clear();
        minNumber.sendKeys("0");
    }

    @When("Olustur butonuna tikladigimda")
    public static void olustur_butonuna_tikladigimda() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/block-component/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div\n")).click();
        Thread.sleep(4000);
    }

    @Then("Sayi guncellenmis olmali")
    public static void sayi_guncellenmis_olmali() {
        String random_number = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/block-component/div/div[1]/div/div/div/div[1]/div/div/div/div/div[1]/div/div[1]")).getText();
        number=Integer.parseInt(random_number);
        System.out.println("Number:"+number);
    }

    @Given("Random sayi alinmis olmali")
    public void random_sayi_alinmis_olmali() {

    }

    @When("Yeni sekmede youtube'a gidilmeli")
    public static void yeni_sekmede_youtube_a_gidilmeli() {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com/?hl=tr&gl=TR");
    }

    @Then("Youtube acilmis olmalidir")
    public static void youtube_acilmis_olmalidir() {
        boolean status = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[1]/ytd-topbar-logo-renderer/a/div/ytd-logo/yt-icon")).isDisplayed();
        Assert.assertTrue(status);
    }

    @When("Sayi {int}-{int} araliginda ise Matematik konu anlatimi arat")
    public static void sayi_araliginda_ise_matematik_konu_anlatimi_arat(Integer int1, Integer int2) throws InterruptedException {
        Thread.sleep(3000);
        if(number<=5){
            WebElement search = driver.findElement(numberLocator);
            search.sendKeys("Matematik konu anlatimi");
            Thread.sleep(3000);
            search.sendKeys(Keys.ENTER);
        }
    }

    @Then("Matematik konu anlatimi videolari gelmis olmalidir")
    public static void matematik_konu_anlatimi_videolari_gelmis_olmalidir() {

    }

    @When("Sayi {int}-{int} araliginda ise Turkce konu anlatimi arat")
    public static void sayi_araliginda_ise_turkce_konu_anlatimi_arat(Integer int1, Integer int2) throws InterruptedException {
        Thread.sleep(3000);
        if(number>=6){
            WebElement search = driver.findElement(numberLocator);
            Thread.sleep(3000);
            search.sendKeys("Turkce konu anlatimi");
            search.sendKeys(Keys.ENTER);
        }
    }

    @Then("Turkce konu anlatimi videolari gelmis olmalidir")
    public static void turkce_konu_anlatimi_videolari_gelmis_olmalidir() {

    }

    @When("Basligi tyt, Tyt ya da TYT kelimesini iceren ve playlist olmayan ilk sonuca tiklandiginda")
    public static void basligi_tyt_tyt_ya_da_tyt_kelimesini_iceren_ve_playlist_olmayan_ilk_sonuca_tiklandiginda() throws InterruptedException {
        decideAndGetVideo().click();
    }

    @Then("Video acilmis olmalidir")
    public static void video_acilmis_olmalidir() {

    }

    @When("Reklam ile baslayan videoda reklami gec butonuna basildiginda")
    public static void reklam_ile_baslayan_videoda_reklami_gec_butonuna_basildiginda() throws InterruptedException {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        try{
            WebElement ad = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[17]/div/div[3]/div/div[2]/span/button"));
            if(driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[17]/div/div[2]/span[1]/div")).isDisplayed())//reklam mevcut ise
            {
                js.executeScript("document.getElementsByClassName(\"video-stream html5-main-video\")[0].currentTime = 6;");
                Thread.sleep(2000);
                ad.click();
                js.executeScript("document.getElementsByClassName(\"video-stream html5-main-video\")[0].currentTime = 60;");
                driver.findElement(By.id("movie_player")).click();
            }
        }catch (Exception e){
            js.executeScript("document.getElementsByClassName(\"video-stream html5-main-video\")[0].currentTime = 60;");
            driver.findElement(By.id("movie_player")).click();
        }
    }

    @Then("Reklam atlanmis olmalidir")
    public static void reklam_atlanmis_olmalidir() {

    }

    @When("Birinci dk'ya gidildiginde")
    public static void birinci_dk_ya_gidildiginde() {

    }

    @Then("Video suresi birinci dk'da olmalidir")
    public static void video_suresi_birinci_dk_da_olmalidir() {

    }

    private static WebElement decideAndGetVideo() throws InterruptedException {
        int i=0;
        Thread.sleep(5000);
        List<WebElement> links= driver.findElements(By.xpath("//*[@id=\"video-title\"][@class=\"yt-simple-endpoint style-scope ytd-video-renderer\"]"));
        List<String> listOfAllWebElements = new ArrayList<>();
        for (WebElement element : links){
            if(!element.getAttribute("class").contains("style-scope ytd-playlist-renderer")) {
                listOfAllWebElements.add(element.getText());
            }
        }
        System.out.println(listOfAllWebElements);
        System.out.println("*********************************");
        for(String value:listOfAllWebElements){
            i++;
            String[] expectedOptions = value.split(",");
            if(expectedOptions[0].contains("TYT") || expectedOptions[0].contains("tyt") || expectedOptions[0].contains("Tyt")) {
                System.out.println(expectedOptions[0]);
                System.out.println("*********************************");
                break;
            }
        }
        return links.get(i-1);
    }
}
