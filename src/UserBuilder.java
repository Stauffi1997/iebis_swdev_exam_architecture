public class UserBuilder {
    private String name;
    private String emailAddress;
    private int age;
    private String address;
    private String city;
    private String zipCode;
    private User.Gender gender;

    public UserBuilder(String name) {
        this.name = name;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public UserBuilder setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public UserBuilder setGender(User.Gender gender) {
        this.gender = gender;
        return this;
    }

    public User createUser() {
        return new User(name, emailAddress, age, address, city, zipCode, gender);
    }
}