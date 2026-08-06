class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,(log1,log2) ->{
            int ind1=log1.indexOf(" ");
            int ind2=log2.indexOf(" ");

            String c1=log1.substring(ind1+1);
            String c2=log2.substring(ind2+1);

            boolean d1=Character.isDigit(c1.charAt(0));
            boolean d2=Character.isDigit(c2.charAt(0));
            if (!d1 && !d2){
                int compareContent = c1.compareTo(c2);

                if (compareContent != 0)
                    return compareContent;

                // Contents are same, compare identifiers
                String id1 = log1.substring(0, ind1);
                String id2 = log2.substring(0, ind2);

                return id1.compareTo(id2);
            }

            // Case 2: log1 is letter, log2 is digit
            if (!d1 && d2)
                return -1;

            // Case 3: log1 is digit, log2 is letter
            if (d1 && !d2)
                return 1;

            // Case 4: Both are digit logs
            return 0;
        });

        return logs;
    }
}