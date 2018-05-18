package appObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadastroAppObject {

	private WebDriver driver;
	
	public CadastroAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNomeCompletoTextField() {
		return this.driver.findElement(By.id("nome"));
	}
	
	public WebElement getEmailTextField() {
		return this.driver.findElement(By.id("email"));
	}
	
	public WebElement getSenhaTextField() {
		return this.driver.findElement(By.id("password"));
	}
	
	public WebElement getConfirmaSenhaTextField() {
		return this.driver.findElement(By.id("passconf"));
	}
	
	public WebElement getTelefoneTextField() {
		return this.driver.findElement(By.id("telefone"));
	}
	
	public WebElement getCidadeComboBox() {
		WebElement cidadeSelecionada = this.driver.findElement(By.id("cidade"));

		return cidadeSelecionada;
	}
	
	public WebElement getCadastrarButton() {
		//return this.driver.findElement(By.className("btn btn-success"));
		return this.driver.findElement(By.cssSelector("#cadastrar > fieldset > div:nth-child(8) > div > input"));
	}
}
