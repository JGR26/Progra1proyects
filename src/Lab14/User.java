

package Lab14;

import java.util.Date;

/**
 *
 * @author HP USER
 */
public class User {
    
    protected String userId;
    protected String password;
    protected String loginStatus;
    protected Date registerDate;
    
   public boolean verifyLogin(){
       
       return true;
       
   }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
   
}
