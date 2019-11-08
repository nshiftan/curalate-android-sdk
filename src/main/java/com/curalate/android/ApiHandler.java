//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android;

public interface ApiHandler<T> {
  void onFailure(Exception e);
  void onSuccess(T t);
}



