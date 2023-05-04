public class re {
    public static void main(String[] args) {
        re sc=new re();
        sc.nextnew(0);
    }
    void nextnew(int c)
    {
        if(c<7)
        {
            System.out.println("hi");
            c++;
            nextnew(c);
        }
        else
        return;
    }
}
