class Solution {
    public String decodeString(String s) {
        Stack<Integer> stackInt = new Stack<>();
        Stack<StringBuilder> stackStr = new Stack<>();
        
        
        StringBuilder str = new StringBuilder();
        int num =0;
        
        for(char ch : s.toCharArray())
        {
            if(ch >= '0' && ch <= '9')
            {
                num = num*10 + ch - '0';
            }
            else if(ch == '[')
            {
                stackStr.push(str);
                str = new StringBuilder();
                
                 stackInt.push(num);
                num =0;
            }
            else if(ch == ']')
            {
                StringBuilder tmp = str;
                str = stackStr.pop();
                
                int count= stackInt.pop();
                
                while(count -- > 0)
                {
                    str.append(tmp);
                }
                
            }
            else
            {
                str.append(ch);
            }
        }
        
        return str.toString();
    }
}