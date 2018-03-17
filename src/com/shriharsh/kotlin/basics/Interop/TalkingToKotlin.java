package com.shriharsh.kotlin.basics.Interop;

import com.shriharsh.kotlin.basics.classes.CustomerKotlin;
import com.shriharsh.kotlin.basics.classes.CustomerKotlinKt;
import com.shriharsh.kotlin.basics.classes.Status;

import java.io.IOException;

/**
 * ~ when using Kotlin code in Java files, the default parameters if not declared nullable, then they show @NotNull in the suggestions
 * and if they are declared Nullable, then it would show @Null
 * <p>
 * ~ when you want to set and get on any property from Kotlin, you can invoke any setters and getters relevant to that property
 * <p>
 * ~ When you want to access any property from a kotlin class and change the value of it, then you cannot do it if it is not declared with
 *
 * @JvmField annotation
 * <p>
 * <p>
 * ~ Handling default parameters for a function from Kotlin can be done by using annotation @JvmOverloads
 * <p>
 * ~ Using @JvmName you can actually change the name of the method, when we want to access it from Java code, this is useful during type erasion
 */

public class TalkingToKotlin {

    /**
     * - This shows how a "checked exception" is handled in Java, when their is no concept of "checked exception" in Kotlin
     * - It is possible using annotation @Throws, by adding it in Kotlin file
     *
     * @param customerKotlin
     */
    public void loadStats(CustomerKotlin customerKotlin) {

        try {
            customerKotlin.loadStatistics("Something");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println("================Talking to Kotlin class==========================");
        CustomerKotlin customerKotlin = new CustomerKotlin(100, "Hadi", "somoething@sometgin.com");

        //default provided setter
        customerKotlin.setEmail("shri@shri.com");

        //somefield is declared as @JvmField, so you can access it here, otherwise you cannot
        String someValue = customerKotlin.someField;

        //Parameter passed to the function
        customerKotlin.changeStatus(Status.CURRENT);

        //Handling default parameters, by using @JvmOverloads
        customerKotlin.changeStatus();

        //Use of @JvmName, try accessing using "makePreferred()" name you cannot access it, but its accessible using name "preferential"
        customerKotlin.preferrential();

        System.out.println("================Talking to Kotlin Top Level Functions==========================");
        String value = TopLevelFunctionsKt.prefix("some", "value");
        System.out.println(value);

        //this is accessed as a function, but not as a field
        TopLevelFunctionsKt.getCopyRightYear();

        //You can access it as a property by using "const" keyword in you Kotlin file
        int lastCopyRightYear = TopLevelFunctionsKt.lastCopyRightYear;

        System.out.println("================Talking to Kotlin Extension function==========================");
        //It can be accessed using fileName#extensionFunctionName and then you need to pass the instance of the object to that function
        CustomerKotlinKt.extension(customerKotlin);


    }


}
