package JavaCodes.E_Strings;

public class B_String_basic {
    public static void main(String[] args) {

        //strings are immutable

        //1.string concatenate
        String name="Anurag";
      String title=" Kumar";
      String Full_name=name+title;
      System.out.println(Full_name);
        System.out.println(Full_name.length());


        //2.charAt function
        //we want to print all the char of Full_name string
        for(int i=0;i<Full_name.length();i++){
            System.out.print(Full_name.charAt(i));
        }
        System.out.println();

        //3.compare
        String str1="anu";
        String str2="kumar";
        // 3 case
        //str1==str2 return 0
        //str1>str2 +ve value
        //str2<str1 -ve value

        if(str1.compareTo(str2)==0){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
       //The compareTo method in Java is used to compare two strings lexicographically. Lexicographical comparison
       //means comparing strings based on the alphabetical order of their characters.This method returns an integer
      //value that indicates the relationship between the two strings being compared.

      // here str1 is less than str 2 as first char a of str1 comes
      // before first char of str2 k  we can say it has less ascii value
        String a="My name is Tony";
        String b=a.substring(11);
        System.out.println(b);
        System.out.println(a.substring(0,10));

    }
}
