package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import defpackage.r06;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(16)
public final class zzaue extends zzawq implements zzbac {
    public final zzato Q;
    public final zzaua R;
    public boolean S;
    public int T;
    public int U;
    public long V;
    public boolean W;

    public zzaue(zzaws zzawsVar, zzaus zzausVar, boolean z, Handler handler, zzatp zzatpVar) {
        super(1, zzawsVar, null, true);
        this.R = new zzaua(null, new zzath[0], new r06(this));
        this.Q = new zzato(handler, zzatpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzawq, com.google.android.gms.internal.ads.zzasc
    public final void b() {
        zzato zzatoVar = this.Q;
        try {
            this.R.zzj();
            try {
                super.b();
            } finally {
                this.O.zza();
                zzatoVar.zze(this.O);
            }
        } catch (Throwable th) {
            try {
                super.b();
                throw th;
            } finally {
                this.O.zza();
                zzatoVar.zze(this.O);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawq, com.google.android.gms.internal.ads.zzasc
    public final void c(boolean z) {
        super.c(z);
        this.Q.zzf(this.O);
        int i = this.b.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzawq, com.google.android.gms.internal.ads.zzasc
    public final void d(long j, boolean z) {
        super.d(j, z);
        this.R.zzk();
        this.V = j;
        this.W = true;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void e() {
        this.R.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void f() {
        this.R.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final int h(zzass zzassVar) {
        int i;
        int i2;
        String str = zzassVar.zzf;
        if (!zzbad.zza(str)) {
            return 0;
        }
        int i3 = zzban.zza;
        int i4 = i3 >= 21 ? 16 : 0;
        zzawo zzawoVarZzc = zzaxa.zzc(str, false);
        if (zzawoVarZzc == null) {
            return 1;
        }
        return ((i3 < 21 || (((i = zzassVar.zzs) == -1 || zzawoVarZzc.zzd(i)) && ((i2 = zzassVar.zzr) == -1 || zzawoVarZzc.zzc(i2)))) ? 3 : 2) | i4 | 4;
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final zzawo j(zzass zzassVar) {
        return zzaxa.zzc(zzassVar.zzf, false);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    @Override // com.google.android.gms.internal.ads.zzawq
    public final void k(zzawo zzawoVar, MediaCodec mediaCodec, zzass zzassVar) {
        boolean z;
        String str = zzawoVar.zza;
        if (zzban.zza < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(zzban.zzc)) {
            String str2 = zzban.zzb;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.S = z;
        mediaCodec.configure(zzassVar.zzb(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final void l(String str, long j, long j2) {
        this.Q.zzd(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final void m(zzass zzassVar) {
        super.m(zzassVar);
        this.Q.zzg(zzassVar);
        this.T = "audio/raw".equals(zzassVar.zzf) ? zzassVar.zzt : 2;
        this.U = zzassVar.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final void n(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzase {
        int i;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.S && integer == 6) {
            int i2 = this.U;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.U; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        } else {
            i = integer;
            iArr = null;
        }
        try {
            this.R.zze("audio/raw", i, integer2, this.T, 0, iArr);
        } catch (zzatu e) {
            throw zzase.zza(e, this.c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final void o() throws zzase {
        try {
            this.R.zzi();
        } catch (zzatz e) {
            throw zzase.zza(e, this.c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawq
    public final boolean p(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, long j3, boolean z) throws zzase {
        zzaua zzauaVar = this.R;
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.O.zze++;
            zzauaVar.zzf();
            return true;
        }
        try {
            if (!zzauaVar.zzm(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.O.zzd++;
            return true;
        } catch (zzatv | zzatz e) {
            throw zzase.zza(e, this.c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawq, com.google.android.gms.internal.ads.zzasx
    public final boolean zzE() {
        return super.zzE() && this.R.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzawq, com.google.android.gms.internal.ads.zzasx
    public final boolean zzF() {
        return this.R.zzn() || super.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbac
    public final long zzI() {
        long jZza = this.R.zza(zzE());
        if (jZza != Long.MIN_VALUE) {
            if (!this.W) {
                jZza = Math.max(this.V, jZza);
            }
            this.V = jZza;
            this.W = false;
        }
        return this.V;
    }

    @Override // com.google.android.gms.internal.ads.zzbac
    public final zzasw zzJ() {
        return this.R.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbac
    public final zzasw zzK(zzasw zzaswVar) {
        return this.R.zzd(zzaswVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasc, com.google.android.gms.internal.ads.zzasx
    public final zzbac zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzasc, com.google.android.gms.internal.ads.zzasg
    public final void zzl(int i, Object obj) {
        if (i != 2) {
            return;
        }
        this.R.zzl(((Float) obj).floatValue());
    }
}
