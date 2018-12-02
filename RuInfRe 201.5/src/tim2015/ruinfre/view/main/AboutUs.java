package tim2015.ruinfre.view.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AboutUs extends JFrame
{

	private static final long serialVersionUID = 1L;

	public AboutUs() 
	{
		this.setSize(new Dimension(700, 400));

		this.setTitle("About");

		setResizable(false);
		
		JPanel main_panel = new JPanel(new BorderLayout());

		JPanel title_panel = new JPanel();

		JLabel title = new JLabel("Tim 201.5", SwingConstants.CENTER);

		title.setFont(new Font(title.getFont().getFontName(), Font.BOLD, 16));

		JPanel background = new JPanel(new GridLayout(1, 2));

		JLabel first_label = new JLabel("Aleksandar Micic", SwingConstants.CENTER);
		
		first_label.setIcon(new ImageIcon(this.getClass().getResource("/resources/micic.jpg")));
		
		first_label.setHorizontalTextPosition(JLabel.CENTER);

		first_label.setVerticalTextPosition(JLabel.BOTTOM);
		
		

		JLabel second_label = new JLabel("Andrija Petrovic", SwingConstants.CENTER);

		second_label.setIcon(new ImageIcon(this.getClass().getResource("/resources/andrija.jpg")));
		
		second_label.setHorizontalTextPosition(JLabel.CENTER);

		second_label.setVerticalTextPosition(JLabel.BOTTOM);

		JLabel third_label = new JLabel("Aleksandar Karpuzov", SwingConstants.CENTER);

		third_label.setIcon(new ImageIcon(this.getClass().getResource("/resources/karp.jpg")));
		
		third_label.setHorizontalTextPosition(JLabel.CENTER);

		third_label.setVerticalTextPosition(JLabel.BOTTOM);

		JLabel fourth_label = new JLabel("Nemanja Nedeljkovic", SwingConstants.CENTER);

		fourth_label.setIcon(new ImageIcon(this.getClass().getResource("/resources/nemanja.jpg")));
		
		fourth_label.setHorizontalTextPosition(JLabel.CENTER);

		fourth_label.setVerticalTextPosition(JLabel.BOTTOM);

		background.add(first_label);

		background.add(second_label);

		background.add(third_label);

		background.add(fourth_label);

		title_panel.add(title);

		this.add(main_panel);

		main_panel.add(title_panel, BorderLayout.NORTH);

		main_panel.add(background, BorderLayout.CENTER);

		this.setLocationRelativeTo(null);

		this.setVisible(true);

		this.setDefaultCloseOperation(AboutUs.DISPOSE_ON_CLOSE);
	}
}
