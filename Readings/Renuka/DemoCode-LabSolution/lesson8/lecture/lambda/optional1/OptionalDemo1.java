package lesson8.lecture.lambda.optional1;
class Company {
    private String name;
    private Office office;
    public Company(String name, Office office) {
        this.name = name;
        this.office = office;
    }
    public String getName() {
        return name;
    }
    public Office getOffice() {
        return office;
    }
}

class Office {
    private String id;
    private Address address;
    public Office(String id, Address address) {
        this.id = id;
        this.address = address;
    }
    public String getId() {
        return id;
    }
    public Address getAddress() {
        return address;
    }
}

class Address {
    private String street;
    private String city;
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
}

public class OptionalDemo1 {
    public static void main(String[] args) {
        Address address1 = new Address(null, "New York");
        Office office1 = new Office("OF1", address1);
        Company company1 = new Company("Door Never Closed", office1);
        
        // What is the street address of company1?
        // In which city company1 is located?
        String streetAddress = null;
        String city = null;
        if (company1 != null) {
            Office office = company1.getOffice();
            if (office != null) {
                Address address = office.getAddress();
                if (address != null) {
                    streetAddress = address.getStreet();
                    city = address.getCity();
                }
            } 
        }
        System.out.println("Street Name:" + streetAddress);
        System.out.println("City:" + city);
    }
}