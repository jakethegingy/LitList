package lit.controller;
//importing information from the model file using lit.model.Donut    lit.model says where and .Donut says what I want in that file. 
import java.util.List;
import java.util.ArrayList;
import lit.model.Donut;
import lit.view.PopupDisplay;

public class LitController 
{
	//< > are gang signs.   
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public LitController()
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
	}
	
	private void showTheList()
	{
		String favorite = "Glazed with sprinkles, but only sprinkles on half of it";
		for (int index = 0; index < donutList.size(); index +=1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			Donut currentDonut = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			
			if (currentFlavor.equals(favorite)) 
			{
				for (int woop = 0; woop < 5; woop +=1)
				{
					display.displayText("The best flavor ever!!!!");
				}
			}
			for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
			}
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
}
