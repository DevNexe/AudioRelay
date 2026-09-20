package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VU extends B1 {
    public static String[] A09 = {"LiVpibqpJatuLGaZNpcVvLbqNHldnUzA", "bX5xO856XIcJE12GDRsOqh2", "ZVG", "hIvfEeguXT", "OzXlbx4H0xP2XpsF07euT", "fU7LOfxMrEgavyMWFPaWlv5y0089z6Uh", "tbzCzUNP5mUbYRUDq8rztMXXiQr3Ary2", "G8Ws4pPS3koy2aZpOP3X3qbhHPqHsp6i"};
    public static final Object A0A = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;

    @Nullable
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public VU(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, @Nullable Object obj) {
        this.A01 = j;
        this.A05 = j2;
        this.A00 = j3;
        this.A03 = j4;
        this.A04 = j5;
        this.A02 = j6;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = obj;
    }

    public VU(long j, long j2, long j3, long j4, boolean z, boolean z2, @Nullable Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public VU(long j, boolean z, boolean z2, @Nullable Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // com.facebook.ads.redexgen.X.B1
    public final int A00() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.B1
    public final int A01() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.B1
    public final int A04(Object obj) {
        return A0A.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.redexgen.X.B1
    public final C0507Az A0A(int i, C0507Az c0507Az, boolean z) {
        IK.A00(i, 0, 1);
        return c0507Az.A0B(null, z ? A0A : null, 0, this.A00, -this.A04);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    @Override // com.facebook.ads.redexgen.X.B1
    public final B0 A0D(int i, B0 b0, boolean z, long j) {
        Object obj;
        IK.A00(i, 0, 1);
        if (z) {
            obj = this.A06;
        } else {
            obj = null;
        }
        long j2 = this.A02;
        boolean z2 = this.A07;
        if (A09[1].length() == 20) {
            throw new RuntimeException();
        }
        A09[1] = "fKWrusBplbW";
        if (z2 && j != 0) {
            long j3 = this.A03;
            if (j3 == -9223372036854775807L) {
                j2 = -9223372036854775807L;
            } else {
                j2 += j;
                if (A09[3].length() == 10) {
                    String[] strArr = A09;
                    strArr[2] = "wVi";
                    strArr[4] = "2OdzkdLKms985VAdE1FhN";
                    if (j2 > j3) {
                        j2 = -9223372036854775807L;
                    }
                } else if (j2 > j3) {
                    j2 = -9223372036854775807L;
                }
            }
        }
        return b0.A04(obj, this.A01, this.A05, this.A08, this.A07, j2, this.A03, 0, 0, this.A04);
    }
}
