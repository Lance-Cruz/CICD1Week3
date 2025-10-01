package ie.atu.week3;

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
    public Product addProduct(@RequestBody Product myProduct){
        mylist.add(myProduct);
        return myProduct;
    }


}
