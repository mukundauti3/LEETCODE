class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> return_map=new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] c= strs[i].toCharArray();

            Arrays.sort(c);

            String s=new String(c);

            if (!return_map.containsKey(s)) {
                return_map.put(s, new ArrayList<>());
            }

            return_map.get(s).add(strs[i]);
        }

        return new ArrayList<>(return_map.values());


    }
}