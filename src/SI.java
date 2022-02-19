class SI
{
    double principal;
    double rate;
    double interest;
    int time;
    public void calcSI()
    {
        principal = 20000;
        rate = 13.5;
        time = 4;
        interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is:" + interest);
    }
}








