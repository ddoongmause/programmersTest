import java.util.HashMap;

public class Hash_01 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        HashMap<String, Integer> completionMap = new HashMap<String, Integer>();
        String answer = "";
        for(String member : completion){
            if(completionMap.get(member) == null){
                completionMap.put(member, 1);
            }else{
                int count = completionMap.get(member);
                completionMap.put(member, count+1);
            }
        }
        for(int i=0; participant.length>i; i++){
            if(completionMap.get(participant[i]) == null){
                answer = participant[i];
                break;
            }else{
                if(completionMap.get(participant[i])==0){
                    answer = participant[i];
                    break;
                }else{
                    int count = completionMap.get(participant[i]);
                    completionMap.put(participant[i], count-1);
                }
            }
        }
        System.out.println(answer);

    }
}
