class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String, List<String>> map=new HashMap<>();
        for (String st:strs){
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String res = new String(arr);
            if (!map.containsKey(res)) {
                map.put(res,new ArrayList<>());
            }
            map.get(res).add(st);
        }
        // for (List<String> list: map.values()){
        //     ans.add(new ArrayList<>(list));
        // }
        return new ArrayList<>(map.values());
    }
}