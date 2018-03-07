import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ChooseFlag extends JFrame {

	private JButton btBrazil, btIreland, btItaly;
	private Icon imgBrazil, imgIreland, imgItaly;
	private JLabel labelBrazil, labelIreland, labelItaly;
	private JPanel panelNorth;

	public ChooseFlag() {
		initComponents();
		setEvents();
	}

	private void initComponents() {
		
		setTitle("Choose  Flag");
		setBounds(0, 0, 600, 600);

		btBrazil = new JButton("Brazil");
		btIreland = new JButton("Ireland");
		btItaly = new JButton("Italy");

		btBrazil.setBackground(Color.GREEN);

		imgBrazil = new ImageIcon("Images//Brazil.gif");
		imgIreland = new ImageIcon("Images//Ireland.gif");
		imgItaly = new ImageIcon("Images//Italy.gif");

		labelBrazil = new JLabel(imgBrazil);
		labelIreland = new JLabel(imgIreland);
		labelItaly = new JLabel(imgItaly);

		labelBrazil.setPreferredSize(new Dimension(300, 200));
		labelIreland.setPreferredSize(new Dimension(300, 200));
		labelItaly.setPreferredSize(new Dimension(300, 200));

		panelNorth = new JPanel();
		panelNorth.add(btBrazil);
		panelNorth.add(btIreland);
		panelNorth.add(btItaly);
		panelNorth.setBackground(Color.BLACK);

		add(panelNorth, "North");

	}

	private void setEvents() {

		btBrazil.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JPanel panel = new JPanel();
				panel.add(labelBrazil);
				panel.setBackground(Color.BLACK);
				add(panel, "Center");

				JLabel label = new JLabel("Brazil", JLabel.LEFT);
				label.setForeground(Color.CYAN);
				label.setFont(new Font("Arial Narrow", Font.BOLD, 80));
				label.setPreferredSize(new Dimension(500, 250));

				JPanel panel2 = new JPanel();
				panel2.setBackground(Color.BLACK);
				panel2.add(label);

				add(panel2, "South");

				setVisible(true);
				validate();

			}
		});

		btIreland.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JPanel panel = new JPanel();
				panel.setBackground(Color.BLACK);
				panel.add(labelIreland);
				add(panel, "Center");

				JLabel label = new JLabel("Ireland", JLabel.CENTER);
				label.setForeground(Color.CYAN);
				label.setFont(new Font("Arial Narrow", Font.BOLD, 80));
				label.setPreferredSize(new Dimension(500, 250));

				JPanel panel2 = new JPanel();
				panel2.setBackground(Color.BLACK);

				panel2.add(label);

				add(panel2, "South");

				setVisible(true);
				validate();

			}
		});

		btItaly.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JPanel panel = new JPanel();
				panel.setBackground(Color.BLACK);
				panel.add(labelItaly);
				add(panel, "Center");

				JLabel label = new JLabel("Italy", JLabel.RIGHT);
				label.setForeground(Color.CYAN);
				label.setFont(new Font("Arial Narrow", Font.BOLD, 80));
				label.setPreferredSize(new Dimension(500, 250));

				JPanel panel2 = new JPanel();
				panel2.setBackground(Color.BLACK);

				panel2.add(label);

				add(panel2, "South");

				setVisible(true);
				validate();

			}
		});

	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				ChooseFlag chooseFlag = new ChooseFlag();
				chooseFlag.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
				chooseFlag.setLocation((tela.width - chooseFlag.getSize().width) / 2,
						(tela.height - chooseFlag.getSize().height) / 2);
				chooseFlag.setVisible(true);
			}
		});
	}

}
