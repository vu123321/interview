
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class HashingBase64 {


    public static void main(String[] args) throws IOException {
        // Chuỗi cần băm
        String originalString = new String(Files.readAllBytes(Paths.get("C:\\Users\\lhvu\\junior-why\\CompletableFuture\\src\\main\\java\\base64Tohash.txt")));



        // Mã hóa chuỗi thành Base64
        String base64Encoded = Base64.getEncoder().encodeToString(originalString.getBytes());
//        System.out.println("Base64 Encoded: " + base64Encoded);

        // Băm chuỗi Base64

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 1000; i++) {

            String hashedValue = hashBase64(base64Encoded);
            System.out.println("Hashed Value: " + hashedValue);
            map.put(hashedValue, String.valueOf(System.identityHashCode(hashedValue)));
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Hashed Key: " + entry.getKey() + ", Hashed Value: " + entry.getValue());
        }

    }

    public static String hashBase64(String input) {
        try {
            // Tạo đối tượng MessageDigest với thuật toán SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes());

            // Chuyển đổi byte[] thành chuỗi hex
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
