package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TC extends C4H<S3> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC0785Mq A03;
    public C0895Qw A04;
    public String A05;
    public List<C0847Pa> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C7U A09;
    public final C1075Xy A0A;
    public final InterfaceC0703Jh A0B;
    public final UB A0C;
    public final MK A0D;
    public final AI A0E;
    public final C0693Ix A0F;

    public TC(C1075Xy c1075Xy, List<C0847Pa> list, AnonymousClass18 anonymousClass18, InterfaceC0703Jh interfaceC0703Jh, UB ub, InterfaceC0785Mq interfaceC0785Mq, String str, AI ai, @Nullable C0693Ix c0693Ix) {
        this.A0A = c1075Xy;
        this.A0B = interfaceC0703Jh;
        this.A0C = ub;
        this.A09 = ub.A10();
        this.A04 = ub.A1A();
        this.A0D = ub.A19();
        this.A03 = interfaceC0785Mq;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A05 = str;
        this.A0E = ai;
        this.A0F = c0693Ix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final S3 A06(ViewGroup viewGroup, int i) {
        return new S3(OO.A00(new C0829Oi(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0I(this.A0F).A0G(this.A0C).A0J(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(S3 s3, int i) {
        C0847Pa c0847Pa = this.A06.get(i);
        s3.A0m(this.A04);
        s3.A0l(c0847Pa, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i, int i2, int i3) {
        boolean z = i != this.A00;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        if (z) {
            A07();
        }
    }

    public final void A0G(C0895Qw c0895Qw) {
        this.A04 = c0895Qw;
    }
}
