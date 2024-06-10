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
