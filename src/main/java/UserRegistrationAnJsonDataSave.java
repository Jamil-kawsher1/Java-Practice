import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserRegistrationAnJsonDataSave {


    public static void main (String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your FullName");
        String fullName = sc.nextLine();
        System.out.println("Enter Your Email");
        String email = sc.nextLine();
        System.out.println("Enter Your Password");
        String password = sc.nextLine();
        System.out.println("Enter Your Address");
        String address = sc.nextLine();
        System.out.println("Enter Your Mobile");
        String mobile = sc.nextLine();
     
        writeJSONFile(fullName, email, password, address, mobile);
    }

    public static void writeJSONFile (String fullName, String email, String password, String address, String mobile) throws IOException {

        JSONObject user = new JSONObject();
        user.put("FullName", fullName);
        user.put("Email", email);
        user.put("Password", password);
        user.put("Address", address);
        user.put("Mobile", mobile);
        FileWriter file = new FileWriter("./src/main/resources/user.json");
        file.write(user.toJSONString());
        file.flush();
        System.out.print(user);
    }
}
