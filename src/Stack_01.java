public class Stack_01 {

    public static void main(String [] args){
        int[] prices = {1,2,3,2,3,3,1};
        //[6, 5, 1, 3, 2, 1, 0]
        int[] answer = new int[prices.length];
        for(int i=0; prices.length>i; i++){
            int count =0;
            for(int j=i+1; prices.length>j; j++){
                if(prices[i] <= prices[j]){
                    count++;
                }else {
                    count++;
                    break;
                }
            }
            answer[i] = count;
        }
        for(int ii : answer){
            System.out.println(ii);
        }

    }
}
