public class LibraryItem
{
    private String type;
    private String ID;

    public LibraryItem(String type, String ID)
    {
        this.type = type;
        this.ID = ID;
    }

    public String toString()
    {
        return "Type: " + type + ", ID: " + ID;
    }
}