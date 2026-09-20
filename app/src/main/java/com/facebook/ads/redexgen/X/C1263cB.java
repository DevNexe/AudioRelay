package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1263cB extends C4T implements InterfaceC03464f {
    public static byte[] A0F;
    public static String[] A0G = {"VKH6HNPW", "5SG7ZkmA1SrYT5HpW6e3lHPIEdQjCnoY", "GUFAcNFlkHbDslOxTlAKu2zM5da70L8W", "8EarDdUd0wjX", "ogiAdIZLqFL2ODTGKcli7xbzAuQZVFku", "k0c9canuweazyFazM74f3pFcokchiBr", "yJQv9VjGutzUoxdr6", "vBYUiSK7FkagYmvZS"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public C4D A04;
    public boolean A05;
    public int A06;
    public AnonymousClass48 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass46 A0D;
    public final AnonymousClass47 A0E;

    public static String A0T(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{30, 25, 1, 22, 27, 30, 19, 87, 24, 5, 30, 18, 25, 3, 22, 3, 30, 24, 25, 77};
    }

    static {
        A0V();
    }

    public C1263cB(Context context) {
        this(context, 1, false);
    }

    public C1263cB(Context context, int i, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new AnonymousClass46(this);
        this.A0E = new AnonymousClass47();
        this.A06 = 2;
        A2E(i);
        A0h(z);
        A1V(true);
    }

    private final int A04(int scrolled, C03424b c03424b, C03494i c03494i) {
        if (A0W() == 0 || scrolled == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A2D();
        int i = scrolled > 0 ? 1 : -1;
        int iAbs = Math.abs(scrolled);
        A0Y(i, iAbs, true, c03494i);
        int iA08 = this.A07.A07 + A08(c03424b, this.A07, c03494i, false);
        if (iA08 < 0) {
            return 0;
        }
        int i2 = iAbs > iA08 ? i * iA08 : scrolled;
        this.A04.A0J(-i2);
        this.A07.A04 = i2;
        return i2;
    }

    private int A05(int fixOffset, C03424b c03424b, C03494i c03494i, boolean z) {
        int iA07 = this.A04.A07() - fixOffset;
        if (iA07 > 0) {
            int i = -A04(-iA07, c03424b, c03494i);
            int fixOffset2 = fixOffset + i;
            if (z) {
                int iA08 = this.A04.A07();
                if (A0G[0].length() == 7) {
                    throw new RuntimeException();
                }
                A0G[0] = "DiKLRwr5Jced9h1IWYQQBSe";
                int i2 = iA08 - fixOffset2;
                if (i2 > 0) {
                    this.A04.A0J(i2);
                    return i2 + i;
                }
            }
            return i;
        }
        return 0;
    }

    private int A06(int fixOffset, C03424b c03424b, C03494i c03494i, boolean z) {
        int fixOffset2;
        int iA0A = fixOffset - this.A04.A0A();
        if (iA0A > 0) {
            int i = -A04(iA0A, c03424b, c03494i);
            int fixOffset3 = fixOffset + i;
            if (z && (fixOffset2 = fixOffset3 - this.A04.A0A()) > 0) {
                this.A04.A0J(-fixOffset2);
                return i - fixOffset2;
            }
            return i;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0033 A[EDGE_INSN: B:47:0x0033->B:16:0x0033 BREAK  A[LOOP:0: B:9:0x001d->B:48:0x001d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x001d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x001d A[SYNTHETIC] */
    private final int A08(C03424b c03424b, AnonymousClass48 anonymousClass48, C03494i c03494i, boolean z) {
        boolean z2;
        int i = anonymousClass48.A00;
        if (anonymousClass48.A07 != Integer.MIN_VALUE) {
            if (anonymousClass48.A00 < 0) {
                anonymousClass48.A07 += anonymousClass48.A00;
            }
            A0e(c03424b, anonymousClass48);
        }
        int i2 = anonymousClass48.A00 + anonymousClass48.A02;
        AnonymousClass47 anonymousClass47 = this.A0E;
        while (true) {
            if ((!anonymousClass48.A09 && i2 <= 0) || !anonymousClass48.A05(c03494i)) {
                break;
            }
            anonymousClass47.A00();
            A2H(c03424b, c03494i, anonymousClass48, anonymousClass47);
            if (anonymousClass47.A01) {
                break;
            }
            anonymousClass48.A06 += anonymousClass47.A00 * anonymousClass48.A05;
            if (!anonymousClass47.A03 || this.A07.A08 != null || !c03494i.A07()) {
                anonymousClass48.A00 -= anonymousClass47.A00;
                i2 -= anonymousClass47.A00;
            }
            if (anonymousClass48.A07 != Integer.MIN_VALUE) {
                anonymousClass48.A07 += anonymousClass47.A00;
                if (anonymousClass48.A00 < 0) {
                    int i3 = anonymousClass48.A07;
                    int i4 = anonymousClass48.A00;
                    if (A0G[0].length() != 7) {
                        A0G[5] = "4Yaap7YPoeEmBfNVznjneaOXF1T3Chf";
                        anonymousClass48.A07 = i3 + i4;
                    }
                }
                A0e(c03424b, anonymousClass48);
                if (z) {
                    z2 = anonymousClass47.A02;
                    if (A0G[0].length() != 7) {
                        A0G[1] = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov";
                        if (z2) {
                            break;
                        }
                    }
                }
            } else if (z) {
                z2 = anonymousClass47.A02;
                if (A0G[0].length() != 7) {
                    A0G[1] = "BoRZmQ3r1kYFEVrzuprqJgVQBsgHE2ov";
                    if (z2) {
                        break;
                        break;
                    }
                }
            }
            throw new RuntimeException();
        }
        return i - anonymousClass48.A00;
    }

    private int A09(C03494i c03494i) {
        if (A0W() != 0) {
            A2D();
            return C03534m.A00(c03494i, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        }
        if (A0G[5].length() != 31) {
            throw new RuntimeException();
        }
        A0G[5] = "JS1EmTokFkofHdCiZDqGUekHou375gK";
        return 0;
    }

    private int A0A(C03494i c03494i) {
        if (A0W() == 0) {
            return 0;
        }
        A2D();
        return C03534m.A02(c03494i, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
    }

    private int A0B(C03494i c03494i) {
        if (A0W() != 0) {
            A2D();
            return C03534m.A01(c03494i, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[2] = "SnDsIEYZVkVP365fclIsQ2wSHS1GnuqA";
        strArr2[4] = "cd1sjhoNq3y2dBxKlbos6To2J3BafTHs";
        return 0;
    }

    private final int A0C(C03494i c03494i) {
        if (c03494i.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0W());
    }

    private View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final View A0H(int preferredBoundsFlag, int acceptableBoundsFlag) {
        byte b;
        int i;
        int i2;
        A2D();
        if (acceptableBoundsFlag > preferredBoundsFlag) {
            b = 1;
        } else {
            b = acceptableBoundsFlag < preferredBoundsFlag ? (byte) -1 : (byte) 0;
        }
        if (b == 0) {
            View viewA0t = A0t(preferredBoundsFlag);
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0G[5] = "tEP4S10y6AtQbDA9ff3H424KLTnX0k7";
            return viewA0t;
        }
        if (this.A04.A0F(A0t(preferredBoundsFlag)) < this.A04.A0A()) {
            i = 16644;
            i2 = 16388;
        } else {
            i = 4161;
            i2 = 4097;
        }
        if (this.A00 == 0) {
            return super.A04.A00(preferredBoundsFlag, acceptableBoundsFlag, i, i2);
        }
        return super.A05.A00(preferredBoundsFlag, acceptableBoundsFlag, i, i2);
    }

    private final View A0J(int acceptableBoundsFlag, int i, boolean z, boolean z2) {
        int i2;
        A2D();
        int i3 = 0;
        if (z) {
            i2 = 24579;
        } else {
            i2 = 320;
        }
        if (z2) {
            i3 = 320;
        }
        int i4 = this.A00;
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "NnwW0AnvRBQDKBAe7Vp9NN4SqY6y39Zg";
        strArr[4] = "snWQRfIRwdJNOSPMdDWVpUmegwlUrdsl";
        if (i4 == 0) {
            return super.A04.A00(acceptableBoundsFlag, i, i2, i3);
        }
        return super.A05.A00(acceptableBoundsFlag, i, i2, i3);
    }

    private View A0K(C03424b c03424b, C03494i c03494i) {
        return A2C(c03424b, c03494i, 0, A0W(), c03494i.A03());
    }

    private View A0L(C03424b c03424b, C03494i c03494i) {
        return A2C(c03424b, c03494i, A0W() - 1, -1, c03494i.A03());
    }

    private View A0M(C03424b c03424b, C03494i c03494i) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C03424b c03424b, C03494i c03494i) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C03424b c03424b, C03494i c03494i) {
        return this.A05 ? A0K(c03424b, c03494i) : A0L(c03424b, c03494i);
    }

    private View A0P(C03424b c03424b, C03494i c03494i) {
        return this.A05 ? A0L(c03424b, c03494i) : A0K(c03424b, c03494i);
    }

    private View A0Q(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(0, A0W(), z, z2);
        }
        return A0J(A0W() - 1, -1, z, z2);
    }

    private View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z, z2);
        }
        return A0J(0, A0W(), z, z2);
    }

    private final AnonymousClass48 A0S() {
        return new AnonymousClass48();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2J()) {
            this.A05 = this.A0A;
            return;
        }
        boolean z = !this.A0A;
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0G;
        strArr2[6] = "rvopS3hSB7itRsuyG";
        strArr2[7] = "9RTUShXs4ZXrU4n03";
        this.A05 = z;
    }

    private void A0W(int i, int i2) {
        this.A07.A00 = this.A04.A07() - i2;
        this.A07.A03 = this.A05 ? -1 : 1;
        AnonymousClass48 anonymousClass48 = this.A07;
        anonymousClass48.A01 = i;
        anonymousClass48.A05 = 1;
        anonymousClass48.A06 = i2;
        anonymousClass48.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i, int i2) {
        this.A07.A00 = i2 - this.A04.A0A();
        AnonymousClass48 anonymousClass48 = this.A07;
        anonymousClass48.A01 = i;
        anonymousClass48.A03 = this.A05 ? 1 : -1;
        AnonymousClass48 anonymousClass49 = this.A07;
        anonymousClass49.A05 = -1;
        anonymousClass49.A06 = i2;
        anonymousClass49.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i, int i2, boolean z, C03494i c03494i) {
        int iA0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(c03494i);
        AnonymousClass48 anonymousClass48 = this.A07;
        anonymousClass48.A05 = i;
        int i3 = -1;
        if (i == 1) {
            anonymousClass48.A02 += this.A04.A08();
            View viewA0F = A0F();
            AnonymousClass48 anonymousClass49 = this.A07;
            if (!this.A05) {
                i3 = 1;
            }
            anonymousClass49.A03 = i3;
            this.A07.A01 = A0p(viewA0F) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(viewA0F);
            iA0A = this.A04.A0C(viewA0F) - this.A04.A07();
        } else {
            View viewA0G = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(viewA0G) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(viewA0G);
            iA0A = (-this.A04.A0F(viewA0G)) + this.A04.A0A();
        }
        AnonymousClass48 anonymousClass410 = this.A07;
        anonymousClass410.A00 = i2;
        if (z) {
            anonymousClass410.A00 -= iA0A;
        }
        this.A07.A07 = iA0A;
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        A0G[1] = "rmKnvh8FAT7bzRdUkYGsCRYa1fX1DRoz";
    }

    private void A0Z(AnonymousClass46 anonymousClass46) {
        A0W(anonymousClass46.A01, anonymousClass46.A00);
    }

    private void A0a(AnonymousClass46 anonymousClass46) {
        A0X(anonymousClass46.A01, anonymousClass46.A00);
    }

    private void A0b(C03424b c03424b, int i) {
        int iA0W = A0W();
        if (i < 0) {
            return;
        }
        int iA06 = this.A04.A06() - i;
        if (this.A05) {
            for (int i2 = 0; i2 < iA0W; i2++) {
                View viewA0t = A0t(i2);
                if (this.A04.A0F(viewA0t) < iA06 || this.A04.A0H(viewA0t) < iA06) {
                    A0d(c03424b, 0, i2);
                    return;
                }
            }
            return;
        }
        for (int i3 = iA0W - 1; i3 >= 0; i3--) {
            View viewA0t2 = A0t(i3);
            if (this.A04.A0F(viewA0t2) < iA06 || this.A04.A0H(viewA0t2) < iA06) {
                A0d(c03424b, iA0W - 1, i3);
                return;
            }
        }
    }

    private void A0c(C03424b c03424b, int i) {
        if (i < 0) {
            return;
        }
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[0] = "66";
        int iA0W = A0W();
        if (this.A05) {
            for (int i2 = iA0W - 1; i2 >= 0; i2--) {
                View viewA0t = A0t(i2);
                if (this.A04.A0C(viewA0t) <= i) {
                    C4D c4d = this.A04;
                    String[] strArr2 = A0G;
                    if (strArr2[6].length() != strArr2[7].length()) {
                        if (c4d.A0G(viewA0t) <= i) {
                        }
                    } else {
                        A0G[3] = "uDZbJl3GZvnd0";
                        if (c4d.A0G(viewA0t) <= i) {
                        }
                    }
                }
                A0d(c03424b, iA0W - 1, i2);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < iA0W; i3++) {
            View viewA0t2 = A0t(i3);
            int iA0C = this.A04.A0C(viewA0t2);
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            A0G[1] = "ET87P0AumYMcjI6vylu4qFXoEmTHeXod";
            if (iA0C > i || this.A04.A0G(viewA0t2) > i) {
                A0d(c03424b, 0, i3);
                return;
            }
        }
    }

    private void A0d(C03424b c03424b, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                A14(i3, c03424b);
            }
            return;
        }
        while (i > i2) {
            A14(i, c03424b);
            i--;
        }
    }

    private void A0e(C03424b c03424b, AnonymousClass48 anonymousClass48) {
        if (!anonymousClass48.A0B || anonymousClass48.A09) {
            return;
        }
        int i = anonymousClass48.A05;
        String[] strArr = A0G;
        if (strArr[6].length() == strArr[7].length()) {
            String[] strArr2 = A0G;
            strArr2[2] = "M7iaeQoExhHh03f7x1XNzmreS2Lq1zJK";
            strArr2[4] = "3weclwG7n9RXAySrMV3Jn51LrKgutG4n";
            if (i == -1) {
                int i2 = anonymousClass48.A07;
                if (A0G[1].charAt(30) == 'o') {
                    A0G[3] = "CiNTyTfZO3PW6tP";
                    A0b(c03424b, i2);
                    return;
                }
            } else {
                A0c(c03424b, anonymousClass48.A07);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0f(C03424b c03424b, C03494i c03494i, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!c03494i.A08() || A0W() == 0 || c03494i.A07() || !A26()) {
            return;
        }
        int direction = 0;
        int i = 0;
        List<AbstractC03524l> listA0J = c03424b.A0J();
        int size = listA0J.size();
        int iA0p = A0p(A0t(0));
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC03524l abstractC03524l = listA0J.get(i2);
            if (!abstractC03524l.A0c()) {
                int position = abstractC03524l.A0I();
                byte b = 1;
                if ((position < iA0p) != this.A05) {
                    b = -1;
                }
                if (b == -1) {
                    int position2 = this.A04.A0D(abstractC03524l.A0H);
                    direction += position2;
                } else {
                    int position3 = this.A04.A0D(abstractC03524l.A0H);
                    i += position3;
                }
            }
        }
        this.A07.A08 = listA0J;
        if (direction > 0) {
            View anchor = A0G();
            A0X(A0p(anchor), scrapExtraEnd);
            AnonymousClass48 anonymousClass48 = this.A07;
            anonymousClass48.A02 = direction;
            anonymousClass48.A00 = 0;
            anonymousClass48.A04();
            A08(c03424b, this.A07, c03494i, false);
        }
        if (i > 0) {
            View anchor2 = A0F();
            A0W(A0p(anchor2), scrapExtraEnd2);
            AnonymousClass48 anonymousClass49 = this.A07;
            anonymousClass49.A02 = i;
            anonymousClass49.A00 = 0;
            anonymousClass49.A04();
            A08(c03424b, this.A07, c03494i, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C03424b c03424b, C03494i c03494i, AnonymousClass46 anonymousClass46) {
        if (A0k(c03494i, anonymousClass46)) {
            return;
        }
        boolean zA0j = A0j(c03424b, c03494i, anonymousClass46);
        String[] strArr = A0G;
        if (strArr[2].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[3] = "XDJ2jDWhUW9a7iN";
        if (zA0j) {
            return;
        }
        anonymousClass46.A02();
        anonymousClass46.A01 = this.A0C ? c03494i.A03() - 1 : 0;
    }

    private final void A0h(boolean z) {
        A22(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C03424b c03424b, C03494i c03494i, AnonymousClass46 anonymousClass46) {
        View viewA0P;
        int iA0A;
        if (A0W() == 0) {
            return false;
        }
        View viewA0s = A0s();
        if (viewA0s != null && anonymousClass46.A06(viewA0s, c03494i)) {
            anonymousClass46.A05(viewA0s);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (anonymousClass46.A02) {
            viewA0P = A0O(c03424b, c03494i);
        } else {
            viewA0P = A0P(c03424b, c03494i);
        }
        if (viewA0P == null) {
            return false;
        }
        anonymousClass46.A04(viewA0P);
        if (!c03494i.A07() && A26()) {
            if (this.A04.A0F(viewA0P) >= this.A04.A07() || this.A04.A0C(viewA0P) < this.A04.A0A()) {
                if (anonymousClass46.A02) {
                    iA0A = this.A04.A07();
                } else {
                    iA0A = this.A04.A0A();
                }
                anonymousClass46.A00 = iA0A;
            }
        }
        return true;
    }

    private boolean A0k(C03494i c03494i, AnonymousClass46 anonymousClass46) {
        int i;
        int iA0F;
        if (c03494i.A07() || (i = this.A01) == -1) {
            return false;
        }
        if (i < 0 || i >= c03494i.A03()) {
            this.A01 = -1;
            this.A02 = Integer.MIN_VALUE;
            return false;
        }
        anonymousClass46.A01 = this.A01;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState == null || !linearLayoutManager$SavedState.A01()) {
            if (this.A02 == Integer.MIN_VALUE) {
                View viewA1q = A1q(this.A01);
                if (viewA1q != null) {
                    int iA0D = this.A04.A0D(viewA1q);
                    int childSize = this.A04.A0B();
                    if (iA0D > childSize) {
                        anonymousClass46.A02();
                        return true;
                    }
                    int iA0F2 = this.A04.A0F(viewA1q);
                    int childSize2 = this.A04.A0A();
                    if (iA0F2 - childSize2 < 0) {
                        int childSize3 = this.A04.A0A();
                        anonymousClass46.A00 = childSize3;
                        anonymousClass46.A02 = false;
                        return true;
                    }
                    int iA07 = this.A04.A07();
                    int childSize4 = this.A04.A0C(viewA1q);
                    if (iA07 - childSize4 < 0) {
                        int childSize5 = this.A04.A07();
                        anonymousClass46.A00 = childSize5;
                        anonymousClass46.A02 = true;
                        return true;
                    }
                    if (anonymousClass46.A02) {
                        int iA0C = this.A04.A0C(viewA1q);
                        int childSize6 = this.A04.A05();
                        iA0F = iA0C + childSize6;
                    } else {
                        C4D c4d = this.A04;
                        String[] strArr = A0G;
                        if (strArr[6].length() == strArr[7].length()) {
                            String[] strArr2 = A0G;
                            strArr2[2] = "9T9n4DYektAgKE77gOe81bMFJSkTZYq2";
                            strArr2[4] = "NdWGpVKxzfIQyf7YZEk7yb7IRTmAWJab";
                            iA0F = c4d.A0F(viewA1q);
                        }
                        throw new RuntimeException();
                    }
                    anonymousClass46.A00 = iA0F;
                    return true;
                }
                int childSize7 = A0W();
                if (childSize7 > 0) {
                    int iA0p = A0p(A0t(0));
                    int i2 = this.A01;
                    String[] strArr3 = A0G;
                    String str = strArr3[2];
                    String str2 = strArr3[4];
                    int iCharAt = str.charAt(4);
                    int pos = str2.charAt(4);
                    if (iCharAt != pos) {
                        A0G[3] = "ZbIhQvVoqDIGDPkO0OlvW9zioDplzu";
                        anonymousClass46.A02 = (i2 < iA0p) == this.A05;
                    }
                    throw new RuntimeException();
                }
                anonymousClass46.A02();
                return true;
            }
            boolean z = this.A05;
            anonymousClass46.A02 = z;
            if (z) {
                anonymousClass46.A00 = this.A04.A07() - this.A02;
            } else {
                anonymousClass46.A00 = this.A04.A0A() + this.A02;
            }
            return true;
        }
        anonymousClass46.A02 = this.A03.A02;
        if (anonymousClass46.A02) {
            anonymousClass46.A00 = this.A04.A07() - this.A03.A00;
        } else {
            anonymousClass46.A00 = this.A04.A0A() + this.A03.A00;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public int A1h(int i, C03424b c03424b, C03494i c03494i) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i, c03424b, c03494i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public int A1i(int i, C03424b c03424b, C03494i c03494i) {
        if (this.A00 == 0) {
            return 0;
        }
        int iA04 = A04(i, c03424b, c03494i);
        String[] strArr = A0G;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0G[3] = "CDnF1shpb";
        return iA04;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1j(C03494i c03494i) {
        return A09(c03494i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1k(C03494i c03494i) {
        return A0A(c03494i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1l(C03494i c03494i) {
        return A0B(c03494i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1m(C03494i c03494i) {
        return A09(c03494i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1n(C03494i c03494i) {
        return A0A(c03494i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final int A1o(C03494i c03494i) {
        return A0B(c03494i);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final Parcelable A1p() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(linearLayoutManager$SavedState));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = new LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A2D();
            boolean z = this.A08 ^ this.A05;
            linearLayoutManager$SavedState2.A02 = z;
            if (z) {
                View viewA0F = A0F();
                linearLayoutManager$SavedState2.A00 = this.A04.A07() - this.A04.A0C(viewA0F);
                linearLayoutManager$SavedState2.A01 = A0p(viewA0F);
            } else {
                View refChild = A0G();
                linearLayoutManager$SavedState2.A01 = A0p(refChild);
                linearLayoutManager$SavedState2.A00 = this.A04.A0F(refChild) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState2.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState2);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    @Nullable
    public final View A1q(int firstChild) {
        int viewPosition = A0W();
        if (viewPosition == 0) {
            return null;
        }
        int iA0p = firstChild - A0p(A0t(0));
        if (iA0p >= 0 && iA0p < viewPosition) {
            View viewA0t = A0t(iA0p);
            if (A0p(viewA0t) == firstChild) {
                return viewA0t;
            }
        }
        View child = super.A1q(firstChild);
        return child;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public View A1r(View view, int i, C03424b c03424b, C03494i c03494i) {
        int iA2B;
        View viewA0M;
        View viewA0F;
        A0U();
        if (A0W() == 0 || (iA2B = A2B(i)) == Integer.MIN_VALUE) {
            return null;
        }
        A2D();
        A2D();
        A0Y(iA2B, (int) (this.A04.A0B() * 0.33333334f), false, c03494i);
        AnonymousClass48 anonymousClass48 = this.A07;
        anonymousClass48.A07 = Integer.MIN_VALUE;
        anonymousClass48.A0B = false;
        A08(c03424b, anonymousClass48, c03494i, true);
        if (iA2B == -1) {
            viewA0M = A0N(c03424b, c03494i);
        } else {
            viewA0M = A0M(c03424b, c03494i);
        }
        if (iA2B == -1) {
            viewA0F = A0G();
        } else {
            viewA0F = A0F();
        }
        boolean zHasFocusable = viewA0F.hasFocusable();
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[2] = "JGtMOr7ZHjmwUVfbInfaZmEhr0nxGN38";
        strArr[4] = "jCrgpf8bwQbyd1C9u6FfAt5OnK6gBhSa";
        if (zHasFocusable) {
            if (viewA0M == null) {
                return null;
            }
            return viewA0F;
        }
        return viewA0M;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public C4U A1s() {
        return new C4U(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public void A1t(int i) {
        this.A01 = i;
        this.A02 = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A1u(int i, int i2, C03494i c03494i, C4R c4r) {
        if (this.A00 != 0) {
            i = i2;
        }
        if (A0W() == 0 || i == 0) {
            return;
        }
        A2D();
        A0Y(i > 0 ? 1 : -1, Math.abs(i), true, c03494i);
        A2I(c03494i, this.A07, c4r);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A1v(int i, C4R c4r) {
        boolean z;
        int i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            z = this.A03.A02;
            i2 = this.A03.A01;
        } else {
            A0U();
            z = this.A05;
            int i3 = this.A01;
            String[] strArr = A0G;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0G[1] = "j12HxmlCdcFNOCf90EDMVBFIs8rsuaoM";
            if (i3 == -1) {
                i2 = z ? i - 1 : 0;
            } else {
                i2 = this.A01;
            }
        }
        int i4 = z ? -1 : 1;
        for (int i5 = 0; i5 < anchorPos && i2 >= 0 && i2 < i; i5++) {
            c4r.A3G(i2, 0);
            i2 += i4;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A1w(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (A0G[1].charAt(30) == 'o') {
            A0G[1] = "tHEWx5U9TGfOm0s3U2zrO5nR7UMaVIoI";
            if (classLoader == null) {
                return;
            }
            if (A0G[5].length() == 31) {
                A0G[3] = "tm";
                Parcelable parcelableUnwrap = ((WrappedParcelable) parcelable).unwrap(classLoader);
                if (parcelableUnwrap instanceof LinearLayoutManager$SavedState) {
                    this.A03 = (LinearLayoutManager$SavedState) parcelableUnwrap;
                    A0y();
                    return;
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A1x(AccessibilityEvent accessibilityEvent) {
        super.A1x(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A28());
            int iA29 = A29();
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            A0G[3] = "9E5bhv9RVKulu";
            accessibilityEvent.setToIndex(iA29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x020e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0252  */
    @Override // com.facebook.ads.redexgen.X.C4T
    public void A1y(C03424b c03424b, C03494i c03494i) {
        int i;
        int i2;
        int i3;
        View viewA1q;
        int iA0F;
        int iA07;
        String[] strArr;
        int i4 = -1;
        if ((this.A03 != null || this.A01 != -1) && c03494i.A03() == 0) {
            A1I(c03424b);
            return;
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.A01()) {
            this.A01 = this.A03.A01;
        }
        A2D();
        this.A07.A0B = false;
        A0U();
        View viewA0s = A0s();
        if (!this.A0D.A03 || this.A01 != -1 || this.A03 != null) {
            this.A0D.A03();
            AnonymousClass46 anonymousClass46 = this.A0D;
            anonymousClass46.A02 = this.A05 ^ this.A0C;
            A0g(c03424b, c03494i, anonymousClass46);
            AnonymousClass46 anonymousClass47 = this.A0D;
            if (A0G[3].length() == 28) {
                throw new RuntimeException();
            }
            A0G[0] = "pP9DXN24lJAGcvrzmJLzNvbz";
            anonymousClass47.A03 = true;
        } else if (viewA0s != null) {
            int iA0F2 = this.A04.A0F(viewA0s);
            int upcomingOffset = this.A04.A07();
            if (iA0F2 < upcomingOffset) {
                int iA0C = this.A04.A0C(viewA0s);
                int upcomingOffset2 = this.A04.A0A();
                if (iA0C <= upcomingOffset2) {
                    this.A0D.A05(viewA0s);
                }
            } else {
                this.A0D.A05(viewA0s);
            }
        }
        int iA0C2 = A0C(c03494i);
        int extra = this.A07.A04;
        if (extra >= 0) {
            i = 0;
        } else {
            i = iA0C2;
            iA0C2 = 0;
        }
        int extraForStart = this.A04.A0A();
        int i5 = i + extraForStart;
        int extraForStart2 = this.A04.A08();
        int i6 = iA0C2 + extraForStart2;
        if (c03494i.A07()) {
            int i7 = this.A01;
            String[] strArr2 = A0G;
            String str = strArr2[6];
            String str2 = strArr2[7];
            int length = str.length();
            int extraForStart3 = str2.length();
            if (length != extraForStart3) {
                A0G[1] = "HnPzY03honFOjhYT25K5WFAFMhFIclok";
                if (i7 != -1) {
                    if (this.A02 != Integer.MIN_VALUE && (viewA1q = A1q(i7)) != null) {
                        if (this.A05) {
                            iA07 = this.A04.A07() - this.A04.A0C(viewA1q);
                            strArr = A0G;
                            if (strArr[2].charAt(4) != strArr[4].charAt(4)) {
                                A0G[5] = "r3FnQil1r32czyLALUutLd0XCkxYZ4G";
                                int current = this.A02;
                                iA0F = iA07 - current;
                            } else {
                                String[] strArr3 = A0G;
                                strArr3[2] = "sdmiyO1ExKOYMO2wbr6XNnW0K6t4WoaH";
                                strArr3[4] = "ty9AfnxQn4ghzZPCSImQPyrccPhuEwJu";
                                int current2 = this.A02;
                                iA0F = iA07 - current2;
                            }
                        } else {
                            iA0F = this.A02 - (this.A04.A0F(viewA1q) - this.A04.A0A());
                        }
                        if (iA0F > 0) {
                            i5 += iA0F;
                        } else {
                            i6 -= iA0F;
                        }
                    }
                }
            } else {
                String[] strArr4 = A0G;
                strArr4[2] = "wwbDuuRcKwQkcLvBFtW9wuMbOUuGYFzY";
                strArr4[4] = "YequbpJjhMyIl9uyXvP2gytASLo9xZ7L";
                if (i7 != -1) {
                    if (this.A02 != Integer.MIN_VALUE) {
                        if (this.A05) {
                            iA07 = this.A04.A07() - this.A04.A0C(viewA1q);
                            strArr = A0G;
                            if (strArr[2].charAt(4) != strArr[4].charAt(4)) {
                                A0G[5] = "r3FnQil1r32czyLALUutLd0XCkxYZ4G";
                                int current3 = this.A02;
                                iA0F = iA07 - current3;
                            } else {
                                String[] strArr5 = A0G;
                                strArr5[2] = "sdmiyO1ExKOYMO2wbr6XNnW0K6t4WoaH";
                                strArr5[4] = "ty9AfnxQn4ghzZPCSImQPyrccPhuEwJu";
                                int current4 = this.A02;
                                iA0F = iA07 - current4;
                            }
                        } else {
                            iA0F = this.A02 - (this.A04.A0F(viewA1q) - this.A04.A0A());
                        }
                        if (iA0F > 0) {
                            i5 += iA0F;
                        } else {
                            i6 -= iA0F;
                        }
                    }
                }
            }
        }
        if (this.A0D.A02) {
            if (this.A05) {
                i4 = 1;
            }
        } else if (!this.A05) {
            i4 = 1;
        }
        A2G(c03424b, c03494i, this.A0D, i4);
        A1H(c03424b);
        this.A07.A09 = A0i();
        this.A07.A0A = c03494i.A07();
        if (this.A0D.A02) {
            A0a(this.A0D);
            AnonymousClass48 anonymousClass48 = this.A07;
            anonymousClass48.A02 = i5;
            A08(c03424b, anonymousClass48, c03494i, false);
            i3 = this.A07.A06;
            int i8 = this.A07.A01;
            int firstElement = this.A07.A00;
            if (firstElement > 0) {
                int firstElement2 = this.A07.A00;
                i6 += firstElement2;
            }
            A0Z(this.A0D);
            AnonymousClass48 anonymousClass49 = this.A07;
            anonymousClass49.A02 = i6;
            int i9 = anonymousClass49.A01;
            int firstElement3 = this.A07.A03;
            anonymousClass49.A01 = i9 + firstElement3;
            A08(c03424b, this.A07, c03494i, false);
            i2 = this.A07.A06;
            int endOffset = this.A07.A00;
            if (endOffset > 0) {
                int i10 = this.A07.A00;
                A0X(i8, i3);
                AnonymousClass48 anonymousClass410 = this.A07;
                anonymousClass410.A02 = i10;
                A08(c03424b, anonymousClass410, c03494i, false);
                i3 = this.A07.A06;
            }
        } else {
            A0Z(this.A0D);
            AnonymousClass48 anonymousClass411 = this.A07;
            anonymousClass411.A02 = i6;
            A08(c03424b, anonymousClass411, c03494i, false);
            i2 = this.A07.A06;
            int i11 = this.A07.A01;
            int lastElement = this.A07.A00;
            if (lastElement > 0) {
                int lastElement2 = this.A07.A00;
                i5 += lastElement2;
            }
            A0a(this.A0D);
            AnonymousClass48 anonymousClass412 = this.A07;
            anonymousClass412.A02 = i5;
            int i12 = anonymousClass412.A01;
            int lastElement3 = this.A07.A03;
            anonymousClass412.A01 = i12 + lastElement3;
            A08(c03424b, this.A07, c03494i, false);
            i3 = this.A07.A06;
            int startOffset = this.A07.A00;
            if (startOffset > 0) {
                int i13 = this.A07.A00;
                A0W(i11, i2);
                AnonymousClass48 anonymousClass413 = this.A07;
                anonymousClass413.A02 = i13;
                A08(c03424b, anonymousClass413, c03494i, false);
                i2 = this.A07.A06;
            }
        }
        int endOffset2 = A0W();
        if (endOffset2 > 0) {
            if (this.A05 ^ this.A0C) {
                int iA05 = A05(i2, c03424b, c03494i, true);
                int i14 = i3 + iA05;
                int i15 = i2 + iA05;
                int iA06 = A06(i14, c03424b, c03494i, false);
                i3 = i14 + iA06;
                i2 = i15 + iA06;
            } else {
                int iA08 = A06(i3, c03424b, c03494i, true);
                int i16 = i3 + iA08;
                int i17 = i2 + iA08;
                int iA09 = A05(i17, c03424b, c03494i, false);
                i3 = i16 + iA09;
                i2 = i17 + iA09;
            }
        }
        A0f(c03424b, c03494i, i3, i2);
        if (!c03494i.A07()) {
            this.A04.A0I();
        } else {
            this.A0D.A03();
        }
        this.A08 = this.A0C;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public void A1z(C03494i c03494i) {
        super.A1z(c03494i);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A20(F9 f9, C03424b c03424b) {
        super.A20(f9, c03424b);
        if (this.A09) {
            A1I(c03424b);
            c03424b.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public void A21(F9 f9, C03494i c03494i, int i) {
        C1262cA c1262cA = new C1262cA(f9.getContext());
        c1262cA.A0A(i);
        A1L(c1262cA);
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final void A22(String str) {
        if (this.A03 == null) {
            super.A22(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final boolean A23() {
        if (A0Y() != 1073741824 && A0i() != 1073741824) {
            boolean zA1W = A1W();
            if (A0G[0].length() == 7) {
                throw new RuntimeException();
            }
            A0G[0] = "ZYU5Lu8KJdo1W8";
            if (zA1W) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final boolean A24() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public final boolean A25() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.X.C4T
    public boolean A26() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A27() {
        View viewA0J = A0J(0, A0W(), true, false);
        if (viewA0J == null) {
            return -1;
        }
        return A0p(viewA0J);
    }

    public final int A28() {
        View viewA0J = A0J(0, A0W(), false, true);
        if (viewA0J == null) {
            return -1;
        }
        return A0p(viewA0J);
    }

    public final int A29() {
        View viewA0J = A0J(A0W() - 1, -1, false, true);
        if (viewA0J == null) {
            return -1;
        }
        return A0p(viewA0J);
    }

    public final int A2A() {
        return this.A00;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5 A[RETURN] */
    public final int A2B(int i) {
        if (i == 1) {
            if (this.A00 == 1) {
                return -1;
            }
            boolean zA2J = A2J();
            if (A0G[0].length() != 7) {
                A0G[0] = "oHMhsTCUvi8O8";
                if (zA2J) {
                    return 1;
                }
                return -1;
            }
            String[] strArr = A0G;
            strArr[2] = "cASVkZ3y2DetEF9G8otARsSwnjimgRtg";
            strArr[4] = "wDGntkgp6XogcOY7rYz8EKhCse1aHWOv";
            if (zA2J) {
                return 1;
            }
            return -1;
        }
        if (i == 2) {
            if (this.A00 == 1) {
                return 1;
            }
            boolean zA2J2 = A2J();
            String[] strArr2 = A0G;
            if (strArr2[6].length() != strArr2[7].length()) {
                if (zA2J2) {
                    return -1;
                }
                return 1;
            }
            String[] strArr3 = A0G;
            strArr3[2] = "RrOYqAD7qkiKfoMMpmv8yvTfnugso6lX";
            strArr3[4] = "bATvX0yF7VRTLnTu9UqtYEiONslIi7NA";
            if (zA2J2) {
                return -1;
            }
            return 1;
        }
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[3] = "6DQtaB3lJkGKNvmH8s9QQc68TsOBLDE";
        if (i == 17) {
            if (this.A00 == 0) {
                return -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 33) {
            if (this.A00 == 1) {
                return -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.A00 == 1) ? 1 : Integer.MIN_VALUE;
        }
        int i2 = this.A00;
        String[] strArr4 = A0G;
        if (strArr4[6].length() != strArr4[7].length()) {
            A0G[5] = "iK4U0ZRXzEtdW2fzfe8Bf3AGjQ0TqpV";
            if (i2 == 0) {
                return 1;
            }
        } else {
            A0G[3] = "iGul3AgWfaQLWccPz7lC";
            if (i2 == 0) {
                return 1;
            }
        }
        return Integer.MIN_VALUE;
    }

    public View A2C(C03424b c03424b, C03494i c03494i, int boundsEnd, int i, int i2) {
        A2D();
        View view = null;
        View view2 = null;
        int iA0A = this.A04.A0A();
        int iA07 = this.A04.A07();
        int i3 = i > boundsEnd ? 1 : -1;
        while (boundsEnd != i) {
            View viewA0t = A0t(boundsEnd);
            int iA0p = A0p(viewA0t);
            if (iA0p >= 0 && iA0p < i2) {
                if (((C4U) viewA0t.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = viewA0t;
                    }
                } else if (this.A04.A0F(viewA0t) >= iA07 || this.A04.A0C(viewA0t) < iA0A) {
                    if (view2 == null) {
                        view2 = viewA0t;
                    }
                } else {
                    return viewA0t;
                }
            }
            boundsEnd += i3;
        }
        return view2 != null ? view2 : view;
    }

    public final void A2D() {
        if (this.A07 == null) {
            this.A07 = A0S();
        }
        if (this.A04 == null) {
            this.A04 = C4D.A02(this, this.A00);
        }
    }

    public final void A2E(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(A0T(0, 20, 1) + i);
        }
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[1] = "wMuOUB68W5cmyVCUMue198JFnL9Wkeot";
        A22(null);
        if (i == this.A00) {
            return;
        }
        this.A00 = i;
        this.A04 = null;
        A0y();
    }

    public final void A2F(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.A03;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.A00();
        }
        A0y();
        if (A0G[1].charAt(30) != 'o') {
            throw new RuntimeException();
        }
        A0G[3] = "tDl3kZGUKMTs";
    }

    public void A2G(C03424b c03424b, C03494i c03494i, AnonymousClass46 anonymousClass46, int i) {
    }

    public void A2H(C03424b c03424b, C03494i c03494i, AnonymousClass48 anonymousClass48, AnonymousClass47 anonymousClass47) {
        int iA0g;
        int iA0E;
        int iA0e;
        int iA0E2;
        View viewA03 = anonymousClass48.A03(c03424b);
        if (viewA03 == null) {
            anonymousClass47.A01 = true;
            return;
        }
        C4U c4u = (C4U) viewA03.getLayoutParams();
        if (anonymousClass48.A08 == null) {
            if (this.A05 == (anonymousClass48.A05 == -1)) {
                A17(viewA03);
            } else {
                A19(viewA03, 0);
            }
        } else {
            boolean z = this.A05;
            int top = anonymousClass48.A05;
            if (z == (top == -1)) {
                A16(viewA03);
            } else {
                A18(viewA03, 0);
            }
        }
        A1A(viewA03, 0, 0);
        anonymousClass47.A00 = this.A04.A0D(viewA03);
        if (this.A00 == 1) {
            if (A2J()) {
                iA0E2 = A0h() - A0f();
                iA0e = iA0E2 - this.A04.A0E(viewA03);
            } else {
                iA0e = A0e();
                iA0E2 = this.A04.A0E(viewA03) + iA0e;
            }
            if (anonymousClass48.A05 == -1) {
                iA0E = anonymousClass48.A06;
                iA0g = anonymousClass48.A06 - anonymousClass47.A00;
            } else {
                iA0g = anonymousClass48.A06;
                int i = anonymousClass48.A06;
                int top2 = anonymousClass47.A00;
                iA0E = i + top2;
            }
        } else {
            iA0g = A0g();
            iA0E = this.A04.A0E(viewA03) + iA0g;
            int top3 = anonymousClass48.A05;
            if (top3 == -1) {
                iA0E2 = anonymousClass48.A06;
                int i2 = anonymousClass48.A06;
                int top4 = anonymousClass47.A00;
                iA0e = i2 - top4;
            } else {
                iA0e = anonymousClass48.A06;
                int i3 = anonymousClass48.A06;
                int top5 = anonymousClass47.A00;
                iA0E2 = i3 + top5;
            }
        }
        A1B(viewA03, iA0e, iA0g, iA0E2, iA0E);
        if (c4u.A02() || c4u.A01()) {
            anonymousClass47.A03 = true;
        }
        anonymousClass47.A02 = viewA03.hasFocusable();
    }

    public void A2I(C03494i c03494i, AnonymousClass48 anonymousClass48, C4R c4r) {
        int i = anonymousClass48.A01;
        if (i >= 0 && i < c03494i.A03()) {
            c4r.A3G(i, Math.max(0, anonymousClass48.A07));
        }
    }

    public final boolean A2J() {
        return A0a() == 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03464f
    public final PointF A45(int firstChildPos) {
        if (A0W() == 0) {
            return null;
        }
        int i = (firstChildPos < A0p(A0t(0))) != this.A05 ? -1 : 1;
        int i2 = this.A00;
        if (A0G[0].length() == 7) {
            throw new RuntimeException();
        }
        A0G[5] = "5EjIyJt0kzQOvAP28HqeuGPqaebz9kN";
        if (i2 == 0) {
            return new PointF(i, 0.0f);
        }
        return new PointF(0.0f, i);
    }
}
