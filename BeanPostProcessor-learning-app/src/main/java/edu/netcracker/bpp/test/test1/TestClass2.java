package edu.netcracker.bpp.test.test1;

import edu.netcracker.bpp.bean.Bean1;
import edu.netcracker.bpp.bpp.annotation.Inject;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class TestClass2 {
    @Inject
    private Bean1 bean1;
}
