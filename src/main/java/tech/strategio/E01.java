package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        // FIXME
        if(n == 1) return 0;
        if(n == 2) return 1;
        return getNthFib(n - 1) + getNthFib(n - 2);
    }
}
