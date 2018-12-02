package tim2015.ruinfre.view.main;

import java.awt.*;
import java.util.List;

import javax.swing.*;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.model.Relation;
import tim2015.ruinfre.model.Resource;
import tim2015.ruinfre.util.SqlUtil;
import tim2015.ruinfre.view.tree.ResourceNode;

public class RelationView extends JPanel
{
    private JTabbedPane tab = new JTabbedPane();

    public RelationView(Entity entity)
    {
        this.add(tab,BorderLayout.CENTER);

        setVisible(true);

        for(Resource child: entity.getChildrenReadOnly()) {
            if (child instanceof Relation) {
                Entity entityRelation = (Entity) ResourceView.findParentOfEntityWithKey((Resource) ((ResourceNode<?>) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot()).getItem(), ((Relation) child).getRelation());

                ResourceView rv = new ResourceView(entityRelation, true);

                tab.add(rv);

                try {
                    //rv.loadSql();
                    this.repaint();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
