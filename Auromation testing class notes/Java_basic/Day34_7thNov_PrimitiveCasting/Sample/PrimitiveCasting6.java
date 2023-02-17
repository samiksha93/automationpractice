package day29Casting;
class Sample1
{
	double x=10;
    double test1()
    {
        System.out.println("Running test1");
        return 4;//auto/implicit widening---> lower to higher, int to double
    }     
}
public class PrimitiveCasting6 {
    public static void main(String[] args) {
        System.out.println("Program starts");
        Sample1 s=new Sample1();
        int res=(int)s.test1();//explicit narrowing
        System.out.println("raturn value="+res);
        System.out.println("Program ends");
    }
}