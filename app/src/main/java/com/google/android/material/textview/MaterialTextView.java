package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.Th;
import defpackage.g14c;
import defpackage.qa2;
import defpackage.w92;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialTextView extends g14c {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(qa2.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        TypedValue typedValueA = w92.a(context2, com.azefsw.audioconnect.R.attr.textAppearanceLineHeightEnabled);
        if ((typedValueA != null && typedValueA.type == 18 && typedValueA.data == 0) ? false : true) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = Th.N;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int iE = e(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iE != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                d(resourceId, theme);
            }
        }
    }

    public static int e(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    public final void d(int i, Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, Th.M);
        int iE = e(getContext(), typedArrayObtainStyledAttributes, 1, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (iE >= 0) {
            setLineHeight(iE);
        }
    }

    @Override // defpackage.g14c, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        TypedValue typedValueA = w92.a(context, com.azefsw.audioconnect.R.attr.textAppearanceLineHeightEnabled);
        if ((typedValueA != null && typedValueA.type == 18 && typedValueA.data == 0) ? false : true) {
            d(i, context.getTheme());
        }
    }
}
