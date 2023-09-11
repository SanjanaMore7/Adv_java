package p4n.in.CodesWP;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Data data = new Data();
        data.setmsg("welcome to JPA...");
        String msg = data.getmsg();
        
        MsgData msgdata = new MsgData();
        msgdata.setHiddenMsg(msg);
        
        System.out.println(msgdata.getHiddenMsg());
    
    }
}
