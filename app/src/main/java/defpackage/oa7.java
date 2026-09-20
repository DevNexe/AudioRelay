package defpackage;

import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzcm;
import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzru;

/* JADX INFO: loaded from: classes3.dex */
public final class oa7 extends zzru {
    public static final Object d = new Object();
    public final Object b;
    public final Object c;

    public oa7(zzcn zzcnVar, Object obj, Object obj2) {
        super(zzcnVar);
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzru, com.google.android.gms.internal.ads.zzcn
    public final int zza(Object obj) {
        Object obj2;
        if (d.equals(obj) && (obj2 = this.c) != null) {
            obj = obj2;
        }
        return this.a.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzru, com.google.android.gms.internal.ads.zzcn
    public final zzck zzd(int i, zzck zzckVar, boolean z) {
        this.a.zzd(i, zzckVar, z);
        if (zzel.zzT(zzckVar.zzc, this.c) && z) {
            zzckVar.zzc = d;
        }
        return zzckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzru, com.google.android.gms.internal.ads.zzcn
    public final zzcm zze(int i, zzcm zzcmVar, long j) {
        this.a.zze(i, zzcmVar, j);
        if (zzel.zzT(zzcmVar.zzc, this.b)) {
            zzcmVar.zzc = zzcm.zza;
        }
        return zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzru, com.google.android.gms.internal.ads.zzcn
    public final Object zzf(int i) {
        Object objZzf = this.a.zzf(i);
        return zzel.zzT(objZzf, this.c) ? d : objZzf;
    }
}
