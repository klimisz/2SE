package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Condb {

	// Connection con;
	public Condb() {
		connectionToMySql();

	}

	public static Connection connect;

	public static void connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void connectionToMySql() {
		connection();
		String host = "jdbc:mysql://localhost/sdifa";
		String username = "root";
		String password = "root1234";
		try {
			connect = DriverManager.getConnection(host, username, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void importUser(String name, String lName, String fName, String bDate, String amka, String securance,
			Long phone, Long mphone, String city, String addres, int postcode, int gender, int status) {
		PreparedStatement prst = null;
		String sqlInsert = "INSERT INTO infos (name, surname, fathername, birthday, AMKA, securance, phone, mobilephone,"
				+ " city, address, postcode, gender, status) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
		try {
			prst = connect.prepareStatement(sqlInsert);
			prst.setString(1, name);
			prst.setString(2, lName);
			prst.setString(3, fName);
			prst.setString(4, bDate);
			prst.setString(5, amka);
			prst.setString(6, securance);
			prst.setLong(7, phone);
			prst.setLong(8, mphone);
			prst.setString(9, city);
			prst.setString(10, addres);
			prst.setInt(11, postcode);
			prst.setInt(12, gender);
			prst.setInt(13, status);

			prst.executeUpdate();
			
		} catch (SQLException e) {
			
		}

	}

	public static void updateUser(String name, String lName, String fName, String bDate, String amka, String securance,
			Long phone, Long mphone, String city, String addres, int postcode, int am, int status) {
		PreparedStatement prst = null;
		String sqlUpdate = "UPDATE infos SET name=?, surname=?, fathername=?, birthday=?, AMKA=?, securance=?, phone=?, mobilephone= ?, city=?, address=?, postcode=?, status=? WHERE am=? ;";
		try {
			prst = connect.prepareStatement(sqlUpdate);
			prst.setString(1, name);
			prst.setString(2, lName);
			prst.setString(3, fName);
			prst.setString(4, bDate);
			prst.setString(5, amka);
			prst.setString(6, securance);
			prst.setLong(7, phone);
			prst.setLong(8, mphone);
			prst.setString(9, city);
			prst.setString(10, addres);
			prst.setInt(11, postcode);
			prst.setInt(12, status);
			prst.setInt(13, am);

			prst.executeUpdate();
			

		} catch (SQLException e) {
			
		}

	}

	public static String[] searchByAmka(String amka) {
		String[] data = new String[14];
		DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		
		try {

			PreparedStatement statement1 = connect.prepareStatement("SELECT * FROM infos WHERE AMKA= ? ;");
			statement1.setString(1, amka);

			ResultSet res = statement1.executeQuery();

			while (res.next()) {
				
				data[0] = res.getString(1);
				data[1] = res.getString(2);
				data[2] = res.getString(3);
				data[3] = formater.format(res.getDate(4));
				data[4] = res.getString(5);
				data[5] = res.getString(6);
				data[6] = Long.toString(res.getLong(7));
				data[7] = Long.toString(res.getLong(8));
				data[8] = res.getString(9);
				data[9] = res.getString(10);
				data[10] = Integer.toString(res.getInt(11));
				data[11] = Integer.toString(res.getInt(12));
				data[12] = Integer.toString(res.getInt(13));
				data[13] = Integer.toString(res.getInt(14));

				
			}
		} catch (SQLException e) {
		}
		return data;

	}

	public static String[][] searchByInfosAm(int infosAm) {
		int rows = 0;
		PreparedStatement statement1;

		try {
			statement1 = connect.prepareStatement("SELECT count(*) FROM visit WHERE infosAm= ? ;");
			statement1.setInt(1, infosAm);
			ResultSet resultRows = statement1.executeQuery();
			while (resultRows.next()) {
				rows = resultRows.getInt(1);
			}
		} catch (SQLException e) {
			
		}

		String[][] data = new String[rows][6];

		try {

			statement1 = connect.prepareStatement("SELECT * FROM visit WHERE infosAm= ? ;");
			statement1.setInt(1, infosAm);

			ResultSet res = statement1.executeQuery();

			int i = 0;
			while (res.next()) {

				data[i][0] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(res.getTimestamp(3));
				data[i][1] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(res.getTimestamp(4));
				data[i][2] = res.getString(5);
				data[i][3] = res.getString(6);
				data[i][4] = res.getString(7);
				data[i][5] = "" + res.getInt(1); // Visit Id
				i++;

			}
		} catch (SQLException e) {
		}
		return data;

	}

	public static String[][] searchExamsByVisitID(int visitId) {
		int rows = 0;
		PreparedStatement statement1;

		try {
			statement1 = connect.prepareStatement("SELECT count(*) FROM exams WHERE visitId=? ;");
			statement1.setInt(1, visitId);
			ResultSet resultRows = statement1.executeQuery();
			while (resultRows.next()) {
				rows = resultRows.getInt(1);
			}
		} catch (SQLException e) {
			
		}
		String[][] data = new String[rows][6];

		try {

			statement1 = connect.prepareStatement("SELECT * FROM exams WHERE visitId= ? ;");
			statement1.setInt(1, visitId);

			ResultSet res = statement1.executeQuery();

			int i = 0;
			while (res.next()) {
				

				data[i][0] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(res.getTimestamp(2));
				data[i][1] = res.getString(3);
				data[i][2] = res.getString(4);
				data[i][3] = res.getString(5);
				data[i][4] = res.getString(6);
				i++;

			}
		} catch (SQLException e) {
		}
		return data;

	}

	public static String[][] searchMedsByVisitID(int visitId) {
		int rows = 0;
		PreparedStatement statement1;

		try {
			statement1 = connect.prepareStatement("SELECT count(*) FROM medicine WHERE visitId=? ;");
			statement1.setInt(1, visitId);
			ResultSet resultRows = statement1.executeQuery();
			while (resultRows.next()) {
				rows = resultRows.getInt(1);
			}
		} catch (SQLException e) {
			
		}

		String[][] data = new String[rows][6];
		try {

			statement1 = connect.prepareStatement("SELECT * FROM medicine WHERE visitId= ? ;");
			statement1.setInt(1, visitId);

			ResultSet res = statement1.executeQuery();

			int i = 0;
			while (res.next()) {
				data[i][0] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(res.getTimestamp(2));
				data[i][1] = res.getString(3);
				data[i][2] = res.getString(4);
				data[i][3] = res.getString(5);
				data[i][4] = res.getString(6);
				i++;

			}
		} catch (SQLException e) {
		}
		return data;

	}

	public static void insertVisitPatient(Integer infosAm, String imeraOra1, String imeraOra2, String effects,
			String alergys, String diagnosis,String[][] examsData, String[][] medsData) {
		PreparedStatement prst = null;
		String sqlInsert = "INSERT INTO visit (infosAm, imeraOra1, imeraOra2, effects, alergys, diagnosis) VALUES(?,NOW(),NOW(),?,?,?);";
		try {
			prst = connect.prepareStatement(sqlInsert);
			prst.setInt(1, infosAm);
			prst.setString(2, effects);
			prst.setString(3, alergys);
			prst.setString(4, diagnosis);

			prst.executeUpdate();
			
		} catch (SQLException e) {
			
		}
		
		int visitId = -1;
		String sqlUpdate = "SELECT id FROM visit ORDER BY id DESC LIMIT 1;";
		try {
			prst = connect.prepareStatement(sqlUpdate);
			ResultSet resultRows = prst.executeQuery();
			while (resultRows.next()) {
				visitId = resultRows.getInt(1);
				
			}

		} catch (SQLException e) {
			
		}
		
		for (int i = 0; i < examsData.length; i++) {
			sqlUpdate = "INSERT INTO exams(visitId,imeraOra,examType, exam, doctor,examRes) VALUES (?,NOW(),?,?,?,?)";
			try {
				prst = connect.prepareStatement(sqlUpdate);
				prst.setInt(1, visitId);
				prst.setString(2, examsData[i][0]);
				prst.setString(3, examsData[i][1]);
				prst.setString(4, examsData[i][2]);
				prst.setString(5, examsData[i][3]);
				
				prst.executeUpdate();
				
			} catch (SQLException e) {
				
			}
		}
		
		for (int i = 0; i < medsData.length; i++) {
			sqlUpdate = "INSERT INTO medicine(visitId,imeraOra,medType, med, doctor,doses) VALUES (?,NOW(),?,?,?,?)";
			try {
				prst = connect.prepareStatement(sqlUpdate);
				prst.setInt(1, visitId);
				prst.setString(2, medsData[i][0]);
				prst.setString(3, medsData[i][1]);
				prst.setString(4, medsData[i][2]);
				prst.setString(5, medsData[i][3]);
				
				prst.executeUpdate();
				

			} catch (SQLException e) {
				
			}
		}

	}

	public static void insertPatient(Integer infosAm, String imeraOra1, String effects, String alergys) {
		PreparedStatement prst = null;
		String sqlInsert = "INSERT INTO visit (infosAm, imeraOra1, effects, alergys) VALUES(?,NOW(),?,?);";
		try {
			prst = connect.prepareStatement(sqlInsert);
			prst.setInt(1, infosAm);
			prst.setString(2, effects);
			prst.setString(3, alergys);

			prst.executeUpdate();
			
		} catch (SQLException e) {
			
		}

	}

	public static void exitPatient(Integer infosAm, String imeraOra2, String diagnosis, String[][] examsData,
			String[][] medsData) {
		PreparedStatement prst = null;

		int visitId = -1;
		String sqlUpdate = "SELECT id FROM visit WHERE infosAm=? AND imeraOra2 IS NULL ;";
		try {
			prst = connect.prepareStatement(sqlUpdate);
			prst.setInt(1, infosAm);
			ResultSet resultRows = prst.executeQuery();
			while (resultRows.next()) {
				visitId = resultRows.getInt(1);
				
			}

		} catch (SQLException e) {
			
		}

		if (visitId < 0)// if visit id not found stop
			return;

		sqlUpdate = "UPDATE visit SET imeraOra2=NOW(), diagnosis=? WHERE id= ? ;";
		try {
			prst = connect.prepareStatement(sqlUpdate);
			prst.setString(1, diagnosis);
			prst.setInt(2, visitId);

			prst.executeUpdate();
			
		} catch (SQLException e) {
			
		}

		for (int i = 0; i < examsData.length; i++) {
			sqlUpdate = "INSERT INTO exams(visitId,imeraOra,examType, exam, doctor,examRes) VALUES (?,NOW(),?,?,?,?)";
			try {
				prst = connect.prepareStatement(sqlUpdate);
				prst.setInt(1, visitId);
				prst.setString(2, examsData[i][0]);
				prst.setString(3, examsData[i][1]);
				prst.setString(4, examsData[i][2]);
				prst.setString(5, examsData[i][3]);
				
				prst.executeUpdate();
				
			} catch (SQLException e) {
				
			}
		}
		
		for (int i = 0; i < medsData.length; i++) {
			sqlUpdate = "INSERT INTO medicine(visitId,imeraOra,medType, med, doctor,doses) VALUES (?,NOW(),?,?,?,?)";
			try {
				prst = connect.prepareStatement(sqlUpdate);
				prst.setInt(1, visitId);
				prst.setString(2, medsData[i][0]);
				prst.setString(3, medsData[i][1]);
				prst.setString(4, medsData[i][2]);
				prst.setString(5, medsData[i][3]);
				
				prst.executeUpdate();
				
			} catch (SQLException e) {
				
			}
		}
	}

	public static String[] validateUser(String un, String pa) {
		String[] data = new String[4];
		
		try {

			PreparedStatement statement1 = connect
					.prepareStatement("SELECT * FROM users WHERE Username = ? AND Pass = ?;");
			statement1.setString(1, un);
			statement1.setString(2, pa);
			ResultSet res = statement1.executeQuery();
			
			while (res.next()) {

				data[0] = "" + res.getInt(1);
				data[1] = res.getString(2);
				data[2] = res.getString(3);
				data[3] = "" + res.getInt(4);
				
			}
		} catch (SQLException e) {
		}
		return data;

	}

}
