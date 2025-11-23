public class LibraryDriver
{
    public static void main(String[] args)
    {
        LibraryItem[] items = new LibraryItem[2];

        items[0] = new Book("Book", "B001", "Rowling", "Harry Potter", 300);
        items[1] = new CD("CD", "C001", "Pink Floyd", "Dark Side of the Moon", 10);

        for (int i = 0; i < items.length; i++)
        {
            System.out.println(items[i].toString());
            
            if (items[i] instanceof LoanItem)
            {
                LoanItem loanItem = (LoanItem) items[i];
                System.out.println("Price: " + loanItem.calculatePrice());
            }
            System.out.println("---");
        }
    }
}