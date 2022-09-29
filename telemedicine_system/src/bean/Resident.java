package bean;

import java.util.Date;

/**
 * @Description: Resident Bean
 * @author: Weikang
 * @version: 1.0
 * @date: 29/09/2022 10:44
 */

public class Resident extends Actor{
    private Date birthdate;

    public Resident() {
    }

    public Resident(String username, String password, String address, double latitude, double longitude, String tel, Date birthdate) {
        super(username, password, address, latitude, longitude, tel);
        this.birthdate = birthdate;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "birthdate=" + birthdate +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", tel='" + tel + '\'' +
                '}';
    }
}
