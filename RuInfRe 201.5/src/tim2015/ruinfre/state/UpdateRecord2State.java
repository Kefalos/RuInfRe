package tim2015.ruinfre.state;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.StateView;
import tim2015.ruinfre.view.main.UpdateRecordView2;

public class UpdateRecord2State extends State
{
	private StateView mediator;
	private Entity entity;
	public UpdateRecord2State(StateView med, Entity entity)
	{
		this.mediator = med;
		this.entity = entity;
	}
	
	@Override
	public void show()
	{
		mediator.setMainPanel(new UpdateRecordView2(entity));
	}
}
