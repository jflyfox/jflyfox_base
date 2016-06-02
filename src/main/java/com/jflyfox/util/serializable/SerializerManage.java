/**
 * Copyright 2015-2025 FLY的狐狸(email:jflyfox@sina.com qq:369191470).
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
 * 
 */

package com.jflyfox.util.serializable;

import java.util.HashMap;
import java.util.Map;

public class SerializerManage {

	private static final Map<String, Serializer> map = new HashMap<String, Serializer>();

	static {
		map.put("java", new JavaSerializer());
	}

	public static void add(String key, Serializer serializer) {
		map.put(key, serializer);
	}

	public static Serializer get(String key) {
		return map.get(key);
	}
}
