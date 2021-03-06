// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.enterprise.connector.filenet4.api;

import com.filenet.api.core.Document;
import com.filenet.api.util.Id;

public class MockVersionSeries implements IVersionSeries {
  private final Document object;

  public MockVersionSeries(Document object) {
    this.object = object;
  }

  @Override
  public Id get_Id() {
    return object.get_Id();
  }

  @Override
  public IDocument get_ReleasedVersion() {
    return new MockDocument(object);
  }
}
