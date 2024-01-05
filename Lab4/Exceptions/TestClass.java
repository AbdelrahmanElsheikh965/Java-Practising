package exec; 

public class TestClass {

    public int divide (int n1, int n2) throws CustomException
    {
        if (n2 == 0){
            throw new CustomException("No / on 0 allowed");
        }
        return n1 / n2;
    }

    public String connectToDB (String creds) throws CustomException
    {
        if (creds.length() < 10){
            throw new CustomException("Wrong creds");
        }
        return "Connected";
    }

    public char checkFile (char c) throws CustomException
    {
        if (c == 'e'){
            throw new CustomException("Be careful");
        }
        return 'D';
    }

}
