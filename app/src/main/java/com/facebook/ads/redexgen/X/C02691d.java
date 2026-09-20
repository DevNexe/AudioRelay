package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02691d {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};

    @Nullable
    public C7U A00;
    public OH A01 = OH.A06;

    @Nullable
    @DoNotStrip
    public PA A02;
    public final C1328dJ A03;
    public final InterfaceC02681c A04;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -53, -48, -42, -57, -44, -43, -42, -53, -42, -53, -61, -50};
    }

    static {
        A07();
    }

    public C02691d(C1075Xy c1075Xy, C02821q c02821q, InterfaceC02681c interfaceC02681c, @Nullable String str) {
        this.A03 = A02(c1075Xy, c02821q, str, c02821q.A03());
        this.A04 = interfaceC02681c;
    }

    @Nullable
    private AdError A00(C1075Xy c1075Xy) {
        if (this.A03.A0c().isEmpty()) {
            c1075Xy.A06().A8y(A06(62, 3, 18), C04578z.A0Z, new AnonymousClass90(A06(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C1328dJ A02(C1075Xy c1075Xy, C02821q c02821q, @Nullable String str, JSONObject jSONObject) {
        C1328dJ adDataBundle = C1328dJ.A01(jSONObject, c1075Xy);
        adDataBundle.A0i(str);
        C9I c9iA01 = c02821q.A01();
        if (c9iA01 != null) {
            adDataBundle.A0e(c9iA01.A06());
        }
        return adDataBundle;
    }

    private C7U A04(C1075Xy c1075Xy) {
        C7U c7u = this.A00;
        return c7u != null ? c7u : new C7U(c1075Xy);
    }

    private void A08(C1075Xy c1075Xy) {
        C1W c1wA06 = this.A03.A0O().A0D().A06();
        A0A(c1wA06 != null ? c1wA06.A0A() : OH.A06);
        C1319dA c1319dA = new C1319dA(this);
        C7U c7u = new C7U(c1075Xy);
        boolean z = JR.A1U(c1075Xy) && C03735g.A0A(this.A03.A0d());
        String[] strArr = A06;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "rsw451NGt86";
        strArr2[2] = "Yd4DtCWl7E1Fg10XBidxjBNo2K";
        if (z) {
            C03735g c03735g = new C03735g(c7u, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z, new C1318d9(this));
            C0711Jp funnelLoggingHandler = new C0711Jp(this.A03.A0U(), c1075Xy.A08());
            c7u.A0d(funnelLoggingHandler);
            c03735g.A0B();
            return;
        }
        C1328dJ c1328dJ = this.A03;
        String[] strArr3 = A06;
        if (strArr3[1].charAt(24) != strArr3[0].charAt(24)) {
            C02791n.A02(c1075Xy, c1328dJ, true, c1319dA);
            return;
        }
        String[] strArr4 = A06;
        strArr4[6] = "NvwaqOE8NtZ";
        strArr4[2] = "Mi75BUZiVIPk9FHJPOQQgiG4jh";
        C02791n.A02(c1075Xy, c1328dJ, true, c1319dA);
    }

    private void A09(C1075Xy c1075Xy, EnumSet<CacheFlag> enumSet) {
        boolean cacheVideos = this.A03.A0r();
        C7U c7uA04 = A04(c1075Xy);
        C0711Jp funnelLoggingHandler = new C0711Jp(this.A03.A0U(), c1075Xy.A08());
        c7uA04.A0d(funnelLoggingHandler);
        boolean z = JR.A1U(c1075Xy) && C03735g.A0A(this.A03.A0d());
        if (z) {
            new C03735g(c7uA04, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z, new C1322dD(this, c1075Xy, cacheVideos)).A0B();
            return;
        }
        String strA06 = A06(65, 12, 2);
        if (cacheVideos) {
            C7Q c7q = new C7Q(this.A03.A0V(), this.A03.A0Z(), strA06);
            c7q.A04 = true;
            c7q.A03 = A06(0, 5, 17);
            c7uA04.A0X(c7q);
        }
        c7uA04.A0c(new C7S(this.A03.A0R().A01(), PZ.A04, PZ.A04, this.A03.A0Z(), A06(65, 12, 2)));
        boolean zContains = enumSet.contains(CacheFlag.VIDEO);
        int i = 0;
        boolean zA27 = JR.A27(c1075Xy, C0879Qg.A03());
        Iterator<C1B> it = this.A03.A0c().iterator();
        while (useExoPlayerCacheForDSL) {
            C1B adInfo = it.next();
            C7S c7s = new C7S(adInfo.A0D().A07(), C02751j.A00(adInfo.A0D()), C02751j.A01(adInfo.A0D()), this.A03.A0Z(), A06(65, 12, 2));
            if (i == 0) {
                c7uA04.A0b(c7s);
            } else {
                c7uA04.A0c(c7s);
            }
            Iterator<String> it2 = adInfo.A0G().A00().iterator();
            while (isDSL) {
                c7uA04.A0c(new C7S(it2.next(), -1, -1, this.A03.A0Z(), A06(65, 12, 2)));
            }
            if (zContains) {
                boolean isDSL = TextUtils.isEmpty(adInfo.A0D().A08());
                if (!isDSL) {
                    C7Q c7q2 = new C7Q(adInfo.A0D().A08(), this.A03.A0Z(), A06(65, 12, 2), adInfo.A0D().A05());
                    c7q2.A04 = false;
                    if (i == 0) {
                        if (cacheVideos && !zA27) {
                            c7uA04.A0X(c7q2);
                        } else {
                            c7uA04.A0a(c7q2);
                        }
                    } else if (cacheVideos && !zA27) {
                        c7uA04.A0Y(c7q2);
                    } else {
                        c7uA04.A0Z(c7q2);
                    }
                }
            }
            i++;
        }
        c7uA04.A0W(new C1320dB(this, c1075Xy, cacheVideos), new C7N(this.A03.A0Z(), strA06));
    }

    private void A0A(OH oh) {
        this.A01 = oh;
    }

    public final AnonymousClass18 A0B() {
        return this.A03;
    }

    public final EnumC0736Kq A0C() {
        if (this.A03.A0r()) {
            return EnumC0736Kq.A03;
        }
        int size = this.A03.A0c().size();
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (size > 1) {
                return EnumC0736Kq.A07;
            }
            if (this.A03.A0O().A0D().A06() != null) {
                EnumC0736Kq enumC0736Kq = EnumC0736Kq.A09;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return enumC0736Kq;
                }
            } else {
                if (A0I()) {
                    EnumC0736Kq enumC0736Kq2 = EnumC0736Kq.A0A;
                    String[] strArr3 = A06;
                    if (strArr3[6].length() == strArr3[2].length()) {
                        throw new RuntimeException();
                    }
                    A06[3] = "JH";
                    return enumC0736Kq2;
                }
                EnumC0736Kq enumC0736Kq3 = EnumC0736Kq.A08;
                if (A06[3].length() == 32) {
                    A06[3] = "ySAy4b6nQ";
                    return enumC0736Kq3;
                }
                String[] strArr4 = A06;
                strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                return enumC0736Kq3;
            }
        }
        throw new RuntimeException();
    }

    public final OH A0D() {
        return this.A01;
    }

    public final String A0E() {
        return this.A03.A0U();
    }

    public final void A0F() {
        this.A04.AFH();
    }

    public final void A0G(Intent intent, RewardData rewardData, String str) {
        this.A03.A0g(rewardData);
        this.A03.A0k(str);
        intent.putExtra(A06(48, 14, 94), this.A03);
    }

    public final void A0H(C1075Xy c1075Xy, EnumSet<CacheFlag> enumSet) {
        AdError adErrorA00 = A00(c1075Xy);
        if (adErrorA00 != null) {
            this.A04.A9u(adErrorA00);
            return;
        }
        this.A04.ADj();
        if (A0C() == EnumC0736Kq.A09) {
            A08(c1075Xy);
        } else {
            A09(c1075Xy, enumSet);
        }
    }

    public final boolean A0I() {
        return !TextUtils.isEmpty(this.A03.A0O().A0D().A08());
    }

    public final boolean A0J() {
        return this.A03.A0o();
    }
}
