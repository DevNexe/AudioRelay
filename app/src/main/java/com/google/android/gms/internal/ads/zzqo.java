package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import defpackage.u97;
import defpackage.v97;
import defpackage.x97;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzqo extends zzgp {
    public static final byte[] U0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public final zzqi I;
    public boolean I0;
    public final zzqq J;
    public long J0;
    public final float K;
    public long K0;
    public final zzgg L;
    public boolean L0;
    public final zzgg M;
    public boolean M0;
    public final zzgg N;
    public boolean N0;
    public final u97 O;
    public zzgq O0;
    public final zzei P;
    public long P0;
    public final ArrayList Q;
    public long Q0;
    public final MediaCodec.BufferInfo R;
    public int R0;
    public final long[] S;
    public zzpp S0;
    public final long[] T;
    public zzpp T0;
    public final long[] U;
    public zzaf V;
    public zzaf W;
    public final long X;
    public float Y;
    public float Z;
    public zzqj a0;
    public zzaf b0;
    public MediaFormat c0;
    public boolean d0;
    public float e0;
    public ArrayDeque f0;
    public zzqn g0;
    public zzql h0;
    public int i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public v97 s0;
    public long t0;
    public int u0;
    public int v0;
    public ByteBuffer w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public zzqo(int i, zzqi zzqiVar, zzqq zzqqVar, boolean z, float f) {
        super(i);
        this.I = zzqiVar;
        zzqqVar.getClass();
        this.J = zzqqVar;
        this.K = f;
        this.L = new zzgg(0, 0);
        this.M = new zzgg(0, 0);
        this.N = new zzgg(2, 0);
        u97 u97Var = new u97();
        this.O = u97Var;
        this.P = new zzei(10);
        this.Q = new ArrayList();
        this.R = new MediaCodec.BufferInfo();
        this.Y = 1.0f;
        this.Z = 1.0f;
        this.X = -9223372036854775807L;
        this.S = new long[10];
        this.T = new long[10];
        this.U = new long[10];
        this.P0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        u97Var.zzi(0);
        u97Var.zzb.order(ByteOrder.nativeOrder());
        this.e0 = -1.0f;
        this.i0 = 0;
        this.D0 = 0;
        this.u0 = -1;
        this.v0 = -1;
        this.t0 = -9223372036854775807L;
        this.J0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        this.E0 = 0;
        this.F0 = 0;
    }

    private final void z() {
        try {
            this.a0.zzi();
        } finally {
            K();
        }
    }

    public void A() {
    }

    public void B(zzgg zzggVar) {
        throw null;
    }

    public void C() {
    }

    public abstract boolean D(long j, long j2, zzqj zzqjVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzafVar);

    public boolean E(zzaf zzafVar) {
        return false;
    }

    public zzqk F(IllegalStateException illegalStateException, zzql zzqlVar) {
        return new zzqk(illegalStateException, zzqlVar);
    }

    public void G(zzgg zzggVar) {
    }

    public final void H() {
        zzaf zzafVar;
        if (this.a0 != null || this.z0 || (zzafVar = this.V) == null) {
            return;
        }
        if (this.T0 == null && E(zzafVar)) {
            zzaf zzafVar2 = this.V;
            n();
            String str = zzafVar2.zzm;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            u97 u97Var = this.O;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                u97Var.e = 32;
            } else {
                u97Var.e = 1;
            }
            this.z0 = true;
            return;
        }
        zzpp zzppVar = this.T0;
        this.S0 = zzppVar;
        zzaf zzafVar3 = this.V;
        String str2 = zzafVar3.zzm;
        if (zzppVar != null && zzpq.zza) {
            zzpg zzpgVarZza = zzppVar.zza();
            throw b(this.V, zzpgVarZza, false, zzpgVarZza.zza);
        }
        try {
            if (this.f0 == null) {
                try {
                    List listQ = q(this.J, zzafVar3);
                    listQ.isEmpty();
                    this.f0 = new ArrayDeque();
                    if (!listQ.isEmpty()) {
                        this.f0.add((zzql) listQ.get(0));
                    }
                    this.g0 = null;
                } catch (zzqx e) {
                    throw new zzqn(this.V, (Throwable) e, false, -49998);
                }
            }
            if (this.f0.isEmpty()) {
                throw new zzqn(this.V, (Throwable) null, false, -49999);
            }
            zzql zzqlVar = (zzql) this.f0.peekFirst();
            while (this.a0 == null) {
                zzql zzqlVar2 = (zzql) this.f0.peekFirst();
                if (!N(zzqlVar2)) {
                    return;
                }
                try {
                    O(zzqlVar2);
                } catch (Exception e2) {
                    if (zzqlVar2 != zzqlVar) {
                        throw e2;
                    }
                    try {
                        Log.w("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        O(zzqlVar2);
                    } catch (Exception e3) {
                        zzdu.zzb("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(zzqlVar2)), e3);
                        this.f0.removeFirst();
                        zzqn zzqnVar = new zzqn(this.V, (Throwable) e3, false, zzqlVar2);
                        r(zzqnVar);
                        zzqn zzqnVar2 = this.g0;
                        if (zzqnVar2 == null) {
                            this.g0 = zzqnVar;
                        } else {
                            this.g0 = new zzqn(zzqnVar2.getMessage(), zzqnVar2.getCause(), zzqnVar2.zza, zzqnVar2.zzc, zzqnVar2.zzd, zzqnVar);
                        }
                        if (this.f0.isEmpty()) {
                            throw this.g0;
                        }
                    }
                }
            }
            this.f0 = null;
        } catch (zzqn e4) {
            throw b(this.V, e4, false, 4001);
        }
    }

    public void I(long j) {
        while (true) {
            int i = this.R0;
            if (i == 0) {
                return;
            }
            long[] jArr = this.U;
            if (j < jArr[0]) {
                return;
            }
            long[] jArr2 = this.S;
            this.P0 = jArr2[0];
            long[] jArr3 = this.T;
            this.Q0 = jArr3[0];
            int i2 = i - 1;
            this.R0 = i2;
            System.arraycopy(jArr2, 1, jArr2, 0, i2);
            System.arraycopy(jArr3, 1, jArr3, 0, this.R0);
            System.arraycopy(jArr, 1, jArr, 0, this.R0);
            A();
        }
    }

    public final void J() {
        try {
            zzqj zzqjVar = this.a0;
            if (zzqjVar != null) {
                zzqjVar.zzl();
                this.O0.zzb++;
                t(this.h0.zza);
            }
        } finally {
            this.a0 = null;
            this.S0 = null;
            L();
        }
    }

    public void K() {
        this.u0 = -1;
        this.M.zzb = null;
        this.v0 = -1;
        this.w0 = null;
        this.t0 = -9223372036854775807L;
        this.H0 = false;
        this.G0 = false;
        this.p0 = false;
        this.q0 = false;
        this.x0 = false;
        this.y0 = false;
        this.Q.clear();
        this.J0 = -9223372036854775807L;
        this.K0 = -9223372036854775807L;
        v97 v97Var = this.s0;
        if (v97Var != null) {
            v97Var.a = 0L;
            v97Var.b = 0L;
            v97Var.c = false;
        }
        this.E0 = 0;
        this.F0 = 0;
        this.D0 = this.C0 ? 1 : 0;
    }

    public final void L() {
        K();
        this.s0 = null;
        this.f0 = null;
        this.h0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = false;
        this.I0 = false;
        this.e0 = -1.0f;
        this.i0 = 0;
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = false;
        this.o0 = false;
        this.r0 = false;
        this.C0 = false;
        this.D0 = 0;
    }

    public final boolean M() {
        if (this.a0 == null) {
            return false;
        }
        int i = this.F0;
        if (i == 3 || this.k0 || ((this.l0 && !this.I0) || (this.m0 && this.H0))) {
            J();
            return true;
        }
        if (i == 2) {
            int i2 = zzel.zza;
            zzdd.zzf(i2 >= 23);
            if (i2 >= 23) {
                try {
                    try {
                        throw null;
                    } catch (MediaCryptoException e) {
                        throw b(this.V, e, false, 6006);
                    }
                } catch (zzgy e2) {
                    zzdu.zzb("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                    J();
                    return true;
                }
            }
        }
        z();
        return false;
    }

    public boolean N(zzql zzqlVar) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x0125  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a3  */
    public final void O(zzql zzqlVar) {
        float fJ;
        zzqj zzrfVar;
        int i;
        boolean z;
        boolean z2;
        String str = zzqlVar.zza;
        int i2 = zzel.zza;
        if (i2 < 23) {
            fJ = -1.0f;
        } else {
            float f = this.Z;
            zzaf[] zzafVarArr = this.D;
            zzafVarArr.getClass();
            fJ = j(f, zzafVarArr);
        }
        float f2 = fJ > this.K ? fJ : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zzqh zzqhVarP = p(zzqlVar, this.V, f2);
        if (i2 >= 31) {
            zzmz zzmzVar = this.A;
            zzmzVar.getClass();
            x97.a(zzqhVarP, zzmzVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            if (i2 < 23 || i2 < 31) {
                MediaCodec mediaCodec = null;
                try {
                    zzql zzqlVar2 = zzqhVarP.zza;
                    zzqlVar2.getClass();
                    String str2 = zzqlVar2.zza;
                    Trace.beginSection("createCodec:".concat(String.valueOf(str2)));
                    MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str2);
                    Trace.endSection();
                    try {
                        Trace.beginSection("configureCodec");
                        mediaCodecCreateByCodecName.configure(zzqhVarP.zzb, zzqhVarP.zzd, (MediaCrypto) null, 0);
                        Trace.endSection();
                        Trace.beginSection("startCodec");
                        mediaCodecCreateByCodecName.start();
                        Trace.endSection();
                        zzrfVar = new zzrf(mediaCodecCreateByCodecName);
                    } catch (IOException | RuntimeException e) {
                        e = e;
                        mediaCodec = mediaCodecCreateByCodecName;
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (IOException e2) {
                    e = e2;
                } catch (RuntimeException e3) {
                    e = e3;
                }
            } else {
                int iZzb = zzbt.zzb(zzqhVarP.zzc.zzm);
                Log.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzel.zzO(iZzb)));
                zzrfVar = new zzpu(iZzb, false).zzc(zzqhVarP);
            }
            this.a0 = zzrfVar;
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.h0 = zzqlVar;
            this.e0 = f2;
            this.b0 = this.V;
            if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str3 = zzel.zzd;
                if (str3.startsWith("SM-T585") || str3.startsWith("SM-A510") || str3.startsWith("SM-A520") || str3.startsWith("SM-J700")) {
                    i = 2;
                } else if (i2 < 24) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (i2 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i = 0;
            } else {
                String str4 = zzel.zzb;
                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            this.i0 = i;
            this.j0 = i2 < 21 && this.b0.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.k0 = i2 == 19 && zzel.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str));
            this.l0 = i2 == 29 && "c2.android.aac.decoder".equals(str);
            if (i2 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
                if (i2 <= 19) {
                    String str5 = zzel.zzb;
                    z = ("hb2000".equals(str5) || "stvm8".equals(str5)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str));
                }
            }
            this.m0 = z;
            this.n0 = i2 == 21 && "OMX.google.aac.decoder".equals(str);
            if (i2 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(zzel.zzc)) {
                String str6 = zzel.zzb;
                if (str6.startsWith("baffin") || str6.startsWith("grand") || str6.startsWith("fortuna") || str6.startsWith("gprimelte") || str6.startsWith("j2y18lte") || str6.startsWith("ms01")) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
            this.o0 = z2;
            String str7 = zzqlVar.zza;
            this.r0 = (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str7)) || (i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str7) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str7))) || ("Amazon".equals(zzel.zzc) && "AFTS".equals(zzel.zzd) && zzqlVar.zzf);
            this.a0.zzr();
            if ("c2.android.mp3.decoder".equals(zzqlVar.zza)) {
                this.s0 = new v97();
            }
            if (zzbe() == 2) {
                this.t0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.O0.zza++;
            s(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @TargetApi(23)
    public final void P() throws zzgy {
        int i = this.F0;
        if (i == 1) {
            z();
            return;
        }
        if (i == 2) {
            z();
            try {
                throw null;
            } catch (MediaCryptoException e) {
                throw b(this.V, e, false, 6006);
            }
        } else if (i != 3) {
            this.M0 = true;
            C();
        } else {
            J();
            H();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public void c() {
        this.V = null;
        this.P0 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.R0 = 0;
        M();
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public void d(boolean z, boolean z2) {
        this.O0 = new zzgq();
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public void e(long j, boolean z) {
        this.L0 = false;
        this.M0 = false;
        if (this.z0) {
            this.O.zzb();
            this.N.zzb();
            this.A0 = false;
        } else if (M()) {
            H();
        }
        zzei zzeiVar = this.P;
        if (zzeiVar.zza() > 0) {
            this.N0 = true;
        }
        zzeiVar.zze();
        int i = this.R0;
        if (i != 0) {
            int i2 = i - 1;
            this.Q0 = this.T[i2];
            this.P0 = this.S[i2];
            this.R0 = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public void f() {
        try {
            n();
            J();
        } finally {
            this.T0 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgp
    public final void i(long j, long j2) {
        if (this.Q0 == -9223372036854775807L) {
            zzdd.zzf(this.P0 == -9223372036854775807L);
            this.P0 = j;
            this.Q0 = j2;
            return;
        }
        int i = this.R0;
        long[] jArr = this.T;
        if (i == 10) {
            Log.w("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + jArr[9]);
        } else {
            this.R0 = i + 1;
        }
        int i2 = this.R0 - 1;
        this.S[i2] = j;
        jArr[i2] = j2;
        this.U[i2] = this.J0;
    }

    public float j(float f, zzaf[] zzafVarArr) {
        throw null;
    }

    public abstract int k(zzqq zzqqVar, zzaf zzafVar);

    public zzgr l(zzql zzqlVar, zzaf zzafVar, zzaf zzafVar2) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    public zzgr m(zzje zzjeVar) {
        int i;
        boolean z = true;
        this.N0 = true;
        zzaf zzafVar = zzjeVar.zza;
        zzafVar.getClass();
        if (zzafVar.zzm == null) {
            throw b(zzafVar, new IllegalArgumentException(), false, 4005);
        }
        zzpp zzppVar = zzjeVar.zzb;
        this.T0 = zzppVar;
        this.V = zzafVar;
        if (this.z0) {
            this.B0 = true;
            return null;
        }
        zzqj zzqjVar = this.a0;
        if (zzqjVar == null) {
            this.f0 = null;
            H();
            return null;
        }
        zzql zzqlVar = this.h0;
        zzaf zzafVar2 = this.b0;
        zzpp zzppVar2 = this.S0;
        if (zzppVar2 != zzppVar) {
            if (zzppVar != null && zzppVar2 != null && zzel.zza >= 23) {
                UUID uuid = zzo.zze;
                UUID uuid2 = zzo.zza;
                if (!uuid.equals(uuid2)) {
                    uuid.equals(uuid2);
                }
            }
            o();
            return new zzgr(zzqlVar.zza, zzafVar2, zzafVar, 0, 128);
        }
        zzdd.zzf(zzppVar == zzppVar2 || zzel.zza >= 23);
        zzgr zzgrVarL = l(zzqlVar, zzafVar2, zzafVar);
        int i2 = zzgrVarL.zzd;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (x(zzafVar)) {
                        this.b0 = zzafVar;
                        if (zzppVar != zzppVar2 && !u()) {
                            i = 2;
                        }
                    } else {
                        i = 16;
                    }
                } else if (x(zzafVar)) {
                    this.C0 = true;
                    this.D0 = 1;
                    int i3 = this.i0;
                    if (i3 != 2 && (i3 != 1 || zzafVar.zzr != zzafVar2.zzr || zzafVar.zzs != zzafVar2.zzs)) {
                        z = false;
                    }
                    this.p0 = z;
                    this.b0 = zzafVar;
                    if (zzppVar != zzppVar2 && !u()) {
                        i = 2;
                    }
                } else {
                    i = 16;
                }
            } else if (x(zzafVar)) {
                this.b0 = zzafVar;
                if (zzppVar != zzppVar2) {
                    if (!u()) {
                        i = 2;
                    }
                } else if (this.G0) {
                    this.E0 = 1;
                    if (this.k0 || this.m0) {
                        this.F0 = 3;
                        i = 2;
                    } else {
                        this.F0 = 1;
                    }
                }
            } else {
                i = 16;
            }
            return (zzgrVarL.zzd != 0 || (this.a0 == zzqjVar && this.F0 != 3)) ? zzgrVarL : new zzgr(zzqlVar.zza, zzafVar2, zzafVar, 0, i);
        }
        o();
        i = 0;
        if (zzgrVarL.zzd != 0) {
        }
    }

    public final void n() {
        this.B0 = false;
        this.O.zzb();
        this.N.zzb();
        this.A0 = false;
        this.z0 = false;
    }

    public final void o() {
        if (this.G0) {
            this.E0 = 1;
            this.F0 = 3;
        } else {
            J();
            H();
        }
    }

    public abstract zzqh p(zzql zzqlVar, zzaf zzafVar, float f);

    public abstract List q(zzqq zzqqVar, zzaf zzafVar);

    public void r(Exception exc) {
        throw null;
    }

    public void s(String str, long j, long j2) {
        throw null;
    }

    public void t(String str) {
        throw null;
    }

    @TargetApi(23)
    public final boolean u() throws zzgy {
        if (!this.G0) {
            try {
                throw null;
            } catch (MediaCryptoException e) {
                throw b(this.V, e, false, 6006);
            }
        }
        this.E0 = 1;
        if (this.k0 || this.m0) {
            this.F0 = 3;
            return false;
        }
        this.F0 = 2;
        return true;
    }

    public final boolean v() throws zzgy {
        zzqj zzqjVar = this.a0;
        if (zzqjVar == null || this.E0 == 2 || this.L0) {
            return false;
        }
        int i = this.u0;
        zzgg zzggVar = this.M;
        if (i < 0) {
            int iZza = zzqjVar.zza();
            this.u0 = iZza;
            if (iZza < 0) {
                return false;
            }
            zzggVar.zzb = this.a0.zzf(iZza);
            zzggVar.zzb();
        }
        if (this.E0 == 1) {
            if (!this.r0) {
                this.H0 = true;
                this.a0.zzj(this.u0, 0, 0, 0L, 4);
                this.u0 = -1;
                zzggVar.zzb = null;
            }
            this.E0 = 2;
            return false;
        }
        if (this.p0) {
            this.p0 = false;
            zzggVar.zzb.put(U0);
            this.a0.zzj(this.u0, 0, 38, 0L, 0);
            this.u0 = -1;
            zzggVar.zzb = null;
            this.G0 = true;
            return true;
        }
        if (this.D0 == 1) {
            for (int i2 = 0; i2 < this.b0.zzo.size(); i2++) {
                zzggVar.zzb.put((byte[]) this.b0.zzo.get(i2));
            }
            this.D0 = 2;
        }
        int iPosition = zzggVar.zzb.position();
        zzje zzjeVar = this.x;
        zzjeVar.zzb = null;
        zzjeVar.zza = null;
        try {
            int iA = a(zzjeVar, zzggVar, 0);
            if (zzG()) {
                this.K0 = this.J0;
            }
            if (iA == -3) {
                return false;
            }
            if (iA == -5) {
                if (this.D0 == 2) {
                    zzggVar.zzb();
                    this.D0 = 1;
                }
                m(zzjeVar);
                return true;
            }
            if (zzggVar.zzg()) {
                if (this.D0 == 2) {
                    zzggVar.zzb();
                    this.D0 = 1;
                }
                this.L0 = true;
                if (!this.G0) {
                    P();
                    return false;
                }
                try {
                    if (!this.r0) {
                        this.H0 = true;
                        this.a0.zzj(this.u0, 0, 0, 0L, 4);
                        this.u0 = -1;
                        zzggVar.zzb = null;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw b(this.V, e, false, zzel.zzl(e.getErrorCode()));
                }
            }
            if (!this.G0 && !zzggVar.zzh()) {
                zzggVar.zzb();
                if (this.D0 == 2) {
                    this.D0 = 1;
                }
                return true;
            }
            boolean zZzk = zzggVar.zzk();
            if (zZzk) {
                zzggVar.zza.zzb(iPosition);
            }
            if (this.j0 && !zZzk) {
                ByteBuffer byteBuffer = zzggVar.zzb;
                byte[] bArr = zzaac.zza;
                int iPosition2 = byteBuffer.position();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i3 + 1;
                    if (i5 >= iPosition2) {
                        byteBuffer.clear();
                        break;
                    }
                    int i6 = byteBuffer.get(i3) & 255;
                    if (i4 == 3) {
                        if (i6 == 1) {
                            if ((byteBuffer.get(i5) & 31) == 7) {
                                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                                byteBufferDuplicate.position(i3 - 3);
                                byteBufferDuplicate.limit(iPosition2);
                                byteBuffer.position(0);
                                byteBuffer.put(byteBufferDuplicate);
                                break;
                            }
                            i6 = 1;
                        }
                    } else if (i6 == 0) {
                        i4++;
                    }
                    if (i6 != 0) {
                        i4 = 0;
                    }
                    i3 = i5;
                }
                if (zzggVar.zzb.position() == 0) {
                    return true;
                }
                this.j0 = false;
            }
            long j = zzggVar.zzd;
            v97 v97Var = this.s0;
            if (v97Var != null) {
                zzaf zzafVar = this.V;
                if (v97Var.b == 0) {
                    v97Var.a = j;
                }
                if (!v97Var.c) {
                    ByteBuffer byteBuffer2 = zzggVar.zzb;
                    byteBuffer2.getClass();
                    int i7 = 0;
                    for (int i8 = 0; i8 < 4; i8++) {
                        i7 = (i7 << 8) | (byteBuffer2.get(i8) & 255);
                    }
                    int iZzc = zzzz.zzc(i7);
                    if (iZzc == -1) {
                        v97Var.c = true;
                        v97Var.b = 0L;
                        v97Var.a = zzggVar.zzd;
                        Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                        j = zzggVar.zzd;
                    } else {
                        long jMax = Math.max(0L, ((v97Var.b - 529) * 1000000) / zzafVar.zzA) + v97Var.a;
                        v97Var.b += (long) iZzc;
                        j = jMax;
                    }
                }
                long j2 = this.J0;
                v97 v97Var2 = this.s0;
                zzaf zzafVar2 = this.V;
                v97Var2.getClass();
                this.J0 = Math.max(j2, Math.max(0L, ((v97Var2.b - 529) * 1000000) / zzafVar2.zzA) + v97Var2.a);
            }
            if (zzggVar.zzf()) {
                this.Q.add(Long.valueOf(j));
            }
            if (this.N0) {
                this.P.zzd(j, this.V);
                this.N0 = false;
            }
            this.J0 = Math.max(this.J0, j);
            zzggVar.zzj();
            if (zzggVar.zze()) {
                G(zzggVar);
            }
            B(zzggVar);
            try {
                if (zZzk) {
                    this.a0.zzk(this.u0, 0, zzggVar.zza, j, 0);
                } else {
                    this.a0.zzj(this.u0, 0, zzggVar.zzb.limit(), j, 0);
                }
                this.u0 = -1;
                zzggVar.zzb = null;
                this.G0 = true;
                this.D0 = 0;
                this.O0.zzc++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw b(this.V, e2, false, zzel.zzl(e2.getErrorCode()));
            }
        } catch (zzgf e3) {
            r(e3);
            w(0);
            z();
            return true;
        }
    }

    public final boolean w(int i) throws zzgy {
        zzje zzjeVar = this.x;
        zzjeVar.zzb = null;
        zzjeVar.zza = null;
        zzgg zzggVar = this.L;
        zzggVar.zzb();
        int iA = a(zzjeVar, zzggVar, i | 4);
        if (iA == -5) {
            m(zzjeVar);
            return true;
        }
        if (iA != -4 || !zzggVar.zzg()) {
            return false;
        }
        this.L0 = true;
        P();
        return false;
    }

    public final boolean x(zzaf zzafVar) {
        if (zzel.zza >= 23 && this.a0 != null && this.F0 != 3 && zzbe() != 0) {
            float f = this.Z;
            zzaf[] zzafVarArr = this.D;
            zzafVarArr.getClass();
            float fJ = j(f, zzafVarArr);
            float f2 = this.e0;
            if (f2 == fJ) {
                return true;
            }
            if (fJ == -1.0f) {
                o();
                return false;
            }
            if (f2 == -1.0f && fJ <= this.K) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fJ);
            this.a0.zzp(bundle);
            this.e0 = fJ;
        }
        return true;
    }

    public void y(zzaf zzafVar, MediaFormat mediaFormat) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzjy
    public void zzD(float f, float f2) {
        this.Y = f;
        this.Z = f2;
        x(this.b0);
    }

    /* JADX WARN: Code duplicated, block: B:210:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:221:0x0312  */
    /* JADX WARN: Code duplicated, block: B:224:0x0319 A[Catch: IllegalStateException -> 0x0335, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x0335, blocks: (B:222:0x0313, B:224:0x0319), top: B:307:0x0313 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0326  */
    /* JADX WARN: Code duplicated, block: B:232:0x032b A[LOOP:2: B:335:0x0152->B:232:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:281:0x03af  */
    /* JADX WARN: Code duplicated, block: B:283:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:292:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:294:0x03db  */
    /* JADX WARN: Code duplicated, block: B:303:0x027d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x02fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:? A[LOOP:1: B:58:0x00d3->B:351:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x030e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1 A[Catch: IllegalStateException -> 0x0139, TryCatch #10 {IllegalStateException -> 0x0139, blocks: (B:17:0x002d, B:23:0x003c, B:38:0x0089, B:40:0x008d, B:91:0x0127, B:41:0x0093, B:44:0x009a, B:46:0x00a6, B:48:0x00aa, B:53:0x00b3, B:57:0x00c3, B:58:0x00d3, B:75:0x0109, B:80:0x0112, B:81:0x0115, B:86:0x011e, B:88:0x0122, B:63:0x00e1, B:65:0x00e7, B:66:0x00ea, B:68:0x00ee, B:70:0x00f3, B:71:0x00fa, B:73:0x0103, B:74:0x0106, B:111:0x0162, B:113:0x0166, B:124:0x0188, B:126:0x0194, B:128:0x019e, B:130:0x01a6, B:131:0x01a9, B:132:0x01ae, B:134:0x01b2, B:136:0x01b6, B:138:0x01ba, B:139:0x01be, B:141:0x01c2, B:143:0x01d4, B:145:0x01d8, B:147:0x01de, B:149:0x01e7, B:151:0x01f3, B:152:0x0202, B:154:0x0206, B:156:0x020e, B:158:0x0214, B:160:0x021a, B:161:0x021c, B:163:0x0220, B:165:0x0227, B:167:0x0235, B:170:0x023e, B:174:0x024b, B:176:0x0255, B:178:0x0259, B:180:0x0261, B:185:0x026c, B:181:0x0264, B:183:0x0268, B:168:0x023a, B:117:0x0171, B:119:0x0178, B:120:0x017d, B:115:0x016a), top: B:319:0x0023, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[Catch: IllegalStateException -> 0x0139, TryCatch #10 {IllegalStateException -> 0x0139, blocks: (B:17:0x002d, B:23:0x003c, B:38:0x0089, B:40:0x008d, B:91:0x0127, B:41:0x0093, B:44:0x009a, B:46:0x00a6, B:48:0x00aa, B:53:0x00b3, B:57:0x00c3, B:58:0x00d3, B:75:0x0109, B:80:0x0112, B:81:0x0115, B:86:0x011e, B:88:0x0122, B:63:0x00e1, B:65:0x00e7, B:66:0x00ea, B:68:0x00ee, B:70:0x00f3, B:71:0x00fa, B:73:0x0103, B:74:0x0106, B:111:0x0162, B:113:0x0166, B:124:0x0188, B:126:0x0194, B:128:0x019e, B:130:0x01a6, B:131:0x01a9, B:132:0x01ae, B:134:0x01b2, B:136:0x01b6, B:138:0x01ba, B:139:0x01be, B:141:0x01c2, B:143:0x01d4, B:145:0x01d8, B:147:0x01de, B:149:0x01e7, B:151:0x01f3, B:152:0x0202, B:154:0x0206, B:156:0x020e, B:158:0x0214, B:160:0x021a, B:161:0x021c, B:163:0x0220, B:165:0x0227, B:167:0x0235, B:170:0x023e, B:174:0x024b, B:176:0x0255, B:178:0x0259, B:180:0x0261, B:185:0x026c, B:181:0x0264, B:183:0x0268, B:168:0x023a, B:117:0x0171, B:119:0x0178, B:120:0x017d, B:115:0x016a), top: B:319:0x0023, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee A[Catch: IllegalStateException -> 0x0139, TRY_LEAVE, TryCatch #10 {IllegalStateException -> 0x0139, blocks: (B:17:0x002d, B:23:0x003c, B:38:0x0089, B:40:0x008d, B:91:0x0127, B:41:0x0093, B:44:0x009a, B:46:0x00a6, B:48:0x00aa, B:53:0x00b3, B:57:0x00c3, B:58:0x00d3, B:75:0x0109, B:80:0x0112, B:81:0x0115, B:86:0x011e, B:88:0x0122, B:63:0x00e1, B:65:0x00e7, B:66:0x00ea, B:68:0x00ee, B:70:0x00f3, B:71:0x00fa, B:73:0x0103, B:74:0x0106, B:111:0x0162, B:113:0x0166, B:124:0x0188, B:126:0x0194, B:128:0x019e, B:130:0x01a6, B:131:0x01a9, B:132:0x01ae, B:134:0x01b2, B:136:0x01b6, B:138:0x01ba, B:139:0x01be, B:141:0x01c2, B:143:0x01d4, B:145:0x01d8, B:147:0x01de, B:149:0x01e7, B:151:0x01f3, B:152:0x0202, B:154:0x0206, B:156:0x020e, B:158:0x0214, B:160:0x021a, B:161:0x021c, B:163:0x0220, B:165:0x0227, B:167:0x0235, B:170:0x023e, B:174:0x024b, B:176:0x0255, B:178:0x0259, B:180:0x0261, B:185:0x026c, B:181:0x0264, B:183:0x0268, B:168:0x023a, B:117:0x0171, B:119:0x0178, B:120:0x017d, B:115:0x016a), top: B:319:0x0023, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x010f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112 A[Catch: IllegalStateException -> 0x0139, TryCatch #10 {IllegalStateException -> 0x0139, blocks: (B:17:0x002d, B:23:0x003c, B:38:0x0089, B:40:0x008d, B:91:0x0127, B:41:0x0093, B:44:0x009a, B:46:0x00a6, B:48:0x00aa, B:53:0x00b3, B:57:0x00c3, B:58:0x00d3, B:75:0x0109, B:80:0x0112, B:81:0x0115, B:86:0x011e, B:88:0x0122, B:63:0x00e1, B:65:0x00e7, B:66:0x00ea, B:68:0x00ee, B:70:0x00f3, B:71:0x00fa, B:73:0x0103, B:74:0x0106, B:111:0x0162, B:113:0x0166, B:124:0x0188, B:126:0x0194, B:128:0x019e, B:130:0x01a6, B:131:0x01a9, B:132:0x01ae, B:134:0x01b2, B:136:0x01b6, B:138:0x01ba, B:139:0x01be, B:141:0x01c2, B:143:0x01d4, B:145:0x01d8, B:147:0x01de, B:149:0x01e7, B:151:0x01f3, B:152:0x0202, B:154:0x0206, B:156:0x020e, B:158:0x0214, B:160:0x021a, B:161:0x021c, B:163:0x0220, B:165:0x0227, B:167:0x0235, B:170:0x023e, B:174:0x024b, B:176:0x0255, B:178:0x0259, B:180:0x0261, B:185:0x026c, B:181:0x0264, B:183:0x0268, B:168:0x023a, B:117:0x0171, B:119:0x0178, B:120:0x017d, B:115:0x016a), top: B:319:0x0023, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0119  */
    /* JADX WARN: Code duplicated, block: B:84:0x011b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v14, types: [com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22, types: [com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27, types: [com.google.android.gms.internal.ads.zzgp] */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33, types: [com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18, types: [com.google.android.gms.internal.ads.zzqo] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzL(long j, long j2) throws zzgy {
        char c;
        int i;
        StackTraceElement[] stackTrace;
        boolean z;
        ?? r1;
        ?? r3;
        MediaCodec.BufferInfo bufferInfo;
        boolean zD;
        zzqo zzqoVar;
        int i2;
        Object obj;
        ?? r2;
        ?? r4;
        long j3;
        boolean z2;
        int iZzb;
        boolean z3;
        ?? r15;
        u97 u97Var;
        ?? r16;
        ?? r5;
        ?? r13;
        zzje zzjeVar;
        Object obj2;
        int iA;
        boolean z4;
        boolean z5;
        ?? r17 = this;
        zzei zzeiVar = r17.P;
        u97 u97Var2 = r17.O;
        boolean z6 = false;
        boolean z7 = true;
        try {
            if (r17.M0) {
                C();
                return;
            }
            int i3 = 2;
            if (r17.V == null && !r17.w(2)) {
                return;
            }
            H();
            ?? r6 = r17.z0;
            try {
                if (r6 != 0) {
                    int i4 = zzel.zza;
                    Trace.beginSection("bypassRender");
                    r6 = r17;
                    r17 = r17;
                    while (true) {
                        zzdd.zzf(r6.M0 ^ z7);
                        try {
                            int i5 = u97Var2.d;
                            if (i5 > 0) {
                                u97 u97Var3 = u97Var2;
                                try {
                                    if (!D(j, j2, null, u97Var2.zzb, r6.v0, 0, i5, u97Var2.zzd, u97Var2.zzf(), u97Var2.zzg(), r6.W)) {
                                        r16 = this;
                                        r5 = r16;
                                        break;
                                    }
                                    u97Var = u97Var3;
                                    try {
                                        zzqo zzqoVar2 = this;
                                        zzqoVar2.I(u97Var.c);
                                        u97Var.zzb();
                                        r5 = zzqoVar2;
                                        r16 = zzqoVar2;
                                    } catch (IllegalStateException e) {
                                        e = e;
                                        r17 = this;
                                        c = 0;
                                    }
                                } catch (IllegalStateException e2) {
                                    e = e2;
                                    r17 = this;
                                    c = 0;
                                }
                            } else {
                                u97Var = u97Var2;
                                r5 = r6;
                                r16 = r17;
                            }
                            if (r5.L0) {
                                r5.M0 = true;
                                break;
                            }
                            boolean z8 = r5.A0;
                            zzgg zzggVar = r5.N;
                            if (z8) {
                                zzdd.zzf(u97Var.c(zzggVar));
                                r13 = 0;
                                r5.A0 = false;
                            } else {
                                r13 = 0;
                            }
                            if (r5.B0) {
                                if (!(u97Var.d > 0)) {
                                    n();
                                    r5.B0 = r13;
                                    H();
                                    if (!r5.z0) {
                                        break;
                                    }
                                    zzdd.zzf(!r5.L0);
                                    zzjeVar = r16.x;
                                    obj2 = null;
                                    zzjeVar.zzb = null;
                                    zzjeVar.zza = null;
                                    zzggVar.zzb();
                                    while (true) {
                                        zzggVar.zzb();
                                        iA = r5.a(zzjeVar, zzggVar, r13);
                                        if (iA != -5) {
                                            r5.m(zzjeVar);
                                            break;
                                        }
                                        if (iA == -4) {
                                            break;
                                            break;
                                        }
                                        if (zzggVar.zzg()) {
                                            r5.L0 = true;
                                            break;
                                        }
                                        if (r5.N0) {
                                            zzaf zzafVar = r5.V;
                                            zzafVar.getClass();
                                            r5.W = zzafVar;
                                            r5.y(zzafVar, null);
                                            r5.N0 = r13;
                                        }
                                        zzggVar.zzj();
                                        if (!u97Var.c(zzggVar)) {
                                            r5.A0 = true;
                                            break;
                                        }
                                    }
                                    if (u97Var.d > 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        u97Var.zzj();
                                    }
                                    if (u97Var.d > 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (!z5) {
                                        break;
                                        break;
                                    }
                                    continue;
                                } else {
                                    obj2 = null;
                                }
                                u97Var2 = u97Var;
                                z7 = true;
                                r6 = r5;
                                r17 = r16;
                            } else {
                                zzdd.zzf(!r5.L0);
                                zzjeVar = r16.x;
                                obj2 = null;
                                zzjeVar.zzb = null;
                                zzjeVar.zza = null;
                                zzggVar.zzb();
                                while (true) {
                                    zzggVar.zzb();
                                    iA = r5.a(zzjeVar, zzggVar, r13);
                                    if (iA != -5) {
                                        r5.m(zzjeVar);
                                        break;
                                    }
                                    if (iA == -4) {
                                        break;
                                    }
                                    if (zzggVar.zzg()) {
                                        r5.L0 = true;
                                        break;
                                    }
                                    if (r5.N0) {
                                        zzaf zzafVar2 = r5.V;
                                        zzafVar2.getClass();
                                        r5.W = zzafVar2;
                                        r5.y(zzafVar2, null);
                                        r5.N0 = r13;
                                    }
                                    zzggVar.zzj();
                                    if (!u97Var.c(zzggVar)) {
                                        r5.A0 = true;
                                        break;
                                    }
                                }
                                if (u97Var.d > 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    u97Var.zzj();
                                }
                                if (u97Var.d > 0) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!z5 && !r5.L0 && !r5.B0) {
                                    break;
                                }
                                u97Var2 = u97Var;
                                z7 = true;
                                r6 = r5;
                                r17 = r16;
                            }
                        } catch (IllegalStateException e3) {
                            e = e3;
                            c = 0;
                            r1 = r6;
                            r17 = r1;
                        }
                    }
                    Trace.endSection();
                    c = 0;
                    r15 = r5;
                    r17 = r15;
                    try {
                        r17.O0.zza();
                        return;
                    } catch (IllegalStateException e4) {
                        e = e4;
                    }
                } else {
                    Object obj3 = null;
                    boolean z9 = true;
                    if (r17.a0 != null) {
                        try {
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            int i6 = zzel.zza;
                            Trace.beginSection("drainAndFeed");
                            r6 = r17;
                            r17 = r17;
                            while (true) {
                                try {
                                    boolean z10 = r17.v0 >= 0;
                                    MediaCodec.BufferInfo bufferInfo2 = r6.R;
                                    if (!z10) {
                                        if (r6.n0 && r6.H0) {
                                            try {
                                                iZzb = r6.a0.zzb(bufferInfo2);
                                            } catch (IllegalStateException unused) {
                                                P();
                                                if (r6.M0) {
                                                    J();
                                                }
                                            }
                                        } else {
                                            iZzb = r6.a0.zzb(bufferInfo2);
                                        }
                                        if (iZzb >= 0) {
                                            if (!r6.q0) {
                                                if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                                                    P();
                                                    c = 0;
                                                    r17 = r6;
                                                    break;
                                                }
                                                r6.v0 = iZzb;
                                                ByteBuffer byteBufferZzg = r6.a0.zzg(iZzb);
                                                r6.w0 = byteBufferZzg;
                                                if (byteBufferZzg != null) {
                                                    byteBufferZzg.position(bufferInfo2.offset);
                                                    r6.w0.limit(bufferInfo2.offset + bufferInfo2.size);
                                                }
                                                if (r6.o0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                                                    long j4 = r6.J0;
                                                    if (j4 != -9223372036854775807L) {
                                                        bufferInfo2.presentationTimeUs = j4;
                                                    }
                                                }
                                                long j5 = bufferInfo2.presentationTimeUs;
                                                ArrayList arrayList = r6.Q;
                                                int size = arrayList.size();
                                                int i7 = 0;
                                                while (true) {
                                                    if (i7 >= size) {
                                                        z3 = false;
                                                        break;
                                                    } else {
                                                        if (((Long) arrayList.get(i7)).longValue() == j5) {
                                                            arrayList.remove(i7);
                                                            z3 = true;
                                                            break;
                                                        }
                                                        i7++;
                                                    }
                                                }
                                                r6.x0 = z3;
                                                long j6 = r6.K0;
                                                long j7 = bufferInfo2.presentationTimeUs;
                                                r6.y0 = j6 == j7;
                                                zzaf zzafVar3 = (zzaf) zzeiVar.zzc(j7);
                                                if (zzafVar3 == null && r6.d0) {
                                                    zzafVar3 = (zzaf) zzeiVar.zzb();
                                                }
                                                if (zzafVar3 == null) {
                                                    if (r6.d0 && r6.W != null) {
                                                    }
                                                    if (r6.n0) {
                                                        if (r6.H0) {
                                                            bufferInfo = bufferInfo2;
                                                            c = 0;
                                                            zD = D(j, j2, r6.a0, r6.w0, r6.v0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, r6.x0, r6.y0, r6.W);
                                                        } else {
                                                            bufferInfo = bufferInfo2;
                                                            c = 0;
                                                            zD = D(j, j2, r6.a0, r6.w0, r6.v0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, r6.x0, r6.y0, r6.W);
                                                        }
                                                        if (zD) {
                                                            zzqoVar = this;
                                                            zzqoVar.I(bufferInfo.presentationTimeUs);
                                                            i2 = bufferInfo.flags;
                                                            zzqoVar.v0 = -1;
                                                            obj = null;
                                                            zzqoVar.w0 = null;
                                                            if ((i2 & 4) != 0) {
                                                                P();
                                                                r3 = zzqoVar;
                                                            } else {
                                                                r2 = zzqoVar;
                                                                r4 = zzqoVar;
                                                                j3 = r2.X;
                                                                if (j3 != -9223372036854775807L) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = true;
                                                                }
                                                                if (!z2) {
                                                                    r17 = r2;
                                                                    break;
                                                                }
                                                                obj3 = obj;
                                                                r6 = r2;
                                                                r17 = r4;
                                                                zzeiVar = zzeiVar;
                                                                i3 = 2;
                                                                z6 = false;
                                                                z9 = true;
                                                            }
                                                        } else {
                                                            r3 = this;
                                                        }
                                                    } else {
                                                        bufferInfo = bufferInfo2;
                                                        c = 0;
                                                        zD = D(j, j2, r6.a0, r6.w0, r6.v0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, r6.x0, r6.y0, r6.W);
                                                        if (zD) {
                                                            zzqoVar = this;
                                                            zzqoVar.I(bufferInfo.presentationTimeUs);
                                                            i2 = bufferInfo.flags;
                                                            zzqoVar.v0 = -1;
                                                            obj = null;
                                                            zzqoVar.w0 = null;
                                                            if ((i2 & 4) != 0) {
                                                                P();
                                                                r3 = zzqoVar;
                                                            } else {
                                                                r2 = zzqoVar;
                                                                r4 = zzqoVar;
                                                                j3 = r2.X;
                                                                if (j3 != -9223372036854775807L) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = true;
                                                                }
                                                                if (!z2) {
                                                                    r17 = r2;
                                                                    break;
                                                                }
                                                                obj3 = obj;
                                                                r6 = r2;
                                                                r17 = r4;
                                                                zzeiVar = zzeiVar;
                                                                i3 = 2;
                                                                z6 = false;
                                                                z9 = true;
                                                            }
                                                        } else {
                                                            r3 = this;
                                                        }
                                                    }
                                                    r17 = r3;
                                                    break;
                                                }
                                                r6.W = zzafVar3;
                                                r6.y(r6.W, r6.c0);
                                                r6.d0 = z6;
                                                if (r6.n0) {
                                                    if (r6.H0) {
                                                        bufferInfo = bufferInfo2;
                                                        c = 0;
                                                        zD = D(j, j2, r6.a0, r6.w0, r6.v0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, r6.x0, r6.y0, r6.W);
                                                    } else {
                                                        bufferInfo = bufferInfo2;
                                                        c = 0;
                                                        zD = D(j, j2, r6.a0, r6.w0, r6.v0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, r6.x0, r6.y0, r6.W);
                                                    }
                                                    if (zD) {
                                                        zzqoVar = this;
                                                        zzqoVar.I(bufferInfo.presentationTimeUs);
                                                        i2 = bufferInfo.flags;
                                                        zzqoVar.v0 = -1;
                                                        obj = null;
                                                        zzqoVar.w0 = null;
                                                        if ((i2 & 4) != 0) {
                                                            P();
                                                            r3 = zzqoVar;
                                                        } else {
                                                            r2 = zzqoVar;
                                                            r4 = zzqoVar;
                                                            j3 = r2.X;
                                                            if (j3 != -9223372036854775807L) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            if (!z2) {
                                                                r17 = r2;
                                                                break;
                                                            }
                                                            obj3 = obj;
                                                            r6 = r2;
                                                            r17 = r4;
                                                            zzeiVar = zzeiVar;
                                                            i3 = 2;
                                                            z6 = false;
                                                            z9 = true;
                                                        }
                                                    } else {
                                                        r3 = this;
                                                    }
                                                } else {
                                                    bufferInfo = bufferInfo2;
                                                    c = 0;
                                                    zD = D(j, j2, r6.a0, r6.w0, r6.v0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, r6.x0, r6.y0, r6.W);
                                                    if (zD) {
                                                        zzqoVar = this;
                                                        zzqoVar.I(bufferInfo.presentationTimeUs);
                                                        i2 = bufferInfo.flags;
                                                        zzqoVar.v0 = -1;
                                                        obj = null;
                                                        zzqoVar.w0 = null;
                                                        if ((i2 & 4) != 0) {
                                                            P();
                                                            r3 = zzqoVar;
                                                        } else {
                                                            r2 = zzqoVar;
                                                            r4 = zzqoVar;
                                                            j3 = r2.X;
                                                            if (j3 != -9223372036854775807L) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = true;
                                                            }
                                                            if (!z2) {
                                                                r17 = r2;
                                                                break;
                                                            }
                                                            obj3 = obj;
                                                            r6 = r2;
                                                            r17 = r4;
                                                            zzeiVar = zzeiVar;
                                                            i3 = 2;
                                                            z6 = false;
                                                            z9 = true;
                                                        }
                                                    } else {
                                                        r3 = this;
                                                    }
                                                }
                                                r17 = r3;
                                                break;
                                            }
                                            r6.q0 = z6;
                                            r6.a0.zzn(iZzb, z6);
                                            zzeiVar = zzeiVar;
                                            r2 = r6;
                                            obj = obj3;
                                            r4 = r17;
                                            c = 0;
                                            j3 = r2.X;
                                            if (j3 != -9223372036854775807L) {
                                                z2 = true;
                                            } else {
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                r17 = r2;
                                                break;
                                            }
                                            obj3 = obj;
                                            r6 = r2;
                                            r17 = r4;
                                            zzeiVar = zzeiVar;
                                            i3 = 2;
                                            z6 = false;
                                            z9 = true;
                                        } else {
                                            if (iZzb != -2) {
                                                if (r6.r0 && (r6.L0 || r6.E0 == i3)) {
                                                    P();
                                                }
                                                c = 0;
                                                r17 = r6;
                                                break;
                                            }
                                            r6.I0 = z9;
                                            MediaFormat mediaFormatZzc = r6.a0.zzc();
                                            if (r6.i0 != 0 && mediaFormatZzc.getInteger("width") == 32 && mediaFormatZzc.getInteger("height") == 32) {
                                                r6.q0 = z9;
                                            } else {
                                                r6.c0 = mediaFormatZzc;
                                                r6.d0 = z9;
                                            }
                                            zzeiVar = zzeiVar;
                                            r2 = r6;
                                            obj = obj3;
                                            r4 = r17;
                                            c = 0;
                                            j3 = r2.X;
                                            if (j3 != -9223372036854775807L) {
                                                z2 = true;
                                            } else {
                                                z2 = true;
                                            }
                                            if (!z2) {
                                                r17 = r2;
                                                break;
                                            }
                                            obj3 = obj;
                                            r6 = r2;
                                            r17 = r4;
                                            zzeiVar = zzeiVar;
                                            i3 = 2;
                                            z6 = false;
                                            z9 = true;
                                        }
                                    } else {
                                        if (r6.n0) {
                                            try {
                                                if (r6.H0) {
                                                    try {
                                                        bufferInfo = bufferInfo2;
                                                        c = 0;
                                                        try {
                                                            zD = D(j, j2, r6.a0, r6.w0, r6.v0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, r6.x0, r6.y0, r6.W);
                                                        } catch (IllegalStateException unused2) {
                                                            try {
                                                                P();
                                                                r17 = this;
                                                                try {
                                                                    if (r17.M0) {
                                                                        J();
                                                                    }
                                                                    r3 = r17;
                                                                } catch (IllegalStateException e5) {
                                                                    e = e5;
                                                                }
                                                            } catch (IllegalStateException e6) {
                                                                e = e6;
                                                                r17 = this;
                                                            }
                                                        }
                                                    } catch (IllegalStateException unused3) {
                                                        c = 0;
                                                    }
                                                } else {
                                                    bufferInfo = bufferInfo2;
                                                    c = 0;
                                                    try {
                                                        zD = D(j, j2, r6.a0, r6.w0, r6.v0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, r6.x0, r6.y0, r6.W);
                                                    } catch (IllegalStateException e7) {
                                                        e = e7;
                                                        r1 = r6;
                                                        r17 = r1;
                                                    }
                                                }
                                                if (zD) {
                                                    try {
                                                        zzqoVar = this;
                                                        try {
                                                            zzqoVar.I(bufferInfo.presentationTimeUs);
                                                            i2 = bufferInfo.flags;
                                                            zzqoVar.v0 = -1;
                                                            obj = null;
                                                            zzqoVar.w0 = null;
                                                            if ((i2 & 4) != 0) {
                                                                P();
                                                                r3 = zzqoVar;
                                                            } else {
                                                                r2 = zzqoVar;
                                                                r4 = zzqoVar;
                                                                try {
                                                                    j3 = r2.X;
                                                                    if (j3 != -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j3) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    if (!z2) {
                                                                        r17 = r2;
                                                                        break;
                                                                    }
                                                                    obj3 = obj;
                                                                    r6 = r2;
                                                                    r17 = r4;
                                                                    zzeiVar = zzeiVar;
                                                                    i3 = 2;
                                                                    z6 = false;
                                                                    z9 = true;
                                                                } catch (IllegalStateException e8) {
                                                                    e = e8;
                                                                    r17 = r2;
                                                                }
                                                            }
                                                        } catch (IllegalStateException e9) {
                                                            e = e9;
                                                            r17 = zzqoVar;
                                                        }
                                                    } catch (IllegalStateException e10) {
                                                        e = e10;
                                                        zzqoVar = this;
                                                    }
                                                } else {
                                                    r3 = this;
                                                }
                                            } catch (IllegalStateException e11) {
                                                e = e11;
                                                c = 0;
                                                r1 = r6;
                                                r17 = r1;
                                                i = zzel.zza;
                                                if (i >= 21) {
                                                    stackTrace = e.getStackTrace();
                                                    if (stackTrace.length > 0) {
                                                    }
                                                    throw e;
                                                }
                                                stackTrace = e.getStackTrace();
                                                if (stackTrace.length > 0) {
                                                }
                                                throw e;
                                                r17.r(e);
                                                if (i < 21) {
                                                    z = false;
                                                } else {
                                                    z = false;
                                                }
                                                if (z) {
                                                    J();
                                                }
                                                throw r17.b(r17.V, r17.F(e, r17.h0), z, 4003);
                                            }
                                        } else {
                                            bufferInfo = bufferInfo2;
                                            c = 0;
                                            zD = D(j, j2, r6.a0, r6.w0, r6.v0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, r6.x0, r6.y0, r6.W);
                                            if (zD) {
                                                zzqoVar = this;
                                                zzqoVar.I(bufferInfo.presentationTimeUs);
                                                i2 = bufferInfo.flags;
                                                zzqoVar.v0 = -1;
                                                obj = null;
                                                zzqoVar.w0 = null;
                                                if ((i2 & 4) != 0) {
                                                    P();
                                                    r3 = zzqoVar;
                                                } else {
                                                    r2 = zzqoVar;
                                                    r4 = zzqoVar;
                                                    j3 = r2.X;
                                                    if (j3 != -9223372036854775807L) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    if (!z2) {
                                                        r17 = r2;
                                                        break;
                                                    }
                                                    obj3 = obj;
                                                    r6 = r2;
                                                    r17 = r4;
                                                    zzeiVar = zzeiVar;
                                                    i3 = 2;
                                                    z6 = false;
                                                    z9 = true;
                                                }
                                            } else {
                                                r3 = this;
                                            }
                                        }
                                        r17 = r3;
                                        break;
                                    }
                                } catch (IllegalStateException e12) {
                                    e = e12;
                                    c = 0;
                                    r1 = r6;
                                }
                            }
                            while (v()) {
                                try {
                                    long j8 = r17.X;
                                    if (!(j8 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j8)) {
                                        break;
                                    }
                                } catch (IllegalStateException e13) {
                                    e = e13;
                                }
                            }
                            Trace.endSection();
                            r15 = r17;
                            r17 = r15;
                            r17.O0.zza();
                            return;
                        } catch (IllegalStateException e14) {
                            e = e14;
                            c = 0;
                        }
                    } else {
                        c = 0;
                        try {
                            zzgq zzgqVar = r17.O0;
                            int i8 = zzgqVar.zzd;
                            zztw zztwVar = r17.C;
                            zztwVar.getClass();
                            zzgqVar.zzd = i8 + zztwVar.zzb(j - r17.E);
                            try {
                                r17.w(1);
                                r17 = r17;
                                r17.O0.zza();
                                return;
                            } catch (IllegalStateException e15) {
                                e = e15;
                                r17 = r17;
                            }
                        } catch (IllegalStateException e16) {
                            e = e16;
                        }
                    }
                    r17 = r1;
                }
            } catch (IllegalStateException e17) {
                e = e17;
                c = 0;
                r1 = r6;
            }
            i = zzel.zza;
            if (i >= 21 || !(e instanceof MediaCodec.CodecException)) {
                stackTrace = e.getStackTrace();
                if (stackTrace.length > 0 || !stackTrace[c].getClassName().equals("android.media.MediaCodec")) {
                    throw e;
                }
            }
            r17.r(e);
            if (i < 21 && (e instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e).isRecoverable()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                J();
            }
            throw r17.b(r17.V, r17.F(e, r17.h0), z, 4003);
        } catch (IllegalStateException e18) {
            e = e18;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public boolean zzM() {
        return this.M0;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public boolean zzN() {
        boolean zZze;
        if (this.V == null) {
            return false;
        }
        if (zzG()) {
            zZze = this.G;
        } else {
            zztw zztwVar = this.C;
            zztwVar.getClass();
            zZze = zztwVar.zze();
        }
        if (!zZze) {
            if (!(this.v0 >= 0)) {
                return this.t0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.t0;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public final int zzO(zzaf zzafVar) throws zzgy {
        try {
            return k(this.J, zzafVar);
        } catch (zzqx e) {
            throw b(zzafVar, e, false, 4002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgp, com.google.android.gms.internal.ads.zzjz
    public final int zze() {
        return 8;
    }
}
