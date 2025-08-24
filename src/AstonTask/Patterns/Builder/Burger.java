package AstonTask.Patterns.Builder;

public class Burger {
    private String bread;
    private String meat;
    private String cheese;
    private String sauce;

    private Burger(BurgerBuilder builder) {
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.cheese = builder.cheese;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        return "Burger with: " + bread + ", " + meat + ", " + cheese + ", " + sauce;
    }

    static class BurgerBuilder {
        private String bread;
        private String meat;
        private String cheese;
        private String sauce;

        public BurgerBuilder setBread(String bread) {
            this.bread = bread;
            return this;
        }

        public BurgerBuilder setMeat(String meat) {
            this.meat = meat;
            return this;
        }

        public BurgerBuilder setCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public BurgerBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}

