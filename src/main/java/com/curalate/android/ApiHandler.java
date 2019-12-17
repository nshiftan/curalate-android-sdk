//
// Copyright (c) 2011-2019 by Curalate, Inc.
//

package com.curalate.android;

import com.curalate.android.exceptions.CuralateApiException;
import java.io.IOException;

public interface ApiHandler<T> {
  void onFailure(CuralateApiException e);
  void onIOException(IOException e);
  void onSuccess(T t);
}



