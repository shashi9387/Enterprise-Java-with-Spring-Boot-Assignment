/* Assignment 4(a)
Give the menu to the user as the operation listed below on student table:
   1. Create 
   2. Read 
   3. Update 
   4. Delete   */

import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;


public class Assignment_4_1 {

	public static void main(String[] args) {
		

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		Scanner sc = null;
		
		String url = "jdbc:mysql://localhost:3306/ineurondb";
		String user = "root";
		String password = "Rahul@8409";
		
		
		try {
			connection = DriverManager.getConnection(url, user, password);

			if (connection != null) {
				
				statement = connection.createStatement();
				if(statement != null) {
				sc = new Scanner(System.in);
				System.out.println("Enter the DB operation you want to perform:");
				System.out.println("1 - Create");
				System.out.println("2 - Read");
				System.out.println("3 - Update");
				System.out.println("4 - Delete");
				int option = sc.nextInt();
				

					if (option == 1 ) {
						System.out.println("[You have selected INSERT operation]");
						System.out.print("Enter rollno: ");
						int srollno = sc.nextInt();
						System.out.print("Enter firstname: ");
						String sfirstname = sc.next();
						System.out.print("Enter lastname: ");
						String slastname = sc.next();
						System.out.print("Enter age: ");
						int sage = sc.nextInt();
						String sqlQuery = String.format(
								"insert into school(`rollno`, `lastname`, `firstname`, `age`) values(%d,'%s', '%s', %d)",
								srollno, slastname, sfirstname, sage);
						int executeUpdate = statement.executeUpdate(sqlQuery);
						System.out.println("Number of rows affected=" + executeUpdate);

					}

					if (option == 2) {
						System.out.println("[You have selected READ operation]");
						resultSet = statement.executeQuery("select rollno, lastname, firstname, age from school");

						if (resultSet != null) {
							System.out.println("================================");
							System.out.println("RollNo FirstName LastName Age");
							System.out.println("================================");
							while (resultSet.next()) {
								int rollno = resultSet.getInt("rollno");
								String lastname = resultSet.getString("lastname");
								String firstname = resultSet.getString("firstname");
								int age = resultSet.getInt("age");
								System.out.println(rollno + "\t" + firstname + "\t" + lastname + "\t" + age);
							}
							System.out.println("================================");
						}
					}

					if (option == 3) {
						System.out.println("[You have selected UPDATE operation]");
						System.out.println("Enter detail of student of which you want to change the details");
						
						System.out.println("Enter the details you want to update:");
						System.out.println("1 - rollno");
						System.out.println("2 - firstname");
						System.out.println("3 - lastname");
						System.out.println("4 - age");
						int update = sc.nextInt();
						if(update == 1) {
							System.out.print("Enter rollno: ");
							int srollno = sc.nextInt();
							System.out.print("Enter the new roll of the student");
							int roll = sc.nextInt();
							String sqlQuery = String.format("update school set rollno=%d where rollno=%d", roll, srollno);
							int executeUpdate = statement.executeUpdate(sqlQuery);
							System.out.println("Number of rows affected=" + executeUpdate);
						}
						if(update == 2) {
							System.out.println("Enter firstname: ");
							String sfirstname = sc.next();
							System.out.print("Enter the new firstname of the customer");
							String firstname = sc.next();
							String sqlQuery = String.format("update school set firstname='%s' where firstname='%d'", firstname, sfirstname);
							int executeUpdate = statement.executeUpdate(sqlQuery);
							System.out.println("Number of rows affected=" + executeUpdate);
						}
						if(update == 3) {
							System.out.println("Enter lastname: ");
							String slastname = sc.next();
							System.out.print("Enter the new age of the customer");
							String lastname = sc.next();
							String sqlQuery = String.format("update school set lastname='%s' where lastname='%s'", lastname, slastname);
							int executeUpdate = statement.executeUpdate(sqlQuery);
							System.out.println("Number of rows affected=" + executeUpdate);
						}
						if(update == 4) {
							System.out.print("Enter age: ");
							int sage = sc.nextInt();
							System.out.print("Enter the new age of the customer");
							int age = sc.nextInt();
							String sqlQuery = String.format("update school set age=%d where age=%d", age, sage);
							int executeUpdate = statement.executeUpdate(sqlQuery);
							System.out.println("Number of rows affected=" + executeUpdate);
						}
						if (option <= 0 | option > 4) {
							System.out.println("Wrong input, please try again!");
						}
						
						
					}

					if (option == 4) {
						System.out.println("[You have selected DELETE operation]");
						System.out.print("Enter rollno of student you want to delete");
						int srollno = sc.nextInt();
						String sqlQuery = String.format("delete from school where rollno=%d", srollno);
						int executeUpdate = statement.executeUpdate(sqlQuery);
						System.out.println("Number of rows affected=" + executeUpdate);
					}
					if (option <= 0 | option > 4) {
						System.out.println("Wrong input, please try again!");
					}
					System.out.println("Thanks for using the JDBC Aplication :)");
				}
			}
			} catch (SQLException s) {
				s.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (statement != null) {
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (connection != null) {
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (sc != null) {
					sc.close();
				}

			}

		}

}