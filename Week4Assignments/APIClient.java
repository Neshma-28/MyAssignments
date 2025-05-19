package week4.day1;

public class APIClient {
	//Method1 with one argument
public void sendRequest(String endpoint) {
	System.out.println("Connected to the API:"+" "+endpoint);
}
//Method2 with three arguments which also matched one argument in method1
public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
	System.out.println("Connected to the API in Method2:"+" "+endpoint);
	System.out.println("Method2 Request Body:"+" "+requestBody);
	System.out.println("Connection Status Active:"+" "+requestStatus);
}
	public static void main(String[] args) {
		//object creation for main class
		APIClient api=new APIClient();
		//Method overloading (same method with different argument passed)
		api.sendRequest("Method1");
		api.sendRequest("Connected", "Coding Part", true);
	}

}
