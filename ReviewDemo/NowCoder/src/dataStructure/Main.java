package dataStructure;


import java.util.*;

public class Main {
    static int calcSimilarity(String name1, String name2) {
        if(name1 == null || name2 == null) return 0;
        StringBuilder nameChar = new StringBuilder();
        int n1 = name1.length();
        int n2 = name2.length();
        int i = 0;
        if(n1>=n2){
            for (; i < name2.length(); i++) {
                if(!(name1.charAt(i)==name2.charAt(i))) {
                    nameChar.append(name1.charAt(i));
                    nameChar.append(name2.charAt(i));
                }
            }
            nameChar.append(name1.substring(i));
        }else {
            for (; i < name1.length(); i++) {
                if(!(name1.charAt(i)==name2.charAt(i))) {
                    nameChar.append(name1.charAt(i));
                    nameChar.append(name2.charAt(i));
                }
            }
           nameChar.append(name2.substring(i));
        }
        name1 = nameChar.toString().replace(" ", "");
        int sum = 0;
        for (char value : name1.toCharArray()) {
            sum += value;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
//            String name1 = in.nextLine();
//            String name2 = in.nextLine();
            solution s = new solution();
//
//            int sum = calcSimilarity(name1, name2);
//            System.out.println(sum);
//            int count = in.nextInt();
            int num = in.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = in.nextInt();
            }
//            System.out.println(countNum(arr, count));
            System.out.println(s.findRepeatNumber(arr));
        }
    }

    public static String convert(String s, int numRows){
        if (numRows == 1) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i < Math.min(numRows, s.length()); i++){
            rows.add(new StringBuilder());
        }
        int curRow = 0;
        boolean goingDown = false;
        for(char c : s.toCharArray()){
            rows.get(curRow).append(c);
            if(curRow == 0 || curRow == numRows-1) goingDown = !goingDown;
            curRow+=goingDown? 1 : -1;
        }
        StringBuilder ret = new StringBuilder();
        for(StringBuilder row : rows){
            ret.append(row);
        }
        return ret.toString();
    }

    public static String convert1(String s, int numRows){
        if(numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2*numRows-2;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j+i < n; j++){
                ret.append(s.charAt(j+i));
                if(i != 0 && i != numRows-1 && j+cycleLen-i < n)
                    ret.append(s.charAt(j+cycleLen-i));
            }
        }
        return ret.toString();
    }

    public static char countNum(int[] arr, int num){
        StringBuilder tempStr = new StringBuilder();
        for (int k : arr) {
            tempStr.append(k);
            int count = 0;
            for (int j = 0; j < tempStr.length(); j++) {
                count++;
                if (count == num) {
                    return tempStr.charAt(j);
                }
            }
        }
        return 0;
    }

    public static int reverseNum(int num){
        int tmp = 0;
        while(num!=0){
            int pop = num%10;
            num/=10;
            if(tmp > Integer.MAX_VALUE/10 || (tmp == Integer.MAX_VALUE/10 && pop > 7)) return 0;
            if(tmp < Integer.MIN_VALUE/10 || (tmp == Integer.MIN_VALUE/10 && pop < -8)) return 0;
            tmp = tmp*10+pop;
        }
        return tmp;
    }

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String str = String.valueOf(x);
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }
        for(int i = 0; i < str.length(); i++){
            if(stack.pop()!=str.charAt(i)) return false;
        }
        return true;
    }
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            nums[i] = start+2*i;
            sum = sum^nums[i];
        }
        return sum;
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int rows = matrix.length, columns = matrix[0].length;
        int row = 0, column = matrix[0].length-1;
        while(row < rows){
            if(matrix[row][column] == target) return true;
            else if(matrix[row][column] < target) row+=1;
            else column-=1;
        }
        return false;
    }

    public String replaceSpace(String s) {
//        if(s == null) return null;
//        String tmp = s.replaceAll(" ", "%20");
//        return tmp;
        if(s==null) return null;
        char[] ch = new char[s.length()*3];
        int size = 0;
        for(char C: s.toCharArray()){
            char c = C;
            if(c==' '){
                ch[size++] = '%';
                ch[size++] = '2';
                ch[size++] = '0';
            }else{
                ch[size++] = c;
            }
            // ch[size++] = c;
        }
        return new String(ch, 0, size);
    }
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        return null;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.push(root);
        int inorderIndex = 0;
        for (int i = 1; i < preorder.length; i++) {
            int preorderVal = preorder[i];
            TreeNode node = stack.peek();
            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }
        return root;
    }
    public int hammingWeight(int n) {
        int res = 0;
        while(n!=0){
            res += n&1;
            n<<=1;
        }
        return res;
    }
    public int hammingWeight1(int n) {
        int res = 0;
        while(n!=0){
            res += 1;
            n=n&(n-1);
        }
        return res;
    }

    public double myPow(double x, int n) {
        if(x==0) return 0;
        long m = n;
        double res = 1.0;
        if(m<0){
            x = 1/x;
            m = -m;
        }
        while(m!=0){
            if((m&1)==1) res *= x;
            x*=x;
            m>>=1;
        }
        return res;
    }
}