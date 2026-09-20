package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0829Oi {

    @Nullable
    public View A02;

    @Nullable
    public UB A03;

    @Nullable
    public AbstractC0784Mp A04;

    @Nullable
    public C0693Ix A05;

    @Nullable
    public final View A06;
    public final AnonymousClass18 A07;
    public final C1075Xy A08;
    public final InterfaceC0703Jh A09;
    public final MK A0A;
    public final InterfaceC0785Mq A0B;
    public final C0895Qw A0C;
    public int A01 = 0;
    public int A00 = 1;

    public C0829Oi(C1075Xy c1075Xy, InterfaceC0703Jh interfaceC0703Jh, InterfaceC0785Mq interfaceC0785Mq, AnonymousClass18 anonymousClass18, @Nullable View view, C0895Qw c0895Qw, MK mk) {
        this.A08 = c1075Xy;
        this.A09 = interfaceC0703Jh;
        this.A0B = interfaceC0785Mq;
        this.A07 = anonymousClass18;
        this.A06 = view;
        this.A0C = c0895Qw;
        this.A0A = mk;
    }

    public final C0829Oi A0D(int i) {
        this.A00 = i;
        return this;
    }

    public final C0829Oi A0E(int i) {
        this.A01 = i;
        return this;
    }

    public final C0829Oi A0F(View view) {
        this.A02 = view;
        return this;
    }

    public final C0829Oi A0G(UB ub) {
        this.A03 = ub;
        return this;
    }

    public final C0829Oi A0H(AbstractC0784Mp abstractC0784Mp) {
        this.A04 = abstractC0784Mp;
        return this;
    }

    public final C0829Oi A0I(C0693Ix c0693Ix) {
        this.A05 = c0693Ix;
        return this;
    }

    public final C0830Oj A0J() {
        return new C0830Oj(this);
    }
}
