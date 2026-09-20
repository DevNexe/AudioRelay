package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Q3 extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};

    @Nullable
    public C04267m A00;
    public WeakReference<Q2> A01;
    public final InterfaceC0890Qr A02;

    public Q3(C1075Xy c1075Xy, InterfaceC0890Qr interfaceC0890Qr) {
        super(c1075Xy);
        this.A02 = interfaceC0890Qr;
        MS.A0J((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(NQ nq) {
        addView(nq, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C04267m) nq;
    }

    public final void A01(NQ nq) {
        MS.A0J(nq);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A86();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C04267m c04267m = this.A00;
        if (c04267m != null) {
            c04267m.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int mVideoWidth, int mVideoHeight) {
        int width = 0;
        int widthSpecMode = this.A02.getVideoWidth();
        int heightSpecMode = this.A02.getVideoHeight();
        int heightSpecSize = getDefaultSize(widthSpecMode, mVideoWidth);
        int defaultSize = getDefaultSize(heightSpecMode, mVideoHeight);
        if (widthSpecMode > 0 && heightSpecMode > 0) {
            width = 1;
            int mode = View.MeasureSpec.getMode(mVideoWidth);
            String[] strArr = A03;
            String str = strArr[5];
            String str2 = strArr[4];
            int iCharAt = str.charAt(24);
            int height = str2.charAt(24);
            if (iCharAt == height) {
                throw new RuntimeException();
            }
            A03[1] = "CDDJeYuNvDEJubiWpvjZnzRFdpaPIWUA";
            int size = View.MeasureSpec.getSize(mVideoWidth);
            int mode2 = View.MeasureSpec.getMode(mVideoHeight);
            int size2 = View.MeasureSpec.getSize(mVideoHeight);
            if (mode != 1073741824 || mode2 != 1073741824) {
                if (mode == 1073741824) {
                    heightSpecSize = size;
                    defaultSize = (heightSpecSize * heightSpecMode) / widthSpecMode;
                    if (mode2 == Integer.MIN_VALUE && defaultSize > size2) {
                        defaultSize = size2;
                    }
                } else if (mode2 == 1073741824) {
                    defaultSize = size2;
                    heightSpecSize = (defaultSize * widthSpecMode) / heightSpecMode;
                    String[] strArr2 = A03;
                    if (strArr2[7].charAt(1) != strArr2[0].charAt(1)) {
                        String[] strArr3 = A03;
                        strArr3[7] = "6OY3VkVRTo9gTvB5T4EFQBtDC7FaIDf0";
                        strArr3[0] = "lXHmnICBdoyL7DjWTMRRGmshSxtLnfI6";
                        if (mode == Integer.MIN_VALUE) {
                            if (heightSpecSize > size) {
                                heightSpecSize = size;
                            }
                        }
                    } else if (mode == Integer.MIN_VALUE) {
                        if (heightSpecSize > size) {
                            heightSpecSize = size;
                        }
                    }
                } else {
                    heightSpecSize = widthSpecMode;
                    defaultSize = heightSpecMode;
                    if (mode2 == Integer.MIN_VALUE && defaultSize > size2) {
                        defaultSize = size2;
                        heightSpecSize = (defaultSize * widthSpecMode) / heightSpecMode;
                    }
                    if (mode == Integer.MIN_VALUE && heightSpecSize > size) {
                        heightSpecSize = size;
                        defaultSize = (heightSpecSize * heightSpecMode) / widthSpecMode;
                    }
                }
            } else {
                heightSpecSize = size;
                defaultSize = size2;
                if (widthSpecMode * defaultSize < heightSpecSize * heightSpecMode) {
                    heightSpecSize = (defaultSize * widthSpecMode) / heightSpecMode;
                } else {
                    int i = widthSpecMode * defaultSize;
                    int i2 = heightSpecSize * heightSpecMode;
                    if (A03[3].charAt(9) != 'h') {
                        A03[3] = "fC7LLJ1Dm89Wzyv9Y7CU7RKyEHK0kUw2";
                        if (i > i2) {
                            defaultSize = (heightSpecSize * heightSpecMode) / widthSpecMode;
                        }
                    } else if (i > i2) {
                        defaultSize = (heightSpecSize * heightSpecMode) / widthSpecMode;
                    }
                }
            }
        }
        setMeasuredDimension(heightSpecSize, defaultSize);
        if (A03[3].charAt(9) != 'h') {
            A03[1] = "jUvlMuc6V7f2FSIr4bukaecFyxTPY1HC";
            if (width == 0) {
                return;
            }
        } else if (width == 0) {
            return;
        }
        WeakReference<Q2> weakReference = this.A01;
        if (weakReference != null && weakReference.get() != null) {
            this.A01.get().ACk();
        }
    }

    public void setViewImplInflationListener(Q2 q2) {
        this.A01 = new WeakReference<>(q2);
    }
}
