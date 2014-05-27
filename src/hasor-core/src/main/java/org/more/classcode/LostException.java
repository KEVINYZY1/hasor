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
package org.more.classcode;
/**
 * 丢失异常。
 * @version 2009-4-29
 * @author 赵永春 (zyc@hasor.net)
 */
public class LostException extends ClassCodeRuntimeException {
    private static final long serialVersionUID = 3664651649094973500L;
    /**丢失异常*/
    public LostException(String string) {
        super(string);
    }
    /**丢失异常*/
    public LostException(Throwable error) {
        super(error);
    }
    /**丢失异常*/
    public LostException(String string, Throwable error) {
        super(string, error);
    }
}