package edu.netcracker.small_learning_things.test_small_things_here;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Base {
    private List<A> as;
}
