## Create REST controller
```Java
   @RestController
   public class FunRestController{
    // expose "/" that return "Hello World"
    @GetMapping("/"){
        public String sayHello(){
            return "Hello World!";
        }
    }
   }
```
- Create a package
- Inside the package create a java class and insert the above code to listen to '/'  and return `Hello World!`

