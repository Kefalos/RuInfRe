package tim2015.ruinfre.state;

import tim2015.ruinfre.view.main.AddRecordView;
import tim2015.ruinfre.view.main.StateView;

public class AddRecordState extends State
{
	private StateView mediator;
	public AddRecordState(StateView med)
	{
		this.mediator = med;
	}
	@Override
	public void show() 
	{
		mediator.setMainPanel(new AddRecordView());
	}
	
}
