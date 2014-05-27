/*
 * Copyright 2008-2009 the original 赵永春(zyc@hasor.net).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.test.simple._07_dependency;
import java.io.IOException;
import java.net.URISyntaxException;
import net.hasor.quick.anno.AnnoStandardAppContext;
import org.junit.Test;
/**
 * 环境变量操作演示
 * @version : 2013-8-11
 * @author 赵永春 (zyc@hasor.net)
 */
public class Dependency_Test {
    /*测试强制依赖*/
    @Test
    public void testDep_Forced() throws IOException, URISyntaxException, InterruptedException {
        System.out.println("--->>testDep_Forced<<--");
        AnnoStandardAppContext appContext = new AnnoStandardAppContext("net/test/simple/_07_dependency/forced-config.xml");
        //
        appContext.start();
    }
    /*测试弱依赖*/
    @Test
    public void testDep_Weak() throws IOException, URISyntaxException, InterruptedException {
        System.out.println("--->>testDep_Weak<<--");
        AnnoStandardAppContext appContext = new AnnoStandardAppContext("net/test/simple/_07_dependency/weak-config.xml");
        //
        appContext.start();
    }
    /*测试循环依赖*/
    @Test
    public void testDep_Loop() throws IOException, URISyntaxException, InterruptedException {
        System.out.println("--->>testDep_Loop<<--");
        AnnoStandardAppContext appContext = new AnnoStandardAppContext("net/test/simple/_07_dependency/loop-config.xml");
        //
        appContext.start();
    }
    /*测试依赖反制*/
    @Test
    public void testDep_Reverse() throws IOException, URISyntaxException, InterruptedException {
        System.out.println("--->>testDep_Reverse<<--");
        AnnoStandardAppContext appContext = new AnnoStandardAppContext("net/test/simple/_07_dependency/reverse-config.xml");
        //
        appContext.start();
    }
}