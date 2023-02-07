package puk.team.example.response;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <D, E> Result<D, E> createResult(D data, Class<E> type) {
        Result<D, E> res = new Result<>();
        res.setData(data);
        return res;
    }

    public static <T> List<T> createListWithItem(T item) {
        List<T> res = new ArrayList<>();
        res.add(item);
        return res;
    }

    public static void main(String[] args) {
        Result<String, String> test = createResult("Test", String.class);
        List<String> list = createListWithItem("BANANA");
    }
}
