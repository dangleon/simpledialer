/*
 * Copyright (C) 2012 The Android Open Source Project
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
 */
package com.mobileglobe.android.simpledialer.common.list;

import android.content.Context;
import android.util.AttributeSet;

import com.mobileglobe.android.customdialer.common.util.ViewUtil;

/**
 * A {@link com.mobileglobe.android.customdialer.common.list.ContactTileView} that is used for most frequently contacted in the People app
 */
public class ContactTileFrequentView extends ContactTileView {
    public ContactTileFrequentView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected boolean isDarkTheme() {
        return false;
    }

    @Override
    protected int getApproximateImageSize() {
        return ViewUtil.getConstantPreLayoutWidth(getPhotoView());
    }
}
