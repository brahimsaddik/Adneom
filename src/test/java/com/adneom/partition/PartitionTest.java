package com.adneom.partition;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

public class PartitionTest {

    @Test
    public void should_return_exception_when_given_empty_list(){

        Assertions.assertThrows(PartitionException.class, new Executable() {
            public void execute() throws Throwable {
                ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
                Partition.getPartitions(integerArrayList,3);
            }
        },"Cannot treat empty list");
    }

    @Test
    public void should_return_exception_when_given_number_bigger_then_size_of_array(){

        Assertions.assertThrows(PartitionException.class, new Executable() {
            public void execute() throws Throwable {
                ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
                integerArrayList.add(1);
                integerArrayList.add(2);
                Partition.getPartitions(integerArrayList,3);
            }
        },"Second param is bigger then size of first param");
    }

    @Test
    public void should_return_two_subarray_when_given_array_of_five_values() throws PartitionException{
        //Given
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        //When
        List<List<Integer>> parts = Partition.getPartitions(integerArrayList,3);
        //Then
        ArrayList<Integer> part1 = new ArrayList<Integer>();
        part1.add(1);
        part1.add(2);
        part1.add(3);

        ArrayList<Integer> part2 = new ArrayList<Integer>();
        part2.add(4);
        part2.add(5);

        Assertions.assertEquals(parts.size(),2);
        Assertions.assertEquals(parts.get(0),part1);
        Assertions.assertEquals(parts.get(1),part2);
    }

    @Test
    public void should_return_three_subarray_when_given_array_of_five_values() throws PartitionException{
        //Given
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        //When
        List<List<Integer>> parts = Partition.getPartitions(integerArrayList,2);
        //Then
        ArrayList<Integer> part1 = new ArrayList<Integer>();
        part1.add(1);
        part1.add(2);

        ArrayList<Integer> part2 = new ArrayList<Integer>();
        part2.add(3);
        part2.add(4);

        ArrayList<Integer> part3 = new ArrayList<Integer>();
        part3.add(5);

        Assertions.assertEquals(parts.size(),3);
        Assertions.assertEquals(parts.get(0),part1);
        Assertions.assertEquals(parts.get(1),part2);
        Assertions.assertEquals(parts.get(2),part3);
    }

    @Test
    public void should_return_five_subarray_when_given_array_of_five_values() throws PartitionException{
        //Given
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        //When
        List<List<Integer>> parts = Partition.getPartitions(integerArrayList,1);
        //Then
        ArrayList<Integer> part1 = new ArrayList<Integer>();
        part1.add(1);

        ArrayList<Integer> part2 = new ArrayList<Integer>();
        part2.add(2);

        ArrayList<Integer> part3 = new ArrayList<Integer>();
        part3.add(3);

        ArrayList<Integer> part4 = new ArrayList<Integer>();
        part4.add(4);

        ArrayList<Integer> part5 = new ArrayList<Integer>();
        part5.add(5);

        Assertions.assertEquals(parts.size(),5);
        Assertions.assertEquals(parts.get(0),part1);
        Assertions.assertEquals(parts.get(1),part2);
        Assertions.assertEquals(parts.get(2),part3);
        Assertions.assertEquals(parts.get(3),part4);
        Assertions.assertEquals(parts.get(4),part5);
    }
}
