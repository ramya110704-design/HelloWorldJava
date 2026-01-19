public class StringEx{
    public static void main(String[] args){
        String str1="Hello World";
        String str2="Java";
        System.out.println("Length of a string:" + str1.length());
        System.out.println("Character at index:" +str1.charAt(2));
        System.out.println("Concatenation of String:" +str2.concat("Programming"));
        System.out.println("Equals check:" +str1.equals(str2));
        System.out.println("Equals Ignore case:" +str1.equalsIgnoreCase(str2));
        System.out.println("Index of 'o':" +str1.indexOf('o'));
        System.out.println("Last index of 'o':" +str1.lastIndexOf('o'));
        System.out.println("Substring from index 6:" +str1.substring(6));
        System.out.println("Substring (0,5):" +str1.substring(0,5));
        System.out.println("Uppercase:" +str1.toUpperCase());
        System.out.println("Lowercase:" +str1.toLowerCase());
        System.out.println("Trimmed string:" +str1.trim()+"");
        System.out.println("Replace result:" +str1.replace("World","Java"));
    }
}
    

