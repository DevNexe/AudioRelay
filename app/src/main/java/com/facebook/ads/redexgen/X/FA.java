package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FA extends AbstractC1248bv {
    public static String[] A02 = {"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", "3", "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};

    @Nullable
    public C4D A00;

    @Nullable
    public C4D A01;

    private int A00(@NonNull C4T c4t, @NonNull View view, C4D c4d) {
        int iA06;
        int iA0F = c4d.A0F(view) + (c4d.A0D(view) / 2);
        if (c4t.A1X()) {
            iA06 = c4d.A0A() + (c4d.A0B() / 2);
        } else {
            iA06 = c4d.A06() / 2;
        }
        return iA0F - iA06;
    }

    @Nullable
    private View A01(C4T c4t, C4D c4d) {
        int iA06;
        int absClosest = c4t.A0W();
        if (absClosest == 0) {
            return null;
        }
        View child = null;
        if (c4t.A1X()) {
            int iA0A = c4d.A0A();
            int iA0B = c4d.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            iA06 = iA0A + (iA0B / 2);
        } else {
            iA06 = c4d.A06() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < absClosest; i2++) {
            View viewA0t = c4t.A0t(i2);
            int iA0F = c4d.A0F(viewA0t);
            int i3 = c4d.A0D(viewA0t);
            int childCenter = Math.abs((iA0F + (i3 / 2)) - iA06);
            if (childCenter < i) {
                i = childCenter;
                child = viewA0t;
            }
        }
        return child;
    }

    @Nullable
    private View A02(C4T c4t, C4D c4d) {
        int i = c4t.A0W();
        if (i == 0) {
            return null;
        }
        View view = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < i; i3++) {
            View viewA0t = c4t.A0t(i3);
            int iA0F = c4d.A0F(viewA0t);
            if (iA0F < i2) {
                i2 = iA0F;
                int childStart = A02[3].length();
                if (childStart != 1) {
                    throw new RuntimeException();
                }
                A02[3] = "0";
                view = viewA0t;
            }
        }
        return view;
    }

    @NonNull
    private C4D A03(@NonNull C4T c4t) {
        C4D c4d = this.A00;
        if (c4d == null || c4d.A02 != c4t) {
            this.A00 = C4D.A00(c4t);
        }
        return this.A00;
    }

    @NonNull
    private C4D A04(@NonNull C4T c4t) {
        C4D c4d = this.A01;
        if (c4d == null || c4d.A02 != c4t) {
            this.A01 = C4D.A01(c4t);
        }
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.X.AbstractC1248bv
    public final int A0C(C4T c4t, int i, int centerPosition) {
        int iA0p;
        boolean z;
        int iA0Z = c4t.A0Z();
        if (iA0Z == 0) {
            return -1;
        }
        View viewA02 = null;
        if (c4t.A25()) {
            viewA02 = A02(c4t, A04(c4t));
        } else if (c4t.A24()) {
            C4D c4dA03 = A03(c4t);
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo";
            viewA02 = A02(c4t, c4dA03);
        }
        if (viewA02 == null || (iA0p = c4t.A0p(viewA02)) == -1) {
            return -1;
        }
        if (c4t.A24()) {
            z = i > 0;
        } else {
            z = centerPosition > 0;
        }
        boolean z2 = false;
        if (c4t instanceof InterfaceC03464f) {
            PointF pointFA45 = ((InterfaceC03464f) c4t).A45(iA0Z - 1);
            if (A02[3].length() != 1) {
                String[] strArr = A02;
                strArr[6] = "yuw4mNpzW34AqVSRehlxNeo";
                strArr[2] = "wkUUhZpWZ02e";
                if (pointFA45 != null) {
                    z2 = pointFA45.x >= 0.0f || pointFA45.y < 0.0f;
                }
            } else {
                A02[0] = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU";
                if (pointFA45 != null) {
                    z2 = pointFA45.x >= 0.0f || pointFA45.y < 0.0f;
                }
            }
        }
        if (z2) {
            return z ? iA0p - 1 : iA0p;
        }
        return z ? iA0p + 1 : iA0p;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1248bv
    @Nullable
    public final View A0D(C4T c4t) {
        if (c4t.A25()) {
            return A01(c4t, A04(c4t));
        }
        if (c4t.A24()) {
            return A01(c4t, A03(c4t));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1248bv
    public final C1262cA A0E(C4T c4t) {
        if (!(c4t instanceof InterfaceC03464f)) {
            return null;
        }
        return new FB(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1248bv
    @Nullable
    public final int[] A0H(@NonNull C4T c4t, @NonNull View view) {
        int[] iArr = new int[2];
        if (c4t.A24()) {
            iArr[0] = A00(c4t, view, A03(c4t));
        } else {
            iArr[0] = 0;
        }
        boolean zA25 = c4t.A25();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (zA25) {
            iArr[1] = A00(c4t, view, A04(c4t));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
