package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.56, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class AnonymousClass56 {
    public static byte[] A04;
    public static String[] A05 = {"3Lm1xoiqmVz", "7", "e", "S", "b9tO4", "WiIyJoqu6MmGONLqJ4ol82uO906afJVw", "5gKa3hz9VQf", "ZFmxpCIwvmg"};
    public final Intent A00;
    public final AnonymousClass59 A01;
    public final C1075Xy A02;
    public final InterfaceC0703Jh A03;

    public static String A0O(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0P() {
        A04 = new byte[]{51, 54, 13, 54, 51, 38, 51, 13, 48, 39, 60, 54, 62, 55, 18, 29, 8, 21, 10, 25, 61, 24, 56, 29, 8, 29, 62, 9, 18, 24, 16, 25, 73, 94, 76, 90, 73, 95, 94, 95, 109, 82, 95, 94, 84, 122, 95, 127, 90, 79, 90, 121, 78, 85, 95, 87, 94, 69, 90, 87, 86, 92, 108, 71, 90, 94, 86, 108, 67, 92, 95, 95, 90, 93, 84, 108, 90, 93, 71, 86, 65, 69, 82, 95};
    }

    static {
        A0P();
    }

    public AnonymousClass56(AnonymousClass59 anonymousClass59, Intent intent, InterfaceC0703Jh interfaceC0703Jh, C1075Xy c1075Xy) {
        this.A01 = anonymousClass59;
        this.A00 = intent;
        this.A03 = interfaceC0703Jh;
        this.A02 = c1075Xy;
    }

    public /* synthetic */ AnonymousClass56(AnonymousClass59 anonymousClass59, Intent intent, InterfaceC0703Jh interfaceC0703Jh, C1075Xy c1075Xy, AnonymousClass55 anonymousClass55) {
        this(anonymousClass59, intent, interfaceC0703Jh, c1075Xy);
    }

    private C1328dJ A00() {
        return (C1328dJ) this.A00.getSerializableExtra(A0O(0, 14, 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A02() {
        AnonymousClass59 anonymousClass59 = this.A01;
        return new C0953Td(anonymousClass59, this.A02, this.A03, new C1245bs(anonymousClass59));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A03() {
        return new A2(this.A02, this.A03, new C1245bs(this.A01), A00(), new TL(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A04() {
        return new A2(this.A02, this.A03, new C1245bs(this.A01), (C1324dF) this.A00.getSerializableExtra(A0O(32, 25, 116)), new TK(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A05() {
        AnonymousClass18 anonymousClass18 = (AnonymousClass18) this.A00.getSerializableExtra(A0O(14, 18, 51));
        AnonymousClass55 anonymousClass55 = null;
        if (anonymousClass18 == null) {
            return null;
        }
        String strA0Z = anonymousClass18.A0Z();
        String[] strArr = A05;
        if (strArr[2].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[4] = "1M84Q";
        strArr2[6] = "leaDHdAWfWg";
        PA paA02 = PB.A02(strA0Z);
        if (paA02 == null) {
            return null;
        }
        return new C0926Sb(this.A02, new C1245bs(this.A01), paA02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A06() {
        AnonymousClass55 anonymousClass55 = null;
        if (JR.A21(this.A02)) {
            C1075Xy c1075Xy = this.A02;
            return new C8L(c1075Xy, this.A03, new C7U(c1075Xy), new C1245bs(this.A01), A00());
        }
        C1075Xy c1075Xy2 = this.A02;
        return new C8K(c1075Xy2, this.A03, new C7U(c1075Xy2), new C1245bs(this.A01), A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A07() {
        return new C9D(this.A02, new TL(), this.A03, A00(), new C7U(this.A02), new C1245bs(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A08() {
        return new TO(this.A02, this.A03, new C1245bs(this.A01), A00(), null, new TL());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A09() {
        return new C8N(this.A02, new TL(), this.A03, A00(), new C7U(this.A02), new C1245bs(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A0A() {
        return new C8N(this.A02, new TK(), this.A03, (C1324dF) this.A00.getSerializableExtra(A0O(32, 25, 116)), new C7U(this.A02), new F7(this.A01));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A0B() {
        C1324dF c1324dF = (C1324dF) this.A00.getSerializableExtra(A0O(32, 25, 116));
        return new TO(this.A02, this.A03, new F7(this.A01), c1324dF, c1324dF.A0a(), new TK());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC0786Mr A0C(RelativeLayout relativeLayout) {
        TM tm = new TM(this.A02, new C1244br(this), this.A03, new C1245bs(this.A01));
        tm.A05(relativeLayout);
        tm.A04(this.A00.getIntExtra(A0O(57, 27, 124), RCHTTPStatusCodes.SUCCESS));
        MS.A0M(relativeLayout, -16777216);
        return tm;
    }
}
