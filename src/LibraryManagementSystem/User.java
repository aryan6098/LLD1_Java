package LibraryManagementSystem;

public class User {
    static int counter = 0;
    private String userID;
    private String name;
    private String contactInfo;

    public User() {
        this.userID = generateUniquesId();
    }

    static String generateUniquesId() {
        counter++;
        return String.valueOf(counter);
    }

    public User(String name, String contactInfo) {
        this.userID = generateUniquesId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User user) {
        this.userID = generateUniquesId();
        this.name = user.name;
        this.contactInfo = user.contactInfo;
    }

    public String getUserID() {
        return userID;
    }

    public String getName(){
        return this.name;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }




}
