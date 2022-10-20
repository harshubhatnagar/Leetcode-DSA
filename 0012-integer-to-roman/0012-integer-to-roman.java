class Solution {
    public String intToRoman(int num) {
        
        int[] incode ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        
        String[] rom= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<incode.length;i++)
        {
            while(num >= incode[i])
            {
                num = num - incode[i];
            
                sb.append(rom[i]);
                
            }   
        }
        
        return sb.toString();
        
    }
}