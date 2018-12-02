package tim2015.ruinfre.state;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.AddRecordView;
import tim2015.ruinfre.view.main.DeleteRecordView2;
import tim2015.ruinfre.view.main.StateView;

public class DeleteRecord2State extends State
{
	private StateView mediator;
	private Entity entity;
	public DeleteRecord2State(StateView med,Entity entity)
	{
		this.mediator = med;
		this.entity = entity;
	}
	@Override
	public void show()
	{
		mediator.setMainPanel(new DeleteRecordView2(entity));
	}
}
