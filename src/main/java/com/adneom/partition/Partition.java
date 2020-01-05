package com.adneom.partition;

import java.util.ArrayList;
import java.util.List;

public class Partition{

    static <T> List<List<T>> getPartitions(List<T> list, final int l) throws PartitionException {
        if(list.isEmpty()) {
            throw new PartitionException("Cannot treat empty list");
        }
        if(l > list.size()){
            throw new PartitionException("Second param is bigger then size of first param");
        }
        List<List<T>> parts = new ArrayList<List<T>>();
        final int n = list.size();
        for (int i = 0; i < n; i += l) {
            parts.add(new ArrayList<T>(
                    list.subList(i, Math.min(n, i + l)))
            );
        }
        return parts;
    }


}
