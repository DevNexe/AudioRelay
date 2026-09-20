package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1227ba extends C3M {
    public static String[] A01 = {"OZnJYNnF6iNpWafuL0M1gR4fftLtNKLH", "jp3I09eVvza8VUO8I2V9bgD0uqoo2eoT", "o0dN6TNbDPM1OFHwgByg4fes3ij5f0X", "koNydS70AznyGH22QswPXmmCOWqgW7Lp", "FfQJA5dgq067zFURnAgi95yx0TDwU15M", "ldbJEvhnHaVxGyPD7qN3mcBmJCgMtAqs", "ixVhzklDdFphFwHpdcaKVfByjOKIZSaQ", "Bo7wQ6HJBqNsqngGB"};
    public int A00;

    public C1227ba(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0049 A[PHI: r0
  0x0049: PHI (r0v15 int) = (r0v14 int), (r0v16 int) binds: [B:16:0x0058, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.facebook.ads.redexgen.X.C3M, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int h = this.A00;
        int i3 = 0;
        while (true) {
            int childCount = getChildCount();
            String[] strArr = A01;
            if (strArr[4].charAt(3) != strArr[0].charAt(3)) {
                throw new RuntimeException();
            }
            A01[2] = "oQM5as2Hx349sp";
            if (i3 < childCount) {
                View childAt = getChildAt(i3);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                if (A01[3].charAt(2) != 'N') {
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > h) {
                        h = measuredHeight;
                    }
                } else {
                    A01[7] = "8uJesuWryF1bocGxs";
                    measuredHeight = childAt.getMeasuredHeight();
                    if (measuredHeight > h) {
                        h = measuredHeight;
                    }
                }
                i3++;
            } else {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(h, 1073741824));
                return;
            }
        }
    }
}
