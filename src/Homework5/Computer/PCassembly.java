package Homework5.Computer;

public class PCassembly {
    private Processor processor;
    private Ram ram;
    private VideoCard videoCard;
    private Storage storage;
    private Monitor monitor;
    private CoolingStrategy coolingStrategy;

    public PCassembly() {
        this.processor = new Processor();
        this.ram = new Ram();
        this.videoCard = new VideoCard();
        this.storage = new Storage();
        this.monitor = new Monitor();
    }

    public void chooseItem() { }

    public void buildPc() {
        processor.orderProc();
        processor.chooseProcessor();
        ram.orderRam();
        ram.chooseRam();
        videoCard.orderVideo();
        videoCard.chooseVideo();
        storage.orderStorage();
        storage.chooseStorage();
        monitor.orderMonitor();
    }


    class standartCoolStrategy implements CoolingStrategy {
        @Override
        public void cool() {
            System.out.println("Охлаждается воздухом посредством кулера");
        }
    }

    class waterCoolStrategy implements CoolingStrategy {
        @Override
        public void cool() {
            System.out.println("Установлено водное охоаждение");
        }
    }

    class activeCoolStratefy implements CoolingStrategy {
        @Override
        public void cool() {
            System.out.println("Имеет активное охладение");
        }
    }

    class passiveCoolStrategy implements CoolingStrategy {
        @Override
        public void cool() {
            System.out.println("Имеет пассивное охлаждение");
        }
    }
}
