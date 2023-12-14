//The abstract class for the composite pattern
// The abstract class has a default implementation for all method it has.
//The child composite class will override the method it needs to override.
///The leaf class will not override any method => it will use the default implementation.
public abstract class CompanyComponent {

    // The first 3 methods are for the composite class
    // the child leaf class will not override them.

    public void add (CompanyComponent companyComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove (CompanyComponent companyComponent) {
        throw new UnsupportedOperationException();
    }

    public CompanyComponent getChild (int i) {
        throw new UnsupportedOperationException();
    }

    public String getName () {
        throw new UnsupportedOperationException();
    }

    public double getSalary () {
        throw new UnsupportedOperationException();
    }

    public String getID () {
        throw new UnsupportedOperationException();
    }

    public void print () {
        throw new UnsupportedOperationException();
    }
}
