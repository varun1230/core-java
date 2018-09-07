package com.example.core.java.testjava8.lamdafunctions;

import java.util.List;

public interface AbstractBehaviour<k, v> {
	public void done(k key, List<v> value);
}
