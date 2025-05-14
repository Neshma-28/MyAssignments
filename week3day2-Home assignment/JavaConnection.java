package week3.day2;

public class JavaConnection implements DatabseConnection  {
	
public void JREImplements() {
	System.out.println("Implements correct Version of JRE Library files");//implemented method
}
	public static void main(String[] args) {
		JavaConnection java=new JavaConnection();
		//call Method
		java.connect();
		java.executeUpdate();
		java.JREImplements();
		java.disconnect();
		
}
	
	public void connect() {
		//unimplemented method
		System.out.println("Connected to the DataBase");
	}
	
	public void disconnect() {
		//unimplemented method
		System.out.println("Disconnected from the DataBase");
	}
	
	public void executeUpdate() {
		//unimplemented method
		System.out.println("Updated version has been Excuted");
	}

}
