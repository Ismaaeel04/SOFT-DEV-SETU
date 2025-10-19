public class Address {

    String street;
    String town;
    String county;

    public Address(String street, String town, String county) 
    {

        this.street = street;
        this.town = town;
        this.county = county;

    }

    public String toString()
    {

        return street + ", " + town + ", " + county;


    }

    
}
