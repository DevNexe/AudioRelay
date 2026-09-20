package defpackage;

import com.google.android.gms.internal.ads.zzaac;
import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzabq;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzyk;

/* JADX INFO: loaded from: classes3.dex */
public final class xs5 extends ws5 {
    public boolean A;
    public boolean B;
    public int C;
    public final zzed x;
    public final zzed y;
    public int z;

    public xs5(zzaam zzaamVar) {
        super(zzaamVar);
        this.x = new zzed(zzaac.zza);
        this.y = new zzed(4);
    }

    public final boolean b(zzed zzedVar) throws zzabq {
        int iZzk = zzedVar.zzk();
        int i = iZzk >> 4;
        int i2 = iZzk & 15;
        if (i2 != 7) {
            throw new zzabq(GM.a("Video format not supported: ", i2));
        }
        this.C = i;
        return i != 5;
    }

    public final boolean c(long j, zzed zzedVar) throws zzbu {
        int iZzk = zzedVar.zzk();
        long jZzf = (((long) zzedVar.zzf()) * 1000) + j;
        Object obj = this.w;
        if (iZzk == 0) {
            if (!this.A) {
                zzed zzedVar2 = new zzed(new byte[zzedVar.zza()]);
                zzedVar.zzB(zzedVar2.zzH(), 0, zzedVar.zza());
                zzyk zzykVarZza = zzyk.zza(zzedVar2);
                this.z = zzykVarZza.zzb;
                zzad zzadVar = new zzad();
                zzadVar.zzS("video/avc");
                zzadVar.zzx(zzykVarZza.zzf);
                zzadVar.zzX(zzykVarZza.zzc);
                zzadVar.zzF(zzykVarZza.zzd);
                zzadVar.zzP(zzykVarZza.zze);
                zzadVar.zzI(zzykVarZza.zza);
                ((zzaam) obj).zzk(zzadVar.zzY());
                this.A = true;
                return false;
            }
        } else if (iZzk == 1 && this.A) {
            int i = this.C == 1 ? 1 : 0;
            if (!this.B && i == 0) {
                return false;
            }
            zzed zzedVar3 = this.y;
            byte[] bArrZzH = zzedVar3.zzH();
            bArrZzH[0] = 0;
            bArrZzH[1] = 0;
            bArrZzH[2] = 0;
            int i2 = 4 - this.z;
            int i3 = 0;
            while (zzedVar.zza() > 0) {
                zzedVar.zzB(zzedVar3.zzH(), i2, this.z);
                zzedVar3.zzF(0);
                int iZzn = zzedVar3.zzn();
                zzed zzedVar4 = this.x;
                zzedVar4.zzF(0);
                ((zzaam) obj).zzq(zzedVar4, 4);
                ((zzaam) obj).zzq(zzedVar, iZzn);
                i3 = i3 + 4 + iZzn;
            }
            ((zzaam) obj).zzs(jZzf, i, i3, 0, null);
            this.B = true;
            return true;
        }
        return false;
    }
}
