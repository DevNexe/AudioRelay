package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0730Kk {
    public static byte[] A07;
    public static final MV A08;
    public static final Executor A09;
    public long A00;

    @Nullable
    public Kj A01;

    @Nullable
    public Map<String, String> A02;
    public final C2D A03;
    public final C1075Xy A04;
    public final C0731Kl A05;
    public final String A06;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 107, 108, 51, 50, 57, 50, 59, 122, 105, 107, 119, 117, 78, 65, 68, 72, 67, 89, 82, 95, 72, 92, 88, 72, 94, 89, 82, 68, 73, 98, 88, 11, 121, 101, 17, 11, 100, 101, 10, 108, 99, 102, 102, 10, 88, 79, 73, 79, 67, 92, 79, 78, 20, 53, 122, 28, 51, 54, 54, 122, 63, 40, 40, 53, 40, 122, 57, 53, 62, 63, 122, 1, 127, 41, 7, 122, 127, 41, 15, 13, 6, 13, 26, 1, 11, 81, 90, 75, 72, 80, 77, 84, 40, 41, 0, 47, 42, 42, 14, 41, 41, 45};
    }

    static {
        A0A();
        A08 = new MV();
        A09 = Executors.newCachedThreadPool(A08);
    }

    public C0730Kk(C1075Xy c1075Xy) {
        this(c1075Xy, C2E.A00(c1075Xy.A00()));
    }

    public C0730Kk(C1075Xy c1075Xy, C2D c2d) {
        this.A00 = -1L;
        this.A04 = c1075Xy;
        this.A05 = C0731Kl.A00();
        this.A06 = C0734Ko.A01(c1075Xy);
        this.A03 = c2d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public R3 A03(long j, C0728Kh c0728Kh) {
        return new U1(this, c0728Kh, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        C1075Xy c1075Xy = this.A04;
        if (c1075Xy == null || !RK.A0A(c1075Xy)) {
            return;
        }
        AnonymousClass90 anonymousClass90 = new AnonymousClass90(A05(8, 5, 107));
        anonymousClass90.A03(1);
        this.A04.A06().A8y(A05(86, 7, 111), C04578z.A1w, anonymousClass90);
    }

    private void A0B(int i, String str) {
        String strA05 = A05(93, 10, 22);
        KV.A05(strA05, A05(37, 16, 122), A05(0, 8, 90));
        KV.A04(strA05, String.format(Locale.US, A05(53, 26, 10), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(KH kh) {
        Kj kj = this.A01;
        if (kj != null) {
            kj.AAi(kh);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(KH kh) {
        MM.A00(new C0975Tz(this, kh));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(C0974Ty c0974Ty) {
        Kj kj = this.A01;
        if (kj != null) {
            kj.ACS(c0974Ty);
        }
    }

    private void A0L(C0974Ty c0974Ty) {
        InterfaceC04378a interfaceC04378aA04;
        MM.A00(new U0(this, c0974Ty));
        if (JR.A1m(this.A04) && (interfaceC04378aA04 = this.A04.A04()) != null) {
            interfaceC04378aA04.A5U();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M(String str, long j, C0728Kh c0728Kh) {
        String str2;
        try {
            try {
                C0733Kn c0733KnA06 = this.A05.A06(this.A04, str, j);
                C9H c9hA00 = c0733KnA06.A00();
                C1074Xx c1074XxA00 = this.A04.A00();
                c1074XxA00.A01().A8s(c1074XxA00, str);
                if (c9hA00 != null) {
                    JR.A0O(this.A04).A2E(c9hA00.A08());
                    this.A04.A06().A9W();
                    this.A03.A0N(c9hA00.A06());
                    Kg.A05(c9hA00.A05().A0B(), c0728Kh);
                    C0775Mg.A01(this.A04, A09, c9hA00);
                    AnonymousClass90 anonymousClass90 = new AnonymousClass90(A05(30, 7, 123) + C0761Ls.A02());
                    anonymousClass90.A04(1);
                    anonymousClass90.A08(false);
                    this.A04.A06().A9Q(A05(79, 7, 56), C04578z.A1W, anonymousClass90);
                }
                int i = C0729Ki.A00[c0733KnA06.A01().ordinal()];
                if (i == 1) {
                    C0974Ty c0974Ty = (C0974Ty) c0733KnA06;
                    if (c9hA00 != null) {
                        if (c9hA00.A05().A0E()) {
                            Kg.A07(str, c0728Kh);
                        }
                        if (this.A02 != null) {
                            str2 = this.A02.get(A05(13, 17, 93));
                        } else {
                            str2 = null;
                        }
                        if (!TextUtils.isEmpty(c0733KnA06.A02()) && !TextUtils.isEmpty(str2)) {
                            this.A04.A01().AEA(this.A04, str2, c0733KnA06.A02());
                        }
                    }
                    this.A04.A0D().A2k(MJ.A01(this.A00));
                    A0L(c0974Ty);
                    return;
                }
                if (i != 2) {
                    AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                    this.A04.A0D().A2j(MJ.A01(this.A00), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                    A0D(KH.A01(adErrorType, str));
                    return;
                }
                C0973Tx c0973Tx = (C0973Tx) c0733KnA06;
                String strA04 = c0973Tx.A04();
                AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c0973Tx.A03(), AdErrorType.ERROR_MESSAGE);
                A0B(c0973Tx.A03(), strA04);
                if (strA04 == null) {
                    strA04 = str;
                }
                this.A04.A0D().A2j(MJ.A01(this.A00), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA04, adErrorTypeAdErrorTypeFromCode.isPublicError());
                A0D(KH.A01(adErrorTypeAdErrorTypeFromCode, strA04));
            } catch (Exception e) {
                e = e;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                this.A04.A0D().A2j(MJ.A01(this.A00), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0D(KH.A01(adErrorType2, message));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j, C0728Kh c0728Kh) {
        A09.execute(new U2(this, str, j, c0728Kh));
    }

    public final void A0O(C0728Kh c0728Kh) {
        this.A00 = System.currentTimeMillis();
        AnonymousClass98.A0B(this.A04);
        if (Kg.A08(c0728Kh)) {
            MX.A06.execute(new U4(this));
            String strA02 = Kg.A02(c0728Kh);
            if (strA02 != null) {
                this.A04.A0D().AFN();
                A0N(strA02, 0L, c0728Kh);
                return;
            } else {
                AdErrorType adErrorType = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A04.A0D().A2j(MJ.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage(), adErrorType.isPublicError());
                A0D(KH.A01(adErrorType, null));
                return;
            }
        }
        A09.execute(new U3(this, c0728Kh));
    }

    public final void A0P(Kj kj) {
        this.A01 = kj;
    }
}
