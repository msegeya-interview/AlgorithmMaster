/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codilitymaster.solutions;

import static codilitymaster.helpers.Permutations.perm1;
import static codilitymaster.helpers.Permutations.perm2;
import codilitymaster.helpers.StdOut;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author icode
 */
public class SimbilingNumberSolution {
    
    public static void main(String[] args) {
        
        args=SimbilingNumberArgumentLoader.popupulateArguments();
        
        for (int i = 0; i < args.length; i++) {
            generateSiblings(Integer.valueOf(args[i]));
        }
    }

    public int solution(int N) {

        return 1;
    }

    private static List<String> generateSiblings(int N) {
        
        List<String>  simblings= new ArrayList<>();


        N = 356;
        String NN = String.valueOf(N);
        int n = NN.length();
        String alphabet = NN;
        String elements = alphabet.substring(0, n);
        
    
        perm1(elements);
        StdOut.println();
        perm2(elements);

        return simblings;
    }

    private int retrieveMaximumSiblingNumber(int N) {

        return 1;
    }

}
