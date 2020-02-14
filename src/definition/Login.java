package definition;

public class Login {

    private String id;
    private String pswrd;
    private int count;

    public boolean checkID(String id) {
        this.id = id;
        boolean response = false;

        String countstr = Encryption.MD5(id);
        if (countstr.equals("63a9f0ea7bb98050796b649e85481845")) {
            this.count = 0;
            response = true;
        }
        return response;
    }

    public boolean checkPswrd(String pswrd) {
        this.pswrd = pswrd;
        boolean response = false;
        String countstr = Encryption.SHA1(pswrd);

        if (countstr.equals("dc76e9f0c0006e8f919e0c515c66dbba3982f785") && count == 0) response = true;

        return response;
    }

}
