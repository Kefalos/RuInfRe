package tim2015.ruinfre.state;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.*;

public class RelationState extends State
{
    private StateView mediator;
    private Entity entity;
    public RelationState(StateView med,Entity entity)
    {
        this.mediator = med;
        this.entity = entity;
    }
    @Override
    public void show()
    {
        mediator.setMainPanel(new RelationView(entity));
    }
}

