package demo;

public class FlowControl {
    public static void main(String[] args) {
        //we know about methods. That's jump.

        //looping
        //4 loops in java - for, while, do-while, for-each (the enhanced for loop)

        //the regular old for loop, the workhorse, your bread and butter
        for(int i = 0; i < 10; i++ ) {
            //three parts: initial condition, looping condition, iteration
        }

        //the while and it's little sister do-while that no one cares about
        int i = 0;
        while(i < 10) {

            i++;
        }

        int j = 0;
        do{
            j++;
        } while(j < 10);

        //enhanced for, a newcomer in java 8
        //as long as something implements "Iterable" (an interface) then it works with for-each
        //also arrays. At some point Arrays became iterable.
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9};
        for(int k : array) {
            //k is the place holder, it;s each element from the array one by one as we loop
            System.out.println(k);//printing 0-9 on 10 lines
        }

        //branching
        if(1 < 2) {
            //this is always true
            //when the predicate is true, things in the block happen
        }

        if(1 > 5) {
            //this is always false, so we will skip this block and go
            //to the else
        } else {
            //this happens.
        }

        if(false) {
            //again we skip this block
        } else if(false) {
            //now we skip this one too
        } else if(false) {
            //we can chain as many of these as we want
        } else {
            //and finally this is all that's left
        }

        String mySwitchString = "Option C";
        switch (mySwitchString) {
            case "Option A":
            case "Option a":
                //don't forget to break
                break;
            case "Option B":
            case "Option b":
                //or else you get fall-through
                break;
            case "Option C":
            case "Option c":
                //This one is the case we get because it matches our string
                break;
            default:
                //this is the "else" here
        }

    }


}

