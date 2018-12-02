package tim2015.ruinfre.state;

import tim2015.ruinfre.view.main.AddRecordView;
import tim2015.ruinfre.view.main.DeleteRecordView;
import tim2015.ruinfre.view.main.StateView;

public class DeleteRecordState extends State
{
	private StateView mediator;
	private String[] redKojiSeBrise;
	public DeleteRecordState(StateView med,String[] redKojiSeBrise)
	{
		this.mediator = med;
		this.redKojiSeBrise = redKojiSeBrise;
	}
	@Override
	public void show() 
	{
		mediator.setMainPanel(new DeleteRecordView(redKojiSeBrise));
	}
	
}
