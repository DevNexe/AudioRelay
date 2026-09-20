package defpackage;

import com.google.android.gms.internal.ads.zzaxm;
import com.google.android.gms.internal.ads.zzaxx;
import com.google.android.gms.internal.ads.zzaxy;
import com.google.android.gms.internal.ads.zzayk;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzayo;
import com.google.android.gms.internal.ads.zzayp;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzazy;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class l26 implements zzaxy, zzaxx {
    public zzayp A;
    public zzaxy[] B;
    public zzaxm C;
    public final zzaxy[] w;
    public final IdentityHashMap x = new IdentityHashMap();
    public zzaxx y;
    public int z;

    public l26(zzaxy... zzaxyVarArr) {
        this.w = zzaxyVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final long zzB(zzayt[] zzaytVarArr, boolean[] zArr, zzayk[] zzaykVarArr, boolean[] zArr2, long j) {
        int length;
        IdentityHashMap identityHashMap;
        zzaxy[] zzaxyVarArr;
        int length2 = zzaytVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzaytVarArr.length;
            identityHashMap = this.x;
            zzaxyVarArr = this.w;
            if (i >= length) {
                break;
            }
            zzayk zzaykVar = zzaykVarArr[i];
            iArr[i] = zzaykVar == null ? -1 : ((Integer) identityHashMap.get(zzaykVar)).intValue();
            iArr2[i] = -1;
            zzayt zzaytVar = zzaytVarArr[i];
            if (zzaytVar != null) {
                zzayo zzayoVarZzd = zzaytVar.zzd();
                for (int i2 = 0; i2 < zzaxyVarArr.length; i2++) {
                    if (zzaxyVarArr[i2].zzn().zza(zzayoVarZzd) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                }
            }
            i++;
        }
        identityHashMap.clear();
        zzayk[] zzaykVarArr2 = new zzayk[length];
        zzayk[] zzaykVarArr3 = new zzayk[length];
        zzayt[] zzaytVarArr2 = new zzayt[length];
        ArrayList arrayList = new ArrayList(zzaxyVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zzaxyVarArr.length) {
            for (int i4 = 0; i4 < zzaytVarArr.length; i4++) {
                zzayt zzaytVar2 = null;
                zzaykVarArr3[i4] = iArr[i4] == i3 ? zzaykVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    zzaytVar2 = zzaytVarArr[i4];
                }
                zzaytVarArr2[i4] = zzaytVar2;
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            zzayt[] zzaytVarArr3 = zzaytVarArr2;
            zzayk[] zzaykVarArr4 = zzaykVarArr3;
            long jZzB = zzaxyVarArr[i3].zzB(zzaytVarArr2, zArr, zzaykVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jZzB;
            } else if (jZzB != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzaytVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzazy.zze(zzaykVarArr4[i6] != null);
                    zzayk zzaykVar2 = zzaykVarArr4[i6];
                    zzaykVarArr2[i6] = zzaykVar2;
                    identityHashMap.put(zzaykVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzazy.zze(zzaykVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(zzaxyVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzaytVarArr2 = zzaytVarArr3;
            zzaykVarArr3 = zzaykVarArr4;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzaykVarArr2, 0, zzaykVarArr, 0, length);
        zzaxy[] zzaxyVarArr2 = new zzaxy[arrayList3.size()];
        this.B = zzaxyVarArr2;
        arrayList3.toArray(zzaxyVarArr2);
        this.C = new zzaxm(this.B);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy, com.google.android.gms.internal.ads.zzaym
    public final long zza() {
        return this.C.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaxy, com.google.android.gms.internal.ads.zzaym
    public final boolean zzbj(long j) {
        return this.C.zzbj(j);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final /* bridge */ /* synthetic */ void zze(zzaym zzaymVar) {
        if (this.A == null) {
            return;
        }
        this.y.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final void zzf(zzaxy zzaxyVar) {
        int i = this.z - 1;
        this.z = i;
        if (i > 0) {
            return;
        }
        zzaxy[] zzaxyVarArr = this.w;
        int i2 = 0;
        for (zzaxy zzaxyVar2 : zzaxyVarArr) {
            i2 += zzaxyVar2.zzn().zzb;
        }
        zzayo[] zzayoVarArr = new zzayo[i2];
        int i3 = 0;
        for (zzaxy zzaxyVar3 : zzaxyVarArr) {
            zzayp zzaypVarZzn = zzaxyVar3.zzn();
            int i4 = zzaypVarZzn.zzb;
            int i5 = 0;
            while (i5 < i4) {
                zzayoVarArr[i3] = zzaypVarZzn.zzb(i5);
                i5++;
                i3++;
            }
        }
        this.A = new zzayp(zzayoVarArr);
        this.y.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final long zzg() {
        long jMin = Long.MAX_VALUE;
        for (zzaxy zzaxyVar : this.B) {
            long jZzg = zzaxyVar.zzg();
            if (jZzg != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZzg);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final long zzh() {
        zzaxy[] zzaxyVarArr = this.w;
        long jZzh = zzaxyVarArr[0].zzh();
        for (int i = 1; i < zzaxyVarArr.length; i++) {
            if (zzaxyVarArr[i].zzh() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
        if (jZzh != -9223372036854775807L) {
            for (zzaxy zzaxyVar : this.B) {
                if (zzaxyVar != zzaxyVarArr[0] && zzaxyVar.zzi(jZzh) != jZzh) {
                    throw new IllegalStateException("Children seeked to different positions");
                }
            }
        }
        return jZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final long zzi(long j) {
        long jZzi = this.B[0].zzi(j);
        int i = 1;
        while (true) {
            zzaxy[] zzaxyVarArr = this.B;
            if (i >= zzaxyVarArr.length) {
                return jZzi;
            }
            if (zzaxyVarArr[i].zzi(jZzi) != jZzi) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final zzayp zzn() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final void zzq(long j) {
        for (zzaxy zzaxyVar : this.B) {
            zzaxyVar.zzq(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final void zzs() {
        for (zzaxy zzaxyVar : this.w) {
            zzaxyVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxy
    public final void zzw(zzaxx zzaxxVar, long j) {
        this.y = zzaxxVar;
        zzaxy[] zzaxyVarArr = this.w;
        this.z = zzaxyVarArr.length;
        for (zzaxy zzaxyVar : zzaxyVarArr) {
            zzaxyVar.zzw(this, j);
        }
    }
}
