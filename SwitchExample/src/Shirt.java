public class Shirt {
    private String size;
    public Shirt(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getStrSize() {

        return switch (size) {
            case "XS" -> "Extra Small";
            case "S" -> "Small";
            case "M" -> "Medium";
            case "L" -> "Large";
            case "XL" -> "Extra Large";
            case "XXL" -> "Double Extra Large";
            default -> "No Size";
        };
    }
}