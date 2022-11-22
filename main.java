/** "Product" */
class Soup {
    private String meat = "";
    private String groats = "";
    private String spices = "";

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setGroats(String groats) {
        this.groats = groats;
    }

    public void setSpices(String spices) {
        this.spices = spices;
    }
}

/** "Abstract Builder" */
abstract class SoupBuilder {
    protected Soup soup;

    public Soup getSoup() {
        return soup;
    }

    public void createNewSoupProduct() {
        soup = new Soup();
    }

    public abstract void buildMeat();

    public abstract void buildGroats();

    public abstract void buildSpices();
}

/** "ConcreteBuilder" */
class BorschSoupBuilder extends SoupBuilder {
    public void buildMeat() {
        soup.setMeat("veal");
    }

    public void buildGroats() {
        soup.setGroats("mild");
    }

    public void buildSpices() {
        soup.setSpices("spicy");
    }
}

/** "ConcreteBuilder" */
class OkroshkaSoupBuilder extends SoupBuilder {
    public void buildMeat() {
        soup.setMeat("chicken");
    }

    public void buildGroats() {
        soup.setGroats("hot");
    }

    public void buildSpices() {
        soup.setSpices("sour cream");
    }
}

/** "ConcreteBuilder" */
class RiceSoupBuilder extends SoupBuilder {
    public void buildMeat() {
        soup.setMeat("ground meat");
    }

    public void buildGroats() {
        soup.setGroats("rice");
    }

    public void buildSpices() {
        soup.setSpices("lungs");
    }
}

/** "Director" */
class Cook {
    private SoupBuilder soupBuilder;

    public Cook setSoupBuilder(SoupBuilder soupBuilder) {
        this.soupBuilder = soupBuilder;
        return this;
    }

    public Soup getSoup() {
        return soupBuilder.getSoup();
    }

    public Cook constructSoup() {
        soupBuilder.createNewSoupProduct();
        soupBuilder.buildMeat();
        soupBuilder.buildGroats();
        soupBuilder.buildSpices();
        return this;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
