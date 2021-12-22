package designpatterns.design_patterns_udemy.solid.isp;

interface Machine {
    void print(Document document);

    void fax(Document document);

    void scan(Document document);
}

public class Document {

}

class MultiFunctionPrinter implements Machine {
    @Override
    public void print(Document document) {
        //
    }

    @Override
    public void fax(Document document) {
        //
    }

    @Override
    public void scan(Document document) {
        //
    }
}

/**
 * Its bad idea to do below, as the old-fashioned printer is
 * not supposed to have an implementation of 'fax' or 'scan' methods
 */
class OldFashionedPrinter  implements Machine {
    @Override
    public void print(Document document) {
        //
    }

    @Override
    public void fax(Document document) {
        //
    }

    @Override
    public void scan(Document document) {
        //
    }
}

/**
 * The below is a proper way to segregate interfaces.
 */
interface Printer {
    void print(Document d);
}

interface Scanner {
    void scan(Document d);
}

interface Fax {
    void doFax(Document d);
}

/**
 * An implementation of an interface 'Printer' with the only method to override.
 * YAGNI = You Ain't Going To Need It
 */
class JustAPrinter implements Printer {
    @Override
    public void print(Document d) {
        //
    }
}

/**
 * The device that can do two thinks.
 */
class Photocopier implements Printer, Scanner {
    @Override
    public void print(Document d) {
        //
    }

    @Override
    public void scan(Document d) {
        //
    }
}

/**
 * Another idea to extend as many as needed interfaces to implement only one.
 */
interface MultiFunctionDevice extends Printer, Scanner, Fax {

}

/**
 * The implementation of a class that can do a few things.
 */
class MultiFunctionMachine implements MultiFunctionDevice {
    @Override
    public void print(Document d) {
        //
    }

    @Override
    public void scan(Document d) {
        //
    }

    @Override
    public void doFax(Document d) {
        //
    }
}

/**
 * Decorator. We have objects of 'Printer', 'Scanner', 'Fax' initiated in constructor.
 * In overridden methods simply delegate work to those objects.
 */
class MultiFunctionMachineDecorator implements MultiFunctionDevice {
    private Printer printer;
    private Scanner scanner;
    private Fax fax;

    public MultiFunctionMachineDecorator(Printer printer, Scanner scanner, Fax fax) {
        this.printer = printer;
        this.scanner = scanner;
        this.fax = fax;
    }

    @Override
    public void print(Document d) {
        printer.print(d);
    }

    @Override
    public void scan(Document d) {
        scanner.scan(d);
    }

    @Override
    public void doFax(Document d) {
        fax.doFax(d);
    }
}
