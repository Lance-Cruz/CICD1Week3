package ie.atu.week3;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
//NOTE Lombok is causing problems for me
public class Product {
    @NotBlank
    @Size (min = 2, max = 50)
    private String name;
    @NotNull
    @Positive
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
