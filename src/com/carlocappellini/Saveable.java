package com.carlocappellini;

import java.util.List;

public interface Saveable {
    List <String> write();
    void read(List<String> list);
}
