package tim2015.ruinfre.view.main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;

public class AddRecordView extends JPanel 
{

    private JButton btnCancel = new JButton("Cancel");
    private JButton btnOk = new JButton("OK");
    private TextField[] nizPolja = new TextField[MainFrame.getInstance().getOpenedEntity().getAttributeCount()];

    public AddRecordView() 
    {
	Entity entity = MainFrame.getInstance().getOpenedEntity();
	List<Attribute> atributi = entity.getAttributes();
	
	int i = 0;
	for (Attribute attribute : atributi) 
	{
		
	    nizPolja[i] = new TextField();
	    nizPolja[i].setPreferredSize(new Dimension(200, 25));
	    add(new Label(attribute.getName()));
	    add(nizPolja[i++]);
	}
	setLayout(new FlowLayout());
	
	setSize(240, 65*MainFrame.getInstance().getOpenedEntity().getAttributeCount());

	btnOk.addActionListener(l -> {
	    int j = 0;
	    String[] redKojiSeDodaje = new String[nizPolja.length];
	    for (TextField textField : nizPolja) {
		redKojiSeDodaje[j++] = textField.getText();
	}

	    try 
	    {
		tim2015.ruinfre.util.FileHandler.addRecord2(entity, redKojiSeDodaje);
	    } 
	    catch (Exception e) 
	    {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	    ((StateView) this.getParent()).startOffState();
	});
	btnCancel.addActionListener(l -> {
		((StateView) this.getParent()).startOffState();
	});

	

	add(btnCancel);
	add(btnOk);

	setVisible(true);

    }

}
