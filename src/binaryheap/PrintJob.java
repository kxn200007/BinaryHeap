package binaryheap;

public class PrintJob implements Comparable
{
    String userName;
    int priority;
    int numberOfPages;

    public int cal_prior()
    {
        return priority * numberOfPages;
    }




    public String getUserName()
    {
        return userName;
    }




    public void setUserName(String userName)
    {
        this.userName = userName;
    }




    public int getPriority()
    {
        return priority;
    }




    public void setPriority(int priority)
    {
        this.priority = priority;
    }




    public int getNumberOfPages()
    {
        return numberOfPages;
    }




    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }

    public PrintJob(String userName, int priority, int numberOfPages)
    {
        this.userName = userName;
        this.priority = priority;
        this.numberOfPages = numberOfPages;
    }


    @Override
    public int compareTo(Object o)
    {
        return this.cal_prior() < ((PrintJob)o).cal_prior() ? -1 :
                this.cal_prior() == ((PrintJob)o).cal_prior() ? 0 : 1;
    }
    
    public String toString()
    {
        return "User:" + userName + "\t" + "Priority:" + priority + "\t" + "Pages:" + numberOfPages;
    }
}
