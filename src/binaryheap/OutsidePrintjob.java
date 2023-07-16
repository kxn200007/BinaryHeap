package binaryheap;



public class OutsidePrintjob extends PrintJob
{
    double price;

    public void setPrice(int price)
    {
        this.price = price;
    }

    public OutsidePrintjob(String userName, int priority, int numberOfPages)
    {
        super(userName, priority, numberOfPages);
        price = calculatePrice();
    }

    public double calculatePrice()
    {
        double costPrice = numberOfPages * 10;
        return costPrice/100;
    }

    public String toString()
    {
        return "User:" + userName + "\t" + "Priority:" + priority + "\t" + "Pages:" + numberOfPages + "\t" + "Cost:$" + calculatePrice();
    }
    
}
