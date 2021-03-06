// Copyright (C) 2007-2011 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.enterprise.connector.filenet4.api;

import com.google.enterprise.connector.spi.RepositoryException;
import com.google.enterprise.connector.spi.RepositoryLoginException;

import com.filenet.api.collection.PropertyDefinitionList;
import com.filenet.api.property.PropertyFilter;
import com.filenet.api.util.Id;

/**
 * Interface to set FileNet objectFactory and perform operations with
 * objectFactory
 */
public interface IObjectFactory {

  public IConnection getConnection(String contentEngineUri, String userName,
          String userPassword)
          throws RepositoryException;

  public IObjectStore getObjectStore(String objectStoreName,
          IConnection connection, String userId, String password)
          throws RepositoryException, RepositoryLoginException;

  PropertyDefinitionList getPropertyDefinitions(
      IObjectStore objectStore, Id objectId, PropertyFilter filter)
      throws RepositoryException;

  SearchWrapper getSearch(IObjectStore objectStore);
}
