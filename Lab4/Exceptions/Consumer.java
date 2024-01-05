package exec;

import exec.TestClass;

public class Consumer {

    public void divideTest(TestClass c, int x, int y) {
        try {
            System.out.println(c.divide(x, y));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally 0");
        }
    }

    public void connectToDBTest(TestClass tc,  String creds) {
        try {
            System.out.println(tc.connectToDB(creds));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally 1");
        }

    }

    public void checkFileTest(TestClass tc, char c) {
        try {
            System.out.println(tc.checkFile(c));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally 2");

        }
    }

}
