class Test {

    static void validate(int marks) throws Exception {
        if (marks < 33) {
            throw new Exception("Fail");
        }
        System.out.println("Pass");
    }

    public static void main(String[] args) {
        try {
            validate(44);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
