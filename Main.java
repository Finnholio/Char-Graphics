class Main {
  public static void main(String[] args) {
    //creater & draw person
    Buffer person = new Buffer(3, 3);
    person.draw('o', 1, 0);
    person.draw('/', 0, 1);
    person.draw('|', 1, 1);
    person.draw('\\', 2, 1);
    person.draw('/', 0, 2);
    person.draw('\\', 2, 2);

    //create main buffer
    Buffer b = new Buffer(10, 10);
    b.draw(person, 0, 0);

    //display
    b.display();
  }
}
