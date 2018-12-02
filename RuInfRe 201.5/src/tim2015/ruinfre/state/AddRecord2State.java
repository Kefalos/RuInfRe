package tim2015.ruinfre.state;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.AddRecordView2;
import tim2015.ruinfre.view.main.StateView;

public class AddRecord2State extends State
{
	private StateView mediator;
	private Entity entity;
	public AddRecord2State(StateView med,Entity entity)
	{
		this.entity = entity;
		this.mediator = med;
	}
	@Override
	public void show() 
	{
		mediator.setMainPanel(new AddRecordView2(entity));
	}
	
}
