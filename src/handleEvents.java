import java.awt.event.*;
public class handleEvents implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		if(action=="next"){
			String name=index.usertext.getText();
			String pass=index.pwdtext.getText();
			DbConnections.setValues(name,pass);
			boolean check = DbConnections.connCheck();
			if(check==false){
				index.conDisp.setText("Connection failed");
			}
			else{
				index.conDisp.setText("Connection established");
				index.extraQueryPanel();
			}
			index.frame.setContentPane(index.query);
			index.frame.setVisible(true);
		}
		else if(action=="Previous"){
			index.frame.setContentPane(index.index);
			index.frame.setVisible(true);
		}
		else if(action=="submit"){
			String qry = index.qry.getText();
			DbConnections.processQuery(qry);
		}
		else if(action=="conncheck"){
			boolean check = DbConnections.connCheck();
			if(check==false){
				index.conDisp.setText("Connection failed");
			}
			else{
				index.conDisp.setText("Connection established");
				index.extraQueryPanel();
			}
		}
	}
}
