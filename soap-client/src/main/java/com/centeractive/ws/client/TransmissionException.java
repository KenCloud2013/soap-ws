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
 * Exception thrown when an transmission error occurs. Returns HTTP error code if returned by the server.
 *
 * @author Tom Bujok
 * @since 1.0.0
 */
public class TransmissionException extends SoapClientException {

    private final String errorResponse;
    private final int errorCode;

    public TransmissionException(String response, int errorCode, Throwable cause) {
        super((response != null && response.length() > 0 ? response +"; " : "")
                + (errorCode > 0 ? "HTTP code = [" + errorCode + "];" : "")
                , cause);
        this.errorResponse = response;
        this.errorCode = errorCode;
    }

    public String getErrorResponse() {
        return errorResponse;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
