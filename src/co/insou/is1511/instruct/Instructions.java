package co.insou.is1511.instruct;

import co.insou.is1511.instruct.def1b.*;
import co.insou.is1511.instruct.def2b.*;

import java.util.IdentityHashMap;
import java.util.Map;

public enum Instructions {

    // 1 Byte
    HALT_0(0, new HALT_0()),
    INCR_R0_1(1, new INCR_R0_1()),
    DECR_R0_2(2, new DECR_R0_2()),
    INCR_R1_3(3, new INCR_R1_3()),
    DECR_R1_4(4, new DECR_R1_4()),
    SUM_R_5(5, new SUM_R_5()),
    SUB_R_6(6, new SUB_R_6()),
    PNT_R0_7(7, new PNT_R0_7()),

    // 2 Byte
    JMP_R0NZ_8(8, new JMP_R0NZ_8()),
    JMP_R0IZ_9(9, new JMP_R0IZ_9()),
    SET_R0_10(10, new SET_R0_10()),
    SET_R1_11(11, new SET_R1_11()),
    STR_R0_12(12, new STR_R0_12()),
    STR_R1_13(13, new STR_R1_13()),
    SWAP_R0_14(14, new SWAP_R0_14()),
    SWAP_R1_15(15, new SWAP_R1_15());

    private static final Map<Byte, Instruction> INSTRUCTIONS = new IdentityHashMap<>();

    static {
        for (Instructions instruction : Instructions.values()) {
            INSTRUCTIONS.put(instruction.operator, instruction.instruction);
        }
    }

    public static Instruction findInstruction(byte operator) {
        return INSTRUCTIONS.get(operator);
    }

    private final byte operator;
    private final Instruction instruction;

    Instructions(int operator, Instruction instruction) {
        this.operator = (byte) operator;
        this.instruction = instruction;
    }

}
