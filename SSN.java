public class SSN {
    String number;
    public SSN(){
        number = this.getFirst() + "-" + this.getSecond() + "-" + this.getThird();
    }

    public String getNum(){
        return number;
    }

    public String getFirst(){
        String x = "";
        int n = (int)(Math.random()*9)+1;
        for( int i = 0; i < 3; i++ ){
            while(n == 8 || n == 9){
            n = (int)(Math.random()*9)+1;
            }
            x += n;
            n = 9;
        }
        return x;
        
    }

    public int getSecond(){
        return (int)(Math.random()*641)+100;
    }

    public int getThird(){
        return (int)(Math.random()*8999)+1000;
    }
    
}