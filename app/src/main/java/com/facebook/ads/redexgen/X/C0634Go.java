package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0634Go {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<C0635Gp> A09;
    public final boolean A0A;

    public C0634Go(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C0635Gp> sparseArray) {
        this.A03 = i;
        this.A0A = z;
        this.A08 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A01 = i5;
        this.A00 = i6;
        this.A07 = i7;
        this.A06 = i8;
        this.A05 = i9;
        this.A09 = sparseArray;
    }

    public final void A00(C0634Go c0634Go) {
        if (c0634Go == null) {
            return;
        }
        SparseArray<C0635Gp> sparseArray = c0634Go.A09;
        for (int i = 0; i < sparseArray.size(); i++) {
            this.A09.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }
}
