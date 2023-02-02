package section2.node5;

import java.util.Vector;

public class ObjectPool {
    private int step = 10;                      //当对象不够用的时候，每次扩容的数量
    private int minCount;
    private int maxCount;
    private Vector<IPooledObject> returns;     //保存未借出的对象
    private Vector<IPooledObject> borrows;     //保存已借出的对象

    //初始化对象池
    public ObjectPool(int minCount, int maxCount) {
        borrows = new Vector<>();
        returns = new Vector<>();

        this.minCount = minCount;
        this.maxCount = maxCount;

        refresh(this.minCount);
    }

    //取出对象
    public synchronized IPooledObject borrowObject() {
        IPooledObject next;
        if (borrows.size() == maxCount) {
            return null;
        }
        if (returns.size() <= 0) {
            //计算出剩余可创建的对象数
            int count = (maxCount - minCount);
            //剩余可创建的数量大于单次固定创建的对象数
            //则再初始化一批固定数量的对象
            refresh(Math.min(count, step));
        }
        next = returns.get(0);
        returns.remove(next);
        borrows.add(next);
        return next;
    }

    //返回对象
    public void returnObject(IPooledObject pooledObject) {
        returns.add(pooledObject);
        borrows.remove(pooledObject);
    }

    //为对象池写入或扩容复数对象
    private void refresh(int count) {
        for (int i = 0; i < count; i++) {
            returns.add(new ConcretePoolObject());
        }
    }
}
