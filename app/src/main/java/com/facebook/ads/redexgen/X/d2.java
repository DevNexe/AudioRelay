package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
@SuppressLint({"HardcodedIPAddressUse"})
public abstract class d2 implements Kj {
    public static byte[] A0D;
    public static String[] A0E = {"4yJhIog9RzpC9w4XHjq79o6hmz2pMXrt", "bLneqHgNlbzxjE", "P7gevZ65hMGDm5VmgpkLcWEi46YxYduR", "Pajg2XTKXpS0pN0AoGLcPnQoa2IWF6Z7", "YyJRdl3XxpBTstTmsw", "OvgbPt0JG7dlaj99kqPbJKVmb9CPKTVr", "21VbiQWRKHmC0d4xB3zoTsbqXtN2ZOxw", "Q3Y9mBD7X4l0uaedlY7FP5X0xCsXbtIX"};
    public static final Handler A0F;
    public static final C02580s A0G = null;

    @SuppressLint({"StaticFieldLeak"})
    public static final C0730Kk A0H = null;
    public static final String A0I;

    @Nullable
    public InterfaceC02530n A00;

    @Nullable
    public InterfaceC02530n A01;

    @Nullable
    public C9H A04;

    @Nullable
    public C0728Kh A05;

    @Nullable
    public AbstractC02540o A06;
    public final C02811p A07;
    public final InterfaceC0703Jh A08;
    public final C02580s A09;
    public final C0730Kk A0A;
    public final C1075Xy A0B;
    public volatile boolean A0C;
    public long A03 = -1;

