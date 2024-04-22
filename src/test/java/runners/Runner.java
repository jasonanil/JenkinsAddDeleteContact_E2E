package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {//report plugins
                "pretty",//konsola renkli log yapar
                "html:target/reports/html-reports/default-cucumber-reports.html",//html formatinda rapor almak icin kullanilan plugin
                "json:target/reports/json-reports/cucumber1.json",//json formatinda rapor almak icin kullanilan plugin
                "junit:target/reports/xml-reports/cucumber1.xml",//xml formatinda rapor almak icin kullanilan plugin
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" //Spark peport için
        },
        monochrome = false,//Konsol çıktılarını daha düzenli yazdırır
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@AddContact",
        dryRun = false // 'dryRun = true' ==>Eksik step definition olup olmadığını kontrol eder. Testi çalıştırmaz.

)
public class Runner {}
