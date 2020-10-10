package csm.springgradle.entity;

import javax.persistence.*;
import java.util.List;

enum typeOfUser {
    Neighborhood_representative,
    Law_enforcement_officer,
    Municipality_officer
}

@Embeddable
@Entity
@Table(name="User")
public class User {

    @Id
    @GeneratedValue
    private int userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private typeOfUser userType;


    public User(){

    }

    public int getId() {
        return userId;
    }
    public String getName() {
        return userName;
    }

    public String getEmail() {
        return userEmail;
    }

    public String getPassword() {
        return userPassword;
    }

    public String getUserType() {
        return userType.toString();
    }

    public void setName(String name) {
        this.userName = name;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }

    public void setUserType(String usertype){
        if (usertype == typeOfUser.Neighborhood_representative.toString()){
            this.userType = typeOfUser.Neighborhood_representative;
        }
        else if (usertype == typeOfUser.Law_enforcement_officer.toString()){
            this.userType = typeOfUser.Law_enforcement_officer;
        }
        else if(usertype == typeOfUser.Municipality_officer.toString()) {
            this.userType = typeOfUser.Municipality_officer;
        }
    }

}
