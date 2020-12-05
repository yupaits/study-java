package designpattern.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 树叶构件
 * @author ts495
 * @date 2020/12/5
 */
@Getter
@Setter
@AllArgsConstructor
public class Leaf implements Component {
    private String name;

    @Override
    public void operation() {
        System.out.println(String.format("树叶 %s 被访问", name));
    }
}
