public class User implements Subscriber {

    @Override
    public void update(Object object) {
        Episode episode = (Episode) object;
        System.out.println(name + ", the episode " + episode.getName() + " from the TV show " + episode.getShow() + " is available " );
    }

    enum Gender {Male, Female};
    String name;
    String emailAddress;
    int age;
    String address;
    String city;
    String zipCode;
    Gender gender;

    public User(String name, String emailAddress, int age, String address, String city, String zipCode, Gender gender) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.age = age;
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.gender = gender;
    }

}
