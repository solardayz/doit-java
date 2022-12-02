package chapter14;

public class IDFormatTest {

    private String userID;

    public IDFormatTest() {

    }

    public String getUserID() {
        return userID;
    }
    public IDFormatTest(String userID) {
        this.userID = userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if(userID == null) {
            throw new IDFormatException("아이디를 입력해 주세요.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 만들어 주세요.");
        }
        this.userID = userID;
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();
        String userID = null;
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        userID = "1234";
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
