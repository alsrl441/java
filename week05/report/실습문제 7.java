package practice;

class TV {
    private int size;

    public TV(int size) {
        this.size = size;
    }

    protected int getSize() {
        return size;
    }
}

class ColorTV extends TV {
    private int color;

    public ColorTV(int size, int color) {
        super (size);
        this.color = color;
    }
    
    protected int getColor() {
        return color;
    }

    public void printProperty() {
        System.out.println(getSize() + "인치의 " + color + "컬러 TV");
    }
}

public class IPTVEx {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}
}
