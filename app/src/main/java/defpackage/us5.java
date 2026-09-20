package defpackage;

import com.google.android.gms.internal.ads.zzaam;
import com.google.android.gms.internal.ads.zzabq;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzyc;
import com.google.android.gms.internal.ads.zzyd;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class us5 extends ws5 {
    public static final int[] A = {5512, 11025, 22050, 44100};
    public boolean x;
    public boolean y;
    public int z;

    public us5(zzaam zzaamVar) {
        super(zzaamVar);
    }

    public final boolean b(zzed zzedVar) {
        if (this.x) {
            zzedVar.zzG(1);
        } else {
            int iZzk = zzedVar.zzk();
            int i = iZzk >> 4;
            this.z = i;
            Object obj = this.w;
            if (i == 2) {
                int i2 = A[(iZzk >> 2) & 3];
                zzad zzadVar = new zzad();
                zzadVar.zzS("audio/mpeg");
                zzadVar.zzw(1);
                zzadVar.zzT(i2);
                ((zzaam) obj).zzk(zzadVar.zzY());
                this.y = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzad zzadVar2 = new zzad();
                zzadVar2.zzS(str);
                zzadVar2.zzw(1);
                zzadVar2.zzT(8000);
                ((zzaam) obj).zzk(zzadVar2.zzY());
                this.y = true;
            } else if (i != 10) {
                throw new zzabq(GM.a("Audio format not supported: ", i));
            }
            this.x = true;
        }
        return true;
    }

    public final boolean c(long j, zzed zzedVar) {
        int i = this.z;
        Object obj = this.w;
        if (i == 2) {
            int iZza = zzedVar.zza();
            ((zzaam) obj).zzq(zzedVar, iZza);
            ((zzaam) obj).zzs(j, 1, iZza, 0, null);
            return true;
        }
        int iZzk = zzedVar.zzk();
        if (iZzk != 0 || this.y) {
            if (this.z == 10 && iZzk != 1) {
                return false;
            }
            int iZza2 = zzedVar.zza();
            ((zzaam) obj).zzq(zzedVar, iZza2);
            ((zzaam) obj).zzs(j, 1, iZza2, 0, null);
            return true;
        }
        int iZza3 = zzedVar.zza();
        byte[] bArr = new byte[iZza3];
        zzedVar.zzB(bArr, 0, iZza3);
        zzyc zzycVarZza = zzyd.zza(bArr);
        zzad zzadVar = new zzad();
        zzadVar.zzS("audio/mp4a-latm");
        zzadVar.zzx(zzycVarZza.zzc);
        zzadVar.zzw(zzycVarZza.zzb);
        zzadVar.zzT(zzycVarZza.zza);
        zzadVar.zzI(Collections.singletonList(bArr));
        ((zzaam) obj).zzk(zzadVar.zzY());
        this.y = true;
        return false;
    }
}
