public class oper{
    public static void main(String[] args){
        int a=20;
        int b=15;
        String str1="Ramya";
        String str2="1107";
        boolean isEqual=(a==b);
        boolean isNotequal=(a!=b);
        boolean isGreater=(a>b);
        boolean isLesser=(a<b);
        boolean isGreaterorEqual=(a>=b);
        boolean isLesserorEqual=(a<=b);
        System.out.println("a==b"+isEqual);
        System.out.println("a!=b"+isNotequal);
        System.out.println("a>b"+isGreater);
        System.out.println("a<b"+isLesser);
        System.out.println("a>=b"+isGreaterorEqual);
        System.out.println("a<=b"+isLesserorEqual);

        if (str1.equals("Ramya") && str2.equals("1107")){
            System.out.println("Login Sucessfully");
        }
            else{
                System.out.println("Invalid Username or password");
            }
        }
    }
