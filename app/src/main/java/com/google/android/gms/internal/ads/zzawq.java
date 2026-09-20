package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(19)
public abstract class zzawq extends zzasc {
    public static final byte[] P = zzban.zzp("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    public ByteBuffer[] A;
    public ByteBuffer[] B;
    public long C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public zzaum O;
    public final zzaws i;
    public final zzaun j;
    public final zzaun k;
    public final zzast l;
    public final ArrayList m;
    public final MediaCodec.BufferInfo n;
    public zzass o;
    public MediaCodec p;
    public zzawo q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public zzawq(int i, zzaws zzawsVar, zzaus zzausVar, boolean z) {
        super(i);
        zzazy.zze(zzban.zza >= 16);
        this.i = zzawsVar;
        this.j = new zzaun(0);
        this.k = new zzaun(0);
        this.l = new zzast();
        this.m = new ArrayList();
        this.n = new MediaCodec.BufferInfo();
        this.H = 0;
        this.I = 0;
    }

    private final void i() {
        if (this.I == 2) {
            s();
            q();
        } else {
            this.M = true;
            o();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public void b() {
        this.o = null;
        s();
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public void c(boolean z) {
        this.O = new zzaum();
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public void d(long j, boolean z) {
        this.L = false;
        this.M = false;
        if (this.p != null) {
            this.C = -9223372036854775807L;
            this.D = -1;
            this.E = -1;
            this.N = true;
            this.F = false;
            this.m.clear();
            this.y = false;
            this.z = false;
            if (this.s || ((this.v && this.K) || this.I != 0)) {
                s();
                q();
            } else {
                this.p.flush();
                this.J = false;
            }
            if (!this.G || this.o == null) {
                return;
            }
            this.H = 1;
        }
    }

    public abstract int h(zzass zzassVar);

    public zzawo j(zzass zzassVar) {
        return zzaxa.zzc(zzassVar.zzf, false);
    }

    public abstract void k(zzawo zzawoVar, MediaCodec mediaCodec, zzass zzassVar);

    public void l(String str, long j, long j2) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    public void m(zzass zzassVar) {
        boolean z;
        zzass zzassVar2 = this.o;
        this.o = zzassVar;
        if (!zzban.zzo(zzassVar.zzi, zzassVar2 == null ? null : zzassVar2.zzi) && this.o.zzi != null) {
            throw zzase.zza(new IllegalStateException("Media requires a DrmSessionManager"), this.c);
        }
        if (this.p == null || !t(this.q.zzb, zzassVar2, this.o)) {
            if (this.J) {
                this.I = 1;
                return;
            } else {
                s();
                q();
                return;
            }
        }
        this.G = true;
        this.H = 1;
        if (this.t) {
            zzass zzassVar3 = this.o;
            z = zzassVar3.zzj == zzassVar2.zzj && zzassVar3.zzk == zzassVar2.zzk;
        }
        this.y = z;
    }

    public void n(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        throw null;
    }

    public void o() {
    }

    public abstract boolean p(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, long j3, boolean z);

    /* JADX WARN: Code duplicated, block: B:60:0x00d9  */
    public final void q() {
        zzass zzassVar;
        boolean z;
        if (this.p != null || (zzassVar = this.o) == null) {
            return;
        }
        zzawo zzawoVarJ = this.q;
        if (zzawoVarJ == null) {
            try {
                zzawoVarJ = j(zzassVar);
                this.q = zzawoVarJ;
                if (zzawoVarJ == null) {
                    throw zzase.zza(new zzawp(this.o, (Throwable) null, false, -49999), this.c);
                }
            } catch (zzawv e) {
                throw zzase.zza(new zzawp(this.o, (Throwable) e, false, -49998), this.c);
            }
        }
        if (u(zzawoVarJ)) {
            String str = this.q.zza;
            zzass zzassVar2 = this.o;
            int i = zzban.zza;
            this.r = i < 21 && zzassVar2.zzh.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.s = i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && zzban.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            if (i >= 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                z = false;
            } else {
                String str2 = zzban.zzb;
                if ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            this.t = z;
            this.u = i <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
            this.v = (i <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (i <= 19 && "hb2000".equals(zzban.zzb) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
            this.w = i == 21 && "OMX.google.aac.decoder".equals(str);
            this.x = i <= 18 && this.o.zzr == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                zzbal.zza("createCodec:" + str);
                this.p = MediaCodec.createByCodecName(str);
                zzbal.zzb();
                zzbal.zza("configureCodec");
                k(this.q, this.p, this.o);
                zzbal.zzb();
                zzbal.zza("startCodec");
                this.p.start();
                zzbal.zzb();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                l(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                this.A = this.p.getInputBuffers();
                this.B = this.p.getOutputBuffers();
                this.C = zzb() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                this.D = -1;
                this.E = -1;
                this.N = true;
                this.O.zza++;
            } catch (Exception e2) {
                throw zzase.zza(new zzawp(this.o, (Throwable) e2, false, str), this.c);
            }
        }
    }

    public void r() {
    }

    public void s() {
        this.C = -9223372036854775807L;
        this.D = -1;
        this.E = -1;
        this.F = false;
        this.m.clear();
        this.A = null;
        this.B = null;
        this.q = null;
        this.G = false;
        this.J = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.K = false;
        this.H = 0;
        this.I = 0;
        this.j.zzb = null;
        MediaCodec mediaCodec = this.p;
        if (mediaCodec != null) {
            this.O.zzb++;
            try {
                mediaCodec.stop();
                try {
                    this.p.release();
                } finally {
                    this.p = null;
                }
            } catch (Throwable th) {
                try {
                    this.p.release();
                    throw th;
                } finally {
                    this.p = null;
                }
            }
        }
    }

    public boolean t(boolean z, zzass zzassVar, zzass zzassVar2) {
        return false;
    }

    public boolean u(zzawo zzawoVar) {
        return true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9371. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzD(long r34, long r36) {
        /*
            Method dump skipped, instruction units count: 937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawq.zzD(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public boolean zzE() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public boolean zzF() {
        if (this.o == null) {
            return false;
        }
        if ((this.g ? this.h : this.e.zze()) || this.E >= 0) {
            return true;
        }
        return this.C != -9223372036854775807L && SystemClock.elapsedRealtime() < this.C;
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public final int zzG(zzass zzassVar) throws zzase {
        try {
            return h(zzassVar);
        } catch (zzawv e) {
            throw zzase.zza(e, this.c);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasc, com.google.android.gms.internal.ads.zzasy
    public final int zze() {
        return 4;
    }
}
