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
package net.hasor.dataql.runtime.operator;
import net.hasor.dataql.InvokerProcessException;

import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * 一元运算。number类型的只处理：负号
 * @author 赵永春(zyc@hasor.net)
 * @version : 2017-03-23
 */
public class NumberUnaryOP extends UnaryOperatorProcess {
    @Override
    public Object doUnaryProcess(int opcode, String operator, Object object) throws InvokerProcessException {
        if ("-".equals(operator) && object instanceof Number) {
            Number number = (Number) object;
            // .整数
            if (OperatorUtils.isByteNumber(number)) {
                return -(Byte) number;
            }
            if (OperatorUtils.isShortNumber(number)) {
                return -(Short) number;
            }
            if (OperatorUtils.isIntegerNumber(number)) {
                return -(Integer) number;
            }
            if (OperatorUtils.isLongNumber(number)) {
                return -(Long) number;
            }
            if (number instanceof BigInteger) {
                return ((BigInteger) number).negate();
            }
            // .浮点数
            if (OperatorUtils.isFloatNumber(number)) {
                return -(Float) number;
            }
            if (OperatorUtils.isDoubleNumber(number)) {
                return -(Double) number;
            }
            if (number instanceof BigDecimal) {
                return ((BigDecimal) number).negate();
            }
            //
        }
        String dataType = object == null ? "null" : object.getClass().getName();
        throw new InvokerProcessException(opcode, dataType + " , Cannot be used as '" + operator + "'.");
    }
}