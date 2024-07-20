public class strBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        // time complexity o(26)
        // sb+= t.c = o(26*n^2)

        System.out.println(sb);
        System.out.println(sb.length());
    }    
}
