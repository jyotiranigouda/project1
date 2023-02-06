package email;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	public class EmaiilValidationns {
	

	public static void main(String[] args) {

			System.out.println(" Enter your email address -");

		
			Scanner emailInput = new Scanner(System.in);

			String inputEmpEmail = emailInput.next();
			

			System.out.println("The Followinf Email Address entered by the employees - " + inputEmpEmail);
			

			List<String> emailList = new ArrayList<>();
			emailList.add("anny123@gmail.com");
			emailList.add("tom12@yahoo.com");
			emailList.add("shree45@gmail.com");		
			emailList.add("rose23@hotmail.com");
		   emailList.add("sam22@gmail.com.com");
		   emailList.add("amayra49@gmail.com");
		   emailList.add("ira34@yahoo.com");
			System.out.println("Email Addresses List:: " + emailList);

			EmaiilValidationns  emailValidator = new EmaiilValidationns ();

			String emailValidationStatus = emailValidator.checkForValidEmailAddress(inputEmpEmail, emailList);

			System.out.println(emailValidationStatus);
			
			emailInput.close();
		}

		private String checkForValidEmailAddress(String empEmail, List<String> validEmailList) {

			String status;
			for(int index = 0; index < validEmailList.size(); index++) {

				if(validEmailList.get(index).equals(empEmail)) {

					status = empEmail + " is a valid Mail Id";
					return status;
				}

			}
			status = empEmail + " is not a valid Mail Id";

			return status;

		}


	}




