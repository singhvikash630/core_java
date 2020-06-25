 /*In java the volatile modifier only applies to instance variables just like the transient modifier.
  *  declaring a variable volatile tells the compiler that this variable might be changed unexpectedly by other parts of the program.*/

Java Tutorialslass VolatileModifier extends Thread
  {
    private volatile static int someVal;   // declared a volatile variable
    VolatileModifier(String str)
      {
       super(str);
      }
    public void run()                // implementing the run method for threads
     {
      for (int j=0; j<7; j++)
        {
          try
            {
             System.out.println(getName() + "->"+i);
             if(getName().equals("r4r thread1"))
               {
                someVal=7;
               }
             if(getName().equals("r4r thread2"))
               {
                System.out.println("The value of volatile variable is :"+someVal);
               }
             Thread.sleep(2000);
            }
			Java Tutorialsatch(InterruptedException e)
             {
              e.printStackTrace();
             }
		}

}

Java Tutorialslass VolatileModifierExample
{
public static void main(String args[])
{
Thread t=new VolatileModifier("r4r thread1");     // creating a thread object
Thread t1=new VolatileModifier("r4r thread2");
t.start();                                        // starting the execution of thread
t1.start();
}
}

