package Classes;

public class DIU implements University{

    private String universityName = "Daffodil International Classes.University";
    private String universityAddress = "Ashulia, Shavar, Dhaka.";

    @Override
    public String getUniversityName() {
        return universityName;
    }

    @Override
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String getUniversityAddress() {
        return universityAddress;
    }

    @Override
    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }
}
