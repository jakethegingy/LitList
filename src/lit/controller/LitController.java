package lit.controller;
//importing information from the model file using lit.model.Donut    lit.model says where and .Donut says what I want in that file. 
import java.util.List;
import java.util.ArrayList;
import lit.model.Donut;

public class LitController 
{
	//< > are gang signs.   
	private List<Donut> donutList;
	
	public LitController()
	{
		donutList = new ArrayList<Donut>();
	}
	
	public void start()
	{
		donutList.add(new Donut());
	}
}
