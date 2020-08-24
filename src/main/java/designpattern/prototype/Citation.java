package designpattern.prototype;

/**
 * 奖状
 * @author ts495
 * @date 2020/8/3
 */
public class Citation implements Cloneable {

    private String name;
    private String info;
    private String collage;

    public Citation(String name, String info, String collage) {
        this.name = name;
        this.info = info;
        this.collage = collage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
    System.out.println(name + info + collage);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation("张三", "同学：在2020学年第一学期中表现优秀，被评为三好学生。", "yupai学院");
        citation.display();
        Citation citationCopy = (Citation) citation.clone();
        citationCopy.setName("李四");
        citationCopy.display();
    }
}
