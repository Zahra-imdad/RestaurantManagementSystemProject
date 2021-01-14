
package resturantmanagement.model;

public class Staff {
   
    private String id;
    private String firstname;
    private String lastname;
    private String address;
    private String phone;
    private String email;
    private String city;
    private String country;
    private double salary;

    public Staff(String id, String firstname, String lastname,String address,String phone, String email, String city,String country,double salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname=lastname;
        this.address=address;
        this.phone=phone;
        this.email=email;
        this.city=city;
        this.country=country;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
     public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
     public String getAdress() {
        return address;
    }

    public void setAdress(String address) {
        this.address = address;
    }

      public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
     public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
     public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
    
      public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
