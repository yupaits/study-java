package designpattern.composite;

/**
 * 树叶构件
 * @author ts495
 * @date 2020/12/5
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(String.format("树叶 %s 被访问", name));
    }
}
