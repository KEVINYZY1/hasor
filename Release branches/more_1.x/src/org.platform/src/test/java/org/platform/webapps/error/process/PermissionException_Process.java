/*
 * Copyright 2008-2009 the original author or authors.
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
package org.platform.webapps.error.process;
import java.io.PrintWriter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.platform.binder.ErrorHook;
import org.platform.context.AppContext;
import org.platform.context.ViewContext;
import org.platform.context.setting.Config;
import org.platform.security.PermissionException;
import org.platform.support.WebError;
/**
 * 
 * @version : 2013-5-2
 * @author ������ (zyc@byshell.org)
 */
@WebError(PermissionException.class)
public class PermissionException_Process implements ErrorHook {
    @Override
    public void init(AppContext appContext, Config initConfig) {}
    @Override
    public void doError(ViewContext viewContext, ServletRequest request, ServletResponse response, Throwable error) throws Throwable {
        PrintWriter printWriter = response.getWriter();
        //
        printWriter.write("\n<br/>");
        printWriter.write("\n<h1>PermissionException Error:");
        printWriter.write(error.getMessage() + "</h1>");
        printWriter.write("\n<br/>");
        error.printStackTrace(printWriter);
    }
    @Override
    public void destroy(AppContext appContext) {}
}