package employee;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SuperEmployeeView {
	JFrame frame;
	JTextField nameText;
	JTextField ageText;
	JButton saveBtn;
	JComboBox sexBox;

	public void init() {
		frame = new JFrame();
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel mainPanel = (JPanel) frame.getContentPane();
		BoxLayout boxLayout = new BoxLayout(mainPanel, BoxLayout.Y_AXIS);
		mainPanel.setLayout(boxLayout);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		JPanel panel4 = new JPanel();
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);

		JLabel nameLabel = new JLabel();
		nameLabel.setText("姓名");
		panel1.add(nameLabel);
		nameText = new JTextField();
		nameText.setPreferredSize(new Dimension(100, 30));
		panel1.add(nameText);

		JLabel sexLabel = new JLabel();
		sexLabel.setText("性别");
		panel2.add(sexLabel);
		// sexText = new JTextField();
		// sexText.setPreferredSize(new Dimension(100, 30));
		// panel2.add(sexText);
		sexBox = new JComboBox();
		sexBox.addItem("男");
		sexBox.addItem("女");
		sexBox.setPreferredSize(new Dimension(100, 30));
		panel2.add(sexBox);

		JLabel ageLabel = new JLabel();
		ageLabel.setText("年龄");
		panel3.add(ageLabel);
		ageText = new JTextField();
		ageText.setPreferredSize(new Dimension(100, 30));
		panel3.add(ageText);

		saveBtn = new JButton();
		saveBtn.setText("保存");
		saveBtn.setPreferredSize(new Dimension(100, 30));
		panel4.add(saveBtn);

		frame.setVisible(true);// 可见性
	}

}
