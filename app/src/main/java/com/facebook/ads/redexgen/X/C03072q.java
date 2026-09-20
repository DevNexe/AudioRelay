package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03072q {
    public static String[] A05 = {"efs8eZdEWHsCfUb6qOzicmMnQm4SneBY", "GPD1kjm6fR3i7blABsL8PkfqVt5tQ0ec", "1ZMAOqgxiysbgCK2QhJ8YR6mzQdOOVTU", "tADzoHnDRwqyF4JfOWpRm", "", "2dCxtsKJi8key4A0", "YZUwpVg0T4azRRaUQd2X9mlkfrI9cQeh", "C6BrW2LKkOXM7XSn"};
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public C03072q(@NonNull View view) {
        this.A04 = view;
    }

    private ViewParent A00(int i) {
        if (i == 0) {
            return this.A01;
        }
        if (i != 1) {
            return null;
        }
        return this.A00;
    }

    private void A01(int i, ViewParent viewParent) {
        if (i == 0) {
            this.A01 = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.A00 = viewParent;
        }
    }

    public final void A02() {
        A03(0);
    }

    public final void A03(int i) {
        ViewParent viewParentA00 = A00(i);
        if (viewParentA00 != null) {
            C3O.A02(viewParentA00, this.A04, i);
            A01(i, null);
        }
    }

    public final void A04(boolean z) {
        if (this.A02) {
            AnonymousClass38.A08(this.A04);
        }
        this.A02 = z;
    }

    public final boolean A05() {
        return A09(0);
    }

    public final boolean A06() {
        return this.A02;
    }

    public final boolean A07(float f, float f2) {
        ViewParent viewParentA00;
        if (!A06() || (viewParentA00 = A00(0)) == null) {
            return false;
        }
        return C3O.A06(viewParentA00, this.A04, f, f2);
    }

    public final boolean A08(float f, float f2, boolean z) {
        ViewParent viewParentA00;
        if (!A06() || (viewParentA00 = A00(0)) == null) {
            return false;
        }
        return C3O.A07(viewParentA00, this.A04, f, f2, z);
    }

    public final boolean A09(int i) {
        return A00(i) != null;
    }

    public final boolean A0A(int i) {
        return A0B(i, 0);
    }

    public final boolean A0B(int i, int i2) {
        if (A09(i2)) {
            return true;
        }
        if (A06()) {
            if (A05[0].charAt(13) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "WHooJguTbRSPJrOooyt3LEnarcCTCzBe";
            strArr[1] = "8Bjeqw0rr3DdKBFvYwfvH0FxnGa8049d";
            View view = this.A04;
            for (ViewParent parent = this.A04.getParent(); parent != null; parent = parent.getParent()) {
                if (C3O.A08(parent, view, this.A04, i, i2)) {
                    A01(i2, parent);
                    C3O.A05(parent, view, this.A04, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean A0C(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        return A0D(i, i2, i3, i4, iArr, 0);
    }

    public final boolean A0D(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5) {
        ViewParent viewParentA00;
        if (!A06() || (viewParentA00 = A00(i5)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            int startY = 0;
            int i6 = 0;
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                startY = iArr[0];
                i6 = iArr[1];
            }
            C3O.A03(viewParentA00, this.A04, i, i2, i3, i4, i5);
            if (iArr != null) {
                this.A04.getLocationInWindow(iArr);
                iArr[0] = iArr[0] - startY;
                iArr[1] = iArr[1] - i6;
            }
            return true;
        }
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return false;
    }

    public final boolean A0E(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return A0F(i, i2, iArr, iArr2, 0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    public final boolean A0F(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2, int i3) {
        ViewParent viewParentA00;
        int[] iArr3 = iArr;
        if (!A06() || (viewParentA00 = A00(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            int startY = 0;
            int i4 = 0;
            if (A05[3].length() != 9) {
                A05[0] = "3VbjZKhXDsexEmt2meqPVZABMNEQkFPW";
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    startY = iArr2[0];
                    i4 = iArr2[1];
                }
                if (iArr3 == null) {
                    int[] iArr4 = this.A03;
                    String[] strArr = A05;
                    if (strArr[5].length() != strArr[7].length()) {
                        A05[4] = "";
                        if (iArr4 == null) {
                            this.A03 = new int[2];
                        }
                    } else {
                        String[] strArr2 = A05;
                        strArr2[5] = "gHL5QaZEq3qu3ZW6";
                        strArr2[7] = "on2hgQBHubksAtN0";
                        if (iArr4 == null) {
                            this.A03 = new int[2];
                        }
                    }
                    iArr3 = this.A03;
                }
                iArr3[0] = 0;
                iArr3[1] = 0;
                C3O.A04(viewParentA00, this.A04, i, i2, iArr3, i3);
                if (iArr2 != null) {
                    this.A04.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - startY;
                    iArr2[1] = iArr2[1] - i4;
                }
                return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
            }
            throw new RuntimeException();
        }
        if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }
}
