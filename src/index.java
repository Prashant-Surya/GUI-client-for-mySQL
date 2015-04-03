import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;
public class index{
	static JFrame frame= new JFrame("GUI for mySQL");
	static JPanel index = new JPanel();
	static JPanel query = new JPanel();
	static JTextField usertext = new JTextField(20);
	static JTextField pwdtext = new JTextField(20);
	static JLabel conDisp;
	static JTextArea res,qry,upd;
	static JButton but;
//	public index(){
//		GridBagLayout gb = new GridBagLayout();
//		index.setLayout(gb);
//		Color white = new Color(10);
//		GridBagConstraints constr = new GridBagConstraints();
//		constr.gridx=40;
//		constr.gridy=40;
//		gb.setConstraints(user, constr);
//		constr.gridy=60;
//		gb.setConstraints(usertext, constr);
//		constr.gridy=80;
//		gb.setConstraints(pwd, constr);
//		constr.gridy=100;
//		gb.setConstraints(pwdtext, constr);
//		index.setBackground(white);
//
//		
//	}
	public index(){
		
		GridLayout gl=new GridLayout(100,1);
		index.setLayout(gl);
	}
	public static void main(String[] args){
		handleEvents hand= new handleEvents();
		JLabel user = new JLabel("User Name");
		JLabel pwd = new JLabel("Password");
		index.add(user);
		index.add(usertext);
		index.add(pwd);
		index.add(pwdtext);
		JButton indbut = new JButton("Submit");
		indbut.addActionListener(hand);
		indbut.setActionCommand("next");
		index.add(indbut);
		frame.setContentPane(index);
		frame.setSize(300,300);
		frame.setVisible(true);
		but = new JButton(" << Back");
		but.setActionCommand("Previous");
		but.addActionListener(new handleEvents());
		prepareQueryPanel();
		
	}
	public static void prepareQueryPanel(){
//		JLabel disp = new JLabel("panel2");
//		FlowLayout g1= new FlowLayout();
//		GridLayout g1 = new GridLayout(6,0);
//		query.setLayout(g1);
		JButton conCheck = new JButton("Recheck connection");
		conDisp = new JLabel("");
		conCheck.setActionCommand("conncheck");
		conCheck.addActionListener(new handleEvents());
		query.add(conCheck);
		query.add(conDisp);
		query.add(but);
	}
	public static void extraQueryPanel(){
		qry = new JTextArea(1,10);
		upd = new JTextArea(1,10);
		res=new JTextArea("See result here");
		query.remove(but);
		JLabel enter = new JLabel("Enter ur query here");
		JButton submit = new JButton("Submit");
		submit.setActionCommand("select");
		submit.addActionListener(new handleEvents());
		JButton update = new JButton("Update");
		update.setActionCommand("update");
		update.addActionListener(new handleEvents());
		query.add(enter);
		query.add(qry);
		query.add(submit);
		query.add(upd);
		query.add(update);
		query.add(res);
		query.add(but);
	}
}
