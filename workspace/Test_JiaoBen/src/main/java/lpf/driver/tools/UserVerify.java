package lpf.driver.tools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserVerify {
	/*##############################################################################################################
	 * 功能：查看指定元素是否在页面中存在
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：存在返回true,不存在返回false
	 */
	public static Boolean isExistCurrentPage(WebDriver driver, String Positioningmode, String str){
		if(Positioningmode.equals("id")){
			try{
				driver.findElement(By.id(str));
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		else if (Positioningmode.equals("name")) {
			try{
				driver.findElement(By.name(str));
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		else if (Positioningmode.equals("xpath")) {
			try{
				driver.findElement(By.xpath(str));
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		else if (Positioningmode.equals("cssSelector")) {
			try{
				driver.findElement(By.cssSelector(str));
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		else if(Positioningmode.equals("linkText")){
			try{
				driver.findElement(By.linkText(str));
				return true;
			}catch(NoSuchElementException e){
				return false;
			}
		}
		return null;
	}

	/*##############################################################################################################
	 * 功能：查看指定元素是否在页面中不存在
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：存在返回false,不存在返回true
	 */
	public static Boolean isNotExistCurrentPage(WebDriver driver, String Positioningmode, String str){
		if(Positioningmode.equals("id")){
			try{
				driver.findElement(By.id(str));
				return false;
			}catch(NoSuchElementException e){
				return true;
			}
		}
		else if (Positioningmode.equals("name")) {
			try{
				driver.findElement(By.name(str));
				return false;
			}catch(NoSuchElementException e){
				return true;
			}
		}
		else if (Positioningmode.equals("xpath")) {
			try{
				driver.findElement(By.xpath(str));
				return false;
			}catch(NoSuchElementException e){
				return true;
			}
		}
		else if (Positioningmode.equals("cssSelector")) {
			try{
				driver.findElement(By.cssSelector(str));
				return false;
			}catch(NoSuchElementException e){
				return true;
			}
		}
		else if(Positioningmode.equals("linkText")){
			try{
				driver.findElement(By.linkText(str));
				return false;
			}catch(NoSuchElementException e){
				return true;
			}
		}
		return null;
	}

	/*##############################################################################################################
	 * 功能：查看指定元素是否在页面中存在,支持翻页查看
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：存在返回true,不存在返回false
	 */
	public static Boolean isExistMultiPage(WebDriver driver, String Positioningmode, String str){
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		if(Positioningmode.equals("id")){
			while(true){
				try{
					driver.findElement(By.id(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return true;
				}catch(NoSuchElementException e){
					if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						return false;
					}
				}
			}
		}else if(Positioningmode.equals("name")){
			while(true){
				try{
					driver.findElement(By.name(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return true;
				}catch(NoSuchElementException e){
					if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						return false;
					}
				}
			}
		}else if(Positioningmode.equals("xpath")){
			while(true){
				try{
					driver.findElement(By.xpath(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return true;
				}catch(NoSuchElementException e){
					/*if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					}*/
					return false;
				}
			}
		}else if(Positioningmode.equals("cssSelector")){
			while(true){
				try{
					driver.findElement(By.cssSelector(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return true;
				}catch(NoSuchElementException e){
					/*if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

					}*/
					return false;
				}
			}
		}else if(Positioningmode.equals("linkText")){
			while(true){
				try{
					driver.findElement(By.linkText(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return true;
				}catch(NoSuchElementException e){
					if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						return false;
					}
				}
			}
		}
		return null;
	}


	/*##############################################################################################################
	 * 功能：查看指定元素是否在页面中存在,支持需翻页查看
	 * 输入：webdriver,定位方式，定位字符串
	 * 输出：存在返回false,不存在返回true
	 */
	public static Boolean isNotExistMultiPage(WebDriver driver, String Positioningmode, String str){
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		if(Positioningmode.equals("id")){
			while(true){
				try{
					driver.findElement(By.id(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return false;
				}catch(NoSuchElementException e){
					if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						return true;
					}
				}
			}
		}else if(Positioningmode.equals("name")){
			while(true){
				try{
					driver.findElement(By.name(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return false;
				}catch(NoSuchElementException e){
					if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						return true;
					}
				}
			}
		}else if(Positioningmode.equals("xpath")){
			while(true){
				try{
					driver.findElement(By.xpath(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return false;
				}catch(NoSuchElementException e){
					/*if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						return true;
					}*/
					return true;
				}
			}
		}else if(Positioningmode.equals("cssSelector")){
			while(true){
				try{
					driver.findElement(By.cssSelector(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return false;
				}catch(NoSuchElementException e){
					if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						return true;
					}
				}
			}
		}else if(Positioningmode.equals("linkText")){
			while(true){
				try{
					driver.findElement(By.linkText(str));
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					return false;
				}catch(NoSuchElementException e){
					if(PageTurning.next(driver) == -1){
						driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						return true;
					}
				}
			}
		}
		return null;

	}

	/*##############################################################################################################
	 * 功能：查看指定对象是否在表格中存在，功能未实现......
	 * 输入：table，在查找的文本
	 * 输出：存在返回true,不存在返回false
	 */
//	public Boolean isExist(WebElement webelement_table, String str){
//		return null;
//	}

//	function GetInfoFromTable(tableid) {
//	    var tableInfo = "";
//	    var tableObj = document.getElementById(tableid);
//	    for (var i = 0; i < tableObj.rows.length; i++) {    //遍历Table的所有Row
//	        for (var j = 0; j < tableObj.rows[i].cells.length; j++) {   //遍历Row中的每一列
//	            tableInfo += tableObj.rows[i].cells[j].innerText;   //获取Table中单元格的内容
//	            tableInfo += "   ";
//	        }
//	        tableInfo += "\n";
//	    }
//	    return tableInfo;
//	}
}
