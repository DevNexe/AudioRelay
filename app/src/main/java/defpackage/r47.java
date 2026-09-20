package defpackage;

import com.google.android.gms.internal.ads.zzcn;
import com.google.android.gms.internal.ads.zzkn;
import com.google.android.gms.internal.ads.zzmt;
import com.google.android.gms.internal.ads.zzsg;

/* JADX INFO: loaded from: classes3.dex */
public final class r47 {
    public final String a;
    public int b;
    public long c;
    public final zzsg d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ zzmt g;

    public r47(zzmt zzmtVar, String str, int i, zzsg zzsgVar) {
        this.g = zzmtVar;
        this.a = str;
        this.b = i;
        this.c = zzsgVar == null ? -1L : zzsgVar.zzd;
        if (zzsgVar == null || !zzsgVar.zzb()) {
            return;
        }
        this.d = zzsgVar;
    }

    public final boolean a(zzkn zzknVar) {
        long j = this.c;
        if (j == -1) {
            return false;
        }
        zzsg zzsgVar = zzknVar.zzd;
        if (zzsgVar == null) {
            return this.b != zzknVar.zzc;
        }
        if (zzsgVar.zzd > j) {
            return true;
        }
        zzsg zzsgVar2 = this.d;
        if (zzsgVar2 == null) {
            return false;
        }
        int iZza = zzknVar.zzb.zza(zzsgVar.zza);
        int iZza2 = zzknVar.zzb.zza(zzsgVar2.zza);
        zzsg zzsgVar3 = zzknVar.zzd;
        if (zzsgVar3.zzd < zzsgVar2.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!zzsgVar3.zzb()) {
            int i = zzknVar.zzd.zze;
            return i == -1 || i > zzsgVar2.zzb;
        }
        zzsg zzsgVar4 = zzknVar.zzd;
        int i2 = zzsgVar4.zzb;
        int i3 = zzsgVar4.zzc;
        int i4 = zzsgVar2.zzb;
        return i2 > i4 || (i2 == i4 && i3 > zzsgVar2.zzc);
    }

    public final boolean b(zzcn zzcnVar, zzcn zzcnVar2) {
        int i = this.b;
        if (i < zzcnVar.zzc()) {
            zzmt zzmtVar = this.g;
            zzcnVar.zze(i, zzmtVar.a, 0L);
            int i2 = zzmtVar.a.zzo;
            while (true) {
                if (i2 > zzmtVar.a.zzp) {
                    i = -1;
                    break;
                }
                int iZza = zzcnVar2.zza(zzcnVar.zzf(i2));
                if (iZza != -1) {
                    i = zzcnVar2.zzd(iZza, zzmtVar.b, false).zzd;
                    break;
                }
                i2++;
            }
        } else if (i >= zzcnVar2.zzc()) {
            i = -1;
            break;
        }
        this.b = i;
        if (i == -1) {
            return false;
        }
        zzsg zzsgVar = this.d;
        return zzsgVar == null || zzcnVar2.zza(zzsgVar.zza) != -1;
    }
}
