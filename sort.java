public class Sort{
public static void main(String args[]){
List<Integer> list=Arrays.asList{4,1,5,2,7,10,3};
List<Integer> li=list.stream().distinct().collect(Collectors.toList());
System.out.println(li);
}
}
