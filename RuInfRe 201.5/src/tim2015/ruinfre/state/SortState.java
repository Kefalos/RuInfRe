package tim2015.ruinfre.state;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.AddRecordView2;
import tim2015.ruinfre.view.main.SortView;
import tim2015.ruinfre.view.main.StateView;

public class SortState extends State
{
	private StateView mediator;
	private Entity entity;
	public SortState(StateView med,Entity entity)
	{
		this.entity = entity;
		this.mediator = med;
	}
	@Override
	public void show()
	{
		mediator.setMainPanel(new SortView(entity));
	}
	
}
