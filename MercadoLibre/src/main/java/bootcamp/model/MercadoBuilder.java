package bootcamp.model;

public final class MercadoBuilder {


private final String searchItem;

        MercadoBuilder(String searchItem){
        this.searchItem=searchItem;
        }

public String getSearchItem() {
        return searchItem;
        }

public static final class Builder {


    private String searchItem;

    private Builder() {
    }

    public static Builder mercadoCriteria() {
        return new Builder();
    }

    public Builder setSearchItem(String searchItem) {
        this.searchItem = searchItem;
        return this;
    }


    public MercadoBuilder build() {
        return new MercadoBuilder(searchItem);
    }

}

}
