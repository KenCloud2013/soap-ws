/**
 * Copyright (c) 2012 centeractive ag. All Rights Reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.centeractive.ws.client;

/**
 * Copyright (c) centeractive ag, Inc. All Rights Reserved.
 * <p/>
 * User: Tom Bujok (tomasz.bujok@centeractive.com)
 * Date: 22/11/11
 * Time: 7:53 PM
 */
public class SoapClientException extends RuntimeException {

    public SoapClientException(String message) {
        super(message);
    }

    public SoapClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public SoapClientException(Throwable cause) {
        super(cause.getMessage(), cause);
    }

}
