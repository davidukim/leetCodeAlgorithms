public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        if (strs[0].equals("")) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char prefixLetter = strs[0].charAt(i);
            boolean allHasIt = true;
            boolean done = false;
            for (int j = 1; j < strs.length; j++) {
                System.out.println(prefixLetter);
                System.out.println(strs[j].charAt(i));
                if ((i > strs[j].length() - 1) || (strs[j].charAt(i) != prefixLetter)) {
                    done = true;
                    break;
                }
            }
            if (done) break;

            prefix += prefixLetter;
        }
        return prefix;
    }
}

