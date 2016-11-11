package com.org.Tests_A;



//import java.io.File;
import java.util.List;
//import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class HelloTest {
	
	private WebDriver driver1;
	
	  @BeforeTest
	    public void beforeTest() {
	       // driver1 = new FirefoxDriver(DesiredCapabilities.firefox());
	       // driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }
	  @Test
	public void  Scenario_first(){
		
		
		
		System.setProperty("webdriver.chrome.driver", "../Tests_A/src/chrome_d/chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();// выделяем память драйверу для браузера Google Chrome
	
		driver1.manage().window().maximize();// Открыть браузер и развернуть на весь экран
		
		driver1.get("https://yandex.ru");//Зайти на yandex.ru.
		
		try{
			
		Thread.sleep(100);
			
		 driver1.findElement(By.linkText("Маркет")).click();//Перейти в яндекс маркет
		 
		 driver1.findElement(By.linkText("Электроника")).click();//Выбрать раздел Электроника
		 
		 driver1.findElement(By.linkText("Телевизоры")).click();// Выбрать раздел Телевизоры
		 
		 driver1.findElement(By.linkText("Расширенный поиск →")).click();//Зайти в расширенный поиск
		 
		 driver1.findElement(By.cssSelector("input#glf-pricefrom-var")).sendKeys("20000");//Задать параметр поиска от 20000 рублей.
		 
		 driver1.findElement(By.id("glf-1801946-1871499")).click(); 
		 driver1.findElement(By.id("glf-1801946-1871447")).click();//Выбрать производителей Samsung и LG
		
		 
		//((JavascriptExecutor) driver1).executeScript("document.getElementsByClassName('button').click()");

	/*
	 * Обратиться к этой кнопке не получается, локатор неверный ((,  как только не try
		 WebDriverWait wait = new WebDriverWait(driver1, 30);
		 wait.until(ExpectedConditions.elementToBeClickable(By.className("button button_action_n-filter-apply button_size_s button_pseudo_yes button_theme_pseudo i-bem button_js_inited")));
		
		String link = driver1.findElement(By.className("button button_action_n-filter-apply button_size_s button_pseudo_yes button_theme_pseudo i-bem button_js_inited")).getAttribute("href");
		driver1.get(link);
		*/
		    // driver1.findElement(By.xpath("//div[@id='b-toolbar__right']/div[3]/div/div[2]/div/div/span")).click();
			// driver1.findElement(By.xpath("//*[@id='']")).click();
			 //driver1.findElement(By.className("")).click();
		 
		// WebElement searchButton = driver1.findElement(By.cssSelector("div#n-filter-panel-aside__apply"));
	   //  searchButton.click();
	
	//список найденых элементов
		 List<WebElement> elements = driver1.findElements(By.className("snippet-card__header-text"));//"snippet-card__header-link shop-history__link link i-bem link_js_inited"));//
		
		 if (elements.size() == 12)  // Проверить, что элементов на странице 12.
		 {
			 
			 
			 	String el_first = elements.get(1).getText();//11.Запомнить первый элемент в списке.
			 	
			 	driver1.findElement(By.cssSelector("input#header-search")).sendKeys(el_first);//В поисковую строку ввести запомненное значение.
			
			 	String str=((WebElement) driver1.findElement(By.className("snippet-card__header-text"))).getText();
				
				
				 //Найти и проверить, что наименование товара соответствует запомненному значению.
				if (el_first.equalsIgnoreCase(str)==true) { 
					
					System.out.println("13.- наименование товара соответствует");
					}
				 else
				    {
				    System.out.println("13.-наименование товара несоответствует,"+str+" | "+el_first);
				    }
		 }
	
		//(driver1.findElement(By.cssSelector(elements.get(1).getText())).getText().contains(text));
		 

		
		System.out.println("Hello, this test1 is work");
		}catch(Exception e)
		{
			System.out.println("ERROR test1-----"+e);
		}
		
	}
	@Test
	public void  Scenario_second(){
		
		
		System.setProperty("webdriver.chrome.driver", "../Tests_A/src/chrome_d/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();// новый 
	
		driver1.manage().window().maximize();// Открыть браузер и развернуть на весь экран
		
		driver1.get("https://yandex.ru");//Зайти на yandex.ru.
		try{
			
		Thread.sleep(100);
			
				driver1.findElement(By.linkText("Маркет")).click();//Перейти в яндекс маркет
				
				driver1.findElement(By.linkText("Электроника")).click();//Выбрать раздел Электроника
		 
				driver1.findElement(By.linkText("Наушники и Bluetooth-гарнитуры")).click();//5. Выбрать раздел Наушники
		 
				driver1.findElement(By.linkText("Расширенный поиск →")).click();//6. Зайти в расширенный поиск
		 
				driver1.findElement(By.cssSelector("input#glf-pricefrom-var")).sendKeys("5000");//7. Задать параметр поиска от 5000 рублей.
		
				driver1.findElement(By.id("glf-1801946-8455647")).click();//8. Выбрать производителя Beats
         

				//9. Нажать кнопку Применить.
				List<WebElement> elements = driver1.findElements(By.className("snippet-card__header-link"));//
		 
				if (elements.size() == 12)  // 10. Проверить, что элементов на странице 12.
		 	{
			 
					String el_first = elements.get(1).getText();//11.Запомнить первый элемент в списке.
		          
					driver1.findElement(By.cssSelector("input#header-search")).sendKeys(el_first);	//12. поисковую строку ввести запомненное значение.
						
					String str=((WebElement) driver1.findElement(By.className("snippet-card__header-text"))).getText();
					
					if (el_first.equalsIgnoreCase(str)==true) { //13. Найти и проверить, что наименование товара соответствует запомненному значению.
						
						System.out.println("13.- наименование товара соответствует");
						
						}
					 else
					    {
						 
					    System.out.println("13.-наименование товара несоответствует,"+str+" | "+el_first);
					    
					    }
		 	
		 	
		 	};


				
     	System.out.println("Hello, this test2 is work");
     	
		}
		catch(Exception e)
		{
			System.out.println("ERROR Test2-----"+e);
		}
		
	}
	  @AfterTest
	    public void afterTest() {
	        if (driver1 != null) {
	            driver1.quit();
	        }
	    }
}
