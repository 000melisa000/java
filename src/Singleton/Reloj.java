
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Reloj{
    
    private static Reloj instance;
private Reloj()
{

}
    public static Reloj getInstance()
    {
        if(instance == null)
        {
            instance = new Reloj();
        }
        System.out.println("Esta es una de las operaciones ");
        return instance;
    }
    void doOperations()
    {
    }

    void getHora()
    {
        System.out.println( new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) );
    }
}