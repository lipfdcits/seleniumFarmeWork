package com.lpf.driver.tools;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OESMenu {
	/*##############################################################################################################
	 * 功能：打开二级菜单
	 * 输入：driver, 一级菜单名称，二级菜单名称
	 * 输出：
	 */
	public static void open(WebDriver driver,String level_1_name,String level_2_name){
		WebElement ul_1 = driver.findElement(By.id("sidebar"));
		List list_level_1_menu = ul_1.findElements(By.xpath("child::li"));
		//System.out.println("li_1共有"+list_level_1_menu.size()+"个");
		for(Iterator iter1 = list_level_1_menu.iterator();iter1.hasNext();){
			WebElement li_1 = (WebElement)(iter1.next());
			WebElement li_1_a = li_1.findElement(By.tagName("a"));
			//System.out.println(li_1_a.getAttribute("title"));
			if(li_1_a.getAttribute("title").equals(level_1_name)){
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_1);
				if(li_1.getAttribute("class").equals("hasChild")){
					li_1.click();
				}
				Wait.time(500);

				//点击二级菜单
				WebElement ul_2 = li_1.findElement(By.tagName("ul"));
				List list_level_2_menu = ul_2.findElements(By.xpath("child::li"));
				//System.out.println("li_2共有"+list_level_2_menu.size()+"个");
				for(Iterator iter2 = list_level_2_menu.iterator();iter2.hasNext();){
					WebElement li_2 = (WebElement)(iter2.next());
					WebElement li_2_a = li_2.findElement(By.tagName("a"));
					//System.out.println(li_2_a.getAttribute("title"));
					if(li_2_a.getAttribute("title").equals(level_2_name)){
						((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_2);
						li_2.click();
						Wait.time(500);
						return;
					}
				}
			}
		}
	}

	/*##############################################################################################################
	 * 功能：打开三级菜单
	 * 输入：driver, 一级菜单名称，二级菜单名称，三级菜单名称
	 * 输出：
	 */
	public static void open(WebDriver driver,String level_1_name,String level_2_name,String level_3_name){
		WebElement ul_1 = driver.findElement(By.id("sidebar"));
		List list_level_1_menu = ul_1.findElements(By.xpath("child::li"));
		//System.out.println("li_1共有"+list_level_1_menu.size()+"个");
		for(Iterator iter1 = list_level_1_menu.iterator();iter1.hasNext();){
			WebElement li_1 = (WebElement)(iter1.next());
			WebElement li_1_a = li_1.findElement(By.tagName("a"));
			//System.out.println(li_1_a.getAttribute("title"));
			if(li_1_a.getAttribute("title").equals(level_1_name)){
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_1);
				if(li_1.getAttribute("class").equals("hasChild")){
					li_1.click();
				}
				Wait.time(500);

				//点击二级菜单
				WebElement ul_2 = li_1.findElement(By.tagName("ul"));
				List list_level_2_menu = ul_2.findElements(By.xpath("child::li"));
				//System.out.println("li_2共有"+list_level_2_menu.size()+"个");
				for(Iterator iter2 = list_level_2_menu.iterator();iter2.hasNext();){
					WebElement li_2 = (WebElement)(iter2.next());
					WebElement li_2_a = li_2.findElement(By.tagName("a"));
					//System.out.println(li_2_a.getAttribute("title"));
					if(li_2_a.getAttribute("title").equals(level_2_name)){
						((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_2);
						if(!(li_2.getAttribute("class").contains("open"))){
							li_2.click();
						}
						Wait.time(500);

						//点击三级菜单
						WebElement ul_3 = li_2.findElement(By.tagName("ul"));
						List list_level_3_menu = ul_3.findElements(By.xpath("child::li"));
						//System.out.println("li_3共有"+list_level_3_menu.size()+"个");
						for(Iterator iter3 = list_level_3_menu.iterator();iter3.hasNext();){
							WebElement li_3 = (WebElement)(iter3.next());
							WebElement li_3_a = li_3.findElement(By.tagName("a"));
							//System.out.println(li_3_a.getAttribute("title"));
							if(li_3_a.getAttribute("title").equals(level_3_name)){
								((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_3);
								li_3.click();
								Wait.time(500);
								return;
							}
						}
					}
				}
			}
		}
	}
	/*##############################################################################################################
	 * 功能：打开四级菜单
	 * 输入：driver, 一级菜单名称，二级菜单名称，三级菜单名称，四级菜单名称
	 * 输出：
	 */
	public static void open(WebDriver driver,String level_1_name,String level_2_name,String level_3_name,String level_4_name){
		WebElement ul_1 = driver.findElement(By.id("sidebar"));
		List list_level_1_menu = ul_1.findElements(By.xpath("child::li"));
		//System.out.println("li_1共有"+list_level_1_menu.size()+"个");
		for(Iterator iter1 = list_level_1_menu.iterator();iter1.hasNext();){
			WebElement li_1 = (WebElement)(iter1.next());
			WebElement li_1_a = li_1.findElement(By.tagName("a"));
			//System.out.println(li_1_a.getAttribute("title"));
			if(li_1_a.getAttribute("title").equals(level_1_name)){
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_1);
				if(li_1.getAttribute("class").equals("hasChild")){
					li_1.click();
				}
				Wait.time(500);

				//点击二级菜单
				WebElement ul_2 = li_1.findElement(By.tagName("ul"));
				List list_level_2_menu = ul_2.findElements(By.xpath("child::li"));
				//System.out.println("li_2共有"+list_level_2_menu.size()+"个");
				for(Iterator iter2 = list_level_2_menu.iterator();iter2.hasNext();){
					WebElement li_2 = (WebElement)(iter2.next());
					WebElement li_2_a = li_2.findElement(By.tagName("a"));
					//System.out.println(li_2_a.getAttribute("title"));
					if(li_2_a.getAttribute("title").equals(level_2_name)){
						((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_2);
						if(!(li_2.getAttribute("class").contains("open"))){
							li_2.click();
						}
						Wait.time(500);

						//点击三级菜单
						WebElement ul_3 = li_2.findElement(By.tagName("ul"));
						List list_level_3_menu = ul_3.findElements(By.xpath("child::li"));
						//System.out.println("li_3共有"+list_level_3_menu.size()+"个");
						for(Iterator iter3 = list_level_3_menu.iterator();iter3.hasNext();){
							WebElement li_3 = (WebElement)(iter3.next());
							WebElement li_3_a = li_3.findElement(By.tagName("a"));
							//System.out.println(li_3_a.getAttribute("title"));
							if(li_3_a.getAttribute("title").equals(level_3_name)){
								((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_3);
								if(!(li_3.getAttribute("class").contains("open"))){
									li_3.click();
								}
								Wait.time(500);

								//点击四级菜单
								WebElement ul_4 = li_3.findElement(By.tagName("ul"));
								List list_level_4_menu = ul_4.findElements(By.xpath("child::li"));
								//System.out.println("li_4共有"+list_level_4_menu.size()+"个");
								for(Iterator iter4 = list_level_4_menu.iterator();iter4.hasNext();){
									WebElement li_4 = (WebElement)(iter4.next());
									WebElement li_4_a = li_4.findElement(By.tagName("a"));
									//System.out.println(li_4_a.getAttribute("title"));
									if(li_4_a.getAttribute("title").equals(level_4_name)){
										((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_4);
										li_4.click();
										Wait.time(500);
										return;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	/*##############################################################################################################
	 * 功能：打开五级菜单
	 * 输入：driver, 一级菜单名称，二级菜单名称，三级菜单名称，四级菜单名称，五级菜单名称
	 * 输出：
	 */
	public static void open(WebDriver driver,String level_1_name,String level_2_name,String level_3_name,String level_4_name,String level_5_name){
		WebElement ul_1 = driver.findElement(By.id("sidebar"));
		List list_level_1_menu = ul_1.findElements(By.xpath("child::li"));
		//System.out.println("li_1共有"+list_level_1_menu.size()+"个");
		for(Iterator iter1 = list_level_1_menu.iterator();iter1.hasNext();){
			WebElement li_1 = (WebElement)(iter1.next());
			WebElement li_1_a = li_1.findElement(By.tagName("a"));
			//System.out.println(li_1_a.getAttribute("title"));
			if(li_1_a.getAttribute("title").equals(level_1_name)){
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_1);
				if(li_1.getAttribute("class").equals("hasChild")){
					li_1.click();
				}
				Wait.time(500);

				//点击二级菜单
				WebElement ul_2 = li_1.findElement(By.tagName("ul"));
				List list_level_2_menu = ul_2.findElements(By.xpath("child::li"));
				//System.out.println("li_2共有"+list_level_2_menu.size()+"个");
				for(Iterator iter2 = list_level_2_menu.iterator();iter2.hasNext();){
					WebElement li_2 = (WebElement)(iter2.next());
					WebElement li_2_a = li_2.findElement(By.tagName("a"));
					//System.out.println(li_2_a.getAttribute("title"));
					if(li_2_a.getAttribute("title").equals(level_2_name)){
						((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_2);
						if(!(li_2.getAttribute("class").contains("open"))){
							li_2.click();
						}
						Wait.time(500);

						//点击三级菜单
						WebElement ul_3 = li_2.findElement(By.tagName("ul"));
						List list_level_3_menu = ul_3.findElements(By.xpath("child::li"));
						//System.out.println("li_3共有"+list_level_3_menu.size()+"个");
						for(Iterator iter3 = list_level_3_menu.iterator();iter3.hasNext();){
							WebElement li_3 = (WebElement)(iter3.next());
							WebElement li_3_a = li_3.findElement(By.tagName("a"));
							//System.out.println(li_3_a.getAttribute("title"));
							if(li_3_a.getAttribute("title").equals(level_3_name)){
								((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_3);
								if(!(li_3.getAttribute("class").contains("open"))){
									li_3.click();
								}
								Wait.time(500);

								//点击四级菜单
								WebElement ul_4 = li_3.findElement(By.tagName("ul"));
								List list_level_4_menu = ul_4.findElements(By.xpath("child::li"));
								//System.out.println("li_4共有"+list_level_4_menu.size()+"个");
								for(Iterator iter4 = list_level_4_menu.iterator();iter4.hasNext();){
									WebElement li_4 = (WebElement)(iter4.next());
									WebElement li_4_a = li_4.findElement(By.tagName("a"));
									//System.out.println(li_4_a.getAttribute("title"));
									if(li_4_a.getAttribute("title").equals(level_4_name)){
										((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_4);
										if(!(li_4.getAttribute("class").contains("open"))){
											li_4.click();
										}
									}
									Wait.time(500);

									//点击五级菜单
									WebElement ul_5 = li_4.findElement(By.tagName("ul"));
									List list_level_5_menu = ul_5.findElements(By.xpath("child::li"));
									//System.out.println("li_5共有"+list_level_5_menu.size()+"个");
									for(Iterator iter5 = list_level_5_menu.iterator();iter5.hasNext();){
										WebElement li_5 = (WebElement)(iter5.next());
										WebElement li_5_a = li_5.findElement(By.tagName("a"));
										//System.out.println(li_5_a.getAttribute("title"));
										if(li_5_a.getAttribute("title").equals(level_5_name)){
											((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);", li_5);
											li_5.click();
											Wait.time(500);
											return;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
