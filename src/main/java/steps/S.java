package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class S {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Dado("que acesso a página ramblas assessoria")
    public void que_acesso_a_página_ramblas_assessoria() throws InterruptedException {
        driver.get("https://ramblasassessoria.com/");
        Thread.sleep(5000);
    }

    @Quando("clico no botão QA")
    public void clico_no_botão_qa() {

    }

    @Entao("devo validar o botão Ir para o topo")
    public void devo_validar_o_botão_ir_para_o_topo() {

    }

}
