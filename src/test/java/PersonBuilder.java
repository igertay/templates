public class PersonBuilder {

    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }


    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не корректный");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalArgumentException(
                    "Заполни поле Имя"
            );
        }
        if (surname == null) {
            throw new IllegalArgumentException(
                    "Заполни поле Фамилия"
            );
        }

        Person person;

        if (age == -1) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
        }
        if (address != null) {
            person.setAddress(address);
        }
        return person;

    }


}
