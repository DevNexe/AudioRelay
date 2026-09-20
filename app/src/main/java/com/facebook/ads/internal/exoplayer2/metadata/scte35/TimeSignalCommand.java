package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0679Ij;
import com.facebook.ads.redexgen.X.C0691Iv;
import com.facebook.ads.redexgen.X.Ef;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Ef();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, Ef ef) {
        this(j, j2);
    }

    public static long A00(C0679Ij c0679Ij, long j) {
        long jA0E = c0679Ij.A0E();
        if ((128 & jA0E) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & jA0E;
        return (((ptsTime << 32) | c0679Ij.A0M()) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(C0679Ij c0679Ij, long j, C0691Iv c0691Iv) {
        long jA00 = A00(c0679Ij, j);
        return new TimeSignalCommand(jA00, c0691Iv.A07(jA00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
