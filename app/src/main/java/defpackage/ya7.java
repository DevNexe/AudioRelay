package defpackage;

import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzsd;
import com.google.android.gms.internal.ads.zzse;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzty;
import com.google.android.gms.internal.ads.zzue;
import com.google.android.gms.internal.ads.zzvq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ya7 implements zzse, zzsd {
    public zzsd A;
    public zzue B;
    public final zzse[] w;
    public final ArrayList y = new ArrayList();
    public final HashMap z = new HashMap();
    public zzrq D = new zzrq(new zzty[0]);
    public final IdentityHashMap x = new IdentityHashMap();
    public zzse[] C = new zzse[0];

    public ya7(long[] jArr, zzse... zzseVarArr) {
        this.w = zzseVarArr;
        for (int i = 0; i < zzseVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.w[i] = new wa7(zzseVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zza(long j, zzkb zzkbVar) {
        zzse[] zzseVarArr = this.C;
        return (zzseVarArr.length > 0 ? zzseVarArr[0] : this.w[0]).zza(j, zzkbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzb() {
        return this.D.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final long zzc() {
        return this.D.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzse zzseVar : this.C) {
            long jZzd = zzseVar.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j != -9223372036854775807L && zzseVar.zze(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (zzse zzseVar2 : this.C) {
                    if (zzseVar2 == zzseVar) {
                        break;
                    }
                    if (zzseVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zze(long j) {
        long jZze = this.C[0].zze(j);
        int i = 1;
        while (true) {
            zzse[] zzseVarArr = this.C;
            if (i >= zzseVarArr.length) {
                return jZze;
            }
            if (zzseVarArr[i].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final long zzf(zzvq[] zzvqVarArr, boolean[] zArr, zztw[] zztwVarArr, boolean[] zArr2, long j) {
        int length;
        HashMap map;
        IdentityHashMap identityHashMap;
        zzse[] zzseVarArr;
        int length2 = zzvqVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzvqVarArr.length;
            map = this.z;
            identityHashMap = this.x;
            zzseVarArr = this.w;
            if (i >= length) {
                break;
            }
            zztw zztwVar = zztwVarArr[i];
            Integer num = zztwVar == null ? null : (Integer) identityHashMap.get(zztwVar);
            iArr[i] = num == null ? -1 : num.intValue();
            iArr2[i] = -1;
            zzvq zzvqVar = zzvqVarArr[i];
            if (zzvqVar != null) {
                zzcp zzcpVar = (zzcp) map.get(zzvqVar.zze());
                zzcpVar.getClass();
                for (int i2 = 0; i2 < zzseVarArr.length; i2++) {
                    if (zzseVarArr[i2].zzh().zza(zzcpVar) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                }
            }
            i++;
        }
        identityHashMap.clear();
        zztw[] zztwVarArr2 = new zztw[length];
        zztw[] zztwVarArr3 = new zztw[length];
        zzvq[] zzvqVarArr2 = new zzvq[length];
        ArrayList arrayList = new ArrayList(zzseVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < zzseVarArr.length) {
            int i4 = 0;
            while (i4 < zzvqVarArr.length) {
                zztwVarArr3[i4] = iArr[i4] == i3 ? zztwVarArr[i4] : null;
                if (iArr2[i4] == i3) {
                    zzvq zzvqVar2 = zzvqVarArr[i4];
                    zzvqVar2.getClass();
                    zzcp zzcpVar2 = (zzcp) map.get(zzvqVar2.zze());
                    zzcpVar2.getClass();
                    zzvqVarArr2[i4] = new va7(zzvqVar2, zzcpVar2);
                } else {
                    zzvqVarArr2[i4] = null;
                }
                i4++;
                arrayList = arrayList;
                map = map;
            }
            HashMap map2 = map;
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            zzvq[] zzvqVarArr3 = zzvqVarArr2;
            zztw[] zztwVarArr4 = zztwVarArr3;
            long jZzf = zzseVarArr[i3].zzf(zzvqVarArr2, zArr, zztwVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jZzf;
            } else if (jZzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzvqVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zztw zztwVar2 = zztwVarArr4[i6];
                    zztwVar2.getClass();
                    zztwVarArr2[i6] = zztwVar2;
                    identityHashMap.put(zztwVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzdd.zzf(zztwVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(zzseVarArr[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzvqVarArr2 = zzvqVarArr3;
            map = map2;
            zztwVarArr3 = zztwVarArr4;
        }
        System.arraycopy(zztwVarArr2, 0, zztwVarArr, 0, length);
        zzse[] zzseVarArr2 = (zzse[]) arrayList.toArray(new zzse[0]);
        this.C = zzseVarArr2;
        this.D = new zzrq(zzseVarArr2);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zztx
    public final /* bridge */ /* synthetic */ void zzg(zzty zztyVar) {
        zzsd zzsdVar = this.A;
        zzsdVar.getClass();
        zzsdVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final zzue zzh() {
        zzue zzueVar = this.B;
        zzueVar.getClass();
        return zzueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zzi(zzse zzseVar) {
        ArrayList arrayList = this.y;
        arrayList.remove(zzseVar);
        if (arrayList.isEmpty()) {
            zzse[] zzseVarArr = this.w;
            int i = 0;
            for (zzse zzseVar2 : zzseVarArr) {
                i += zzseVar2.zzh().zzc;
            }
            zzcp[] zzcpVarArr = new zzcp[i];
            int i2 = 0;
            for (int i3 = 0; i3 < zzseVarArr.length; i3++) {
                zzue zzueVarZzh = zzseVarArr[i3].zzh();
                int i4 = zzueVarZzh.zzc;
                int i5 = 0;
                while (i5 < i4) {
                    zzcp zzcpVarZzb = zzueVarZzh.zzb(i5);
                    zzcp zzcpVarZzc = zzcpVarZzb.zzc(i3 + ":" + zzcpVarZzb.zzc);
                    this.z.put(zzcpVarZzc, zzcpVarZzb);
                    zzcpVarArr[i2] = zzcpVarZzc;
                    i5++;
                    i2++;
                }
            }
            this.B = new zzue(zzcpVarArr);
            zzsd zzsdVar = this.A;
            zzsdVar.getClass();
            zzsdVar.zzi(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzj(long j, boolean z) {
        for (zzse zzseVar : this.C) {
            zzseVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzk() {
        for (zzse zzseVar : this.w) {
            zzseVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse
    public final void zzl(zzsd zzsdVar, long j) {
        this.A = zzsdVar;
        ArrayList arrayList = this.y;
        zzse[] zzseVarArr = this.w;
        Collections.addAll(arrayList, zzseVarArr);
        for (zzse zzseVar : zzseVarArr) {
            zzseVar.zzl(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final void zzm(long j) {
        this.D.zzm(j);
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzo(long j) {
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            return this.D.zzo(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzse) arrayList.get(i)).zzo(j);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzse, com.google.android.gms.internal.ads.zzty
    public final boolean zzp() {
        return this.D.zzp();
    }
}
