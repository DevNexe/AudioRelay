package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8K, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8K extends TW {
    public static byte[] A0E;
    public static String[] A0F = {"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;

    @Nullable
    public LinearLayout A02;
    public C1328dJ A03;
    public C7U A04;

    @Nullable
    public C2M A05;

    @Nullable
    public OV A06;
    public SB A07;

    @DoNotStrip
    public AbstractC0894Qv A08;
    public C0895Qw A09;
    public String A0A;
    public List<C0847Pa> A0B;
    public final C1075Xy A0C;
    public final MK A0D;

    public static String A07(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0F;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A09() {
        A0E = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114};
    }

    static {
        A09();
        A0G = (int) (Lr.A00 * 48.0f);
        A0H = (int) (Lr.A00 * 8.0f);
        A0I = (int) (Lr.A00 * 8.0f);
        A0K = (int) (Lr.A00 * 56.0f);
        A0J = (int) (Lr.A00 * 12.0f);
    }

    public C8K(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, C7U c7u, InterfaceC0785Mq interfaceC0785Mq, C1328dJ c1328dJ) {
        super(c1075Xy, interfaceC0703Jh, interfaceC0785Mq, c1328dJ);
        this.A0D = new MK();
        this.A04 = c7u;
        this.A0C = c1075Xy;
    }

    private final void A0A() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2M c2m = this.A05;
        if (c2m != null) {
            c2m.removeAllViews();
            this.A05 = null;
        }
        OV ov = this.A06;
        if (ov != null) {
            ov.removeAllViews();
            this.A06 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0121  */
    private final void A0B(int i, @Nullable Bundle bundle) {
        int childSpacing;
        int i2;
        int i3;
        C8K c8k;
        this.A02 = new LinearLayout(getContext());
        if (i == 1) {
            this.A02.setGravity(17);
        } else {
            LinearLayout linearLayout = this.A02;
            String[] strArr = A0F;
            String str = strArr[5];
            String str2 = strArr[4];
            int height = str.charAt(16);
            int width = str2.charAt(16);
            if (height != width) {
                A0F[3] = "ZjfK78AcBdGmJYtKFzysYxy2ZjwGAIzu";
                linearLayout.setGravity(48);
            }
            throw new RuntimeException();
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i4 = Lr.A01.widthPixels;
        int childSpacing2 = Lr.A01.heightPixels;
        if (i == 1) {
            int height2 = A0H;
            int i5 = i4 - (height2 * 4);
            int height3 = childSpacing2 / 2;
            childSpacing = Math.min(i5, height3);
            i2 = (i4 - childSpacing) / 8;
            i3 = i2 * 4;
        } else {
            int height4 = A0K;
            int width2 = A0G;
            int height5 = height4 + width2;
            int width3 = A0H;
            childSpacing = childSpacing2 - (height5 + (width3 * 4));
            i2 = A0H;
            i3 = i2 * 2;
        }
        this.A08 = new S1(this);
        this.A09 = new C0895Qw(this, 1, new WeakReference(this.A08), this.A0C);
        C0895Qw c0895Qw = this.A09;
        int extraSpacing = this.A00;
        c0895Qw.A0W(extraSpacing);
        C0895Qw c0895Qw2 = this.A09;
        int extraSpacing2 = this.A01;
        c0895Qw2.A0X(extraSpacing2);
        this.A05 = new C2M(this.A0C);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new SB(this.A05, i, this.A0B, this.A09, bundle);
        this.A05.setAdapter(new S2(this.A0C, this.A0B, this.A03, super.A0A, this.A04, this.A09, this.A0D, getAudienceNetworkListener(), this.A0A, childSpacing, i2, i3, i, this.A07));
        if (i == 1) {
            c8k = this;
            c8k.A0D(c8k.A07);
        } else {
            c8k = this;
        }
        LinearLayout linearLayout2 = c8k.A02;
        C2M c2m = c8k.A05;
        if (A0F[7].charAt(26) != 'a') {
            String[] strArr2 = A0F;
            strArr2[0] = "pS0yYjaDPNGuTrfnUmeGhxtdEtLadoEJ";
            strArr2[6] = "mwC7eMAbLdHre0yQkkMBVztsNAF33a9m";
            linearLayout2.addView(c2m);
            OV ov = c8k.A06;
            if (ov != null) {
                LinearLayout linearLayout3 = c8k.A02;
                String[] strArr3 = A0F;
                String str3 = strArr3[5];
                String str4 = strArr3[4];
                int iCharAt = str3.charAt(16);
                int width4 = str4.charAt(16);
                if (iCharAt == width4) {
                    throw new RuntimeException();
                }
                A0F[3] = "7ZjVpxQcOo2BFfYt51qxyVC8jdlns0bj";
                linearLayout3.addView(ov);
            }
            boolean zA1I = JR.A1I(c8k.A0C);
            String[] strArr4 = A0F;
            String str5 = strArr4[0];
            String str6 = strArr4[6];
            int iCharAt2 = str5.charAt(22);
            int width5 = str6.charAt(22);
            if (iCharAt2 == width5) {
                A0F[3] = "nKvQ299cRrmi8SltfoUYXILZ1CbfqCSq";
                if (zA1I) {
                    c8k.A0C.A09().AFP(c8k.A05, ((TW) c8k).A08.A0U(), false);
                }
            } else if (zA1I) {
                c8k.A0C.A09().AFP(c8k.A05, ((TW) c8k).A08.A0U(), false);
            }
            c8k.A0U(c8k.A02, false, i);
            return;
        }
        throw new RuntimeException();
    }

    private void A0C(C1328dJ c1328dJ) {
        this.A03 = c1328dJ;
        this.A0A = this.A03.A0U();
        this.A00 = this.A03.A0H();
        this.A01 = this.A03.A0I();
        List<C1B> listA0c = this.A03.A0c();
        this.A0B = new ArrayList(listA0c.size());
        for (int i = 0; i < listA0c.size(); i++) {
            this.A0B.add(new C0847Pa(i, listA0c.size(), listA0c.get(i)));
        }
    }

    private void A0D(SB sb) {
        new FA().A0G(this.A05);
        sb.A0Z(new S0(this));
        this.A06 = new OV(this.A0C, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.TW
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0786Mr
    public final void A8n(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        C1328dJ c1328dJ = (C1328dJ) intent.getSerializableExtra(A07(0, 14, 93));
        A0V(anonymousClass59);
        A0C(c1328dJ);
        A0B(anonymousClass59.A0H().getResources().getConfiguration().orientation, bundle);
        anonymousClass59.A0K(new C0924Rz(this, anonymousClass59));
        int iA03 = super.A08.A0O().A0D().A03();
        if (iA03 > 0) {
            A0T(iA03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW, com.facebook.ads.redexgen.X.InterfaceC0786Mr
    public final void ABj(boolean z) {
        super.ABj(z);
        SB sb = this.A07;
        if (sb != null) {
            sb.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW, com.facebook.ads.redexgen.X.InterfaceC0786Mr
    public final void AC8(boolean z) {
        super.AC8(z);
        this.A07.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0786Mr
    public final void AEI(Bundle bundle) {
        SB sb = this.A07;
        if (sb != null) {
            sb.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.TW
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        AEI(bundle);
        A0A();
        A0B(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.TW, com.facebook.ads.redexgen.X.InterfaceC0786Mr
    public final void onDestroy() {
        super.onDestroy();
        if (JR.A1I(this.A0C)) {
            this.A0C.A09().AFF(this.A05);
        }
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0A.A8v(this.A0A, new OG().A03(this.A09).A02(this.A0D).A05());
        }
        A0A();
        this.A09.A0V();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0D.A06(this.A0C, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
