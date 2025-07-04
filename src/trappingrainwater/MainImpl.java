package trappingrainwater;

public class MainImpl {

    public static void main(String[] args) {

        AmlServiceImpl amlService = new AmlServiceImpl() {
            @Override
            public String checkAml(String userCode) {
                return "";
            }

            @Override
            public String checkAmlV2(String userCode) {
                return "";
            }
        };

        System.out.println(amlService.checkAml(""));

        amlService.checkAmlV2("");
    }
}