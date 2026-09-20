package defpackage;

import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.AudioTrack$Builder;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzne;
import com.google.android.gms.internal.ads.zzns;

/* JADX INFO: loaded from: classes3.dex */
public final class i77 {
    public final zzaf a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final zzne[] i;

    public i77(zzaf zzafVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, zzne[] zzneVarArr) {
        this.a = zzafVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = zzneVarArr;
    }

    public final AudioTrack a(zzk zzkVar, int i) {
        AudioTrack audioTrack;
        int i2 = this.c;
        try {
            int i3 = zzel.zza;
            int i4 = this.g;
            int i5 = this.f;
            int i6 = this.e;
            if (i3 >= 29) {
                audioTrack = new AudioTrack$Builder().setAudioAttributes(zzkVar.zza().zza).setAudioFormat(new AudioFormat.Builder().setSampleRate(i6).setChannelMask(i5).setEncoding(i4).build()).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(i2 == 1).build();
            } else if (i3 >= 21) {
                audioTrack = new AudioTrack(zzkVar.zza().zza, new AudioFormat.Builder().setSampleRate(i6).setChannelMask(i5).setEncoding(i4).build(), this.h, 1, i);
            } else {
                int i7 = zzkVar.zzc;
                audioTrack = i == 0 ? new AudioTrack(3, this.e, this.f, this.g, this.h, 1) : new AudioTrack(3, this.e, this.f, this.g, this.h, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzns(state, this.e, this.f, this.h, this.a, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzns(0, this.e, this.f, this.h, this.a, i2 == 1, e);
        }
    }
}
