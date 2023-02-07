package puk.team.example.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result<D, E> {
    private D data;
    private E error;
}
