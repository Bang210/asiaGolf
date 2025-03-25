package kdd.toy.asiagolf.global.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseEntity<T> {

    private String resultCode;

    private String message;

    private T data;

    public static <T> ResponseEntity<T> of (String resultCode, String message) {
        ResponseEntity<T> response = new ResponseEntity<>();

        response.setResultCode(resultCode);
        response.setMessage(message);

        return response;
    }

    public static <T> ResponseEntity<T> of (String resultCode, String message, T data) {
        ResponseEntity<T> response = new ResponseEntity<>();

        response.setResultCode(resultCode);
        response.setMessage(message);
        response.setData(data);

        return response;
    }
}
