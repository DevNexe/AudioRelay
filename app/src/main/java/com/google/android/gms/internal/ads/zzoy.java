package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import defpackage.e87;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzoy extends zzqo implements zzjg {
    public final Context V0;
    public final zznp W0;
    public final zznw X0;
    public int Y0;
    public boolean Z0;
    public zzaf a1;
    public long b1;
    public boolean c1;
    public boolean d1;
    public boolean e1;
    public zzjx f1;

    public zzoy(Context context, zzqi zzqiVar, zzqq zzqqVar, boolean z, Handler handler, zznq zznqVar, zznw zznwVar) {
        super(1, zzqiVar, zzqqVar, false, 44100.0f);
        this.V0 = context.getApplicationContext();
        this.X0 = zznwVar;
        this.W0 = new zznp(handler, zznqVar);
        zznwVar.zzn(new e87(this));
    }

    public static zzfuv R(zzaf zzafVar, zznw zznwVar) {
        zzql zzqlVarZzd;
        String str = zzafVar.zzm;
        if (str == null) {
            return zzfuv.zzo();
        }
        if (zznwVar.zzv(zzafVar) && (zzqlVarZzd = zzrd.zzd()) != null) {
            return zzfuv.zzp(zzqlVarZzd);
        }
        List listZzf = zzrd.zzf(str, false, false);
        String strZze = zzrd.zze(zzafVar);
        if (strZze == null) {
            return zzfuv.zzm(listZzf);
        }
        List listZzf2 = zzrd.zzf(strZze, false, false);
        zzfus zzfusVarZzi = zzfuv.zzi();
        zzfusVarZzi.zzf(listZzf);
        zzfusVarZzi.zzf(listZzf2);
        return zzfusVarZzi.zzg();
    }

    private final void S() {
        long jZzb = this.X0.zzb(zzM());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.d1) {
                jZzb = Math.max(this.b1, jZzb);
            }
            this.b1 = jZzb;
            this.d1 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void A() {
        this.X0.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void B(zzgg zzggVar) {
        if (!this.c1 || zzggVar.zzf()) {
            return;
        }
        if (Math.abs(zzggVar.zzd - this.b1) > 500000) {
            this.b1 = zzggVar.zzd;
        }
        this.c1 = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void C() throws zzgy {
        try {
            this.X0.zzi();
        } catch (zznv e) {
            throw b(e.zzc, e, e.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean D(long j, long j2, zzqj zzqjVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar) throws zzgy {
        byteBuffer.getClass();
        if (this.a1 != null && (i2 & 2) != 0) {
            zzqjVar.getClass();
            zzqjVar.zzn(i, false);
            return true;
        }
        zznw zznwVar = this.X0;
        if (z) {
            if (zzqjVar != null) {
                zzqjVar.zzn(i, false);
            }
            this.O0.zzf += i3;
            zznwVar.zzf();
            return true;
        }
        try {
            if (!zznwVar.zzs(byteBuffer, j3, i3)) {
                return false;
            }
            if (zzqjVar != null) {
                zzqjVar.zzn(i, false);
            }
            this.O0.zze += i3;
            return true;
        } catch (zzns e) {
            throw b(e.zzc, e, e.zzb, 5001);
        } catch (zznv e2) {
            throw b(zzafVar, e2, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean E(zzaf zzafVar) {
        return this.X0.zzv(zzafVar);
    }

    public final int Q(zzql zzqlVar, zzaf zzafVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(zzqlVar.zza) || (i = zzel.zza) >= 24 || (i == 23 && zzel.zzX(this.V0))) {
            return zzafVar.zzn;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzgp
    public final void c() {
        zznp zznpVar = this.W0;
        this.e1 = true;
        try {
            this.X0.zze();
            try {
                super.c();
            } finally {
                zznpVar.zze(this.O0);
            }
        } catch (Throwable th) {
            try {
                super.c();
                throw th;
            } finally {
                zznpVar.zze(this.O0);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzgp
    public final void d(boolean z, boolean z2) {
        super.d(z, z2);
        this.W0.zzf(this.O0);
        this.y.getClass();
        zzmz zzmzVar = this.A;
        zzmzVar.getClass();
        this.X0.zzp(zzmzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzgp
    public final void e(long j, boolean z) {
        super.e(j, z);
        this.X0.zze();
        this.b1 = j;
        this.c1 = true;
        this.d1 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzgp
    public final void f() {
        zznw zznwVar = this.X0;
        try {
            super.f();
            if (this.e1) {
            }
        } finally {
            if (this.e1) {
                this.e1 = false;
                zznwVar.zzj();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public final void g() {
        this.X0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public final void h() {
        S();
        this.X0.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final float j(float f, zzaf[] zzafVarArr) {
        int iMax = -1;
        for (zzaf zzafVar : zzafVarArr) {
            int i = zzafVar.zzA;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final int k(zzqq zzqqVar, zzaf zzafVar) {
        boolean z;
        if (!zzbt.zzg(zzafVar.zzm)) {
            return 128;
        }
        int i = zzel.zza >= 21 ? 32 : 0;
        int i2 = zzafVar.zzF;
        boolean z2 = i2 == 0;
        zznw zznwVar = this.X0;
        if (z2 && zznwVar.zzv(zzafVar) && (i2 == 0 || zzrd.zzd() != null)) {
            return i | 140;
        }
        if (("audio/raw".equals(zzafVar.zzm) && !zznwVar.zzv(zzafVar)) || !zznwVar.zzv(zzel.zzF(2, zzafVar.zzz, zzafVar.zzA))) {
            return 129;
        }
        zzfuv zzfuvVarR = R(zzafVar, zznwVar);
        if (zzfuvVarR.isEmpty()) {
            return 129;
        }
        if (!z2) {
            return 130;
        }
        zzql zzqlVar = (zzql) zzfuvVarR.get(0);
        boolean zZzd = zzqlVar.zzd(zzafVar);
        if (!zZzd) {
            int i3 = 1;
            while (true) {
                if (i3 >= zzfuvVarR.size()) {
                    z = true;
                    break;
                }
                zzql zzqlVar2 = (zzql) zzfuvVarR.get(i3);
                if (zzqlVar2.zzd(zzafVar)) {
                    zzqlVar = zzqlVar2;
                    z = false;
                    zZzd = true;
                    break;
                }
                i3++;
            }
        } else {
            z = true;
            break;
        }
        int i4 = true != zZzd ? 3 : 4;
        int i5 = (zZzd && zzqlVar.zze(zzafVar)) ? 16 : 8;
        return i | i5 | i4 | (true != zzqlVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzgr l(zzql zzqlVar, zzaf zzafVar, zzaf zzafVar2) {
        int i;
        int i2;
        zzgr zzgrVarZzb = zzqlVar.zzb(zzafVar, zzafVar2);
        int i3 = zzgrVarZzb.zze;
        if (Q(zzqlVar, zzafVar2) > this.Y0) {
            i3 |= 64;
        }
        String str = zzqlVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzgrVarZzb.zzd;
            i2 = 0;
        }
        return new zzgr(str, zzafVar, zzafVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzgr m(zzje zzjeVar) {
        zzgr zzgrVarM = super.m(zzjeVar);
        this.W0.zzg(zzjeVar.zza, zzgrVarM);
        return zzgrVarM;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzqh p(zzql zzqlVar, zzaf zzafVar, float f) {
        boolean z;
        zzaf[] zzafVarArr = this.D;
        zzafVarArr.getClass();
        int iQ = Q(zzqlVar, zzafVar);
        if (zzafVarArr.length != 1) {
            for (zzaf zzafVar2 : zzafVarArr) {
                if (zzqlVar.zzb(zzafVar, zzafVar2).zzd != 0) {
                    iQ = Math.max(iQ, Q(zzqlVar, zzafVar2));
                }
            }
        }
        this.Y0 = iQ;
        String str = zzqlVar.zza;
        int i = zzel.zza;
        if (i < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(zzel.zzc)) {
            String str2 = zzel.zzb;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.Z0 = z;
        String str3 = zzqlVar.zzc;
        int i2 = this.Y0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", zzafVar.zzz);
        mediaFormat.setInteger("sample-rate", zzafVar.zzA);
        zzdw.zzb(mediaFormat, zzafVar.zzo);
        zzdw.zza(mediaFormat, "max-input-size", i2);
        if (i >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                if (i == 23) {
                    String str4 = zzel.zzd;
                    if (!"ZTE B2017G".equals(str4) && !"AXON 7 mini".equals(str4)) {
                        mediaFormat.setFloat("operating-rate", f);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f);
                }
            }
        }
        if (i <= 28 && "audio/ac4".equals(zzafVar.zzm)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i >= 24) {
            if (this.X0.zza(zzel.zzF(4, zzafVar.zzz, zzafVar.zzA)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.a1 = (!"audio/raw".equals(zzqlVar.zzb) || "audio/raw".equals(zzafVar.zzm)) ? null : zzafVar;
        return zzqh.zza(zzqlVar, mediaFormat, zzafVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final List q(zzqq zzqqVar, zzaf zzafVar) {
        return zzrd.zzg(R(zzafVar, this.X0), zzafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void r(Exception exc) {
        zzdu.zza("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.W0.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void s(String str, long j, long j2) {
        this.W0.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void t(String str) {
        this.W0.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void y(zzaf zzafVar, MediaFormat mediaFormat) throws zzgy {
        int iZzn;
        int i;
        zzaf zzafVar2 = this.a1;
        int[] iArr = null;
        if (zzafVar2 != null) {
            zzafVar = zzafVar2;
        } else if (this.a0 != null) {
            if ("audio/raw".equals(zzafVar.zzm)) {
                iZzn = zzafVar.zzB;
            } else if (zzel.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iZzn = mediaFormat.containsKey("v-bits-per-sample") ? zzel.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iZzn = mediaFormat.getInteger("pcm-encoding");
            }
            zzad zzadVar = new zzad();
            zzadVar.zzS("audio/raw");
            zzadVar.zzN(iZzn);
            zzadVar.zzC(zzafVar.zzC);
            zzadVar.zzD(zzafVar.zzD);
            zzadVar.zzw(mediaFormat.getInteger("channel-count"));
            zzadVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzaf zzafVarZzY = zzadVar.zzY();
            if (this.Z0 && zzafVarZzY.zzz == 6 && (i = zzafVar.zzz) < 6) {
                int[] iArr2 = new int[i];
                for (int i2 = 0; i2 < zzafVar.zzz; i2++) {
                    iArr2[i2] = i2;
                }
                iArr = iArr2;
            }
            zzafVar = zzafVarZzY;
        }
        try {
            this.X0.zzd(zzafVar, 0, iArr);
        } catch (zznr e) {
            throw b(e.zza, e, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjy, com.google.android.gms.internal.ads.zzjz
    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzjy
    public final boolean zzM() {
        return super.zzM() && this.X0.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzjy
    public final boolean zzN() {
        return this.X0.zzt() || super.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final long zza() {
        if (zzbe() == 2) {
            S();
        }
        return this.b1;
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final zzby zzc() {
        return this.X0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final void zzg(zzby zzbyVar) {
        this.X0.zzo(zzbyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzjy
    public final zzjg zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzju
    public final void zzp(int i, Object obj) {
        zznw zznwVar = this.X0;
        if (i == 2) {
            zznwVar.zzr(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            zznwVar.zzk((zzk) obj);
            return;
        }
        if (i == 6) {
            zznwVar.zzm((zzl) obj);
            return;
        }
        switch (i) {
            case 9:
                zznwVar.zzq(((Boolean) obj).booleanValue());
                break;
            case 10:
                zznwVar.zzl(((Integer) obj).intValue());
                break;
            case 11:
                this.f1 = (zzjx) obj;
                break;
        }
    }
}
