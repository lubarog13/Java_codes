package rpm_java;

import java.util.Arrays;

public class Computer {
    private CPU cpu;
    private GPU gpu;
    private Memory[] memoryblocks;

    public Computer(CPU cpu, GPU gpu, Memory[] memoryblocks) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.memoryblocks = memoryblocks;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", memoryblocks=" + Arrays.toString(memoryblocks) +
                '}';
    }
    public Computer copy(){
        Computer newPC = new Computer(cpu.copy(), gpu.copy(), new Memory[memoryblocks.length]);
        for(int i = 0;i<memoryblocks.length;i++){
            newPC.getMemoryblocks()[i] = memoryblocks[i].copy();
        }

        return newPC;
    }
    public float getRating(){
            if (gpu.getRtx()){
        return cpu.getMaxFrequency() * 0.95F * cpu.getCores() + gpu.getMemory() * 0.2F + 1;}
            else return cpu.getMaxFrequency() * 0.95F * cpu.getCores() + gpu.getMemory() * 0.2F;
    }


    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public Memory[] getMemoryblocks() {
        return memoryblocks;
    }

    public void setMemoryblocks(Memory[] memoryblocks) {
        this.memoryblocks = memoryblocks;
    }
}
