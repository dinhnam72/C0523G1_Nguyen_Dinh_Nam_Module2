package case_study.model.person;

public abstract class Person {
    private String id;
    private String name;
    private String date;
    private String gender;
    private String identityCard;
    private String telephone;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String date, String gender, String identityCard, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.identityCard = identityCard;
        this.telephone = telephone;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCard=" + identityCard +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                '}';
    }
}
