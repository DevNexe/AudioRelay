package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import defpackage.GM;
import defpackage.j06;
import defpackage.k06;
import defpackage.l06;
import defpackage.m06;
import defpackage.q06;
import defpackage.qc0;
import defpackage.r06;
import defpackage.s06;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaua {
    public int A;
    public long B;
    public int C;
    public long D;
    public int E;
    public long F;
    public long G;
    public long H;
    public float I;
    public zzath[] J;
    public ByteBuffer[] K;
    public ByteBuffer L;
    public ByteBuffer M;
    public byte[] N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public long U;
    public final q06 a;
    public final zzauh b;
    public final zzath[] c;
    public final zzatw d;
    public final ConditionVariable e = new ConditionVariable(true);
    public final long[] f;
    public final k06 g;
    public final LinkedList h;
    public AudioTrack i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public long o;
    public zzasw p;
    public zzasw q;
    public long r;
    public long s;
    public int t;
    public int u;
    public long v;
    public long w;
    public boolean x;
    public long y;
    public Method z;

    public zzaua(zzatf zzatfVar, zzath[] zzathVarArr, zzatw zzatwVar) {
        this.d = zzatwVar;
        if (zzban.zza >= 18) {
            try {
                this.z = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzban.zza >= 19) {
            this.g = new l06();
        } else {
            this.g = new k06();
        }
        q06 q06Var = new q06();
        this.a = q06Var;
        zzauh zzauhVar = new zzauh();
        this.b = zzauhVar;
        zzath[] zzathVarArr2 = {new s06(), q06Var, zzauhVar};
        this.c = zzathVarArr2;
        System.arraycopy(zzathVarArr, 0, zzathVarArr2, 2, 0);
        this.f = new long[10];
        this.I = 1.0f;
        this.E = 0;
        this.S = 0;
        this.q = zzasw.zza;
        this.P = -1;
        this.J = new zzath[0];
        this.K = new ByteBuffer[0];
        this.h = new LinkedList();
    }

    public final void a(long j) throws zzatz {
        ByteBuffer byteBuffer;
        int length = this.J.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.K[i - 1];
            } else {
                byteBuffer = this.L;
                if (byteBuffer == null) {
                    byteBuffer = zzath.zza;
                }
            }
            if (i == length) {
                g(byteBuffer);
            } else {
                zzath zzathVar = this.J[i];
                zzathVar.zzf(byteBuffer);
                ByteBuffer byteBufferZzc = zzathVar.zzc();
                this.K[i] = byteBufferZzc;
                if (byteBufferZzc.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void b() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            zzath zzathVar = this.c[i];
            if (zzathVar.zzi()) {
                arrayList.add(zzathVar);
            } else {
                zzathVar.zzd();
            }
        }
        int size = arrayList.size();
        this.J = (zzath[]) arrayList.toArray(new zzath[size]);
        this.K = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzath zzathVar2 = this.J[i2];
            zzathVar2.zzd();
            this.K[i2] = zzathVar2.zzc();
        }
    }

    public final void c() {
        if (e()) {
            if (zzban.zza >= 21) {
                this.i.setVolume(this.I);
                return;
            }
            AudioTrack audioTrack = this.i;
            float f = this.I;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002a -> B:15:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final boolean d() {
        /*
            r8 = this;
            int r0 = r8.P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r8.P = r2
            r0 = r8
            goto L2f
        Lb:
            r4 = 0
            r0 = r8
        Ld:
            int r5 = r0.P
            com.google.android.gms.internal.ads.zzath[] r6 = r0.J
            int r7 = r6.length
            if (r5 >= r7) goto L31
            r5 = r6[r5]
            if (r4 == 0) goto L1b
            r5.zze()
        L1b:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.a(r6)
            boolean r4 = r5.zzj()
            if (r4 != 0) goto L2a
            return r2
        L2a:
            int r4 = r0.P
            int r4 = r4 + r1
            r0.P = r4
        L2f:
            r4 = 1
            goto Ld
        L31:
            java.nio.ByteBuffer r4 = r0.M
            if (r4 == 0) goto L3d
            r0.g(r4)
            java.nio.ByteBuffer r4 = r0.M
            if (r4 == 0) goto L3d
            return r2
        L3d:
            r0.P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaua.d():boolean");
    }

    public final boolean e() {
        return this.i != null;
    }

    public final boolean f() {
        if (zzban.zza >= 23) {
            return false;
        }
        int i = this.m;
        return i == 5 || i == 6;
    }

    public final void g(ByteBuffer byteBuffer) throws zzatz {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.M;
            int iWrite = 0;
            if (byteBuffer2 != null) {
                zzazy.zzc(byteBuffer2 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (zzban.zza < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.N = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.N, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.O = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (zzban.zza < 21) {
                int iA = this.n - ((int) (this.D - (this.g.a() * ((long) this.C))));
                if (iA > 0) {
                    iWrite = this.i.write(this.N, this.O, Math.min(iRemaining2, iA));
                    if (iWrite > 0) {
                        this.O += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                }
            } else {
                iWrite = this.i.write(byteBuffer, iRemaining2, 1);
            }
            this.U = SystemClock.elapsedRealtime();
            if (iWrite < 0) {
                throw new zzatz(iWrite);
            }
            this.D += (long) iWrite;
            if (iWrite == iRemaining2) {
                this.M = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f4  */
    public final long zza(boolean z) {
        k06 k06Var;
        long jA;
        LinkedList linkedList;
        long jZzj;
        if (!e() || this.E == 0) {
            return Long.MIN_VALUE;
        }
        int playState = this.i.getPlayState();
        k06 k06Var2 = this.g;
        if (playState == 3) {
            long jA2 = (k06Var2.a() * 1000000) / ((long) k06Var2.c);
            if (jA2 == 0) {
                k06Var = k06Var2;
            } else {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.w >= 30000) {
                    int i = this.t;
                    long[] jArr = this.f;
                    jArr[i] = jA2 - jNanoTime;
                    this.t = (i + 1) % 10;
                    int i2 = this.u;
                    if (i2 < 10) {
                        this.u = i2 + 1;
                    }
                    this.w = jNanoTime;
                    this.v = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.u;
                        if (i3 >= i4) {
                            break;
                        }
                        this.v = (jArr[i3] / ((long) i4)) + this.v;
                        i3++;
                    }
                }
                if (f() || jNanoTime - this.y < 500000) {
                    k06Var = k06Var2;
                } else {
                    boolean zE = k06Var2.e();
                    this.x = zE;
                    if (zE) {
                        long jC = k06Var2.c() / 1000;
                        long jB = k06Var2.b();
                        if (jC < this.G) {
                            this.x = false;
                        } else if (Math.abs(jC - jNanoTime) > 5000000) {
                            StringBuilder sbB = qc0.b("Spurious audio timestamp (system clock mismatch): ", jB, ", ");
                            sbB.append(jC);
                            sbB.append(", ");
                            sbB.append(jNanoTime);
                            sbB.append(", ");
                            sbB.append(jA2);
                            Log.w("AudioTrack", sbB.toString());
                            this.x = false;
                        } else {
                            k06Var = k06Var2;
                            if (Math.abs(((1000000 * jB) / ((long) this.j)) - jA2) > 5000000) {
                                StringBuilder sbB2 = qc0.b("Spurious audio timestamp (frame position mismatch): ", jB, ", ");
                                sbB2.append(jC);
                                sbB2.append(", ");
                                sbB2.append(jNanoTime);
                                sbB2.append(", ");
                                sbB2.append(jA2);
                                Log.w("AudioTrack", sbB2.toString());
                                this.x = false;
                            }
                        }
                        k06Var = k06Var2;
                    } else {
                        k06Var = k06Var2;
                    }
                    Method method = this.z;
                    if (method != null) {
                        try {
                            long jIntValue = (((long) ((Integer) method.invoke(this.i, null)).intValue()) * 1000) - this.o;
                            this.H = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.H = jMax;
                            if (jMax > 5000000) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + jMax);
                                this.H = 0L;
                            }
                        } catch (Exception unused) {
                            this.z = null;
                        }
                    }
                    this.y = jNanoTime;
                }
            }
        } else {
            k06Var = k06Var2;
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        if (this.x) {
            jA = ((k06Var.b() + (((jNanoTime2 - (k06Var.c() / 1000)) * ((long) this.j)) / 1000000)) * 1000000) / ((long) this.j);
        } else {
            jA = this.u == 0 ? (k06Var.a() * 1000000) / ((long) k06Var.c) : jNanoTime2 + this.v;
            if (!z) {
                jA -= this.H;
            }
        }
        long j = this.F;
        while (true) {
            linkedList = this.h;
            if (linkedList.isEmpty() || jA < ((m06) linkedList.getFirst()).c) {
                break;
            }
            m06 m06Var = (m06) linkedList.remove();
            this.q = m06Var.a;
            this.s = m06Var.c;
            this.r = m06Var.b - this.F;
        }
        if (this.q.zzb == 1.0f) {
            jZzj = (jA + this.r) - this.s;
        } else if (linkedList.isEmpty()) {
            zzauh zzauhVar = this.b;
            if (zzauhVar.zzn() >= 1024) {
                jZzj = zzban.zzj(jA - this.s, zzauhVar.zzm(), zzauhVar.zzn()) + this.r;
            } else {
                jZzj = ((long) (((double) this.q.zzb) * (jA - this.s))) + this.r;
            }
        } else {
            jZzj = ((long) (((double) this.q.zzb) * (jA - this.s))) + this.r;
        }
        return j + jZzj;
    }

    public final zzasw zzc() {
        return this.q;
    }

    public final zzasw zzd(zzasw zzaswVar) {
        float f = zzaswVar.zzb;
        zzauh zzauhVar = this.b;
        float fZzl = zzauhVar.zzl(f);
        zzauhVar.zzk(1.0f);
        zzasw zzaswVar2 = new zzasw(fZzl, 1.0f);
        zzasw zzaswVar3 = this.p;
        if (zzaswVar3 == null) {
            LinkedList linkedList = this.h;
            zzaswVar3 = !linkedList.isEmpty() ? ((m06) linkedList.getLast()).a : this.q;
        }
        if (!zzaswVar2.equals(zzaswVar3)) {
            if (e()) {
                this.p = zzaswVar2;
            } else {
                this.q = zzaswVar2;
            }
        }
        return this.q;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    public final void zze(String str, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        this.A = zzban.zzi(i3, i);
        this.a.c = iArr;
        boolean zZzh = false;
        for (int i6 = 0; i6 < 3; i6++) {
            zzath zzathVar = this.c[i6];
            try {
                zZzh |= zzathVar.zzh(i2, i, i3);
                if (zzathVar.zzi()) {
                    i = zzathVar.zza();
                    zzathVar.zzb();
                    i3 = 2;
                }
            } catch (zzatg e) {
                throw new zzatu(e);
            }
        }
        if (zZzh) {
            b();
        }
        int i7 = 252;
        switch (i) {
            case 1:
                i5 = 4;
                break;
            case 2:
                i5 = 12;
                break;
            case 3:
                i5 = 28;
                break;
            case 4:
                i5 = 204;
                break;
            case 5:
                i5 = 220;
                break;
            case 6:
                i5 = 252;
                break;
            case 7:
                i5 = 1276;
                break;
            case 8:
                i5 = zzasd.zza;
                break;
            default:
                throw new zzatu(GM.a("Unsupported channel count: ", i));
        }
        int i8 = zzban.zza;
        if (i8 > 23 || !"foster".equals(zzban.zzb) || !"NVIDIA".equals(zzban.zzc)) {
            i7 = i5;
        } else if (i != 3 && i != 5) {
            if (i != 7) {
                i7 = i5;
            } else {
                i7 = zzasd.zza;
            }
        }
        if (i8 <= 25) {
            "fugu".equals(zzban.zzb);
        }
        if (!zZzh && e() && this.l == i3 && this.j == i2 && this.k == i7) {
            return;
        }
        zzk();
        this.l = i3;
        this.j = i2;
        this.k = i7;
        this.m = 2;
        this.C = zzban.zzi(2, i);
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i7, this.m);
        zzazy.zze(minBufferSize != -2);
        int i9 = minBufferSize * 4;
        int i10 = this.j;
        int i11 = this.C;
        int i12 = ((int) ((((long) i10) * 250000) / 1000000)) * i11;
        int iMax = (int) Math.max(minBufferSize, ((((long) i10) * 750000) / 1000000) * ((long) i11));
        if (i9 < i12) {
            i9 = i12;
        } else if (i9 > iMax) {
            i9 = iMax;
        }
        this.n = i9;
        this.o = (((long) (i9 / this.C)) * 1000000) / ((long) this.j);
        zzd(this.q);
    }

    public final void zzf() {
        if (this.E == 1) {
            this.E = 2;
        }
    }

    public final void zzg() {
        this.R = false;
        if (e()) {
            this.v = 0L;
            this.u = 0;
            this.t = 0;
            this.w = 0L;
            this.x = false;
            this.y = 0L;
            k06 k06Var = this.g;
            if (k06Var.g != -9223372036854775807L) {
                return;
            }
            k06Var.a.pause();
        }
    }

    public final void zzh() {
        this.R = true;
        if (e()) {
            this.G = System.nanoTime() / 1000;
            this.i.play();
        }
    }

    public final void zzi() {
        if (!this.Q && e() && d()) {
            k06 k06Var = this.g;
            long j = this.D / ((long) this.C);
            k06Var.h = k06Var.a();
            k06Var.g = SystemClock.elapsedRealtime() * 1000;
            k06Var.i = j;
            k06Var.a.stop();
            this.Q = true;
        }
    }

    public final void zzj() {
        zzk();
        for (int i = 0; i < 3; i++) {
            this.c[i].zzg();
        }
        this.S = 0;
        this.R = false;
    }

    public final void zzk() {
        if (e()) {
            this.B = 0L;
            this.D = 0L;
            zzasw zzaswVar = this.p;
            LinkedList linkedList = this.h;
            if (zzaswVar != null) {
                this.q = zzaswVar;
                this.p = null;
            } else if (!linkedList.isEmpty()) {
                this.q = ((m06) linkedList.getLast()).a;
            }
            linkedList.clear();
            this.r = 0L;
            this.s = 0L;
            this.L = null;
            this.M = null;
            int i = 0;
            while (true) {
                zzath[] zzathVarArr = this.J;
                if (i >= zzathVarArr.length) {
                    break;
                }
                zzath zzathVar = zzathVarArr[i];
                zzathVar.zzd();
                this.K[i] = zzathVar.zzc();
                i++;
            }
            this.Q = false;
            this.P = -1;
            this.E = 0;
            this.H = 0L;
            this.v = 0L;
            this.u = 0;
            this.t = 0;
            this.w = 0L;
            this.x = false;
            this.y = 0L;
            if (this.i.getPlayState() == 3) {
                this.i.pause();
            }
            AudioTrack audioTrack = this.i;
            this.i = null;
            this.g.d(null, false);
            this.e.close();
            new j06(this, audioTrack).start();
        }
    }

    public final void zzl(float f) {
        if (this.I != f) {
            this.I = f;
            c();
        }
    }

    public final boolean zzm(ByteBuffer byteBuffer, long j) throws zzatv, zzatz {
        long j2;
        int i;
        ByteBuffer byteBuffer2 = this.L;
        zzazy.zzc(byteBuffer2 == null || byteBuffer == byteBuffer2);
        boolean zE = e();
        k06 k06Var = this.g;
        zzatw zzatwVar = this.d;
        if (!zE) {
            this.e.block();
            int i2 = this.S;
            if (i2 == 0) {
                this.i = new AudioTrack(3, this.j, this.k, this.m, this.n, 1);
            } else {
                this.i = new AudioTrack(3, this.j, this.k, this.m, this.n, 1, i2);
            }
            int state = this.i.getState();
            if (state != 1) {
                try {
                    this.i.release();
                } catch (Exception unused) {
                } finally {
                    this.i = null;
                }
                throw new zzatv(state, this.j, this.k, this.n);
            }
            int audioSessionId = this.i.getAudioSessionId();
            if (this.S != audioSessionId) {
                this.S = audioSessionId;
                ((r06) zzatwVar).a.Q.zzb(audioSessionId);
            }
            k06Var.d(this.i, f());
            c();
            this.T = false;
            if (this.R) {
                zzh();
            }
        }
        if (f()) {
            if (this.i.getPlayState() == 2) {
                this.T = false;
                return false;
            }
            if (this.i.getPlayState() == 1 && k06Var.a() != 0) {
                return false;
            }
        }
        boolean z = this.T;
        boolean zZzn = zzn();
        this.T = zZzn;
        if (z && !zZzn && this.i.getPlayState() != 1) {
            ((r06) zzatwVar).a.Q.zzc(this.n, zzasd.zzb(this.o), SystemClock.elapsedRealtime() - this.U);
        }
        if (this.L != null) {
            j2 = j;
        } else {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.p != null) {
                if (!d()) {
                    return false;
                }
                this.h.add(new m06(this.p, Math.max(0L, j), ((this.D / ((long) this.C)) * 1000000) / ((long) this.j)));
                this.p = null;
                b();
            }
            int i3 = this.E;
            if (i3 == 0) {
                j2 = j;
                this.F = Math.max(0L, j2);
                this.E = 1;
            } else {
                j2 = j;
                long j3 = (((this.B / ((long) this.A)) * 1000000) / ((long) this.j)) + this.F;
                if (i3 != 1 || Math.abs(j3 - j2) <= 200000) {
                    i = 2;
                } else {
                    StringBuilder sbB = qc0.b("Discontinuity detected [expected ", j3, ", got ");
                    sbB.append(j2);
                    sbB.append("]");
                    Log.e("AudioTrack", sbB.toString());
                    i = 2;
                    this.E = 2;
                }
                if (this.E == i) {
                    this.F = (j2 - j3) + this.F;
                    this.E = 1;
                    ((r06) zzatwVar).a.W = true;
                }
            }
            this.B += (long) byteBuffer.remaining();
            this.L = byteBuffer;
        }
        a(j2);
        if (this.L.hasRemaining()) {
            return false;
        }
        this.L = null;
        return true;
    }

    public final boolean zzn() {
        if (e()) {
            if (this.D / ((long) this.C) > this.g.a()) {
                return true;
            }
            if (f() && this.i.getPlayState() == 2 && this.i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzo() {
        if (e()) {
            return this.Q && !zzn();
        }
        return true;
    }
}
