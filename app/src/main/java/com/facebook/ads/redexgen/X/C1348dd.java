package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1348dd<NativeViewabilityLogger> implements InterfaceC02530n {
    public static byte[] A0G;
    public static String[] A0H = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0I;
    public InterfaceC02610v A00;
    public C1337dS A01;

    @Nullable
    public C1330dL A02;
    public C0579El A03;

    @Nullable
    public InterfaceC0703Jh A04;

    @Nullable
    @DoNotStrip
    public O9 A06;

    @Nullable
    public T5 A07;

    @Nullable
    public A1 A08;

    @DoNotStrip
    public AbstractC0894Qv A09;

    @Nullable
    public C0895Qw A0A;
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public MK A05 = new MK();
    public Boolean A0B = false;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A0G = new byte[]{-28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -29, -30, -17, -17, -26, -13, -81, -28, -19, -22, -28, -20, -26, -27, -24, -39, -20, -24, -93, -36, -24, -31, -32, -68, -69, -83, 116, 127};
    }

    static {
        A0A();
        A0I = C1348dd.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A09() {
        C1330dL c1330dL;
        if (this.A00 != null && this.A08 != null && (c1330dL = this.A02) != null && c1330dL.A0r()) {
            this.A00.AAD(this, this.A08);
        }
        if (this.A00 != null && this.A0D) {
            boolean z = this.A0E;
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            A0H[2] = "DQYu3GBVfiN4Ml";
            if (z || !this.A0F) {
                this.A00.AAD(this, this.A07);
            }
        }
        this.A03.A0D().A3X(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0B(int i, C9I c9i) {
        InterfaceC0846Oz nativeDSLListener = new C1351dg(this);
        this.A08 = new A1(this.A03, this.A04, nativeDSLListener, this.A02, A08(0, 31, 110), 2, this.A05);
        this.A09 = new C1350df(this);
        this.A0A = new C0895Qw(this.A08, c9i.A04(), c9i.A09(), true, new WeakReference(this.A09), this.A03);
        this.A0A.A0W(this.A02.A0H());
        this.A0A.A0X(this.A02.A0I());
        this.A08.setVisibility(0);
        this.A03.getResources();
        this.A08.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        this.A08.AF2();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0E(C9I c9i, C02821q c02821q) {
        C1339dU c1339dUA00 = C1339dU.A00(c02821q.A03());
        this.A0C = c1339dUA00.A65();
        if (C02500j.A03(this.A03, c1339dUA00, this.A04)) {
            this.A03.A0D().A41();
            this.A00.ABC(this, KH.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A06 = new C0618Fy(this, c1339dUA00);
        this.A07 = new T5(this.A03, (WeakReference<O9>) new WeakReference(this.A06), c9i.A04(), A65());
        this.A07.A0G(c9i.A07(), c9i.A08());
        C1349de c1349de = new C1349de(this);
        C0579El c0579El = this.A03;
        InterfaceC0703Jh interfaceC0703Jh = this.A04;
        T5 t5 = this.A07;
        this.A01 = new C1337dS(c0579El, interfaceC0703Jh, t5, t5.getViewabilityChecker(), c1349de);
        this.A01.A08(c1339dUA00);
        this.A07.loadDataWithBaseURL(OC.A01(AdInternalSettings.getUrlPrefix()), c1339dUA00.A04(), A08(31, 9, 97), A08(40, 5, 52), null);
        this.A0D = true;
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(KK kk, C9I c9i) {
        if (this.A02 == null || this.A04 == null) {
            return;
        }
        int iA02 = (int) (kk.A02() * Resources.getSystem().getDisplayMetrics().density);
        if (!(JR.A1U(this.A03) && C03735g.A0A(this.A02.A0d()))) {
            A0B(iA02, c9i);
        } else {
            new C03735g(new C7U(this.A03), this.A02.A0d(), this.A02.A0Y(), this.A02.A0Z(), true, new C1353di(this, iA02, c9i, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public final void A0I(C0579El c0579El, InterfaceC0703Jh interfaceC0703Jh, KK kk, InterfaceC02610v interfaceC02610v, C02821q c02821q) {
        c0579El.A0D().A3W();
        this.A03 = c0579El;
        this.A04 = interfaceC0703Jh;
        this.A00 = interfaceC02610v;
        this.A0F = JR.A18(this.A03.getApplicationContext());
        C9I c9iA01 = c02821q.A01();
        this.A02 = C1330dL.A01(c02821q.A03(), this.A03);
        if (this.A02.A0r()) {
            A0F(kk, c9iA01);
        } else {
            A0E(c9iA01, c02821q);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02530n
    public final String A65() {
        return this.A0C;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02530n
    public final AdPlacementType A7B() {
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02530n
    public final void onDestroy() {
        this.A03.A0D().A3U(this.A07 != null);
        T5 t5 = this.A07;
        if (t5 != null) {
            t5.destroy();
            this.A07 = null;
            this.A06 = null;
        }
    }
}
