package cn.qxk.trend;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        // 使用FutureTask来包装Callable对象
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)() -> {
            //具体方法
            return 1;//返回值
        });
        // 实质还是以Callable对象来创建、并启动线程
        new Thread(task , "有返回值的线程").start();
        try{// 获取线程返回值
            System.out.println("线程的返回值：" + task.get());
        }catch (Exception ex){ex.printStackTrace();}
    }


}
