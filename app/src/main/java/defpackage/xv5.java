package defpackage;

import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzzo;
import com.google.android.gms.internal.ads.zzzp;
import com.google.android.gms.internal.ads.zzzr;
import com.google.android.gms.internal.ads.zzzs;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
public final class xv5 extends cw5 {
    public zzzs n;
    public rv5 o;

    @Override // defpackage.cw5
    public final long a(zzed zzedVar) {
        if (!(zzedVar.zzH()[0] == -1)) {
            return -1L;
        }
        int i = (zzedVar.zzH()[2] & 255) >> 4;
        if (i == 6) {
            zzedVar.zzG(4);
            zzedVar.zzu();
        } else if (i == 7) {
            i = 7;
            zzedVar.zzG(4);
            zzedVar.zzu();
        }
        int iZza = zzzo.zza(zzedVar, i);
        zzedVar.zzF(0);
        return iZza;
    }

    @Override // defpackage.cw5
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    @Override // defpackage.cw5
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(zzed zzedVar, long j, d7G d7g) {
        byte[] bArrZzH = zzedVar.zzH();
        zzzs zzzsVar = this.n;
        if (zzzsVar == null) {
            zzzs zzzsVar2 = new zzzs(bArrZzH, 17);
            this.n = zzzsVar2;
            d7g.x = zzzsVar2.zzc(Arrays.copyOfRange(bArrZzH, 9, zzedVar.zzd()), null);
            return true;
        }
        byte b = bArrZzH[0];
        if ((b & 127) == 3) {
            zzzr zzzrVarZzb = zzzp.zzb(zzedVar);
            zzzs zzzsVarZzf = zzzsVar.zzf(zzzrVarZzb);
            this.n = zzzsVarZzf;
            this.o = new rv5(zzzsVarZzf, zzzrVarZzb);
            return true;
        }
        if (!(b == -1)) {
            return true;
        }
        rv5 rv5Var = this.o;
        if (rv5Var != null) {
            rv5Var.y = j;
            d7g.y = rv5Var;
        }
        ((zzaf) d7g.x).getClass();
        return false;
    }
}
