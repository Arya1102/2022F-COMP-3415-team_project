package bean;

/**
 * @Description: Actor (base class) bean
 * @author: Weikang
 * @version: 1.0
 * @date: 29/09/2022 10:50
 */

public class Actor {
    protected String username;
    protected String password;
    protected String address;

    protected double latitude;

    protected double longitude;
    protected String tel;

    public Actor() {
    }

    public Actor(String username, String password, String address, double latitude, double longitude, String tel) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.tel = tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", tel='" + tel + '\'' +
                '}';
    }
}
