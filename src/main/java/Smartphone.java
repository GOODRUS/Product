public class Smartphone extends Product {
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    private String producer;

    public Smartphone(int id, int price, String name, String producer) {
        super(id, price, name);
        this.producer = producer;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        if (getProducer().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}