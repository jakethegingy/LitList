package useful.controller;
//importing information from the model file using lit.model.Donut    lit.model says where and .Donut says what I want in that file. 
import java.util.List;
import java.util.ArrayList;

import useful.model.Donut;
import useful.view.PopupDisplay;

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
		toppingList = new ArrayList<String>();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		ArrayList<String> tempList = new ArrayList<String>();
		tempList.add("this is a word sequence");
		tempList.add("DonutTests.zip");
		tempList.add("");
		tempList.add("My name is inigomontoya, prepare to die.");
		display.displayText("the longest string in the templist is: " + maxLength(tempList) + " long.");
		display.displayText("It is: " + longestString(tempList) + " this long.");
		donutList.add(new Donut());
		fillTheList();
		showTheList();
		changeTheList();
		showTheList();
		listTheToppings();
		displayToppings();
		
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
		toppingList.add("Sprinklez");
		toppingList.add("Fudge");
		toppingList.add("Bleach");
		toppingList.add("Ginger");
		toppingList.add("Glass Shards");
		toppingList.add("Used Medical Needles");
		toppingList.add("Hornets");
		toppingList.add("Icy Hot");
		toppingList.add("Swass");
	}
	
	public String longestString(ArrayList<String> myList)
	{
		int max = 0;
		String longest = "";
		
		for (int index = 0; index < myList.size(); index += 1)
		{
			if (myList.get(index).length() > max)
			{
				max = myList.get(index).length();
				longest = myList.get(index);
			}
		}
		
		return longest;
	}
	
	public int maxLength(ArrayList<String>myList)
	{
		int max = 0;
		for(int index = 0; index < myList.size(); index +=1)
		{
			if (max < myList.get(index).length())
			{
				max = myList.get(index).length();
			}
		}
		return max;
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
	private void displayToppings()
	{
		display.displayText("Here are the different toppings that you may put on your donut.");
		
		for (int index = 0; index < toppingList.size(); index +=1)
		{
			display.displayText(toppingList.get(index));
		}
	}

	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}

}
