package pl.aswit.leetcode.test;

import java.util.HashSet;
import java.util.Objects;

public class TestDto {

    private String test;

    public TestDto(String test) {
        this.test = test;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestDto testDto = (TestDto) o;
        return Objects.equals(test, testDto.test);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test);
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}
