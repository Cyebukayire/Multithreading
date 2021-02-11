    public class ExtendThread extends Thread{
        private long number;
        private String threadName;
        private Thread th;
        public void start(long number, String threadName){
            if(th==null){
//                th=new ExtendThread(number, threadName);
                th=new Thread(new ExtendThread(this.number, this.threadName)," Test");
            }

            th.start();
        }

        public void run(){
            for(int n=0; n<getNumber(); n++){
                System.out.println("InsideThread: "+getThreadName()+" Number is: "+getNumber());
            }
        }

        public ExtendThread(long number, String threadName){
            this.number=number;
            this.threadName=threadName;
        }

        public void setNumber(long number){
            this.number=number;
        }
        public long getNumber(){
            return this.number;
        }

        public void setThreadName(String threadName){
            this.threadName=threadName;
        }
        public String getThreadName(){
            return this.threadName;
        }

    public static void main(String[] args) throws Exception{
        System.out.println("Return Thread");
        ExtendThread thread= new ExtendThread(100, "A");
        thread.start();
//        ExtendThread thread= new ExtendThread(100, "A");
//        thread = new ExtendThread(88, "B");
//        thread.start();
//        thread = new ExtendThread(100, "B");
//        thread.start();

    }

}
