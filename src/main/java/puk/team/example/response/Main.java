package puk.team.example.response;

public class Main {

    public static <D, E> Result<D, E> createResult(D data, Class<E> type) {
        Result<D, E> res = new Result<>();
        res.setData(data);
        return res;
    }

    public static void main(String[] args) {
        Result<String, String> test = createResult("Test", String.class);

    }
}
