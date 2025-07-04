public class ParseDataFromT24 {


//    static class DepositWhiteListResponse {
//        private static final String
//    }
    public static void main(String[] args) {
        System.out.println();

    }


    private static String getWhiteList() {
        String jsonReq, lmid, ofsResponse;

        ofsResponse= ",AC.LIST::AC.LIST,\"060314294850~VND~8102~VN0012783~~~03~20240115~81301540~81301540\",\"060314578514~VND~8102~VN0012783~~~03~20240119~30284219~30284219\",\"060314984741~VND~8102~VN0012783~~~02~20240127~30278858~30278858\"";


        //,AC.LIST::AC.LIST,
// "060314294850~VND~8102~VN0012783~~~03~20240115~81301540~81301540",
// "060314578514~VND~8102~VN0012783~~~03~20240119~30284219~30284219",
// "060314984741~VND~8102~VN0012783~~~02~20240127~30278858~30278858",
// "060315242791~VND~8102~VN0012783~~~01~20240201~41411981~41411981"

//        "060297301295~VND~8100~VN0011284~06~20230113~102243836~102243836"
        ofsResponse = ofsResponse.replace(",AC.LIST::AC.LIST,", "");

        // "060297301295~VND~8100~VN0011284~06~20230113~102243836~102243836"

        // "060297301295~VND~8100~VN0011284~06~20230113~102243836~102243836"
        String[] depositAccountArray = ofsResponse.split("\",\"");

//        List<DepositAccounts> depositAccounts = new ArrayList<>();
//        if (depositAccountArray.length > 0) {
//            for (int i = 0; i < depositAccountArray.length; i++) {
//                String stringArr = StringUtils.replace(depositAccountArray[i], "\"", "");
//                log.info("{} stringArr={}", lmid, stringArr);
//                if (StringUtils.isNotBlank(stringArr)) {
//                    String[] acctDetails = stringArr.splitByWholeSeparatorPreserveAllTokens(stringArr, "~");
//                    log.info("{} acctDetails={}", lmid, acctDetails);
//
//                    DepositAccounts depositAccount = DepositAccounts.builder().build();
//                    OfsTransform.transformToObject(depositAccount, acctDetails);
//                    depositAccounts.add(depositAccount);
//                }
//            }
//        }
//
//        response.setDepositAccounts(depositAccounts);
//
//        return response;

        return "";

    }
}



