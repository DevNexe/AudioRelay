package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N8 extends ImageView {
    public static String[] A01 = {"", "xAgTXbjVi62PdicRvipr2yH2TBkp", "gkbD2s1xpJQg4uStKBrjHXnqoYLvnFUr", "soe6jIArtiQ", "3Vk7uiWTp4D98Qq5DBFXHdZ3JTbv3qUy", "5FE99nP0vOH07stjGxCxhCer", "JVbWipYt4YB", ""};

    @Nullable
    public ImageView.ScaleType A00;

    public N8(C1075Xy c1075Xy) {
        super(c1075Xy);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int widthSpecSize, int i) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(widthSpecSize);
        if (View.MeasureSpec.getMode(widthSpecSize) == 1073741824) {
            int mode = View.MeasureSpec.getMode(i);
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "LPpzUfvPRnl";
            strArr2[3] = "8xYze5Yy4ig";
            if (mode == 1073741824) {
                int iMin = Math.min(size2, size);
                setMeasuredDimension(iMin, iMin);
            } else if (View.MeasureSpec.getMode(widthSpecSize) == 1073741824) {
                if (size > 0) {
                    size2 = Math.min(size2, size);
                }
                setMeasuredDimension(size2, size2);
            } else if (View.MeasureSpec.getMode(i) == 1073741824) {
                if (size2 > 0) {
                    size = Math.min(size2, size);
                }
                setMeasuredDimension(size, size);
            } else {
                super.onMeasure(widthSpecSize, i);
            }
        } else if (View.MeasureSpec.getMode(widthSpecSize) == 1073741824) {
            if (size > 0) {
                size2 = Math.min(size2, size);
            }
            setMeasuredDimension(size2, size2);
        } else if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (size2 > 0) {
                size = Math.min(size2, size);
            }
            setMeasuredDimension(size, size);
        } else {
            super.onMeasure(widthSpecSize, i);
        }
        ImageView.ScaleType scaleType = this.A00;
        if (scaleType != null) {
            super.setScaleType(scaleType);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
