package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzauw;
import com.google.android.gms.internal.ads.zzavc;
import com.google.android.gms.internal.ads.zzave;
import com.google.android.gms.internal.ads.zzaxv;
import com.google.android.gms.internal.ads.zzaxx;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayi;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzayn;
import com.google.android.gms.internal.ads.zzayp;
import com.google.android.gms.internal.ads.zzayq;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzazl;
import com.google.android.gms.internal.ads.zzazs;
import com.google.android.gms.internal.ads.zzazu;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzazy;
import com.google.android.gms.internal.ads.zzbaa;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class i26 implements zzaxy, zzauw, zzazs, zzayi {
    public final zzaxv A;
    public final zzaxz B;
    public final long C;
    public final g26 E;
    public zzaxx K;
    public zzavc L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public zzayp R;
    public long S;
    public boolean[] T;
    public boolean[] U;
    public boolean V;
    public long X;
    public int Z;
    public boolean a0;
    public boolean b0;
    public final zzazl c0;
    public final Uri w;
    public final zzazi x;
    public final int y;
    public final Handler z;
    public final zzazw D = new zzazw("Loader:ExtractorMediaPeriod");
    public final zzbaa F = new zzbaa();
    public final pz5 G = new pz5(this, 2);
    public final cz5 H = new cz5(this, 3);
    public final Handler I = new Handler();
    public long Y = -9223372036854775807L;
    public final SparseArray J = new SparseArray();
    public long W = -1;

    public i26(Uri uri, zzazi zzaziVar, zzauv[] zzauvVarArr, int i, Handler handler, zzaxv zzaxvVar, zzaxz zzaxzVar, zzazl zzazlVar, int i2) {
        this.w = uri;
        this.x = zzaziVar;
        this.y = i;
        this.z = handler;
        this.A = zzaxvVar;
        this.B = zzaxzVar;
        this.c0 = zzazlVar;
        this.C = i2;
        this.E = new g26(zzauvVarArr, this);
    }

    public final int a() {
        SparseArray sparseArray = this.J;
        int size = sparseArray.size();
        int iZze = 0;
        for (int i = 0; i < size; i++) {
            iZze += ((zzayj) sparseArray.valueAt(i)).zze();
        }
        return iZze;
    }

    public final long b() {
        SparseArray sparseArray = this.J;
        int size = sparseArray.size();
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((zzayj) sparseArray.valueAt(i)).zzg());
        }
        return jMax;
    }

    public final void c() {
        zzavc zzavcVar;
        f26 f26Var = new f26(this, this.w, this.x, this.E, this.F);
        if (this.N) {
            zzazy.zze(d());
            long j = this.S;
            if (j != -9223372036854775807L && this.Y >= j) {
                this.a0 = true;
                this.Y = -9223372036854775807L;
                return;
            }
            long jZzb = this.L.zzb(this.Y);
            long j2 = this.Y;
            f26Var.e.zza = jZzb;
            f26Var.h = j2;
            f26Var.g = true;
            this.Y = -9223372036854775807L;
        }
        this.Z = a();
        int i = this.y;
        if (i == -1) {
            i = (this.N && this.W == -1 && ((zzavcVar = this.L) == null || zzavcVar.zza() == -9223372036854775807L)) ? 6 : 3;
        }
        this.D.zza(f26Var, this, i);
    }

    public final boolean d() {
        return this.Y != -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaxy
    public final long zzB(zzayt[] zzaytVarArr, boolean[] zArr, zzayk[] zzaykVarArr, boolean[] zArr2, long j) {
        SparseArray sparseArray;
        zzayt zzaytVar;
        zzazy.zze(this.N);
        int i = 0;
        while (true) {
            int length = zzaytVarArr.length;
            sparseArray = this.J;
            if (i >= length) {
                break;
            }
            zzayk zzaykVar = zzaykVarArr[i];
            if (zzaykVar != null && (zzaytVarArr[i] == null || !zArr[i])) {
                boolean[] zArr3 = this.T;
                int i2 = ((h26) zzaykVar).a;
                zzazy.zze(zArr3[i2]);
                this.Q--;
                this.T[i2] = false;
                ((zzayj) sparseArray.valueAt(i2)).zzi();
                zzaykVarArr[i] = null;
            }
            i++;
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzaytVarArr.length; i3++) {
            if (zzaykVarArr[i3] == null && (zzaytVar = zzaytVarArr[i3]) != null) {
                zzaytVar.zzb();
                zzazy.zze(zzaytVar.zza(0) == 0);
                int iZza = this.R.zza(zzaytVar.zzd());
                zzazy.zze(!this.T[iZza]);
                this.Q++;
                this.T[iZza] = true;
                zzaykVarArr[i3] = new h26(this, iZza);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.O) {
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.T[i4]) {
                    ((zzayj) sparseArray.valueAt(i4)).zzi();
                }
            }
        }
        if (this.Q == 0) {
            this.P = false;
            zzazw zzazwVar = this.D;
            if (zzazwVar.zzi()) {
                zzazwVar.zzf();
            }
        } else if (this.O) {
            if (z) {
                j = zzi(j);
                for (int i5 = 0; i5 < zzaykVarArr.length; i5++) {
                    if (zzaykVarArr[i5] != null) {
                        zArr2[i5] = true;
                    }
                }
            }
        } else if (j == 0) {
            j = 0;
        } else {
            j = zzi(j);
            while (i5 < zzaykVarArr.length) {
                if (zzaykVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.O = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy, com.google.android.gms.internal.ads.zzaym
    public final long zza() {
        if (this.Q == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzb() {
        this.M = true;
        this.I.post(this.G);
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final zzave zzbi(int i, int i2) {
        SparseArray sparseArray = this.J;
        zzayj zzayjVar = (zzayj) sparseArray.get(i);
        if (zzayjVar != null) {
            return zzayjVar;
        }
        zzayj zzayjVar2 = new zzayj(this.c0, null);
        zzayjVar2.zzk(this);
        sparseArray.put(i, zzayjVar2);
        return zzayjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy, com.google.android.gms.internal.ads.zzaym
    public final boolean zzbj(long j) {
        if (this.a0) {
            return false;
        }
        if (this.N && this.Q == 0) {
            return false;
        }
        boolean zZzc = this.F.zzc();
        if (this.D.zzi()) {
            return zZzc;
        }
        c();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzc(zzavc zzavcVar) {
        this.L = zzavcVar;
        this.I.post(this.G);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final int zzd(zzazu zzazuVar, long j, long j2, IOException iOException) {
        zzavc zzavcVar;
        f26 f26Var = (f26) zzazuVar;
        if (this.W == -1) {
            this.W = f26Var.i;
        }
        int i = 3;
        Handler handler = this.z;
        if (handler != null) {
            handler.post(new tb7(this, iOException, i));
        }
        if (iOException instanceof zzayq) {
            return 3;
        }
        int iA = a();
        int i2 = this.Z;
        if (this.W == -1 && ((zzavcVar = this.L) == null || zzavcVar.zza() == -9223372036854775807L)) {
            this.X = 0L;
            this.P = this.N;
            SparseArray sparseArray = this.J;
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((zzayj) sparseArray.valueAt(i3)).zzj(!this.N || this.T[i3]);
            }
            f26Var.e.zza = 0L;
            f26Var.h = 0L;
            f26Var.g = true;
        }
        this.Z = a();
        return iA <= i2 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final long zzg() {
        long jB;
        if (this.a0) {
            return Long.MIN_VALUE;
        }
        if (d()) {
            return this.Y;
        }
        if (this.V) {
            SparseArray sparseArray = this.J;
            int size = sparseArray.size();
            jB = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.U[i]) {
                    jB = Math.min(jB, ((zzayj) sparseArray.valueAt(i)).zzg());
                }
            }
        } else {
            jB = b();
        }
        return jB == Long.MIN_VALUE ? this.X : jB;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final long zzh() {
        if (!this.P) {
            return -9223372036854775807L;
        }
        this.P = false;
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final long zzi(long j) {
        if (true != this.L.zzc()) {
            j = 0;
        }
        this.X = j;
        SparseArray sparseArray = this.J;
        int size = sparseArray.size();
        boolean zD = true ^ d();
        int i = 0;
        while (zD) {
            if (i >= size) {
                this.P = false;
                return j;
            }
            if (this.T[i]) {
                zD = ((zzayj) sparseArray.valueAt(i)).zzn(j, false);
            }
            i++;
        }
        this.Y = j;
        this.a0 = false;
        zzazw zzazwVar = this.D;
        if (zzazwVar.zzi()) {
            zzazwVar.zzf();
        } else {
            for (int i2 = 0; i2 < size; i2++) {
                ((zzayj) sparseArray.valueAt(i2)).zzj(this.T[i2]);
            }
        }
        this.P = false;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final zzayp zzn() {
        return this.R;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final void zzq(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final void zzs() throws IOException {
        this.D.zzg(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zzt(zzazu zzazuVar, long j, long j2, boolean z) {
        f26 f26Var = (f26) zzazuVar;
        if (this.W == -1) {
            this.W = f26Var.i;
        }
        if (z || this.Q <= 0) {
            return;
        }
        SparseArray sparseArray = this.J;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzayj) sparseArray.valueAt(i)).zzj(this.T[i]);
        }
        this.K.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zzu(zzazu zzazuVar, long j, long j2) {
        f26 f26Var = (f26) zzazuVar;
        if (this.W == -1) {
            this.W = f26Var.i;
        }
        this.a0 = true;
        if (this.S == -9223372036854775807L) {
            long jB = b();
            long j3 = jB == Long.MIN_VALUE ? 0L : jB + 10000;
            this.S = j3;
            this.B.zzg(new zzayn(j3, this.L.zzc()), null);
        }
        this.K.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zzv(zzass zzassVar) {
        this.I.post(this.G);
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final void zzw(zzaxx zzaxxVar, long j) {
        this.K = zzaxxVar;
        this.F.zzc();
        c();
    }
}
