class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int l1 = ransomNote.length();
        int l2 = magazine.length();
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<l2;i++){
            if(mp.get(magazine.charAt(i))==null){
                mp.put(magazine.charAt(i),1);
            }else{
                mp.put(magazine.charAt(i),mp.get(magazine.charAt(i))+1);
            }
        }
        for(int i=0;i<l1;i++){
            if(mp.get(ransomNote.charAt(i))!=null && (mp.get(ransomNote.charAt(i))>0)){
                mp.put(ransomNote.charAt(i),mp.get(ransomNote.charAt(i))-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
