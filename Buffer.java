public class Buffer{
  static char[][] _buffer;

  public Buffer(int width, int height) {
    _buffer = empty(width, height);
  }
  public Buffer(){
    _buffer = empty(1, 1);
  }

  //public Buffer(string filename) {}

  public static char[][] empty(int width, int height){
    char[][] newBuffer = new char[width][height];
    for (int i = 0; i < newBuffer.length; i++){
      for (int j = 0; j < newBuffer[i].length; j++){
        newBuffer[i][j] = ' ';
      }
    }
    return newBuffer;
  }
  // put a single character in a position
  public static void draw(char ch, int x, int y) {
    _buffer[y][x] = ch;
  }

  public static char[][] getInsides(){
    return _buffer;
  }

  public static void draw(Buffer obj, int x, int y){
    char[][] objBuffer = obj.getInsides();
    for (int i = 0; i < objBuffer.length; i++){
      for (int j = 0; j < objBuffer[i].length; j++){
        draw(objBuffer[i][j], x+i, y+j);
      }
    }
  }

  public static void draw_on(Buffer dest, int x, int y) {
    for (int i = 0; i < _buffer.length; i++){
      for (int j = 0; j < _buffer[i].length; j++){
        dest.draw(_buffer[i][j], x+i, y+j);
      }
    }
  }

  // show the buffer on the screen
  public void display() {
    for (int i = 0; i < _buffer.length; i++){
      for (int j = 0; j < _buffer[i].length; j++){
        System.out.print(_buffer[i][j]);
      }
      System.out.println();
    }
  }
}
/*
public class Sprite extends Buffer{
  public Sprite(int width, int height){
    super(width, height);
  }
}
*/