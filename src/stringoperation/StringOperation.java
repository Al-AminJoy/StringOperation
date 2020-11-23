
package stringoperation;

public class StringOperation {

    public static void main(String[] args) {
        String firstName="Al-Amin";
        String secondName=" Islam";
        //Methods
        //.trim() for remove space in start and end
        //.length() for checking length
        //.equal() for checking equal or not with other string 
        //.equalIgnoreCase() for ignore case sensitivity while compare equal or not with other string 
        //.contains() for check string contains the string is passed by this method
        //.isEmpty() for check string is empty or not
        //.replace('replace','replaceBy') for replace a character from string but have to put other string or use StringBuffer
        
        String fullName=firstName.concat(secondName);
        System.out.println("Full Name Is : "+fullName);
        System.out.println("UpperCased Full Name Is : "+fullName.toUpperCase());
        System.out.println("LowerCased Full Name Is : "+fullName.toLowerCase());
       

        String[] splitNames=fullName.split(" ");
        System.out.println("Split Names : ");
        for(String i:splitNames){
            System.out.println(i);
        }
        
        //.startsWith() for show string starts with which letter
        //.endsWith() for show string ends with which letter
        //.charAt() for check which caracter in passed index
        //.codePointAt() for check ASCII value of this caracter in passed index
        //.indexOf() for show the passed character belong in which index
        //.lastIndexOf() for show the passed character belong in which last index of that string
        StringBuffer first=new StringBuffer("Al-Amin");
        //StringBuffer and StringBuilder Both are same 
        first.append(" Islam");
        first.append(" Joy");
        System.out.println("Appened String : "+first);
        //.reverse() for reverse
        //.delete(start,end) for delete index of string
        //.setLength() for set length
        
        
    }
    
}
