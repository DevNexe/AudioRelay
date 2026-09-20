package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0575Ed {
    public final int A00;
    public final long A01;

    public C0575Ed(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C0575Ed(int i, long j, C0574Ec c0574Ec) {
        this(i, j);
    }

    public static C0575Ed A00(Parcel parcel) {
        return new C0575Ed(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
