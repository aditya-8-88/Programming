
public class new{
    public static void main(String[] args) {
        // System.out.println("Hello World");
        StringBuilder sb = new StringBuilder("codeleet");
        int[] nums=new int[]{4,5,6,7,8,9,0,2,3,1};
        for(int i = 0; i < sb.length(); i++){
            sb.replace(i, i+1, String.valueOf(nums[sb.charAt(i)-'a']));
        }
        System.out.println(sb.toString());
    }
}