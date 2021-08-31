public class Block{
    int width;
    int length;
    int height;

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width*length*height;
    }
    public int getSurfaceArea() {
        return (width*length+length*height+width*height)*2;
    }

    public Block(int array []) {
        width=array[0];
        length=array[1];
        height=array[2];
    }
}