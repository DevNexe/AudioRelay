package defpackage;

import com.google.android.gms.internal.ads.zzaad;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzaf;
import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzfuv;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes3.dex */
public final class bw5 extends cw5 {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean e(zzed zzedVar, byte[] bArr) {
        if (zzedVar.zza() < 8) {
            return false;
        }
        int iZzc = zzedVar.zzc();
        byte[] bArr2 = new byte[8];
        zzedVar.zzB(bArr2, 0, 8);
        zzedVar.zzF(iZzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.cw5
    public final long a(zzed zzedVar) {
        int i;
        int i2;
        byte[] bArrZzH = zzedVar.zzH();
        int i3 = bArrZzH[0] & 255;
        int i4 = i3 & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = bArrZzH[1] & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i6 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return (((long) this.i) * (((long) i) * ((long) i2))) / 1000000;
    }

    @Override // defpackage.cw5
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = false;
        }
    }

    @Override // defpackage.cw5
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(zzed zzedVar, long j, d7G d7g) {
        if (e(zzedVar, o)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzedVar.zzH(), zzedVar.zzd());
            int i = bArrCopyOf[9] & 255;
            List listZza = zzaad.zza(bArrCopyOf);
            if (((zzaf) d7g.x) != null) {
                return true;
            }
            zzad zzadVar = new zzad();
            zzadVar.zzS("audio/opus");
            zzadVar.zzw(i);
            zzadVar.zzT(48000);
            zzadVar.zzI(listZza);
            d7g.x = zzadVar.zzY();
            return true;
        }
        if (!e(zzedVar, p)) {
            zzdd.zzb((zzaf) d7g.x);
            return false;
        }
        zzdd.zzb((zzaf) d7g.x);
        if (this.n) {
            return true;
        }
        this.n = true;
        zzedVar.zzG(8);
        zzbq zzbqVarZzb = zzaas.zzb(zzfuv.zzn(zzaas.zzc(zzedVar, false, false).zzb));
        if (zzbqVarZzb == null) {
            return true;
        }
        zzad zzadVarZzb = ((zzaf) d7g.x).zzb();
        zzadVarZzb.zzM(zzbqVarZzb.zzd(((zzaf) d7g.x).zzk));
        d7g.x = zzadVarZzb.zzY();
        return true;
    }
}
