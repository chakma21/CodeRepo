class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String, List<String>> map=new HashMap<>();
        for (String st:strs){
            char[] arr = st.toCharArray();
            Arrays.sort(arr);
            String res = new String(arr);
            // if (map.containsKey(res)) {
            //     map.get(res).add(st);
            // } else {
            //     List<String> list = new ArrayList<>();
            //     list.add(st);
            //     map.put(res, list);
            // }
            map.putIfAbsent(res, new ArrayList<>());
            map.get(res).add(st);
        }
        for (List<String> list: map.values()){
            ans.add(new ArrayList<>(list));
        }
        return ans;
    }
}