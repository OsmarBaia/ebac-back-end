## Square.java

```
public class Square {
    private final float side;
    
    public Square(float side){
        this.side = side;
    }

    /**
     * Calcula a area do triangulo e retorna o valor    
     * @return float: area
     */
    public float getArea(){
        return side*side;
    }

    /**
     * Retorna o valor do lado    
     * @return float: lado
     */
    public float getSide() {
        return side;
    }
}

```

## Main.java

```
public class Main {
    public static void main(String[] args) {
       Square sq1 =  new Square(2);
       System.out.printf("A area do quadrado é: %.2f", sq1.getArea());
    }
}


```
