public class implementsRunnable implements Runnable{
        private long number;
        private String threadName;
        private Thread th;
        public void start(){
            if(th==null){
//                th=new implementsRunnable(number, threadName);
                th=new Thread(new implementsRunnable(this.number, this.threadName)," Test");
            }

            th.start();
        }

        public void run(){
            for(int n=0; n<getNumber(); n++){
                System.out.println("InsideThread: "+getThreadName()+" Number is: "+getNumber());
            }
        }

        public implementsRunnable(long number, String threadName){
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
            implementsRunnable thread= new implementsRunnable(100, "A");
            thread.start();
//        implementsRunnable thread= new implementsRunnable(100, "A");
//        thread = new implementsRunnable(88, "B");
//        thread.start();
//        thread = new implementsRunnable(100, "B");
//        thread.start();

        }


}
