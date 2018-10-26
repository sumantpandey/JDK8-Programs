

public class TestAO {

    public static void main(String [] args)
    {
        try {
            callm();
        }
        catch(ExceptionA e)
        {
            e.printStackTrace();//+":"+e.getCause()+":"+e.getCause().getMessage());
        }
        catch(Exception ee)
        {}
    }

    static void callm() throws  Exception
    {

       try {
           call2();
       }
       catch(Exception e)
       {
           throw new ExceptionA("ex in callm",e);
       }

    }
    static void call2() throws ExceptionA
    {
        throw new ExceptionA("ex in call2");
    }
}

class ExceptionA extends Exception{

    String msg;
    public ExceptionA(String mm)
    {
        super(mm);
    }

    public ExceptionA(String mm, Exception e)
    {
        super(mm,e);
    }
}

