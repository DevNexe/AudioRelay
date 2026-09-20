package com.facebook.ads.redexgen.X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class XW implements C8W {
    public static XW A06;
    public static byte[] A07;
    public static String[] A08 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};

    @Nullable
    public C0U A00;

    @Nullable
    public C8V A01;

    @Nullable
    public InterfaceC04458l A02;

    @Nullable
    public C9P A03;

    @Nullable
    public InterfaceC0715Jt A04;

    @Nullable
    public GU A05;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A08;
            if (strArr[6].length() != strArr[7].length()) {
                break;
            }
            String[] strArr2 = A08;
            strArr2[6] = "Hv2WK1fJh7GnXaP";
            strArr2[7] = "jwUFRNkRPBL5IaL";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            int i5 = bArrCopyOfRange[i4] - i3;
            String[] strArr3 = A08;
            if (strArr3[4].charAt(26) != strArr3[0].charAt(26)) {
                break;
            }
            String[] strArr4 = A08;
            strArr4[2] = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG";
            strArr4[3] = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw";
            bArrCopyOfRange[i4] = (byte) (i5 - 98);
            i4++;
        }
        throw new RuntimeException();
    }

    public static void A07() {
        A07 = new byte[]{-57, -64, -10, -56, -56, -64, -59, -63, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A08[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    static {
        A07();
    }

    @Nullable
    public static InterfaceC03775k A00(C1074Xx c1074Xx, @Nullable GU gu) {
        if (!JR.A1B(c1074Xx) || gu == null) {
            return null;
        }
        return AbstractC03785l.A00().A01(gu);
    }

    public static InterfaceC04458l A01(C1074Xx c1074Xx) {
        return C8m.A00().A01(c1074Xx, new C1054Xd());
    }

    public static synchronized XW A02() {
        if (A06 == null) {
            A06 = new XW();
        }
        return A06;
    }

    @Nullable
    public static R2 A03(C1074Xx c1074Xx) {
        if (!JR.A17(c1074Xx)) {
            return null;
        }
        return RK.A01(c1074Xx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C8W
    @Nullable
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized GU A7d() {
        return this.A05;
    }

    @Nullable
    public static GU A05(C1074Xx c1074Xx, InterfaceC04458l interfaceC04458l, @Nullable R2 r2) {
        if (!JR.A1u(c1074Xx) || r2 == null) {
            return null;
        }
        return AbstractC0906Rh.A00().A01(c1074Xx, interfaceC04458l, r2, C0734Ko.A04(c1074Xx), new XX(new C0728Kh(c1074Xx, A06(0, 0, 122), null, KM.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(c1074Xx), AdSettings.isMixedAudience(), new KR(), MA.A01(JR.A0H(c1074Xx)), null, null), c1074Xx), C0904Rf.A00().A00());
    }

    public static void A08() {
        String strA06 = A06(32, 28, 77);
        if (A08[5].length() == 20) {
            throw new RuntimeException();
        }
        A08[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        KV.A05(strA06, A06(8, 24, 59), A06(0, 8, 46));
    }

    public static void A09(C1074Xx c1074Xx, @Nullable InterfaceC03775k interfaceC03775k) {
        if (!JR.A1B(c1074Xx) || interfaceC03775k == null) {
            return;
        }
        AbstractC03755i.A00().A01(interfaceC03775k, c1074Xx);
    }

    public static void A0A(C1074Xx c1074Xx, @Nullable GU gu) {
        if (!JR.A0h(c1074Xx) || gu == null) {
            return;
        }
        new AnonymousClass65(c1074Xx, gu, new AnonymousClass66(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1074Xx c1074Xx, @Nullable GU gu) {
        if (gu == null) {
            return;
        }
        JU.A00(c1074Xx, gu);
    }

    public final synchronized void A0C(C1074Xx c1074Xx) {
        if (this.A05 != null) {
            return;
        }
        this.A02 = A01(c1074Xx);
        this.A05 = A05(c1074Xx, this.A02, A03(c1074Xx));
        A09(c1074Xx, A00(c1074Xx, this.A05));
        A0A(c1074Xx, this.A05);
        A0B(c1074Xx, this.A05);
        if (this.A05 != null) {
            this.A05.A5U();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final InterfaceC0703Jh A5c(C1074Xx c1074Xx) {
        return UX.A01(c1074Xx);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8V A5q(C8U c8u) {
        if (this.A01 == null) {
            this.A01 = new XY(this);
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC04458l A6L(C8U c8u) {
        if (this.A02 == null) {
            this.A02 = A01(c8u.A00());
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC04568y A6M(C8U c8u) {
        return new C1063Xm(c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8X A6V(C8U c8u) {
        return new EL(this, c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    @Nullable
    public final synchronized C0U A6i(C8U c8u) {
        if (!JR.A0s(c8u)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0V.A00().A01(new C1052Xb(c8u));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C8Z A7L(C8U c8u) {
        return new XZ(c8u);
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final C1074Xx A7M(Context context) {
        C1074Xx c1074XxA00 = C8T.A00();
        if (c1074XxA00 == null) {
            C1074Xx c1074Xx = new C1074Xx(context, this);
            C8T.A01(c1074Xx);
            return c1074Xx;
        }
        return c1074XxA00;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized InterfaceC0715Jt A7N(C1074Xx c1074Xx) {
        if (this.A04 == null) {
            this.A04 = new C0980Ue(c1074Xx);
        }
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.C8W
    public final synchronized C9P A7T() {
        if (this.A03 == null) {
            this.A03 = new C9P();
            A08();
        }
        return this.A03;
    }
}
