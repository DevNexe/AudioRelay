package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0636Gq {
    public C0630Gk A00;
    public C0632Gm A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C0634Go> A08 = new SparseArray<>();
    public final SparseArray<C0629Gj> A06 = new SparseArray<>();
    public final SparseArray<C0631Gl> A07 = new SparseArray<>();
    public final SparseArray<C0629Gj> A04 = new SparseArray<>();
    public final SparseArray<C0631Gl> A05 = new SparseArray<>();

    public C0636Gq(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
