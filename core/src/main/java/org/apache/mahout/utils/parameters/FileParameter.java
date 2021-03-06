/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.mahout.utils.parameters;

import org.apache.hadoop.mapred.JobConf;

import java.io.File;

public class FileParameter extends AbstractParameter<File>{

  public FileParameter(String prefix, String name, JobConf jobConf, File defaultValue, String description) {
    super(File.class, prefix, name, jobConf, defaultValue, description);
  }

  @Override
  public void setStringValue(String stringValue) {
    set(new File(stringValue));
  }

  @Override
  public String getStringValue() {
    if (value == null) {
      return null;
    }
    return get().getPath();
  }
}
