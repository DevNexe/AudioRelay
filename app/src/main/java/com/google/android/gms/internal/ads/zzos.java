package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.revenuecat.purchases.common.UtilsKt;
import defpackage.GM;
import defpackage.b77;
import defpackage.b87;
import defpackage.bj0;
import defpackage.d77;
import defpackage.e87;
import defpackage.h87;
import defpackage.i77;
import defpackage.m77;
import defpackage.n67;
import defpackage.p67;
import defpackage.q77;
import defpackage.qc0;
import defpackage.v77;
import defpackage.v87;
import defpackage.w67;
import defpackage.ys5;
import defpackage.z67;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzos implements zznw {
    public long A;
    public float B;
    public zzne[] C;
    public ByteBuffer[] D;
    public ByteBuffer E;
    public int F;
    public ByteBuffer G;
    public byte[] H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public zzl P;
    public long Q;
    public boolean R;
    public boolean S;
    public final zzoi T;
    public final zznb a;
    public final z67 b;
    public final v87 c;
    public final zzne[] d;
    public final zzne[] e;
    public final ConditionVariable f;
    public final w67 g;
    public final ArrayDeque h;
    public v77 i;
    public final ys5 j;
    public final ys5 k;
    public zzmz l;
    public zznt m;
    public i77 n;
    public i77 o;
    public AudioTrack p;
    public zzk q;
    public m77 r;
    public m77 s;
    public long t;
    public long u;
    public long v;
    public long w;
    public int x;
    public boolean y;
    public boolean z;

    public /* synthetic */ zzos(zzog zzogVar) {
        this.a = zzogVar.a;
        zzoi zzoiVar = zzogVar.b;
        this.T = zzoiVar;
        int i = zzel.zza;
        this.f = new ConditionVariable(true);
        this.g = new w67(new q77(this));
        z67 z67Var = new z67();
        this.b = z67Var;
        v87 v87Var = new v87();
        this.c = v87Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new h87(), z67Var, v87Var);
        Collections.addAll(arrayList, zzoiVar.zze());
        this.d = (zzne[]) arrayList.toArray(new zzne[0]);
        this.e = new zzne[]{new b87()};
        this.B = 1.0f;
        this.q = zzk.zza;
        this.O = 0;
        this.P = new zzl(0, 0.0f);
        this.s = new m77(zzby.zza, false, 0L, 0L);
        this.J = -1;
        this.C = new zzne[0];
        this.D = new ByteBuffer[0];
        this.h = new ArrayDeque();
        this.j = new ys5();
        this.k = new ys5();
    }

    public static boolean l(AudioTrack audioTrack) {
        return zzel.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final long a() {
        i77 i77Var = this.o;
        return i77Var.c == 0 ? this.t / ((long) i77Var.b) : this.u;
    }

    public final long b() {
        i77 i77Var = this.o;
        return i77Var.c == 0 ? this.v / ((long) i77Var.d) : this.w;
    }

    public final m77 c() {
        m77 m77Var = this.r;
        if (m77Var != null) {
            return m77Var;
        }
        ArrayDeque arrayDeque = this.h;
        return !arrayDeque.isEmpty() ? (m77) arrayDeque.getLast() : this.s;
    }

    public final void d(long j) {
        boolean z;
        zzby zzbyVar;
        boolean z2;
        boolean z3 = true;
        int i = 0;
        if ("audio/raw".equals(this.o.a.zzm)) {
            int i2 = this.o.a.zzB;
            z = true;
        } else {
            z = false;
        }
        zzoi zzoiVar = this.T;
        if (z) {
            zzbyVar = c().a;
            zzoiVar.zzc(zzbyVar);
        } else {
            zzbyVar = zzby.zza;
        }
        zzby zzbyVar2 = zzbyVar;
        if ("audio/raw".equals(this.o.a.zzm)) {
            int i3 = this.o.a.zzB;
        } else {
            z3 = false;
        }
        if (z3) {
            z2 = c().b;
            zzoiVar.zzd(z2);
        } else {
            z2 = false;
        }
        this.h.add(new m77(zzbyVar2, z2, Math.max(0L, j), (b() * 1000000) / ((long) this.o.e)));
        zzne[] zzneVarArr = this.o.i;
        ArrayList arrayList = new ArrayList();
        for (zzne zzneVar : zzneVarArr) {
            if (zzneVar.zzg()) {
                arrayList.add(zzneVar);
            } else {
                zzneVar.zzc();
            }
        }
        int size = arrayList.size();
        this.C = (zzne[]) arrayList.toArray(new zzne[size]);
        this.D = new ByteBuffer[size];
        while (true) {
            zzne[] zzneVarArr2 = this.C;
            if (i >= zzneVarArr2.length) {
                break;
            }
            zzne zzneVar2 = zzneVarArr2[i];
            zzneVar2.zzc();
            this.D[i] = zzneVar2.zzb();
            i++;
        }
        zznt zzntVar = this.m;
        if (zzntVar != null) {
            ((e87) zzntVar).a.W0.zzs(z2);
        }
    }

    public final void e() {
        if (this.L) {
            return;
        }
        this.L = true;
        long jB = b();
        w67 w67Var = this.g;
        w67Var.z = w67Var.c();
        w67Var.x = SystemClock.elapsedRealtime() * 1000;
        w67Var.A = jB;
        this.p.stop();
    }

    public final void f(long j) throws zznv {
        ByteBuffer byteBuffer;
        int length = this.C.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.D[i - 1];
            } else {
                byteBuffer = this.E;
                if (byteBuffer == null) {
                    byteBuffer = zzne.zza;
                }
            }
            if (i == length) {
                i(byteBuffer);
            } else {
                zzne zzneVar = this.C[i];
                if (i > this.J) {
                    zzneVar.zze(byteBuffer);
                }
                ByteBuffer byteBufferZzb = zzneVar.zzb();
                this.D[i] = byteBufferZzb;
                if (byteBufferZzb.hasRemaining()) {
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

    public final void g(zzby zzbyVar, boolean z) {
        m77 m77VarC = c();
        if (zzbyVar.equals(m77VarC.a) && z == m77VarC.b) {
            return;
        }
        m77 m77Var = new m77(zzbyVar, z, -9223372036854775807L, -9223372036854775807L);
        if (k()) {
            this.r = m77Var;
        } else {
            this.s = m77Var;
        }
    }

    public final void h() {
        if (k()) {
            if (zzel.zza >= 21) {
                this.p.setVolume(this.B);
                return;
            }
            AudioTrack audioTrack = this.p;
            float f = this.B;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void i(ByteBuffer byteBuffer) throws zznv {
        int iWrite;
        zznt zzntVar;
        zzjx zzjxVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.G;
            if (byteBuffer2 != null) {
                zzdd.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.G = byteBuffer;
                if (zzel.zza < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.H;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.H = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.H, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.I = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i = zzel.zza;
            if (i < 21) {
                long j = this.v;
                w67 w67Var = this.g;
                int iC = w67Var.e - ((int) (j - (w67Var.c() * ((long) w67Var.d))));
                if (iC > 0) {
                    iWrite = this.p.write(this.H, this.I, Math.min(iRemaining2, iC));
                    if (iWrite > 0) {
                        this.I += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
            } else {
                iWrite = this.p.write(byteBuffer, iRemaining2, 1);
            }
            this.Q = SystemClock.elapsedRealtime();
            ys5 ys5Var = this.k;
            if (iWrite < 0) {
                boolean z = (i >= 24 && iWrite == -6) || iWrite == -32;
                if (z) {
                    if (this.o.c == 1) {
                        this.R = true;
                    }
                }
                zznv zznvVar = new zznv(iWrite, this.o.a, z);
                zznt zzntVar2 = this.m;
                if (zzntVar2 != null) {
                    zzntVar2.zza(zznvVar);
                }
                if (zznvVar.zzb) {
                    throw zznvVar;
                }
                ys5Var.a(zznvVar);
                return;
            }
            ys5Var.b = null;
            if (l(this.p)) {
                if (this.w > 0) {
                    this.S = false;
                }
                if (this.M && (zzntVar = this.m) != null && iWrite < iRemaining2 && !this.S && (zzjxVar = ((e87) zzntVar).a.f1) != null) {
                    zzjxVar.zza();
                }
            }
            int i2 = this.o.c;
            if (i2 == 0) {
                this.v += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i2 != 0) {
                    zzdd.zzf(byteBuffer == this.E);
                    this.w = (((long) this.x) * ((long) this.F)) + this.w;
                }
                this.G = null;
            }
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
    public final boolean j() {
        /*
            r8 = this;
            int r0 = r8.J
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r8.J = r2
            r0 = r8
            goto L2f
        Lb:
            r4 = 0
            r0 = r8
        Ld:
            int r5 = r0.J
            com.google.android.gms.internal.ads.zzne[] r6 = r0.C
            int r7 = r6.length
            if (r5 >= r7) goto L31
            r5 = r6[r5]
            if (r4 == 0) goto L1b
            r5.zzd()
        L1b:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f(r6)
            boolean r4 = r5.zzh()
            if (r4 != 0) goto L2a
            return r2
        L2a:
            int r4 = r0.J
            int r4 = r4 + r1
            r0.J = r4
        L2f:
            r4 = 1
            goto Ld
        L31:
            java.nio.ByteBuffer r4 = r0.G
            if (r4 == 0) goto L3d
            r0.i(r4)
            java.nio.ByteBuffer r4 = r0.G
            if (r4 == 0) goto L3d
            return r2
        L3d:
            r0.J = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzos.j():boolean");
    }

    public final boolean k() {
        return this.p != null;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final int zza(zzaf zzafVar) {
        if (!"audio/raw".equals(zzafVar.zzm)) {
            if (!this.R) {
                int i = zzel.zza;
            }
            return this.a.zza(zzafVar) != null ? 2 : 0;
        }
        if (zzel.zzV(zzafVar.zzB)) {
            return zzafVar.zzB != 2 ? 1 : 2;
        }
        bj0.b("Invalid PCM encoding: ", zzafVar.zzB, "DefaultAudioSink");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0237  */
    @Override // com.google.android.gms.internal.ads.zznw
    public final long zzb(boolean z) {
        w67 w67Var;
        zznz zznzVar;
        long jC;
        ArrayDeque arrayDeque;
        long jZzs;
        boolean z2;
        w67 w67Var2;
        Method method;
        if (!k() || this.z) {
            return Long.MIN_VALUE;
        }
        w67 w67Var3 = this.g;
        AudioTrack audioTrack = w67Var3.c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        zznz zznzVar2 = w67Var3.a;
        if (playState == 3) {
            long jC2 = (w67Var3.c() * 1000000) / ((long) w67Var3.g);
            if (jC2 == 0) {
                w67Var = w67Var3;
                zznzVar = zznzVar2;
            } else {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - w67Var3.m >= 30000) {
                    int i = w67Var3.v;
                    long[] jArr = w67Var3.b;
                    jArr[i] = jC2 - jNanoTime;
                    w67Var3.v = (i + 1) % 10;
                    int i2 = w67Var3.w;
                    if (i2 < 10) {
                        w67Var3.w = i2 + 1;
                    }
                    w67Var3.m = jNanoTime;
                    w67Var3.l = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = w67Var3.w;
                        if (i3 >= i4) {
                            break;
                        }
                        w67Var3.l = (jArr[i3] / ((long) i4)) + w67Var3.l;
                        i3++;
                    }
                }
                if (w67Var3.h) {
                    w67Var = w67Var3;
                    zznzVar = zznzVar2;
                } else {
                    p67 p67Var = w67Var3.f;
                    p67Var.getClass();
                    long j = jNanoTime - p67Var.e;
                    long j2 = p67Var.d;
                    n67 n67Var = p67Var.a;
                    if (j < j2) {
                        z2 = false;
                    } else {
                        p67Var.e = jNanoTime;
                        AudioTrack audioTrack2 = n67Var.a;
                        AudioTimestamp audioTimestamp = n67Var.b;
                        boolean timestamp = audioTrack2.getTimestamp(audioTimestamp);
                        if (timestamp) {
                            long j3 = audioTimestamp.framePosition;
                            if (n67Var.d > j3) {
                                n67Var.c++;
                            }
                            n67Var.d = j3;
                            n67Var.e = j3 + (n67Var.c << 32);
                        }
                        int i5 = p67Var.b;
                        if (i5 == 0) {
                            if (timestamp != 0) {
                                if (audioTimestamp.nanoTime / 1000 >= p67Var.c) {
                                    p67Var.f = n67Var.e;
                                    p67Var.a(1);
                                    z2 = true;
                                }
                            } else if (jNanoTime - p67Var.c <= 500000) {
                                z2 = timestamp;
                            } else {
                                p67Var.a(3);
                            }
                            z2 = false;
                        } else if (i5 == 1) {
                            if (timestamp == 0) {
                                p67Var.a(0);
                            } else if (n67Var.e > p67Var.f) {
                                p67Var.a(2);
                                z2 = true;
                            }
                            z2 = timestamp;
                        } else if (i5 != 2) {
                            if (i5 != 3) {
                                z2 = timestamp;
                            } else if (timestamp) {
                                p67Var.a(0);
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else if (timestamp != 0) {
                            z2 = true;
                        } else {
                            p67Var.a(0);
                            z2 = false;
                        }
                    }
                    if (z2) {
                        long j4 = n67Var.b.nanoTime / 1000;
                        long j5 = n67Var.e;
                        if (Math.abs(j4 - jNanoTime) > 5000000) {
                            q77 q77Var = (q77) zznzVar2;
                            zznzVar = zznzVar2;
                            long jA = q77Var.a.a();
                            w67Var2 = w67Var3;
                            long jB = q77Var.a.b();
                            StringBuilder sbB = qc0.b("Spurious audio timestamp (system clock mismatch): ", j5, ", ");
                            sbB.append(j4);
                            sbB.append(", ");
                            sbB.append(jNanoTime);
                            sbB.append(", ");
                            sbB.append(jC2);
                            sbB.append(", ");
                            sbB.append(jA);
                            sbB.append(", ");
                            sbB.append(jB);
                            Log.w("DefaultAudioSink", sbB.toString());
                            p67Var.a(4);
                        } else {
                            zznzVar = zznzVar2;
                            if (Math.abs(((1000000 * j5) / ((long) w67Var3.g)) - jC2) > 5000000) {
                                q77 q77Var2 = (q77) zznzVar;
                                long jA2 = q77Var2.a.a();
                                long jB2 = q77Var2.a.b();
                                w67Var2 = w67Var3;
                                StringBuilder sbB2 = qc0.b("Spurious audio timestamp (frame position mismatch): ", j5, ", ");
                                sbB2.append(j4);
                                sbB2.append(", ");
                                sbB2.append(jNanoTime);
                                sbB2.append(", ");
                                sbB2.append(jC2);
                                sbB2.append(", ");
                                sbB2.append(jA2);
                                sbB2.append(", ");
                                sbB2.append(jB2);
                                Log.w("DefaultAudioSink", sbB2.toString());
                                p67Var.a(4);
                            } else {
                                w67Var2 = w67Var3;
                                if (p67Var.b == 4) {
                                    p67Var.a(0);
                                }
                            }
                        }
                        w67Var = w67Var2;
                    } else {
                        w67Var = w67Var3;
                        zznzVar = zznzVar2;
                    }
                    if (w67Var.q && (method = w67Var.n) != null && jNanoTime - w67Var.r >= 500000) {
                        try {
                            AudioTrack audioTrack3 = w67Var.c;
                            audioTrack3.getClass();
                            Integer num = (Integer) method.invoke(audioTrack3, new Object[0]);
                            int i6 = zzel.zza;
                            long jIntValue = (((long) num.intValue()) * 1000) - w67Var.i;
                            w67Var.o = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            w67Var.o = jMax;
                            if (jMax > 5000000) {
                                Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + jMax);
                                w67Var.o = 0L;
                            }
                        } catch (Exception unused) {
                            w67Var.n = null;
                        }
                        w67Var.r = jNanoTime;
                    }
                }
            }
        } else {
            w67Var = w67Var3;
            zznzVar = zznzVar2;
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        p67 p67Var2 = w67Var.f;
        p67Var2.getClass();
        boolean z3 = p67Var2.b == 2;
        if (z3) {
            n67 n67Var2 = p67Var2.a;
            jC = zzel.zzs(jNanoTime2 - (n67Var2.b.nanoTime / 1000), w67Var.j) + ((n67Var2.e * 1000000) / ((long) w67Var.g));
        } else {
            jC = w67Var.w == 0 ? (w67Var.c() * 1000000) / ((long) w67Var.g) : w67Var.l + jNanoTime2;
            if (!z) {
                jC = Math.max(0L, jC - w67Var.o);
            }
        }
        if (w67Var.D != z3) {
            w67Var.F = w67Var.C;
            w67Var.E = w67Var.B;
        }
        long j6 = jNanoTime2 - w67Var.F;
        if (j6 < 1000000) {
            long j7 = (j6 * 1000) / 1000000;
            jC = (((zzel.zzs(j6, w67Var.j) + w67Var.E) * (1000 - j7)) + (jC * j7)) / 1000;
        }
        if (!w67Var.k) {
            long j8 = w67Var.B;
            if (jC > j8) {
                w67Var.k = true;
                long jCurrentTimeMillis = System.currentTimeMillis() - zzel.zzz(zzel.zzu(zzel.zzz(jC - j8), w67Var.j));
                zznt zzntVar = ((q77) zznzVar).a.m;
                if (zzntVar != null) {
                    ((e87) zzntVar).a.W0.zzr(jCurrentTimeMillis);
                }
            }
        }
        w67Var.C = jNanoTime2;
        w67Var.B = jC;
        w67Var.D = z3;
        long jMin = Math.min(jC, (b() * 1000000) / ((long) this.o.e));
        while (true) {
            arrayDeque = this.h;
            if (arrayDeque.isEmpty() || jMin < ((m77) arrayDeque.getFirst()).d) {
                break;
            }
            this.s = (m77) arrayDeque.remove();
        }
        m77 m77Var = this.s;
        long j9 = jMin - m77Var.d;
        boolean zEquals = m77Var.a.equals(zzby.zza);
        zzoi zzoiVar = this.T;
        if (zEquals) {
            jZzs = this.s.c + j9;
        } else if (arrayDeque.isEmpty()) {
            jZzs = zzoiVar.zza(j9) + this.s.c;
        } else {
            m77 m77Var2 = (m77) arrayDeque.getFirst();
            jZzs = m77Var2.c - zzel.zzs(m77Var2.d - jMin, this.s.a.zzc);
        }
        return ((zzoiVar.zzb() * 1000000) / ((long) this.o.e)) + jZzs;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final zzby zzc() {
        return c().a;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzd(zzaf zzafVar, int i, int[] iArr) throws zznr {
        int i2;
        zzne[] zzneVarArr;
        int iIntValue;
        int iZzo;
        int iIntValue2;
        int i3;
        int iZzo2;
        int i4;
        int i5;
        int iZzf;
        zzne[] zzneVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(zzafVar.zzm)) {
            zzdd.zzd(zzel.zzV(zzafVar.zzB));
            iZzo = zzel.zzo(zzafVar.zzB, zzafVar.zzz);
            int i6 = zzafVar.zzC;
            int i7 = zzafVar.zzD;
            v87 v87Var = this.c;
            v87Var.h = i6;
            v87Var.i = i7;
            if (zzel.zza < 21 && zzafVar.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i8 = 0; i8 < 6; i8++) {
                    iArr2[i8] = i8;
                }
            } else {
                iArr2 = iArr;
            }
            this.b.h = iArr2;
            zznc zzncVar = new zznc(zzafVar.zzA, zzafVar.zzz, zzafVar.zzB);
            zzne[] zzneVarArr3 = this.d;
            for (zzne zzneVar : zzneVarArr3) {
                try {
                    zznc zzncVarZza = zzneVar.zza(zzncVar);
                    if (true == zzneVar.zzg()) {
                        zzncVar = zzncVarZza;
                    }
                } catch (zznd e) {
                    throw new zznr(e, zzafVar);
                }
            }
            int i9 = zzncVar.zzd;
            int i10 = zzncVar.zzb;
            int i11 = zzncVar.zzc;
            int iZzj = zzel.zzj(i11);
            iZzo2 = zzel.zzo(i9, i11);
            zzneVarArr = zzneVarArr3;
            i3 = i10;
            i2 = 0;
            iIntValue = i9;
            iIntValue2 = iZzj;
        } else {
            zzne[] zzneVarArr4 = new zzne[0];
            int i12 = zzafVar.zzA;
            int i13 = zzel.zza;
            Pair pairZza = this.a.zza(zzafVar);
            if (pairZza == null) {
                throw new zznr("Unable to configure passthrough for: ".concat(String.valueOf(zzafVar)), zzafVar);
            }
            i2 = 2;
            zzneVarArr = zzneVarArr4;
            iIntValue = ((Integer) pairZza.first).intValue();
            iZzo = -1;
            iIntValue2 = ((Integer) pairZza.second).intValue();
            i3 = i12;
            iZzo2 = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue2, iIntValue);
        zzdd.zzf(minBufferSize != -2);
        int i14 = 250000;
        if (i2 == 0) {
            long j = i3;
            i4 = iZzo2;
            i5 = iIntValue;
            long j2 = i4;
            iZzf = zzel.zzf(minBufferSize * 4, zzfxa.zza(((((long) 250000) * j) * j2) / 1000000), zzfxa.zza(((((long) 750000) * j) * j2) / 1000000));
        } else if (i2 != 1) {
            int i15 = 5;
            if (iIntValue == 5) {
                i14 = 500000;
                iIntValue = 5;
            } else {
                i15 = iIntValue;
            }
            iZzf = zzfxa.zza((((long) i14) * ((long) zzou.a(iIntValue))) / 1000000);
            i4 = iZzo2;
            i5 = i15;
        } else {
            iZzf = zzfxa.zza((((long) zzou.a(iIntValue)) * 50000000) / 1000000);
            i4 = iZzo2;
            i5 = iIntValue;
        }
        int iMax = (((Math.max(minBufferSize, iZzf) + i4) - 1) / i4) * i4;
        if (i5 == 0) {
            throw new zznr("Invalid output encoding (mode=" + i2 + ") for: " + String.valueOf(zzafVar), zzafVar);
        }
        if (iIntValue2 == 0) {
            throw new zznr("Invalid output channel config (mode=" + i2 + ") for: " + String.valueOf(zzafVar), zzafVar);
        }
        this.R = false;
        i77 i77Var = new i77(zzafVar, iZzo, i2, i4, i3, iIntValue2, i5, iMax, zzneVarArr2);
        if (k()) {
            zzneVarArr2 = zzneVarArr;
            this.n = i77Var;
        } else {
            zzneVarArr2 = zzneVarArr;
            this.o = i77Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zze() {
        if (k()) {
            this.t = 0L;
            this.u = 0L;
            this.v = 0L;
            this.w = 0L;
            this.S = false;
            this.x = 0;
            this.s = new m77(c().a, c().b, 0L, 0L);
            this.A = 0L;
            this.r = null;
            this.h.clear();
            this.E = null;
            this.F = 0;
            this.G = null;
            this.L = false;
            this.K = false;
            this.J = -1;
            this.c.n = 0L;
            int i = 0;
            while (true) {
                zzne[] zzneVarArr = this.C;
                if (i >= zzneVarArr.length) {
                    break;
                }
                zzne zzneVar = zzneVarArr[i];
                zzneVar.zzc();
                this.D[i] = zzneVar.zzb();
                i++;
            }
            w67 w67Var = this.g;
            AudioTrack audioTrack = w67Var.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.p.pause();
            }
            if (l(this.p)) {
                v77 v77Var = this.i;
                v77Var.getClass();
                this.p.unregisterStreamEventCallback(v77Var.b);
                v77Var.a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.p;
            this.p = null;
            if (zzel.zza < 21 && !this.N) {
                this.O = 0;
            }
            i77 i77Var = this.n;
            if (i77Var != null) {
                this.o = i77Var;
                this.n = null;
            }
            w67Var.l = 0L;
            w67Var.w = 0;
            w67Var.v = 0;
            w67Var.m = 0L;
            w67Var.C = 0L;
            w67Var.F = 0L;
            w67Var.k = false;
            w67Var.c = null;
            w67Var.f = null;
            this.f.close();
            new b77(this, audioTrack2).start();
        }
        this.k.b = null;
        this.j.b = null;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzf() {
        this.y = true;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzg() {
        boolean z = false;
        this.M = false;
        if (k()) {
            w67 w67Var = this.g;
            w67Var.l = 0L;
            w67Var.w = 0;
            w67Var.v = 0;
            w67Var.m = 0L;
            w67Var.C = 0L;
            w67Var.F = 0L;
            w67Var.k = false;
            if (w67Var.x == -9223372036854775807L) {
                p67 p67Var = w67Var.f;
                p67Var.getClass();
                p67Var.a(0);
                z = true;
            }
            if (z) {
                this.p.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzh() {
        this.M = true;
        if (k()) {
            p67 p67Var = this.g.f;
            p67Var.getClass();
            p67Var.a(0);
            this.p.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzi() {
        if (!this.K && k() && j()) {
            e();
            this.K = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzj() {
        zze();
        for (zzne zzneVar : this.d) {
            zzneVar.zzf();
        }
        zzne[] zzneVarArr = this.e;
        int length = zzneVarArr.length;
        for (int i = 0; i <= 0; i++) {
            zzneVarArr[i].zzf();
        }
        this.M = false;
        this.R = false;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzk(zzk zzkVar) {
        if (this.q.equals(zzkVar)) {
            return;
        }
        this.q = zzkVar;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzl(int i) {
        if (this.O != i) {
            this.O = i;
            this.N = i != 0;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzm(zzl zzlVar) {
        if (this.P.equals(zzlVar)) {
            return;
        }
        int i = zzlVar.zza;
        if (this.p != null) {
            int i2 = this.P.zza;
        }
        this.P = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzn(zznt zzntVar) {
        this.m = zzntVar;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzo(zzby zzbyVar) {
        g(new zzby(zzel.zza(zzbyVar.zzc, 0.1f, 8.0f), zzel.zza(zzbyVar.zzd, 0.1f, 8.0f)), c().b);
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzp(zzmz zzmzVar) {
        this.l = zzmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzq(boolean z) {
        g(c().a, z);
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzr(float f) {
        if (this.B != f) {
            this.B = f;
            h();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:180:0x032d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0170  */
    /* JADX WARN: Code duplicated, block: B:85:0x0173  */
    /* JADX WARN: Code duplicated, block: B:86:0x0174 A[Catch: zzns -> 0x0177, TryCatch #2 {zzns -> 0x0177, blocks: (B:36:0x0089, B:54:0x00dc, B:56:0x00e4, B:58:0x00ea, B:59:0x00f1, B:60:0x010c, B:62:0x0112, B:64:0x0116, B:65:0x011b, B:69:0x0133, B:49:0x00a8, B:51:0x00b1, B:80:0x0167, B:87:0x0176, B:86:0x0174, B:37:0x008e, B:42:0x009d, B:46:0x00a5, B:45:0x00a2), top: B:229:0x0089, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.google.android.gms.internal.ads.zzoo] */
    @Override // com.google.android.gms.internal.ads.zznw
    public final boolean zzs(ByteBuffer byteBuffer, long j, int i) throws zznv, zzns {
        boolean z;
        AudioTrack audioTrackA;
        boolean z2;
        zzmz zzmzVar;
        boolean z3;
        boolean z4;
        int i2;
        long jZzz;
        q77 q77Var;
        int i3;
        boolean z5;
        int iZza;
        int i4;
        int i5;
        byte b;
        int i6;
        ByteBuffer byteBuffer2 = this.E;
        zzdd.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        Object obj = null;
        if (this.n != null) {
            if (!j()) {
                return false;
            }
            i77 i77Var = this.n;
            i77 i77Var2 = this.o;
            if (i77Var2.c == i77Var.c && i77Var2.g == i77Var.g && i77Var2.e == i77Var.e && i77Var2.f == i77Var.f && i77Var2.d == i77Var.d) {
                this.o = i77Var;
                this.n = null;
                if (l(this.p)) {
                    if (this.p.getPlayState() == 3) {
                        this.p.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.p;
                    zzaf zzafVar = this.o.a;
                    audioTrack.setOffloadDelayPadding(zzafVar.zzC, zzafVar.zzD);
                    this.S = true;
                }
            } else {
                e();
                if (zzt()) {
                    return false;
                }
                zze();
            }
            d(j);
        }
        boolean zK = k();
        ys5 ys5Var = this.j;
        if (zK) {
            z2 = false;
        } else {
            try {
                this.f.block();
                try {
                    i77 i77Var3 = this.o;
                    i77Var3.getClass();
                    try {
                        audioTrackA = i77Var3.a(this.q, this.O);
                    } catch (zzns e) {
                        zznt zzntVar = this.m;
                        if (zzntVar != null) {
                            zzntVar.zza(e);
                        }
                        throw e;
                    }
                } catch (zzns e2) {
                    i77 i77Var4 = this.o;
                    if (i77Var4.h > 1000000) {
                        i77 i77Var5 = new i77(i77Var4.a, i77Var4.b, i77Var4.c, i77Var4.d, i77Var4.e, i77Var4.f, i77Var4.g, UtilsKt.MICROS_MULTIPLIER, i77Var4.i);
                        try {
                            try {
                                audioTrackA = i77Var5.a(this.q, this.O);
                                this.o = i77Var5;
                            } catch (zzns e3) {
                                zznt zzntVar2 = this.m;
                                if (zzntVar2 != null) {
                                    zzntVar2.zza(e3);
                                }
                                throw e3;
                            }
                        } catch (zzns e4) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e2, e4);
                            } catch (Exception unused) {
                            }
                            if (this.o.c == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                throw e2;
                            }
                            this.R = true;
                            throw e2;
                        }
                    }
                    if (this.o.c == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw e2;
                    }
                    this.R = true;
                    throw e2;
                }
                this.p = audioTrackA;
                if (l(audioTrackA)) {
                    AudioTrack audioTrack2 = this.p;
                    if (this.i == null) {
                        this.i = new v77(this);
                    }
                    v77 v77Var = this.i;
                    final Handler handler = v77Var.a;
                    audioTrack2.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzoo
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            handler.post(runnable);
                        }
                    }, v77Var.b);
                    AudioTrack audioTrack3 = this.p;
                    zzaf zzafVar2 = this.o.a;
                    audioTrack3.setOffloadDelayPadding(zzafVar2.zzC, zzafVar2.zzD);
                }
                if (zzel.zza >= 31 && (zzmzVar = this.l) != null) {
                    d77.a(this.p, zzmzVar);
                }
                this.O = this.p.getAudioSessionId();
                w67 w67Var = this.g;
                AudioTrack audioTrack4 = this.p;
                i77 i77Var6 = this.o;
                w67Var.a(audioTrack4, i77Var6.c == 2, i77Var6.g, i77Var6.d, i77Var6.h);
                h();
                int i7 = this.P.zza;
                this.z = true;
                z2 = false;
                obj = null;
            } catch (zzns e5) {
                if (e5.zzb) {
                    throw e5;
                }
                ys5Var.a(e5);
                return false;
            }
        }
        ys5Var.b = obj;
        if (this.z) {
            this.A = Math.max(0L, j);
            this.y = z2;
            this.z = z2;
            d(j);
            if (this.M) {
                zzh();
            }
        }
        long jB = b();
        w67 w67Var2 = this.g;
        AudioTrack audioTrack5 = w67Var2.c;
        audioTrack5.getClass();
        int playState = audioTrack5.getPlayState();
        if (w67Var2.h) {
            if (playState == 2) {
                w67Var2.p = false;
            } else {
                if (playState == 1) {
                    if (w67Var2.c() != 0) {
                        playState = 1;
                    }
                }
                z3 = w67Var2.p;
                boolean zB = w67Var2.b(jB);
                w67Var2.p = zB;
                if (z3) {
                    i2 = w67Var2.e;
                    jZzz = zzel.zzz(w67Var2.i);
                    q77Var = (q77) w67Var2.a;
                    if (q77Var.a.m != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        zzos zzosVar = q77Var.a;
                        ((e87) zzosVar.m).a.W0.zzt(i2, jZzz, jElapsedRealtime - zzosVar.Q);
                    }
                }
                z4 = true;
            }
            z4 = false;
        } else {
            z3 = w67Var2.p;
            boolean zB2 = w67Var2.b(jB);
            w67Var2.p = zB2;
            if (z3 && !zB2 && playState != 1) {
                i2 = w67Var2.e;
                jZzz = zzel.zzz(w67Var2.i);
                q77Var = (q77) w67Var2.a;
                if (q77Var.a.m != null) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    zzos zzosVar2 = q77Var.a;
                    ((e87) zzosVar2.m).a.W0.zzt(i2, jZzz, jElapsedRealtime2 - zzosVar2.Q);
                }
            }
            z4 = true;
        }
        if (!z4) {
            return false;
        }
        if (this.E == null) {
            zzdd.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            i77 i77Var7 = this.o;
            if (i77Var7.c != 0 && this.x == 0) {
                int i8 = i77Var7.g;
                switch (i8) {
                    case 5:
                    case 6:
                    case 18:
                        z5 = true;
                        iZza = zzyg.zza(byteBuffer);
                        this.x = iZza;
                        if (iZza == 0) {
                            return z5;
                        }
                        break;
                    case 7:
                    case 8:
                        int iPosition = byteBuffer.position();
                        byte b2 = byteBuffer.get(iPosition);
                        if (b2 != -2) {
                            if (b2 == -1) {
                                i4 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                                b = byteBuffer.get(iPosition + 7);
                            } else if (b2 != 31) {
                                i4 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                                i5 = byteBuffer.get(iPosition + 5) & 252;
                            } else {
                                i4 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                                b = byteBuffer.get(iPosition + 6);
                            }
                            i5 = b & 60;
                        } else {
                            i4 = (byteBuffer.get(iPosition + 5) & 1) << 6;
                            i5 = byteBuffer.get(iPosition + 4) & 252;
                        }
                        int i9 = (i5 >> 2) | i4;
                        z5 = true;
                        iZza = (i9 + 1) * 32;
                        this.x = iZza;
                        if (iZza == 0) {
                            return z5;
                        }
                        break;
                    case 9:
                        iZza = zzzz.zzc(zzel.zzk(byteBuffer, byteBuffer.position()));
                        if (iZza == -1) {
                            throw new IllegalArgumentException();
                        }
                        z5 = true;
                        this.x = iZza;
                        if (iZza == 0) {
                            return z5;
                        }
                        break;
                    case 10:
                    case 16:
                        iZza = 1024;
                        z5 = true;
                        this.x = iZza;
                        if (iZza == 0) {
                            return z5;
                        }
                        break;
                    case 11:
                    case 12:
                        iZza = 2048;
                        z5 = true;
                        this.x = iZza;
                        if (iZza == 0) {
                            return z5;
                        }
                        break;
                    case 13:
                    default:
                        throw new IllegalStateException(GM.a("Unexpected audio encoding: ", i8));
                    case 14:
                        int iPosition2 = byteBuffer.position();
                        int iLimit = byteBuffer.limit() - 10;
                        int i10 = iPosition2;
                        while (true) {
                            if (i10 > iLimit) {
                                i6 = -1;
                            } else if ((zzel.zzk(byteBuffer, i10 + 4) & (-2)) == -126718022) {
                                i6 = i10 - iPosition2;
                            } else {
                                i10++;
                            }
                        }
                        if (i6 == -1) {
                            iZza = 0;
                        } else {
                            iZza = (40 << ((byteBuffer.get((byteBuffer.position() + i6) + ((byteBuffer.get((byteBuffer.position() + i6) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        }
                        z5 = true;
                        this.x = iZza;
                        if (iZza == 0) {
                            return z5;
                        }
                        break;
                    case 15:
                        iZza = AdRequest.MAX_CONTENT_URL_LENGTH;
                        z5 = true;
                        this.x = iZza;
                        if (iZza == 0) {
                            return z5;
                        }
                        break;
                    case 17:
                        byte[] bArr = new byte[16];
                        int iPosition3 = byteBuffer.position();
                        byteBuffer.get(bArr);
                        byteBuffer.position(iPosition3);
                        iZza = zzyj.zza(new zzec(bArr, 16)).zzc;
                        z5 = true;
                        this.x = iZza;
                        if (iZza == 0) {
                            return z5;
                        }
                        break;
                }
            }
            if (this.r != null) {
                if (!j()) {
                    return false;
                }
                d(j);
                this.r = null;
            }
            long jA = (((a() - this.c.n) * 1000000) / ((long) this.o.a.zzA)) + this.A;
            if (!this.y && Math.abs(jA - j) > 200000) {
                this.m.zza(new zznu(j, jA));
                this.y = true;
            }
            if (this.y) {
                if (!j()) {
                    return false;
                }
                long j2 = j - jA;
                this.A += j2;
                this.y = false;
                d(j);
                zznt zzntVar3 = this.m;
                if (zzntVar3 != null && j2 != 0) {
                    ((e87) zzntVar3).a.d1 = true;
                }
            }
            if (this.o.c == 0) {
                this.t += (long) byteBuffer.remaining();
                i3 = i;
            } else {
                i3 = i;
                this.u = (((long) this.x) * ((long) i3)) + this.u;
            }
            this.E = byteBuffer;
            this.F = i3;
        }
        f(j);
        if (!this.E.hasRemaining()) {
            this.E = null;
            this.F = 0;
            return true;
        }
        if (!(w67Var2.y != -9223372036854775807L && b() > 0 && SystemClock.elapsedRealtime() - w67Var2.y >= 200)) {
            return false;
        }
        Log.w("DefaultAudioSink", "Resetting stalled audio track");
        zze();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final boolean zzt() {
        return k() && this.g.b(b());
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final boolean zzu() {
        if (k()) {
            return this.K && !zzt();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final boolean zzv(zzaf zzafVar) {
        return zza(zzafVar) != 0;
    }
}
