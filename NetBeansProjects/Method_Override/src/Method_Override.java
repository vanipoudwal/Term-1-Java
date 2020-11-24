
//package method_override;

public class Method_Override 
{
    public static void main(String[] args)
    {
        person P = new person();
        employee E = new employee();
        student S = new student();
        person ref;
        ref = P;
        ref.showDetails();
        ref = E;
        ref.showDetails();
        ref = S;
        ref.showDetails();
    }
}
