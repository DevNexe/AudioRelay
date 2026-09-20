package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0980Ue implements InterfaceC0715Jt {
    public static byte[] A04;
    public static String[] A05 = {"Y66c6k3Hy3UvBBfpHck", "fJ4NdAtGEgbYsoLarolV0m2U2ouke5wB", "RcyYmVgVLeSkKDa12w3", "KskJyNeVQ7IEAjxWCckPmucmu9amULkO", "1ed8Y", "R", "mHN6PRZU6o6WB3AjYfdaJfhjKiNadrGW", "OPv53LJXnFYa9uQB3GUlIx9f3blXJ2fU"};
    public static final String A06;

    @Nullable
    public ViewOnAttachStateChangeListenerC0981Uf A00;

    @Nullable
    public C1395eU<JX, C0698Jc> A01;
    public final C1074Xx A02;
    public final C1389eO A03 = C1389eO.A00();

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A05[1].charAt(19) != 'V') {
                throw new RuntimeException();
            }
            A05[1] = "obfng8wQuS9GtxnUf86VO2yIawxGqzEf";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 105);
            i4++;
        }
    }

    public static void A02() {
        A04 = new byte[]{-29, -9, -12, -81, -4, -12, -13, -8, -16, -81, -14, 1, -12, -16, 3, -8, 5, -12, -81, 5, -8, -12, 6, -81, -8, 2, -81, -3, 4, -5, -5, -67, -57, -32, -28, -41, -39, -37, -27, -26, -41, -28, -37, -32, -39, -110, -45, -110, -32, -25, -34, -34, -110, -43, -28, -41, -45, -26, -37, -24, -41, -110, -24, -37, -41, -23, -109, 6, 25, 21, 39, 32, 31, 25, 30, 36, -12, 17, 36, 17, -48, 25, 35, -48, 30, 37, 28, 28, -47, 4, -10, -12, 0, -1, -11, -16, -12, -7, -14, -1, -1, -10, -3};
    }

    static {
        A02();
        A06 = C0980Ue.class.getSimpleName();
    }

    public C0980Ue(C1074Xx c1074Xx) {
        this.A02 = c1074Xx;
    }

    private void A01() {
        this.A02.A06().A8y(A00(89, 14, 40), 3600, new AnonymousClass90(A00(67, 22, 71)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0715Jt
    public final void AAT() {
        C1395eU<JX, C0698Jc> c1395eU = this.A01;
        if (c1395eU != null) {
            c1395eU.A02.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0715Jt
    public final void ACr() {
        C1395eU<JX, C0698Jc> c1395eU = this.A01;
        if (c1395eU != null) {
            c1395eU.A02.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0715Jt
    public final void AFF(@Nullable View view) {
        if (this.A01 == null) {
            this.A02.A06().A8y(A00(89, 14, 40), 3600, new AnonymousClass90(A00(32, 35, 9)));
            return;
        }
        this.A03.A02(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0715Jt
    public final void AFP(@Nullable View view, String str, boolean z) {
        AFQ(view, str, z, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0715Jt
    public final void AFQ(@Nullable View view, String str, boolean z, boolean z2) {
        AFR(view, str, z, z2, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0715Jt
    public final void AFR(@Nullable View view, String str, boolean z, boolean z2, boolean z3) {
        if (view != null) {
            this.A00 = new ViewOnAttachStateChangeListenerC0981Uf(view);
            this.A03.A04(this.A00, view);
            if (z2) {
                ViewOnAttachStateChangeListenerC0981Uf viewOnAttachStateChangeListenerC0981Uf = this.A00;
                String[] strArr = A05;
                if (strArr[0].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "hwPcHACCkDldKsuu7a1";
                strArr2[2] = "KVS16a9OP0E0NreE4Vx";
                viewOnAttachStateChangeListenerC0981Uf.A03();
            }
            this.A01 = C1395eU.A00(new JX(this.A02, view, str, z, z3), new C0698Jc(), A06).A05(new C0982Ug(new C0979Ud())).A06();
            this.A03.A03(view, this.A01);
            return;
        }
        this.A02.A06().A8y(A00(89, 14, 40), 3600, new AnonymousClass90(A00(0, 32, 38)));
    }
}
