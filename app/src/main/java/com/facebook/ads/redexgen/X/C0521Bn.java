package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0521Bn extends VE {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final HZ A0A;
    public final IN A0B;

    public C0521Bn(TrackGroup trackGroup, int[] iArr, HZ hz, long j, long j2, long j3, float f, float f2, long j4, IN in) {
        super(trackGroup, iArr);
        this.A0A = hz;
        this.A07 = j * 1000;
        this.A06 = j2 * 1000;
        this.A08 = 1000 * j3;
        this.A04 = f;
        this.A05 = f2;
        this.A09 = j4;
        this.A0B = in;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    private int A00(long j) {
        long jA5n = (long) (this.A0A.A5n() * this.A04);
        int i = 0;
        for (int i2 = 0; i2 < i; i2++) {
            if (j == Long.MIN_VALUE || !A00(i2, j)) {
                int i3 = A6h(i2).A04;
                if (Math.round(i3 * this.A00) <= jA5n) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.VE, com.facebook.ads.redexgen.X.HQ
    public final void A59() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final int A7Q() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.VE, com.facebook.ads.redexgen.X.HQ
    public final void ABp(float f) {
        this.A00 = f;
    }
}
