import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//create hashmap
//input valid roman numerals and their equal int in hashmap
//iterate through string
//IF CURR VALUE< NEXT VALUE.. WE MUST SUBTRACT THE 2
//SO JUST ADD THE - OF THE CURRENT AS THE NEXT WILL BE ADDED ANYWAYS HENCE MINUSING THE 2 VALUES - > THIS WAY WE AVOID USING MULTIPLE POINTERS AND MESSING UP THE LOOP
//if string isnt at end (end-1) AND current character in string < next character. minus current character from total
//ELSE If STRING IS AT END OR CURRENT NUMBER>NEXT NUMBER ADD CURRENT NUMBER TO TOTAL
public class Main {


     int romanToInt( String s) {
         HashMap<Character, Integer> ri = new HashMap<>();
         ri.put('I',1);
         ri.put('V',5);
         ri.put('X',10);
         ri.put('L',50);
         ri.put('C',100);
         ri.put('D',500);
         ri.put('M',1000);

        int total=0;
        if(s.length()==0){
            return -1;
        }

            for(int i=0;i<s.length();i++){
                if(!(ri.containsKey(s.charAt(i)))){
                    return -1;
                }

                if(i<s.length()-1 && ri.get(s.charAt(i))<ri.get(s.charAt(i+1))){
                    total-=ri.get(s.charAt(i));
                }
                else{
                    total+=ri.get(s.charAt(i));
                }
            }

         return total;
     }


    public void main(String[] args){




    }

}