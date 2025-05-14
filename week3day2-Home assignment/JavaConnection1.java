package week3.day2;

public class JavaConnection1 extends MySqlConnection {

	public static void main(String[] args) {
		JavaConnection1 java1=new JavaConnection1();
		//call Method
		java1.JavaEclipse();
		java1.connect();
		java1.executeQuery();
		java1.executeUpdate();
		java1.disconnect();
		
}
	public void JavaEclipse() {
		//Implemented Method
		System.out.println("Program has been executed and check for the database");
	}

	
	public void connect() {
		//unimplemented method
		System.out.println("Connected to the MySql connection");
	}

	
	public void disconnect() {
		//unimplemented method
		System.out.println("MySql connection has been disconnected");
	}


	public void executeUpdate() {
		//unimplemented method
		System.out.println("Updated Data has been Excuted");
	}

}
