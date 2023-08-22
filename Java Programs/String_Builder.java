package aditi;

public class String_Builder {
    public static void main(String[] args) {
        //StringBuilder Declaration
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'w');
        System.out.println(sb);

        //insert character
        sb.insert(0, 'p');
        System.out.println(sb);

        //delete a character
        sb.delete(3, 4);
        System.out.println(sb);

        //delete substring
        sb.delete(2,4);
        System.out.println(sb);

        //append - adding from last
        sb.append("l");
        sb.append("f");
        System.out.println(sb);

        //length of string
        System.out.println(sb.length());
    }
}