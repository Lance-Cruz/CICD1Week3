package ie.atu.week3;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping
@RestController
public class ProductController {
    List<Product> mylist = new ArrayList<>();

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/getProducts")
    public List<Product> getProduct(){
        return mylist;
    }

    @PostMapping("/addProducts")
    public Product addProduct(@Valid @RequestBody Product myProduct){
        mylist.add(myProduct);
        return myProduct;
    }

    @PostMapping("/addBulkProducts")
    public List<Product> addBulkProducts(@Valid @RequestBody List<Product> mylist){
        return mylist;
    }

}
