import java.util.*;

public class hashmap
{
    public static HashMap<Integer,Integer> sortByValue(HashMap<Integer,Integer> hm)
    {
        List<Map.Entry<Integer,Integer>> list=new ArrayList<Map.Entry<Integer,Integer>>(hm.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        HashMap<Integer,Integer> temp=new LinkedHashMap<Integer,Integer>();
        for(Map.Entry<Integer,Integer> aa:list)
        {
            temp.put(aa.getKey(),aa.getValue());
        }
        return temp;
    }
    public static void main(String[] args)
    {
        int arr[]={5,5,8,8,1,1,11,9};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        HashMap<Integer,Integer> ans=hashmap.sortByValue(hm);
        for(Map.Entry<Integer,Integer> map:ans.entrySet())
        {
            System.out.println("Key:"+map.getKey()+" "+"Value:"+map.getValue());
        }
    }
}
