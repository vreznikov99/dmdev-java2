package enums;

import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorTypes bit32 = ProcessorTypes.BIT_32;
        System.out.println(bit32);
        System.out.println(bit32.name());
        System.out.println(bit32.toString());
        System.out.println(ProcessorTypes.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProcessorTypes.values()));
        System.out.println(ProcessorTypes.BIT_32.ordinal());
        System.out.println(ProcessorTypes.BIT_64.getName());
        System.out.println(ProcessorTypes.BIT_32.getDescription());
    }
}
