class Q {
    int n;
    boolean flag=false;      
    synchronized  int get() {
      while(!flag)
      {
        try{
            wait();

        }
        catch(InterruptedException e)
        {System.out.println(e);}
      }
        System.out.println("Get " + n);
        flag=false;
        notify();
        return n;
    }
    
   synchronized void put(int n) {
        while(flag)
        {
            try{
                wait();
                
            }
            catch(InterruptedException e)
            {System.out.println(e);}
        }
        
      this.n = n;
      System.out.println("put  " + n);
      flag=true;
      notify();
    }
}

class consumer extends Thread {
    Q q;
    
    consumer(Q q1) {
        q = q1;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }
    
    public void run() {
       // int i = 0;
        while (true) {
            q.get();
        }
    }
}

class producer extends Thread {
    Q q;
    
    producer(Q q1) {
        q = q1;
        Thread t = new Thread(this, "Producer");
        t.start();
    }
    
    synchronized
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
class interprocess 
{
    public static void main(String []aswin)
    {
        Q q2=new Q();
        producer p=new producer(q2);
        consumer c=new consumer(q2);
        
    }
}