package designpattern.composite;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 树枝构件
 * @author ts495
 * @date 2020/12/5
 */
public class Composite implements Component {
    private List<Component> children = Lists.newArrayList();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component obj : children) {
            obj.operation();
        }
    }
}
