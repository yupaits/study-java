/*
 * Copyright (c) 2020, S.F. Express Inc. All rights reserved.
 */
package concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Callable示例
 * @author 01401957
 * @date 2020/12/11
 */
public class CallableSample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startTime = System.currentTimeMillis();
        int taskSize = 5;
        // 创建一个线程池
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        // 创建多个有返回值的任务
        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < taskSize; i++) {
            Callable<String> callable = new MyCallable(i);
            // 执行任务并获取Future对象
            Future<String> future = pool.submit(callable);
            list.add(future);
        }
        // 关闭线程池
        pool.shutdown();
        for (Future<String> future : list) {
            // 从Future对象获取任务的返回值
            System.out.println(future.get());
        }
        System.out.println("程序总的运行时间：" + (System.currentTimeMillis() - startTime) + "ms");
    }

    static class MyCallable implements Callable<String> {
        private final int taskNum;

        public MyCallable(int taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public String call() throws Exception {
            long startTime = System.currentTimeMillis();
            Thread.sleep(1000);
            return "任务[" + taskNum + "]耗时：" + (System.currentTimeMillis() - startTime) + "ms";
        }
    }
}
