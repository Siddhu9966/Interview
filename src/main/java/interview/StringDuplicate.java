package interview;

public class StringDuplicate {
    public static void main(String[] args){
        String name= "xyzxgrtyzrr";
        int count=0;
        char[] string1 = name.toCharArray();
        for(int i=0;i<string1.length;i++)
        {
            count=1;
            for(int j=i+1;j<string1.length;j++)
            {
                if(string1[i]==string1[j]){
                    count++;
                    string1[j] = '0';
                }
            }
            if(count>1 && string1[i]!='0'){
                System.out.println("Duplicate Value: "+string1[i]);
            }
        }
    }
}
