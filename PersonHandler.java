 
/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
            int counter = 0;
            String stringRepresentation="";
            while (counter < personArray.length ){
                
               
               stringRepresentation =  personArray[counter].toString();
                 result = result + stringRepresentation;
                counter ++;
                
                
                
            }
            
            
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
            String stringRepresentation = "";
            for(int counter = 0 ; counter < personArray.length ; counter++){
               stringRepresentation =  personArray[counter].toString();
                 result = result +  stringRepresentation;
                
                
    
            }
           

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
            String stringRepresentation = "";
            
            for( Person per : personArray){
               stringRepresentation =  ( per.toString() );
                 result = result +  stringRepresentation;
                
                
                
    
            }
           

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
