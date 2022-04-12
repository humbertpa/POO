public abstract class Clases {


    static void delay(){
        int c=0;
        double i=0;
        while(c==0 || c==1){
            if(i<.9*100000000){
                i++;
            }else{
                if(c==0){c=1;}else{c=0;}
                i=0;
                if(c==1)
                    System.out.print(c);
            }
        }
    }
    
    
    
}
