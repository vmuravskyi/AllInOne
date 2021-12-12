package epam.qaSummer.lesson10;


import java.util.Iterator;

enum VagonEnum {
    Passenger("Passenger"), Cargo("Cargo");

    private String name;

    VagonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "name='" + name + '\'' +
                "}";
    }
}

class StackTrain implements Iterable<VagonEnum> {
    private final VagonEnum[] train;
    private int top = -1;

    public StackTrain(VagonEnum[] train) {
        this.train = train;
        top = train.length - 1;
    }

    public StackTrain() {
        train = new VagonEnum[8];
    }

    public StackTrain(int n) {
        train = new VagonEnum[n];
    }

    public void push(VagonEnum v) {
        if (isFull())
            throw new RuntimeException("Full stack");
        train[++top] = v;
    }

    public VagonEnum pop() {
        if (isEmpty())
            throw new RuntimeException("Empty stack");
        return train[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == train.length - 1;
    }

    public VagonEnum peek() {
        return train[top];
    }

    public void print() {
        for (var v : train) {
            System.out.println(v);
        }
    }

    @Override
    public Iterator<VagonEnum> iterator() {
        return new StackTrainIterator();
    }

    class StackTrainIterator implements Iterator<VagonEnum> {
        private int i;

        StackTrainIterator() {
            this.i = 0;
        }

        @Override
        public boolean hasNext() {
            if (!isEmpty())
                return i <= top;
            else return false;
        }

        @Override
        public VagonEnum next() {
            return train[i++];
        }
    }
}

public class ProgramStack {
    public static void main(String[] args) {
//        StackTrain train = getStackTrain7();
        StackTrain train = new StackTrain();
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Passenger);
        train.push(VagonEnum.Cargo);
        train.push(VagonEnum.Passenger);
        train.push(VagonEnum.Passenger);

        train.print();


        StackTrain passTrain = new StackTrain();
        StackTrain cargoTrain = new StackTrain();

        while (!train.isEmpty()) {
            if (train.peek() == VagonEnum.Cargo)
                cargoTrain.push(train.pop());
            else
                passTrain.push(train.pop());
        }

        System.out.println("*****************************************************");
        cargoTrain.print();
        passTrain.print();
        System.out.println("------------------------------------------------------");
        for (var v : cargoTrain)
            System.out.println(v);
    }

    private static StackTrain getStackTrain7() {
        VagonEnum[] vagons = {
                VagonEnum.Passenger,
                VagonEnum.Cargo,
                VagonEnum.Passenger,
                VagonEnum.Cargo,
                VagonEnum.Passenger,
                VagonEnum.Cargo,
                VagonEnum.Cargo
        };
        return new StackTrain(vagons);

    }
}
