
package model;

public class Contact {

    private int id;
    private String name;
    private String firstName;
    private String lastName;
    private String group;
    private String address;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String star) {
        this.group = star;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Contact(int id, String name, String group, String address, String phone) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.address = address;
        this.phone = phone;
        setFirstLast();
    }

    public final void setFirstLast() {
        String word[] = name.split(" ");
        firstName = "";
        for (int i = 0; i < word.length; i++) {
            if (i == word.length - 1) {
                lastName = word[i];
            } else {
                firstName = firstName + word[i] + " ";
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%-4s%-20s%-15s%-15s%-10s%-15s%-10s",
                id, name, firstName, lastName, group, address, phone);
    }

}
