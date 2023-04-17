package com.testmercadolibre.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testPage extends Base {
	
	By btnCountry = By.linkText("México");
	
	By initialImg = By.id("nav-skip-to-main-content");
	By productLocation = By.id("cb1-edit");
	By pushSearchButoon = By.id("Buscar");
	By newArticle = By.tagName("Nuevo");
	By locationArea By.tagName("Distrito Federal ");
	By relevantsPrice By.tagName("Más relevantes");
	By higherPrice By.tagName("Mayor precio");
	
	By firstArticle By.name("Sony PlayStation 4 500GB 20th Anniversary Edition color  original gray");
	By secondArticle By.name("Sony Playstation 4 Edición 20 Aniversario / 20th Anniversary");
	
	By threeArticle By.name("Sony Playstation 4 Pro 500 Millones / 500 Million Limited");
	By fourArticle By.name("Sony PlayStation 4 Pro 2TB 500 Million Limited Edition color  azul translúcido");
	By fiveArticle By.name("Consola Ps4 Pro The Last Of Us 2");
	
	
	public testPage (WebDriver driver) {
		super (driver);
		// TODO Auto-generated constructor stub
	}
	public void BtnCountry() throws InterruptedException {
		click(btnCountry);
		Thread.sleep(2000);
		if (isDisplayed(initialImg)){
			type("productLocation", "playStation 4" );
			driver.findElement(pushSearchButoon).click();
		}
		
	}
	
	public void newArticle()throws InterruptedException{
		click (newArticle);
		Thread.sleep(2000);
		if(isDisplayed(newArticle)) {
			driver.findElement(locationArea).click();
		}else {
			System.out.print("pages not found");
		}
		
	public void ()throws InterruptedException{
		click("higherPrice");
		Thread.sleep(2000);
		if (isDisplayed(fistArticle)) {
			driver.findElement(firstArticle).click();
			drive.findElement(initialImg);
			drive.findElement(secondArticle);
			drive.findElement(initialImg);
			drive.findElement(threeArticle);
			drive.findElement(initialImg);
			drive.findElement( fourArticle);
			drive.findElement(initialImg);
			drive.findElement(fiveArticle);
		}else
			
			if (isDisplayed(fiveArticle));
		
			System.out.print(firstArticle,SecondArticle,threeArticle, fourArticle,fiveArticle );
	}
	

		
		
	}
}
