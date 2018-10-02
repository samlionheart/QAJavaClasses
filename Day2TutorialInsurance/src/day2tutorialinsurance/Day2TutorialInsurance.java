/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2tutorialinsurance;

/**
 *
 * @author Administrator
 */
public class Day2TutorialInsurance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static double getInsurancePremium(int age, char gender, short engineSize, boolean hasNoClaims) {
        double policy1 = InsuranceConstants.BASE_PREMIUM_1 * InsuranceConstants.PREMIUM_FACTOR_1;
        double policy2 = InsuranceConstants.BASE_PREMIUM_2 * InsuranceConstants.PREMIUM_FACTOR_2;
        double policy3 = InsuranceConstants.BASE_PREMIUM_3 * InsuranceConstants.PREMIUM_FACTOR_3;
        double userPolicy=0;
        if (age > 25){
            if (gender == 'f'){
                if (engineSize <= 800){
                    if (hasNoClaims){
                        userPolicy = policy1;
                    }
                    else {
                        userPolicy = policy2;
                    }
                }else{
                    userPolicy = policy2;
                }
            }
            else {
                userPolicy = policy3;
            }
        }else {
                userPolicy = policy3;
            }
        return userPolicy;
    }

}
