package control_05;

public class LabeledFor {
    public static void main(String[] args) {
        int i=0;
        outer:
        for(;true;){
            inner:
            for(;i<10;i++){
                System.out.println("i="+i);
                if(i==2){
                    System.out.println("continue");
                    continue;
                }
                if(i==3){
                    System.out.println("break");
                    i++;
                    break ;
                }
                if(i==7){
                    System.out.println("continue outer");
                    i++;
                    continue outer;
                }
                if(i==8){
                    System.out.println("break outer");
                }
                //标签名:语句1
                //如果break该标签，实际就是break该语句，continue同理
            }
        }
    }
}
