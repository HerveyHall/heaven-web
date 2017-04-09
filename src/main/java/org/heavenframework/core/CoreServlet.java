/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.heavenframework.core;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * This is the core of heaven framework.It provides servlet supports to
 * Implement business logics.<br>
 * 框架的核心。提供实现业务逻辑的Servlet支持.
 * 
 * @author Hervey Hall <mail@herveyhall.cf>
 *
 */
@WebServlet("/")
public class CoreServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3881399200127156112L;

}