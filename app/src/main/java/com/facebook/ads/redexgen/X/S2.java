package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class S2 extends C4H<C0921Rw> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    @Nullable
    public InterfaceC0785Mq A04;
    public String A05;
    public List<C0847Pa> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass18 A08;
    public final C7U A09;
    public final C1075Xy A0A;
    public final InterfaceC0703Jh A0B;
    public final MK A0C;
    public final SB A0D;
    public final C0895Qw A0E;

    public S2(C1075Xy c1075Xy, List<C0847Pa> list, AnonymousClass18 anonymousClass18, InterfaceC0703Jh interfaceC0703Jh, C7U c7u, C0895Qw c0895Qw, MK mk, InterfaceC0785Mq interfaceC0785Mq, String str, int i, int i2, int i3, int i4, SB sb) {
        this.A0A = c1075Xy;
        this.A0B = interfaceC0703Jh;
        this.A09 = c7u;
        this.A0E = c0895Qw;
        this.A0C = mk;
        this.A04 = interfaceC0785Mq;
        this.A08 = anonymousClass18;
        this.A06 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A05 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0D = sb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0921Rw A06(ViewGroup viewGroup, int i) {
        return new C0921Rw(C0843Ow.A00(new C0829Oi(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0J(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0921Rw c0921Rw, int i) {
        c0921Rw.A0l(this.A06.get(i), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A06.size();
    }
}
