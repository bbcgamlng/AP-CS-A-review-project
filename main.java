
/*
@precondition: str is a String of 0 or more characters.
@returns: the index of the first ‘a’ that is found in the string.
 If one is not found, look for an ‘e’ and return its index.
  If there is not an ‘e’, look for an ‘i’ and return its index.
  Do the same for ‘o’ and ‘u’. If no ‘u’ is found, return the index
  found from this attempt.
 */

public class Main {
    public static void main(String[] args) {
        findVowel("Java");
        System.out.println();
        findVowel("Method");
        System.out.println();
        findVowel("index");
        System.out.println();
        findVowel("String");
        System.out.println();
        findVowel("SystEm");
        System.out.println();
        findVowel("Rhythm");
    }

    public static void findVowel(String str){
        if(str.length()==0){
            System.out.println("Str Must be at least one letter");
        }
        else if(str.indexOf('a')!=-1){
            System.out.println(str+" --> "+(str.indexOf('a')+1));
            System.out.println("Characters before the first found vowel: "+str.substring(0,str.indexOf('a')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('a')+1));

        }
        else if(str.indexOf('A')!=-1){
            System.out.println(str+" --> "+(str.indexOf('A')+1));
            System.out.println("Characters before the first found vowel: "+str.substring(0,str.indexOf('A')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('A')+1));

        }

        else if(str.indexOf('e')!=-1){
            System.out.println(str+" --> "+(str.indexOf('e')+1));
            System.out.println("Characters before the first found vowel:"+str.substring(0,str.indexOf('e')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('e')+1));

        }
        else if(str.indexOf('E')!=-1){
            System.out.println(str+" --> "+(str.indexOf('E')+1));
            System.out.println("Characters before the first found vowel:"+str.substring(0,str.indexOf('E')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('E')+1));

        }
        else if (str.indexOf('i')!=-1) {
            System.out.println(str+" --> "+(str.indexOf('i')+1));
            System.out.println("Characters before the first found vowel:"+str.substring(0,str.indexOf('i')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('i')+1));
        }
        else if (str.indexOf('I')!=-1) {
            System.out.println(str+" --> "+(str.indexOf('I')+1));
            System.out.println("Characters before the first found vowel:"+str.substring(0,str.indexOf('I')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('I')+1));
        }
        else if (str.indexOf('o')!=-1) {
            System.out.println(str+" --> "+(str.indexOf('o')+1));
            System.out.println("Characters before the first found vowel:"+str.substring(0,str.indexOf('o')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('i')+1));
        }
        else if (str.indexOf('O')!=-1) {
            System.out.println(str+" --> "+(str.indexOf('O')+1));
            System.out.println("Characters before the first found vowel:"+str.substring(0,str.indexOf('O')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('O')+1));
        }
        else if (str.indexOf('u')!=-1) {
            System.out.println(str+" --> "+(str.indexOf('u')+1));
            System.out.println("Characters before the first found vowel:"+str.substring(0,str.indexOf('u')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('u')+1));

        }
        else if (str.indexOf('U')!=-1) {
            System.out.println(str+" --> "+(str.indexOf('u')+1));
            System.out.println("Characters before the first found vowel:"+str.substring(0,str.indexOf('U')));
            System.out.println("Characters after the first found vowel: "+str.substring(str.indexOf('U')+1));

        }
        else{
            System.out.println("No vowel found.");

        }
    }
}