    @Nullable
    public String A02 = null;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{75, 110, 107, 122, 126, 111, 120, 42, 110, 101, 111, 121, 42, 100, 101, 126, 42, 111, 114, 99, 121, 126, 78, 107, 110, 127, 123, 106, 125, 47, 102, 124, 47, 97, 122, 99, 99, 47, 96, 97, 47, 124, 123, 110, 125, 123, 78, 107, 54, 23, 88, 21, 23, 10, 29, 88, 25, 28, 88, 27, 25, 22, 28, 17, 28, 25, 12, 29, 11, 86, 59, 30, 3, 2, 11, 76, 13, 8, 13, 28, 24, 9, 30, 76, 24, 21, 28, 9, 66, 110, 107, 47, 110, 99, 125, 106, 110, 107, 118, 47, 124, 123, 110, 125, 123, 106, 107, 42, 59, 34, 78, 89, 43, 46, 59, 46, 0, 45, 37, 42, 44, 59, 111, 38, 60, 111, 33, 58, 35, 35, 90, 81, 92, 77, 70, 79, 75, 90, 91, 96, 86, 91, 48, 59, 35, 60, 39, 58, 59, 56, 48, 59, 33, 117, 60, 38, 117, 48, 56, 37, 33, 44, 31, 11, 28, 8, 12, 28, 23, 26, 0, 38, 26, 24, 9, 9, 16, 23, 30, 70, 65, 89, 78, 67, 70, 75, 15, 95, 67, 78, 76, 74, 66, 74, 65, 91, 15, 70, 65, 15, 93, 74, 92, 95, 64, 65, 92, 74, 66, 65, 79, 74, 113, 90, 71, 67, 75, 113, 67, 93, 49, 38, 50, 54, 38, 48, 55, 28, 42, 39};
    }

    public abstract void A0J();

    public abstract void A0L(InterfaceC02530n interfaceC02530n, C9H c9h, C9F c9f, C02821q c02821q);

    static {
        A07();
        MU.A02();
        A0I = d2.class.getSimpleName();
        A0F = new Handler(Looper.getMainLooper());
    }

    public d2(C1075Xy c1075Xy, C02811p c02811p) {
        this.A0B = c1075Xy;
        this.A07 = c02811p;
        C0730Kk c0730Kk = A0H;
        if (c0730Kk != null) {
            this.A0A = c0730Kk;
        } else {
            this.A0A = new C0730Kk(this.A0B);
        }
        this.A0A.A0P(this);
        C02580s c02580s = A0G;
        if (c02580s != null) {
            this.A09 = c02580s;
        } else {
            this.A09 = new C02580s();
        }
        DynamicLoaderFactory.makeLoader(this.A0B).getInitApi().onAdLoadInvoked(this.A0B);
        this.A08 = c1075Xy.A08();
        this.A0B.A0D().A4X();
    }

    private void A08(C0974Ty c0974Ty) {
        C9H c9hA00 = c0974Ty.A00();
        if (c9hA00 == null || c9hA00.A05() == null) {
            String strA06 = A06(179, 29, 39);
            KH kh = new KH(AdErrorType.NO_AD_PLACEMENT, strA06);
            this.A0B.A0D().A4Z(kh.A03().getErrorCode(), strA06);
            AbstractC02540o abstractC02540o = this.A06;
            if (abstractC02540o != null) {
                abstractC02540o.A0G(kh);
                return;
            }
            return;
        }
        this.A04 = c9hA00;
        this.A00 = null;
        C9H c9h = this.A04;
        C9F c9fA04 = c9h.A04();
        String strA07 = A06(0, 0, 73);
        if (c9fA04 == null) {
            KH khA01 = KH.A01(AdErrorType.NO_FILL, strA07);
            this.A0B.A0D().A4Z(khA01.A03().getErrorCode(), A06(48, 22, 112));
            AbstractC02540o abstractC02540o2 = this.A06;
            if (abstractC02540o2 != null) {
                abstractC02540o2.A0G(khA01);
                return;
            }
            return;
        }
        String strA02 = c9fA04.A02();
        InterfaceC02530n interfaceC02530nA00 = this.A09.A00(this.A0B, c9h.A05().A0D());
        if (interfaceC02530nA00 == null) {
            this.A0B.A06().A8y(A06(107, 3, 67), C04578z.A0a, new AnonymousClass90(A06(0, 22, 2), strA02));
            AAi(KH.A00(AdErrorType.INTERNAL_ERROR));
            return;
        }
        AdPlacementType adPlacementTypeA00 = this.A07.A00();
        AdPlacementType adapterType = interfaceC02530nA00.A7B();
        if (adPlacementTypeA00 != adapterType) {
            KH khA02 = KH.A01(AdErrorType.INTERNAL_ERROR, strA07);
            this.A0B.A0D().A4Z(khA02.A03().getErrorCode(), A06(70, 19, 100));
            AbstractC02540o abstractC02540o3 = this.A06;
            if (abstractC02540o3 != null) {
                abstractC02540o3.A0G(khA02);
                return;
            }
            return;
        }
        this.A00 = interfaceC02530nA00;
        C9I c9iA05 = c9h.A05();
        JSONObject jSONObjectA04 = c9fA04.A04();
        if (jSONObjectA04 != null) {
            String strOptString = jSONObjectA04.optString(A06(220, 10, 75));
            this.A0B.A0D().AEh(strOptString);
            this.A0B.A0B(strOptString);
            C1074Xx c1074XxA00 = C8T.A00();
            if (c1074XxA00 != null) {
                c1074XxA00.A0B(strOptString);
            }
            String requestId = A06(162, 17, 113);
            A0A(jSONObjectA04.optJSONObject(requestId));
            C02821q c02821q = new C02821q(jSONObjectA04, c9iA05, this.A07.A09, c9iA05.A0C());
            if (this.A05 == null) {
                String strA08 = A06(142, 20, 93);
                KH khA03 = KH.A01(AdErrorType.UNKNOWN_ERROR, strA08);
                this.A0B.A0D().A4Z(khA03.A03().getErrorCode(), strA08);
                AbstractC02540o abstractC02540o4 = this.A06;
                if (abstractC02540o4 != null) {
                    abstractC02540o4.A0G(khA03);
                    return;
                }
                return;
            }
            A0L(interfaceC02530nA00, c9h, c9fA04, c02821q);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "m1l7KBFjFJZQKSNoNN";
            strArr[1] = "daOG7UEv1P6bC2";
            return;
        }
        String strA09 = A06(112, 18, 71);
        KH error = KH.A01(AdErrorType.UNKNOWN_ERROR, strA09);
        this.A0B.A0D().A4Z(error.A03().getErrorCode(), strA09);
        AbstractC02540o abstractC02540o5 = this.A06;
        if (abstractC02540o5 != null) {
            abstractC02540o5.A0G(error);
        }
    }

    private final void A09(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        this.A0B.A0D().A4a(str != null);
        this.A03 = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT < 17) {
            AAi(new KH(AdErrorType.API_NOT_SUPPORTED, A06(0, 0, 73)));
            return;
        }
        try {
            this.A05 = this.A07.A01(this.A0B, new KR(this.A0B, str, this.A07.A09, this.A07.A08), adExperienceType);
            if (A0E[6].charAt(21) == '6') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[4] = "3q2wB1pMY3UXfOrLgu";
            strArr[1] = "CsXqAZILgfX2KA";
            this.A0A.A0O(this.A05);
        } catch (KI e) {
            AAi(KH.A02(e));
        }
    }

    private void A0A(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.A02 = jSONObject.optString(A06(130, 12, 55));
            C02600u.A01(this.A0B).A0O(jSONObject);
        }
    }

    public final long A0B() {
        C9H c9h = this.A04;
        if (c9h != null) {
            return c9h.A03();
        }
        return -1L;
    }

    public final Handler A0C() {
        return A0F;
    }

    @Nullable
    public final C9I A0D() {
        C9H c9h = this.A04;
        if (c9h == null) {
            return null;
        }
        return c9h.A05();
    }

    @Nullable
    public final String A0E() {
        InterfaceC02530n interfaceC02530n = this.A01;
        if (interfaceC02530n == null) {
            return null;
        }
        return interfaceC02530n.A65();
    }

    public final void A0F() {
        String strA65;
        this.A0B.A0D().A2e(MJ.A01(this.A03));
        InterfaceC02530n interfaceC02530n = this.A01;
        if (interfaceC02530n == null || (strA65 = interfaceC02530n.A65()) == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put(A06(208, 12, 38), MJ.A04(this.A03));
        new C0711Jp(strA65, this.A08).A02(EnumC0710Jo.A08, map);
    }

    public final void A0G() {
        InterfaceC02530n interfaceC02530n = this.A01;
        String strA06 = A06(107, 3, 67);
        if (interfaceC02530n == null) {
            String strA07 = A06(22, 26, 7);
            this.A0B.A06().A8y(strA06, C04578z.A0Q, new AnonymousClass90(strA07));
            AdErrorType adErrorType = AdErrorType.INTERNAL_ERROR;
            this.A0B.A0D().A4Z(adErrorType.getErrorCode(), strA07);
            AbstractC02540o abstractC02540o = this.A06;
            if (abstractC02540o != null) {
                abstractC02540o.A0G(KH.A01(adErrorType, adErrorType.getDefaultErrorMessage()));
            }
            this.A0B.A0D().A4c();
            return;
        }
        if (this.A0C) {
            String strA08 = A06(89, 18, 7);
            this.A0B.A06().A8y(strA06, C04578z.A0M, new AnonymousClass90(strA08));
            AdErrorType adErrorType2 = AdErrorType.AD_ALREADY_STARTED;
            this.A0B.A0D().A4Z(adErrorType2.getErrorCode(), strA08);
            AbstractC02540o abstractC02540o2 = this.A06;
            if (abstractC02540o2 != null) {
                abstractC02540o2.A0G(KH.A01(adErrorType2, adErrorType2.getDefaultErrorMessage()));
            }
            this.A0B.A0D().A4b();
            return;
        }
        if (!TextUtils.isEmpty(this.A01.A65())) {
            this.A08.A9J(this.A01.A65());
        }
        this.A0B.A0D().A4d();
        this.A0C = true;
        A0J();
    }

    public final void A0H() {
        A0R(false);
    }

    public final void A0I() {
        if (this.A02 != null) {
            C02600u.A01(this.A0B).A0N(this.A02);
        }
    }

    public final void A0K(@Nullable InterfaceC02530n interfaceC02530n) {
        if (interfaceC02530n != null) {
            interfaceC02530n.onDestroy();
        }
    }

    public final void A0M(AbstractC02540o abstractC02540o) {
        this.A06 = abstractC02540o;
    }

    public final void A0N(C02821q c02821q) {
        this.A0B.A0D().A4W();
        String strOptString = c02821q.A03().optString(A06(110, 2, 37));
        if (!TextUtils.isEmpty(strOptString)) {
            new C0711Jp(strOptString, this.A08).A02(EnumC0710Jo.A04, null);
        }
    }

    public void A0O(@Nullable String str) {
        A09(str, null);
    }

    public final void A0P(@Nullable String str) {
        A0O(str);
    }

    public final void A0Q(@Nullable String str, @Nullable AdExperienceType adExperienceType) {
        A09(str, adExperienceType);
    }

    public void A0R(boolean z) {
        if (!z && !this.A0C) {
            return;
        }
        this.A0B.A0D().A4e();
        A0K(this.A01);
        this.A0C = false;
    }

    public final boolean A0S() {
        C9H c9h = this.A04;
        return c9h == null || c9h.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.Kj
    public final synchronized void AAi(KH kh) {
        A0C().post(new C1312d3(this, kh));
    }

    @Override // com.facebook.ads.redexgen.X.Kj
    @SuppressLint({"CatchGeneralException"})
    public final synchronized void ACS(C0974Ty c0974Ty) {
        try {
            A08(c0974Ty);
        } catch (Exception e) {
            this.A0B.A06().A8y(A06(107, 3, 67), C04578z.A0T, new AnonymousClass90(e));
        }
    }
}
