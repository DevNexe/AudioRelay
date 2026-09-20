package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import defpackage.jb7;
import defpackage.kb7;
import defpackage.lb7;
import defpackage.mb7;
import defpackage.ub7;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class zztv implements zzaam {
    public zzpp A;
    public final kb7 a;
    public final zzpo d;
    public zztu e;
    public zzaf f;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean u;
    public zzaf x;
    public boolean y;
    public boolean z;
    public final lb7 b = new lb7();
    public int g = AdError.NETWORK_ERROR_CODE;
    public int[] h = new int[AdError.NETWORK_ERROR_CODE];
    public long[] i = new long[AdError.NETWORK_ERROR_CODE];
    public long[] l = new long[AdError.NETWORK_ERROR_CODE];
    public int[] k = new int[AdError.NETWORK_ERROR_CODE];
    public int[] j = new int[AdError.NETWORK_ERROR_CODE];
    public zzaal[] m = new zzaal[AdError.NETWORK_ERROR_CODE];
    public final ub7 c = new ub7(zztq.zza);
    public long r = Long.MIN_VALUE;
    public long s = Long.MIN_VALUE;
    public long t = Long.MIN_VALUE;
    public boolean w = true;
    public boolean v = true;

    public zztv(zzwf zzwfVar, zzpo zzpoVar) {
        this.d = zzpoVar;
        this.a = new kb7(zzwfVar);
    }

    public final int a(int i) {
        int i2 = this.p + i;
        int i3 = this.g;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final long b(int i) {
        long j = this.s;
        long jMax = Long.MIN_VALUE;
        int i2 = 0;
        if (i != 0) {
            int iA = a(i - 1);
            for (int i3 = 0; i3 < i; i3++) {
                jMax = Math.max(jMax, this.l[iA]);
                if ((this.k[iA] & 1) != 0) {
                    break;
                }
                iA--;
                if (iA == -1) {
                    iA = this.g - 1;
                }
            }
        }
        this.s = Math.max(j, jMax);
        this.n -= i;
        int i4 = this.o + i;
        this.o = i4;
        int i5 = this.p + i;
        this.p = i5;
        int i6 = this.g;
        if (i5 >= i6) {
            this.p = i5 - i6;
        }
        int i7 = this.q - i;
        this.q = i7;
        if (i7 < 0) {
            this.q = 0;
        }
        while (true) {
            ub7 ub7Var = this.c;
            SparseArray sparseArray = ub7Var.b;
            if (i2 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i2 + 1;
            if (i4 < sparseArray.keyAt(i8)) {
                break;
            }
            zzpn zzpnVar = ((mb7) sparseArray.valueAt(i2)).b;
            int i9 = zzpm.zza;
            sparseArray.removeAt(i2);
            int i10 = ub7Var.a;
            if (i10 > 0) {
                ub7Var.a = i10 - 1;
            }
            i2 = i8;
        }
        if (this.n != 0) {
            return this.i[this.p];
        }
        int i11 = this.p;
        if (i11 == 0) {
            i11 = this.g;
        }
        int i12 = i11 - 1;
        return this.i[i12] + ((long) this.j[i12]);
    }

    public final void c(zzaf zzafVar, zzje zzjeVar) {
        zzaf zzafVar2 = this.f;
        zzx zzxVar = zzafVar2 == null ? null : zzafVar2.zzp;
        this.f = zzafVar;
        zzx zzxVar2 = zzafVar.zzp;
        zzjeVar.zza = zzafVar.zzc(this.d.zza(zzafVar));
        zzjeVar.zzb = this.A;
        if (zzafVar2 == null || !zzel.zzT(zzxVar, zzxVar2)) {
            zzpp zzppVar = zzafVar.zzp != null ? new zzpp(new zzpg(new zzpr(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE)) : null;
            this.A = zzppVar;
            zzjeVar.zzb = zzppVar;
        }
    }

    public final int d(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.l[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.k[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.g) {
                i = 0;
            }
        }
        return i3;
    }

    public final int zza() {
        return this.o + this.q;
    }

    public final synchronized int zzb(long j, boolean z) {
        int i = this.q;
        int iA = a(i);
        int i2 = this.q;
        int i3 = this.n;
        if ((i2 != i3) && j >= this.l[iA]) {
            if (j > this.t && z) {
                return i3 - i;
            }
            int iD = d(iA, i3 - i, j, true);
            if (iD == -1) {
                return 0;
            }
            return iD;
        }
        return 0;
    }

    public final int zzc() {
        return this.o + this.n;
    }

    public final int zzd(zzje zzjeVar, zzgg zzggVar, int i, boolean z) {
        int i2;
        boolean z2 = false;
        boolean z3 = (i & 2) != 0;
        lb7 lb7Var = this.b;
        synchronized (this) {
            zzggVar.zzc = false;
            int i3 = this.q;
            if (i3 != this.n) {
                zzaf zzafVar = ((mb7) this.c.a(this.o + i3)).a;
                if (!z3 && zzafVar == this.f) {
                    int iA = a(this.q);
                    if (this.A != null) {
                        int i4 = this.k[iA] & 1073741824;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        zzggVar.zzc(this.k[iA]);
                        long j = this.l[iA];
                        zzggVar.zzd = j;
                        if (j < this.r) {
                            zzggVar.zza(Integer.MIN_VALUE);
                        }
                        lb7Var.a = this.j[iA];
                        lb7Var.b = this.i[iA];
                        lb7Var.c = this.m[iA];
                        i2 = -4;
                    } else {
                        zzggVar.zzc = true;
                        i2 = -3;
                    }
                }
                c(zzafVar, zzjeVar);
                i2 = -5;
            } else {
                if (!z && !this.u) {
                    zzaf zzafVar2 = this.x;
                    if (zzafVar2 == null || (!z3 && zzafVar2 == this.f)) {
                        i2 = -3;
                    } else {
                        c(zzafVar2, zzjeVar);
                        i2 = -5;
                    }
                }
                zzggVar.zzc(4);
                i2 = -4;
            }
        }
        if (i2 != -4) {
            return i2;
        }
        if (zzggVar.zzg()) {
            return -4;
        }
        int i5 = i & 1;
        if ((i & 4) == 0) {
            if (i5 != 0) {
                kb7 kb7Var = this.a;
                kb7.e(kb7Var.c, zzggVar, this.b, kb7Var.a);
                return -4;
            }
            kb7 kb7Var2 = this.a;
            kb7Var2.c = kb7.e(kb7Var2.c, zzggVar, this.b, kb7Var2.a);
        } else if (i5 != 0) {
            return -4;
        }
        this.q++;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final /* synthetic */ int zze(zzr zzrVar, int i, boolean z) {
        return zzaak.zza(this, zzrVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final int zzf(zzr zzrVar, int i, boolean z, int i2) throws EOFException {
        kb7 kb7Var = this.a;
        int iB = kb7Var.b(i);
        jb7 jb7Var = kb7Var.d;
        zzvy zzvyVar = jb7Var.c;
        byte[] bArr = zzvyVar.zza;
        long j = kb7Var.e;
        long j2 = jb7Var.a;
        int i3 = zzvyVar.zzb;
        int iZza = zzrVar.zza(bArr, (int) (j - j2), iB);
        if (iZza == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = kb7Var.e + ((long) iZza);
        kb7Var.e = j3;
        jb7 jb7Var2 = kb7Var.d;
        if (j3 != jb7Var2.b) {
            return iZza;
        }
        kb7Var.d = jb7Var2.d;
        return iZza;
    }

    public final synchronized long zzg() {
        return this.t;
    }

    public final synchronized zzaf zzh() {
        if (this.w) {
            return null;
        }
        return this.x;
    }

    public final void zzi(long j, boolean z, boolean z2) {
        long jB;
        int i;
        kb7 kb7Var = this.a;
        synchronized (this) {
            int i2 = this.n;
            jB = -1;
            if (i2 != 0) {
                long[] jArr = this.l;
                int i3 = this.p;
                if (j >= jArr[i3]) {
                    if (z2 && (i = this.q) != i2) {
                        i2 = i + 1;
                    }
                    int iD = d(i3, i2, j, false);
                    if (iD != -1) {
                        jB = b(iD);
                    }
                }
            }
        }
        kb7Var.a(jB);
    }

    public final void zzj() {
        long jB;
        kb7 kb7Var = this.a;
        synchronized (this) {
            int i = this.n;
            jB = i == 0 ? -1L : b(i);
        }
        kb7Var.a(jB);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x001e, B:15:0x0036, B:17:0x004d, B:16:0x004b), top: B:28:0x0002 }] */
    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzk(zzaf zzafVar) {
        boolean z;
        synchronized (this) {
            z = false;
            this.w = false;
            if (!zzel.zzT(zzafVar, this.x)) {
                if (this.c.b.size() == 0) {
                    this.x = zzafVar;
                } else {
                    SparseArray sparseArray = this.c.b;
                    if (((mb7) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(zzafVar)) {
                        SparseArray sparseArray2 = this.c.b;
                        this.x = ((mb7) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                    } else {
                        this.x = zzafVar;
                    }
                }
                zzaf zzafVar2 = this.x;
                this.y = zzbt.zzf(zzafVar2.zzm, zzafVar2.zzj);
                this.z = false;
                z = true;
            }
        }
        zztu zztuVar = this.e;
        if (zztuVar == null || !z) {
            return;
        }
        zztuVar.zzJ(zzafVar);
    }

    public final void zzm() throws zzpg {
        zzpp zzppVar = this.A;
        if (zzppVar != null) {
            throw zzppVar.zza();
        }
    }

    public final void zzn() {
        zzj();
        if (this.A != null) {
            this.A = null;
            this.f = null;
        }
    }

    public final void zzo() {
        zzp(true);
        if (this.A != null) {
            this.A = null;
            this.f = null;
        }
    }

    public final void zzp(boolean z) {
        ub7 ub7Var;
        SparseArray sparseArray;
        kb7 kb7Var = this.a;
        jb7 jb7Var = kb7Var.b;
        zzvy zzvyVar = jb7Var.c;
        zzwf zzwfVar = kb7Var.f;
        if (zzvyVar != null) {
            zzwfVar.zzd(jb7Var);
            jb7Var.c = null;
            jb7Var.d = null;
        }
        jb7 jb7Var2 = kb7Var.b;
        int i = 0;
        zzdd.zzf(jb7Var2.c == null);
        jb7Var2.a = 0L;
        jb7Var2.b = 65536L;
        jb7 jb7Var3 = kb7Var.b;
        kb7Var.c = jb7Var3;
        kb7Var.d = jb7Var3;
        kb7Var.e = 0L;
        zzwfVar.zzg();
        this.n = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.v = true;
        this.r = Long.MIN_VALUE;
        this.s = Long.MIN_VALUE;
        this.t = Long.MIN_VALUE;
        this.u = false;
        while (true) {
            ub7Var = this.c;
            sparseArray = ub7Var.b;
            if (i >= sparseArray.size()) {
                break;
            }
            zzpn zzpnVar = ((mb7) sparseArray.valueAt(i)).b;
            int i2 = zzpm.zza;
            i++;
        }
        ub7Var.a = -1;
        sparseArray.clear();
        if (z) {
            this.x = null;
            this.w = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final /* synthetic */ void zzq(zzed zzedVar, int i) {
        zzaak.zzb(this, zzedVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzr(zzed zzedVar, int i, int i2) {
        while (true) {
            kb7 kb7Var = this.a;
            if (i <= 0) {
                kb7Var.getClass();
                return;
            }
            int iB = kb7Var.b(i);
            jb7 jb7Var = kb7Var.d;
            zzvy zzvyVar = jb7Var.c;
            byte[] bArr = zzvyVar.zza;
            long j = kb7Var.e;
            long j2 = jb7Var.a;
            int i3 = zzvyVar.zzb;
            zzedVar.zzB(bArr, (int) (j - j2), iB);
            i -= iB;
            long j3 = kb7Var.e + ((long) iB);
            kb7Var.e = j3;
            jb7 jb7Var2 = kb7Var.d;
            if (j3 == jb7Var2.b) {
                kb7Var.d = jb7Var2.d;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3 A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #0 {, blocks: (B:19:0x003c, B:21:0x0040, B:25:0x0057, B:26:0x005a, B:30:0x0062, B:35:0x0099, B:40:0x00c9, B:42:0x00d2, B:37:0x00b3, B:39:0x00c3), top: B:48:0x003c }] */
    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzs(long j, int i, int i2, int i3, zzaal zzaalVar) {
        int i4 = i & 1;
        if (this.v) {
            if (i4 == 0) {
                return;
            } else {
                this.v = false;
            }
        }
        if (this.y) {
            if (j < this.r) {
                return;
            }
            if (i4 == 0) {
                if (!this.z) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.x)));
                    this.z = true;
                }
                i |= 1;
            }
        }
        long j2 = (this.a.e - ((long) i2)) - ((long) i3);
        synchronized (this) {
            int i5 = this.n;
            if (i5 > 0) {
                int iA = a(i5 - 1);
                zzdd.zzd(this.i[iA] + ((long) this.j[iA]) <= j2);
            }
            this.u = (536870912 & i) != 0;
            this.t = Math.max(this.t, j);
            int iA2 = a(this.n);
            this.l[iA2] = j;
            this.i[iA2] = j2;
            this.j[iA2] = i2;
            this.k[iA2] = i;
            this.m[iA2] = zzaalVar;
            this.h[iA2] = 0;
            if (this.c.b.size() == 0) {
                zzpn zzpnVar = zzpn.zzb;
                ub7 ub7Var = this.c;
                int i6 = this.o + this.n;
                zzaf zzafVar = this.x;
                zzafVar.getClass();
                ub7Var.b(i6, new mb7(zzafVar, zzpnVar));
            } else {
                SparseArray sparseArray = this.c.b;
                if (!((mb7) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(this.x)) {
                    zzpn zzpnVar2 = zzpn.zzb;
                    ub7 ub7Var2 = this.c;
                    int i7 = this.o + this.n;
                    zzaf zzafVar2 = this.x;
                    zzafVar2.getClass();
                    ub7Var2.b(i7, new mb7(zzafVar2, zzpnVar2));
                }
            }
            int i8 = this.n + 1;
            this.n = i8;
            int i9 = this.g;
            if (i8 == i9) {
                int i10 = i9 + AdError.NETWORK_ERROR_CODE;
                int[] iArr = new int[i10];
                long[] jArr = new long[i10];
                long[] jArr2 = new long[i10];
                int[] iArr2 = new int[i10];
                int[] iArr3 = new int[i10];
                zzaal[] zzaalVarArr = new zzaal[i10];
                int i11 = this.p;
                int i12 = i9 - i11;
                System.arraycopy(this.i, i11, jArr, 0, i12);
                System.arraycopy(this.l, this.p, jArr2, 0, i12);
                System.arraycopy(this.k, this.p, iArr2, 0, i12);
                System.arraycopy(this.j, this.p, iArr3, 0, i12);
                System.arraycopy(this.m, this.p, zzaalVarArr, 0, i12);
                System.arraycopy(this.h, this.p, iArr, 0, i12);
                int i13 = this.p;
                System.arraycopy(this.i, 0, jArr, i12, i13);
                System.arraycopy(this.l, 0, jArr2, i12, i13);
                System.arraycopy(this.k, 0, iArr2, i12, i13);
                System.arraycopy(this.j, 0, iArr3, i12, i13);
                System.arraycopy(this.m, 0, zzaalVarArr, i12, i13);
                System.arraycopy(this.h, 0, iArr, i12, i13);
                this.i = jArr;
                this.l = jArr2;
                this.k = iArr2;
                this.j = iArr3;
                this.m = zzaalVarArr;
                this.h = iArr;
                this.p = 0;
                this.g = i10;
            }
        }
    }

    public final void zzt(long j) {
        this.r = j;
    }

    public final void zzu(zztu zztuVar) {
        this.e = zztuVar;
    }

    public final synchronized void zzv(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.q + i <= this.n) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzdd.zzd(z);
        this.q += i;
    }

    public final synchronized boolean zzw() {
        return this.u;
    }

    public final synchronized boolean zzx(boolean z) {
        int i = this.q;
        boolean z2 = true;
        boolean z3 = false;
        if (!(i != this.n)) {
            if (!z && !this.u) {
                zzaf zzafVar = this.x;
                if (zzafVar == null) {
                    z2 = false;
                } else if (zzafVar == this.f) {
                    return false;
                }
            }
            return z2;
        }
        if (((mb7) this.c.a(this.o + i)).a != this.f) {
            return true;
        }
        int iA = a(this.q);
        if (this.A == null) {
            z3 = z2;
        } else if ((this.k[iA] & 1073741824) != 0) {
            z2 = false;
            z3 = z2;
        }
        return z3;
    }

    public final synchronized boolean zzy(long j, boolean z) {
        synchronized (this) {
            this.q = 0;
            kb7 kb7Var = this.a;
            kb7Var.c = kb7Var.b;
        }
        int iA = a(0);
        int i = this.q;
        int i2 = this.n;
        if (!(i != i2) || j < this.l[iA] || (j > this.t && !z)) {
            return false;
        }
        int iD = d(iA, i2 + 0, j, true);
        if (iD == -1) {
            return false;
        }
        this.r = j;
        this.q += iD;
        return true;
    }
}
