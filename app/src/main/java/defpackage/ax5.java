package defpackage;

import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzail;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzys;
import com.google.android.gms.internal.ads.zzzi;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ax5 {
    public final List a;
    public final zzaam[] b;

    public ax5(List list) {
        this.a = list;
        this.b = new zzaam[list.size()];
    }

    public final void a(long j, zzed zzedVar) {
        if (zzedVar.zza() < 9) {
            return;
        }
        int iZze = zzedVar.zze();
        int iZze2 = zzedVar.zze();
        int iZzk = zzedVar.zzk();
        if (iZze == 434 && iZze2 == 1195456820 && iZzk == 3) {
            zzys.zzb(j, zzedVar, this.b);
        }
    }

    public final void b(zzzi zzziVar, zzail zzailVar) {
        int i = 0;
        while (true) {
            zzaam[] zzaamVarArr = this.b;
            if (i >= zzaamVarArr.length) {
                return;
            }
            zzailVar.zzc();
            zzaam zzaamVarZzv = zzziVar.zzv(zzailVar.zza(), 3);
            zzaf zzafVar = (zzaf) this.a.get(i);
            String str = zzafVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzdd.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            zzad zzadVar = new zzad();
            zzadVar.zzH(zzailVar.zzb());
            zzadVar.zzS(str);
            zzadVar.zzU(zzafVar.zze);
            zzadVar.zzK(zzafVar.zzd);
            zzadVar.zzu(zzafVar.zzE);
            zzadVar.zzI(zzafVar.zzo);
            zzaamVarZzv.zzk(zzadVar.zzY());
            zzaamVarArr[i] = zzaamVarZzv;
            i++;
        }
    }
}
