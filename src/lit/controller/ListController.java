package lit.controller;
//importing information from the model file using lit.model.Donut    lit.model says where and .Donut says what I want in that file. 
import java.util.List;
import java.util.ArrayList;
import lit.model.Donut;
import lit.view.PopupDisplay;

public class ListController 
{
	//< > are gang signs.   
	private List<Donut> donutList;
	private List<String> toppingList;
	private PopupDisplay display;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(new Donut());
		fillTheList();
		showTheList();
		changeTheList();
		showTheList();
//		displayText();
//		listTheToppings();
	}
	
	private void showTheList()
	{
		String favorite = "Glazed with sprinkles, but only sprinkles on half of it";
		for (int index = 0; index < donutList.size(); index +=1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			Donut currentDonut = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			
//			if (currentFlavor.equals(favorite)) 
//This		{
//loops			for (int woop = 0; woop < 5; woop +=1)
//every			{
//letter				display.displayText("The best flavor ever!!!!");
//in				}
//the		}
//list		for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
//			{
//				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
//			}
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("Jelly Filled!");
		Donut springSmitch = new Donut("Spring-Smitch for Luniticks!");
		Donut chocolate = new Donut("Chocolate Yummy!");
		Donut glazed = new Donut("Glaze it!");
		Donut creamFilled = new Donut("Mmmmmm... Creamy!");
		
		donutList.add(jellyFilled);
		donutList.add(springSmitch);
		donutList.add(chocolate);
		donutList.add(glazed);
		donutList.add(creamFilled);
	}

	private void listTheToppings()
	{	
		toppingList.add("sprinklez");
		toppingList.add("fudge");
		toppingList.add("bleach");
		toppingList.add("ginger");
		toppingList.add("glassShards");
		toppingList.add("usedMedicalNeedles");
		toppingList.add("hornets");
		toppingList.add("icyHot");
		toppingList.add("swass");
	}
	
	private void changeTheList()
	{
		display.displayText("The donut menu has " + donutList.size() + " items.");
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + "was removed from the menu");
		display.displayText("Now the menu has " + donutList.size() + " items.");
		donutList.add(removed);
		
		display.displayText("The menu has been updated to have " + donutList.size() + " items.");
		removed =  donutList.set(3, new Donut());
		display.displayText("The donut with the flavor " + removed.getFlavor() + " has been removed from the menu");
		
		Donut donutDonut = new Donut("Donut Donut!");
		donutList.add(donutDonut);
		
		display.displayText("This is the new Donut Menu.");
	}
	private void displayText()
	{
		display.displayText("Here are the different toppings that you may put on your donut.");
		
		for (int index = 0; index < toppingList.size(); index +=1)
		{
			display.displayText(toppingList);
		}
	}

	public ArrayList<Donut> getDonutLIst()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}

}
