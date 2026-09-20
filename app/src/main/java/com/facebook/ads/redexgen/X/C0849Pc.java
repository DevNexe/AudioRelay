package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0849Pc extends FrameLayout {
    public static final int A08 = (int) (Lr.A00 * 16.0f);
    public C0492Aj A00;

    @Nullable
    public C0870Px A01;

    @Nullable
    public AnonymousClass89 A02;
    public KS A03;
    public C04267m A04;
    public C04076p A05;
    public final C1075Xy A06;
    public final C0711Jp A07;

    public C0849Pc(C1075Xy c1075Xy, C0711Jp c0711Jp) {
        super(c1075Xy);
        this.A07 = c0711Jp;
        this.A06 = c1075Xy;
        setUpView(c1075Xy);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        C0870Px c0870Px = this.A01;
        if (c0870Px != null) {
            c0870Px.A0A();
            this.A01 = null;
        }
        AnonymousClass89 anonymousClass89 = this.A02;
        if (anonymousClass89 != null) {
            anonymousClass89.A0g();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC04609c abstractC04609c) {
        this.A00.getEventBus().A05(abstractC04609c);
    }

    public final void A04(InterfaceC0703Jh interfaceC0703Jh, String str, Map<String, String> extraParams) {
        A02();
        this.A02 = new AnonymousClass89(this.A06, interfaceC0703Jh, this.A00, str, extraParams);
        if (JR.A1J(this.A06)) {
            this.A01 = new C0870Px(this.A06, interfaceC0703Jh, this.A00, str, extraParams);
        } else {
            this.A01 = null;
        }
    }

    public final void A05(Q6 q6) {
        this.A00.A0b(q6, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public QK getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(C1075Xy c1075Xy) {
        this.A00.A0X();
        this.A04 = new C04267m(c1075Xy);
        this.A00.A0c(this.A04);
        this.A03 = new KS(c1075Xy, this.A07);
        this.A00.A0c(new C04327u(c1075Xy));
        this.A00.A0c(this.A03);
        this.A05 = new C04076p(c1075Xy, true, this.A07);
        this.A00.A0c(this.A05);
        this.A00.A0c(new KT(this.A05, QJ.A03, true, true));
        if (!this.A00.A0g() && !JR.A21(c1075Xy)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i = A08;
        layoutParams.setMargins(i, i, i, i);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(C1075Xy c1075Xy) {
        this.A00 = new C0492Aj(c1075Xy);
        this.A00.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        MS.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new ViewOnClickListenerC0848Pb(this));
    }

    private void setUpView(C1075Xy c1075Xy) {
        setUpVideo(c1075Xy);
        setUpPlugins(c1075Xy);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.A00.setVolume(f);
        this.A03.A09();
    }
}
