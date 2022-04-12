package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedNumber {
//    private int number;
//    private WebDriver driver;
//    private int px;
//    @Given("Sayfayi ac")
//    public void sayfayi_ac() {
//        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.google.com/search?q=random+number&oq=random+number&aqs=chrome.0.69i59j0i131i433i512j0i512l8.2298j0j9&sourceid=chrome&ie=UTF-8");
//    }
//    @When("Sayfanin acildigini dogrula")
//    public void sayfanin_acildigini_dogrula() {
//        boolean status = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/block-component/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div\n")).isDisplayed();
//        Assert.assertTrue(status);
//    }
//
//    @Then("Min kismina {int} yaz")
//    public void min_kismina_yaz(Integer int1) {
//        WebElement minNumber= driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/block-component/div/div[1]/div/div/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/input"));
//        minNumber.clear();
//        minNumber.sendKeys("0");
//    }
//
//    @Then("Olustur butonuna tikla")
//    public void olustur_butonuna_tikla() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/block-component/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div\n")).click();
//        Thread.sleep(4000);
//
//    }
//    @Then("Sayiyi al")
//    public void sayiyi_al() {
//        String random_number = driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div[2]/div[2]/div/div/div[1]/block-component/div/div[1]/div/div/div/div[1]/div/div/div/div/div[1]/div/div[1]")).getText();
//        number=Integer.parseInt(random_number);
//        System.out.println("Number:"+number);
//    }
//    @Then("Yeni sekmede youtube ac")
//    public void yeni_sekmede_youtube_ac() {
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.youtube.com/?hl=tr&gl=TR");
//        boolean status = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[1]/ytd-topbar-logo-renderer/a/div/ytd-logo/yt-icon")).isDisplayed();
//        Assert.assertTrue(status);
//    }
//    @Then("Kosula gore arama yap")
//    public void kosula_gore_arama_yap() throws InterruptedException {
//        By numberLocator = By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/form/div[1]/div[1]/input");
//        Thread.sleep(3000);
//        if(number<=5){
//            WebElement search = driver.findElement(numberLocator);
//            search.sendKeys("Matematik konu anlatimi");
//            Thread.sleep(3000);
//            search.sendKeys(Keys.ENTER);
//        }else{
//            WebElement search = driver.findElement(numberLocator);
//            Thread.sleep(3000);
//            search.sendKeys("Turkce konu anlatimi");
//            search.sendKeys(Keys.ENTER);
//        }
//    }
//    @Then("Video ac")
//    public void video_ac() throws InterruptedException {
//        decideAndGetVideo().click();
//    }
//
//    @Then("Birinci dk tikla")
//    public void birinci_dk_tikla() throws InterruptedException {
//        Thread.sleep(5000);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        try{
//            WebElement ad = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[17]/div/div[3]/div/div[2]/span/button"));
//            if(driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[17]/div/div[2]/span[1]/div")).isDisplayed())//reklam mevcut ise
//            {
//                js.executeScript("document.getElementsByClassName(\"video-stream html5-main-video\")[0].currentTime = 6;");
//                Thread.sleep(2000);
//                ad.click();
//                js.executeScript("document.getElementsByClassName(\"video-stream html5-main-video\")[0].currentTime = 60;");
//                driver.findElement(By.id("movie_player")).click();
//            }
//        }catch (Exception e){
//            js.executeScript("document.getElementsByClassName(\"video-stream html5-main-video\")[0].currentTime = 60;");
//            driver.findElement(By.id("movie_player")).click();
//        }
//    }
//    private WebElement decideAndGetVideo() throws InterruptedException {
//        int i=0;
//        Thread.sleep(5000);
//        List<WebElement> links= driver.findElements(By.xpath("//*[@id=\"video-title\"][@class=\"yt-simple-endpoint style-scope ytd-video-renderer\"]"));
//        List<String> listOfAllWebElements = new ArrayList<>();
//        for (WebElement element : links){
//            if(!element.getAttribute("class").contains("style-scope ytd-playlist-renderer")) {
//                listOfAllWebElements.add(element.getText());
//            }
//        }
//        System.out.println(listOfAllWebElements);
//        System.out.println("*********************************");
//        for(String value:listOfAllWebElements){
//            i++;
//            String[] expectedOptions = value.split(",");
//            if(expectedOptions[0].contains("TYT") || expectedOptions[0].contains("tyt") || expectedOptions[0].contains("Tyt")) {
//                System.out.println(expectedOptions[0]);
//                System.out.println("*********************************");
//                break;
//            }
//        }
//        return links.get(i-1);
//    }
////    private void getClickElement(){
////        String time_duration=driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div/div/div/ytd-player/div/div/div[35]/div[2]/div[1]/div[1]/span[2]/span[3]")).getText();
////        String[] time_lists=time_duration.split(":");
////        int total_seconds = (Integer.parseInt(time_lists[0])*3600) + (Integer.parseInt(time_lists[1])*60) + (Integer.parseInt(time_lists[2]));
////        String width_value = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[35]/div[1]/div[2]/div[1]/div")).getAttribute("style");
////        String pattern = "(\\d+)";
////        Pattern r = Pattern.compile(pattern);
////        Matcher m = r.matcher(width_value);
////        if (m.find( )) {
////            System.out.println("*********************************");
////            System.out.println("Found value: " + m.group(0) );
////            px=Integer.parseInt(m.group(0));
////        }else {
////            System.out.println("NO MATCH");
////        }
////        System.out.println("*********************************");
////        System.out.println("Width_value: "+ width_value);
////        int click_px_number=(60*px)/total_seconds;
////        System.out.println("*********************************");
////        System.out.println("click px number: "+ click_px_number);
////    }
//    private WebElement fluentWait(final By locator) {
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(10))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(locator);
//            }
//        });
//
//        return  foo;
//    };
}


