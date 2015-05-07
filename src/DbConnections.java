import java.sql.*;
public class DbConnections {
		static Connection conn;
<<<<<<< HEAD
		static String url="jdbc:mysql://localhost:3306/prashant";
=======
		static String url="jdbc:mysql://localhost:3306/";
>>>>>>> b9bf3e77e971a8e72c1345436eaca99652b6501c
		static String username="root";
		static String password="prashantsurya";
		
	public static boolean connCheck()  {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,username,password);
			return true;
		}
		catch(SQLException s){
//			System.out.println("Connection Failed");
			return false;
		}
		catch(Exception e){
//			System.out.println("Re-install software mysql driver error");
			return false;
		}
	}
	static public void setValues(String u,String p){
		username=u;
		password=p;
	}
	static public void processQuery(String query){
		if(conn!=null){
			try {
				Statement smt = conn.createStatement();
				//@SuppressWarnings("unused")
<<<<<<< HEAD
				ResultSet rs =smt.executeQuery(query);
				ResultSetMetaData rsmd=rs.getMetaData();
				int count=rsmd.getColumnCount();
				//print fields
				String respText="";
				for(int i=1;i<=count;i++){
					respText+=rsmd.getColumnName(i)+"\t";
				}
				respText+="\n";
				if(rs.next()){
					for(int i=1;i<=count;i++){
						respText+=rs.getString(i)+"\t";
					}
					respText+="\n";
					while(rs.next()){
						for(int i=1;i<=count;i++){
							respText+=rs.getString(i)+"\t";
						}
						respText+="\n";
					}
					index.res.setText(respText);
				}
				else{
					index.res.setText("No results found");
=======
				ResultSet rs1 =smt.executeQuery("use prashant");
				ResultSet rs =smt.executeQuery(query);
				if(rs.next()){
					index.res.setText("Query successful");
				}
				else{
					index.res.setText("Query unsuccessful");
>>>>>>> b9bf3e77e971a8e72c1345436eaca99652b6501c
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				//System.out.println("Exception");
				index.res.setText("Exception");
			}
			
		}
		else{
			index.res.setText("Recheck Connection");
		}
	}
	static public void updateQuery(String query){
		if(conn!=null){
			try{
				Statement stm = conn.createStatement();
<<<<<<< HEAD
=======
				ResultSet rs1=stm.executeQuery("use prashant");
>>>>>>> b9bf3e77e971a8e72c1345436eaca99652b6501c
				int r=stm.executeUpdate(query);
				if(r>0){
					index.res.setText(r+" rows affected");
				}
			}catch(SQLException e){
				index.res.setText("Exception");
			}
		}
	}

}
