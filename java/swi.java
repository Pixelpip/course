public class swi {
    public static void main(String[] args){
        int a;
        int b;
        for(a=10,b=0;a>b;a--,b++){
            System.out.println(a+" "+b);
        }
        for(;;){
            System.out.println("hello");
            break;
        }
        //for-each loop
        int num[]={1,2,3,4,5,6,7,8};
        int sum=0;
        for(int i:num){
            sum+=i;
            System.out.println(sum);
        }
        System.out.println("final:"+sum);
    }
}
