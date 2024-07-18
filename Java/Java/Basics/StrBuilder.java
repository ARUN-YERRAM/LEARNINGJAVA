class StrBuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Srikar");
        System.out.println(sb);
        // Look at char
        System.out.println(sb.charAt(5));
        // Set Char at index
        sb.setCharAt(0, 'T');
        sb.insert(0,'S');
        System.out.println(sb);

        sb.delete(1, 2);
        System.out.println(sb);
    }
}