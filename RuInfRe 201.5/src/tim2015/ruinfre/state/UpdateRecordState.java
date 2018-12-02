package tim2015.ruinfre.state;

import tim2015.ruinfre.view.main.StateView;
import tim2015.ruinfre.view.main.UpdateRecordView;

public class UpdateRecordState extends State
{
	private StateView mediator;
	public UpdateRecordState(StateView med)
	{
		this.mediator = med;
	}
	@Override
	public void show() 
	{
		mediator.setMainPanel(new UpdateRecordView());
	}
	
}
