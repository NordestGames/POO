public class Triangulo {
    float lado1;
    float lado2;
    float lado3;
    String desc;

    void inicializa(float l1, float l2, float l3, String d){
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
        desc = d;
    }
    
    float perimetro(){
        return lado1 + lado2 + lado3;
    }
}
