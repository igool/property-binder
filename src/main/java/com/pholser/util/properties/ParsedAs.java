/*
 The MIT License

 Copyright (c) 2009-2010 Paul R. Holser, Jr.

 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files (the
 "Software"), to deal in the Software without restriction, including
 without limitation the rights to use, copy, modify, merge, publish,
 distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to
 the following conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.pholser.util.properties;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Mark an interface method with this annotation to indicate that values for the property represented by the
 * method are parsed according to the given patterns. For {@link Date}-returning methods, the patterns are
 * to be specified as described in {@link SimpleDateFormat}. For methods that return primitive numerics or
 * any derivative of {@link Number}, the patterns are to be specified as described in {@link DecimalFormat}.
 * This annotation is ignored for any other type.
 *
 * @author <a href="http://www.pholser.com">Paul Holser</a>
 * @see BoundProperty
 */
@Target(METHOD)
@Retention(RUNTIME)
public @interface ParsedAs {
    String[] value();
}