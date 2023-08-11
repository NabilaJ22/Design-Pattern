package DecoratorPatternDemo;

public interface Shape1 {
   void draw();
}

class Rectangle implements Shape1 {

   @Override
   public void draw() {
      System.out.println("Shape1: Rectangle");
   }
}

class Circle implements Shape1 {

   @Override
   public void draw() {
      System.out.println("Shape1: Circle");
   }
}

abstract class Shape1Decorator implements Shape1 {
   protected Shape1 decoratedShape1;

   public Shape1Decorator(Shape1 decoratedShape1) {
      this.decoratedShape1 = decoratedShape1;
   }

   public void draw() {
      decoratedShape1.draw();
   }
}

class RedShape1Decorator extends Shape1Decorator {

   public RedShape1Decorator(Shape1 decoratedShape1) {
      super(decoratedShape1);
   }

   @Override
   public void draw() {
      decoratedShape1.draw();
      setRedBorder(decoratedShape1);
   }

   private void setRedBorder(Shape1 decoratedShape1) {
      System.out.println("Border Color: Red");
   }
}

class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape1 circle = new Circle();

      Shape1 redCircle = new RedShape1Decorator(new Circle());

      Shape1 redRectangle = new RedShape1Decorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}