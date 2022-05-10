package design_patterns.design_patterns_other.other.builder.builderDone;

public class LunchOrder {

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private LunchOrder(Builder builder) {
        if (builder.bread == null) {
            this.bread = "Default bread";
        } else {
            this.bread = builder.bread;
        }
        if (builder.condiments == null) {
            this.condiments = "No condiments";
        } else {
            this.condiments = builder.condiments;
        }
        if (builder.dressing == null) {
            this.dressing = "No dressing";
        } else {
            this.dressing = builder.dressing;
        }
        if (builder.meat == null) {
            this.meat = "No meat";
        } else {
            this.meat = builder.meat;
        }
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }


    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {

        }

        public static Builder newBuilder() {
            return new Builder();
        }


        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder withBread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder withCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder withDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder withMeat(String meat) {
            this.meat = meat;
            return this;
        }
    }

}
