import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class AirlineDB {
	
		private static Connection con;
	
		public AirlineDB()  {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url= "jdbc:mysql://localhost:3306/bankdb";
					String username="bank";
					String password="securepassword";
				Connection con;
				con = DriverManager.getConnection(url, username, password);
				AirlineDB.con = con;
				System.out.println("************** Connected to Database! *************************");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
		
			
	}
/**************************************************************************************************/
	// Add a customer
		int addAccount(String name, String email, String phone, int PRN)
		{
			int userId=-1;	
			try
			{
				// Add customer
				con.setAutoCommit(false);
				String addCustSql = "INSERT INTO AccountDetails (name, emailID , mobileNumber , PRN ) VALUES (?,?,?,?)";
				PreparedStatement addCust = con.prepareStatement(addCustSql, Statement.RETURN_GENERATED_KEYS);
				addCust.setString(1,name);
				addCust.setString(2,email);
				addCust.setString(3,phone);
				addCust.setInt(4,PRN);
				addCust.executeUpdate();
				con.commit();
			}
			catch(SQLException ex)
			{
				try {
					con.rollback();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Error !"+ex.getMessage());
			}
			return userId;
		}
/***********************************************************************************************************/
		public int getMaxAccNo()throws SQLException {
			int accountNumber = 0;
			con.setAutoCommit(false);
			String addCustSql = "SELECT MAX(PRN) FROM AccountDetails";
			PreparedStatement addCust = con.prepareStatement(addCustSql);
			ResultSet resultSet = addCust.executeQuery();
			while(resultSet.next()) {
			 accountNumber = resultSet.getInt("max(PRN)");
			 break;
			}
			con.commit();
			return accountNumber;
			
		}
		
/****************************************************************************************************************/
		// delete customer
		boolean deleteAccount(int PRN) {
		boolean success = false;
		try	{
				con.setAutoCommit(false);
					String deleteSql = "DELETE FROM AccountDetails WHERE PRN = ?";
					PreparedStatement deleteAcc = con.prepareStatement(deleteSql);
					deleteAcc.setInt(1,PRN);
					deleteAcc.executeUpdate();
					success = true;
					con.commit();
			}
		catch(SQLException ex)
			{
				try {
					con.rollback();
				} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Error !"+ex.getMessage());
			}
				return success;
			}
/***************************************************************************************************************/
				// update email
		boolean updateEmail(int PRN, String nu) {
		boolean success = false;
		try	{
			con.setAutoCommit(false);
				String updateSql = "UPDATE AccountDetails SET emailID  = ? WHERE PRN = ?";
				PreparedStatement updateBalance = con.prepareStatement(updateSql,Statement.RETURN_GENERATED_KEYS);
				updateBalance.setString(1,nu);
				updateBalance.setInt(2,PRN);
				updateBalance.executeUpdate();
				ResultSet resultSet = updateBalance.getGeneratedKeys();
				
				if(resultSet.next())
					success = true;
				con.commit();
				return success;
			}
		catch(SQLException ex)
		{
			try {
				con.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Error !"+ex.getMessage());
		}
			return false;
		}	
/**************************************************************************************************************/
		//Update phone  number
		boolean updatePhone(int PRN, String nu) {
		boolean success = false;
			try	{
				con.setAutoCommit(false);
					String updateSql = "UPDATE AccountDetails SET mobileNumber = ? WHERE PRN = ?";
					PreparedStatement updateBalance = con.prepareStatement(updateSql,Statement.RETURN_GENERATED_KEYS);
					updateBalance.setString(1,nu);
					updateBalance.setInt(2,PRN);
					updateBalance.executeUpdate();
					ResultSet resultSet = updateBalance.getGeneratedKeys();
					if(resultSet.next())
						success = true;
					con.commit();
					return success;
				}
			catch(SQLException ex)
			{
				try {
					con.rollback();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Error !"+ex.getMessage());
			}
				return false;
			}	
   }
