class Computer {
    String cpu, gpu;
    int ram;

    static class Builder {
        String cpu, gpu;
        int ram;

        Builder setCPU(String c) { cpu = c; return this; }
        Builder setGPU(String g) { gpu = g; return this; }
        Builder setRAM(int r) { ram = r; return this; }

        Computer build() {
            Computer pc = new Computer();
            pc.cpu = cpu;
            pc.gpu = gpu;
            pc.ram = ram;
            return pc;
        }
    }

    void show() {
        System.out.println(cpu + ", " + gpu + ", " + ram + "GB");
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        Computer pc = new Computer.Builder()
                .setCPU("i5").setGPU("GTX").setRAM(8).build();
        pc.show();
    }
}
