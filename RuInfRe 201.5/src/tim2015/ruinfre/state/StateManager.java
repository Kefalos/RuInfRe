package tim2015.ruinfre.state;


import tim2015.ruinfre.view.main.StateView;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.state.State;

public class StateManager 
{
	private State currentState;
	
	private AddRecord2State addRecord2;
	private AddRecordState addRecord;
	private OffState Off;
	private DeleteRecordState deleteRecord;
	private DeleteRecord2State deleteRecord2;
	private UpdateRecordState updateRecord;
	private UpdateRecord2State updateRecord2;
	private SearchState searchState;
	private SortState sortState;
	private RelationState relationState;
	
	private String[] redKojiSeBrise;
	private StateView med;
	public StateManager(StateView med)
	{
		this.med = med;
		addRecord = new AddRecordState(med);
		
		Off = new OffState(med);
		
		//deleteRecord2 = new DeleteRecord2State(med);
		updateRecord = new UpdateRecordState(med);
		
		
	}
	

	//public void setAddRecord2() {
		//this.currentState = addRecord2;
		//addRecord2.show();
	//}

	//public void setAddRecord() {
	//this.currentState = addRecord;
	//addRecord.show();
	//}

	public void setDeleteRecord(String[] redKojiSeBrise)
	{
		deleteRecord = new DeleteRecordState(med, redKojiSeBrise);
		this.currentState = deleteRecord;
		deleteRecord.show();
	}

	public void setDeleteRecord2(Entity entity) 
	{
		deleteRecord2 = new DeleteRecord2State(med, entity);
		this.currentState = deleteRecord2;
		deleteRecord2.show();
	}

	public void setUpdateRecord() 
	{
		this.currentState = updateRecord;
		updateRecord.show();
	}

	public void setUpdateRecord2(Entity entity) 
	{
		updateRecord2 =  new UpdateRecord2State(med, entity);
		this.currentState = updateRecord2;
		updateRecord2.show();
	}

	public void setAddRecord2State(Entity entity)
	{
		addRecord2 = new AddRecord2State(med,entity);
		this.currentState = addRecord2; 
		addRecord2.show();
	}
	public void setAddRecordState()
	{
		this.currentState = addRecord; 
		addRecord.show();
	}
	public void setOffState()
	{
		this.currentState = Off; 
		Off.show();
	}
	public void setSearchState()
	{
		this.currentState = searchState; 
		searchState.show();
	}
	public void setSortState(Entity entity)
	{
		sortState = new SortState(med, entity);
		this.currentState = sortState; 
		sortState.show();
	}
	public void setSearchState(Entity entity)
	{
		searchState = new SearchState(med, entity);
		this.currentState = searchState; 
		searchState.show();
	}
	public void setRelationState(Entity entity)
	{
		relationState = new RelationState(med, entity);
		this.relationState = relationState;
		relationState.show();
	}
	public State getCurrentState()
	{
		return currentState;
	}
}
