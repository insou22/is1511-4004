package co.insou.is1511.instruct.def1b;

import co.insou.is1511.CPU;
import co.insou.is1511.instruct.Instruction;

public class HALT_0 implements Instruction {

    @Override
    public void execute(CPU cpu) {
        cpu.setRunning(false);
    }

}
