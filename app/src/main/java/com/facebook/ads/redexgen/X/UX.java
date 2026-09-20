package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UX implements InterfaceC0703Jh {

    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static InterfaceC0703Jh A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C1074Xx A00;
    public final InterfaceC04649g A01;
    public final InterfaceC0702Jg A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, 31};
    }

    static {
        A03();
        A05 = UX.class.getSimpleName();
        A06 = false;
    }

    public UX(C1074Xx c1074Xx) {
        InterfaceC0701Jf interfaceC0701JfA00;
        this.A00 = c1074Xx;
        if (JT.A0T(c1074Xx)) {
            this.A01 = C04629e.A00(c1074Xx);
            interfaceC0701JfA00 = C0708Jm.A01(c1074Xx, this.A01);
        } else {
            E5 e5A01 = C04629e.A01(c1074Xx);
            interfaceC0701JfA00 = C0708Jm.A00(c1074Xx, e5A01);
            this.A01 = e5A01;
        }
        this.A02 = new C0976Ua(c1074Xx, interfaceC0701JfA00);
        MX.A08.execute(new UZ(this));
        A04(c1074Xx);
    }

    public static synchronized InterfaceC0703Jh A01(C1074Xx c1074Xx) {
        if (A03 == null) {
            A03 = new UX(c1074Xx);
        }
        return A03;
    }

    public static synchronized void A04(C1074Xx c1074Xx) {
        if (A06) {
            return;
        }
        c1074Xx.A02().A9t();
        A06 = true;
    }

    private void A05(C0700Je c0700Je) {
        if (!c0700Je.A0A()) {
            Log.e(A05, A02(7, 29, 24) + c0700Je.A06() + A02(0, 7, 55));
            return;
        }
        A06(c0700Je);
        this.A01.AFi(c0700Je, new UY(this, c0700Je));
    }

    @SuppressLint({"ThrowException"})
    private void A06(C0700Je c0700Je) {
        switch (c0700Je.A06()) {
            case A0Q:
            case A0K:
            case A07:
            case A0J:
            case A0R:
            case A0T:
            case A0U:
                AnonymousClass90 anonymousClass90 = new AnonymousClass90(new Exception(A02(36, 5, 50)));
                anonymousClass90.A03(1);
                try {
                    anonymousClass90.A05(new JSONObject().put(A02(48, 4, 107), c0700Je.A06().toString()));
                    break;
                } catch (JSONException unused) {
                }
                this.A00.A06().A8z(A02(41, 7, 50), C04578z.A1H, anonymousClass90);
                break;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A8q(String str, Map<String, String> map) {
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A8t(String str, Map<String, String> map) {
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A8u(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A07).A06(C0713Jr.A0A(str, EnumC0710Jo.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A8v(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A08).A06(C0713Jr.A0A(str, EnumC0710Jo.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A8x(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A91(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A93(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0D).A06(C0713Jr.A0A(str, EnumC0710Jo.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A94(String str, @Nullable Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A95(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0F).A06(C0713Jr.A0A(str, EnumC0710Jo.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A96(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0K).A06(C0713Jr.A0A(str, EnumC0710Jo.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A97(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0H).A06(C0713Jr.A0A(str, EnumC0710Jo.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A99(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A0J).A06(C0713Jr.A0A(str, EnumC0710Jo.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9B(String str, Map<String, String> map, String str2, EnumC0705Jj enumC0705Jj) {
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(enumC0705Jj).A02(EnumC0706Jk.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9C(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A0L).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9G(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0N).A06(C0713Jr.A0A(str, EnumC0710Jo.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9H(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0O).A06(C0713Jr.A0A(str, EnumC0710Jo.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9J(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A0P).A06(C0713Jr.A0A(str, EnumC0710Jo.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9L(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9M(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0Q).A06(C0713Jr.A0A(str, EnumC0710Jo.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9N(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A0U).A06(C0713Jr.A0A(str, EnumC0710Jo.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9O(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A04).A02(EnumC0706Jk.A0T).A06(C0713Jr.A0A(str, EnumC0710Jo.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9P(String str, Map<String, String> map) {
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void A9R(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C0699Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC0705Jj.A05).A02(EnumC0706Jk.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0703Jh
    public final void ADD(String str) {
        new RM(this.A00).execute(str);
    }
}
