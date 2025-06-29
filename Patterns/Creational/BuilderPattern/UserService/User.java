package Patterns.Creational.BuilderPattern.UserService;

public class User {
    private final String name, email, address, phoneNumber;
    private final int age;
    private final boolean isVerified;

    private User(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.age = builder.age;
        this.email = builder.email;
        this.isVerified = builder.isVerified;
        this.phoneNumber = builder.phoneNumber;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("isVerified: " + isVerified);
    }
    
    public static void main(String[] args) {
        User user = new User.Builder("Charan", "charan@charan.com")
                    .withAge(24)
                    .withPhoneNumber("9876543210")
                    .build();

        user.display();

        User user2 = new User.Builder("Patrick", "patrick@bateman.com")
                    .withAddress("Wall Street")
                    .withPhoneNumber("9696969696")
                    .withAge(69)
                    .isVerified(false)
                    .build();

        user2.display();
    }

    private static class Builder{
        String name, email, address, phoneNumber;
        private int age;
        private boolean isVerified;
        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder isVerified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
