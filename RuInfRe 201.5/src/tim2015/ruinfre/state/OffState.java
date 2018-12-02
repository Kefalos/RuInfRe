package tim2015.ruinfre.state;

import javax.swing.JPanel;

import tim2015.ruinfre.view.main.StateView;

public class OffState extends State
{
	StateView mediator;
	public OffState(StateView med)
	{
		this.mediator = med;
	}
	@Override
	public void show() 
	{
		mediator.setMainPanel(new JPanel());
	}
	
}
