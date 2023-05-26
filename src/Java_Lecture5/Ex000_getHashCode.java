package Java_Lecture5;

public class Ex000_getHashCode {
//    #region
//    public int hashCode1() {
//        int result = (int) (id ^ (id >>> 32));
//        result = 31 * result + name.hashCode();
//        result = 31 * result + email.hashCode();
//        return result;
//    }
//
//    public int hashCode2() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((email == null) ? 0 : email.hashCode());
//        result = prime * result + (int) (id ^ (id >>> 32));
//        result = prime * result + ((name == null) ? 0 : name.hashCode());
//        return result;
//    }
//    #endregion

    public static void main(String[] args) {
        int a = 123;
        System.out.println(Integer.hashCode(a));
        System.out.println("z".hashCode());
    }
}
