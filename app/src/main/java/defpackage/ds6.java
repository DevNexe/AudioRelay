package defpackage;

import com.google.android.gms.internal.ads.zzgbe;
import com.google.android.gms.internal.ads.zzghk;
import com.google.android.gms.internal.ads.zzght;
import com.google.android.gms.internal.ads.zzgie;
import com.google.android.gms.internal.ads.zzgig;
import com.google.android.gms.internal.ads.zzgln;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public final class ds6 {
    public static void a(zzght zzghtVar) throws GeneralSecurityException {
        zzgln.zze(c(zzghtVar.zzf().zzg()));
        b(zzghtVar.zzf().zzh());
        if (zzghtVar.zzi() == 2) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzgbe.zzc(zzghtVar.zza().zze());
    }

    public static String b(int i) throws NoSuchAlgorithmException {
        int i2 = i - 2;
        if (i2 == 1) {
            return "HmacSha1";
        }
        if (i2 == 2) {
            return "HmacSha384";
        }
        if (i2 == 3) {
            return "HmacSha256";
        }
        if (i2 == 4) {
            return "HmacSha512";
        }
        if (i2 == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzgig.zza(i))));
    }

    public static int c(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 2;
        }
        if (i2 == 4) {
            return 3;
        }
        throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzgie.zza(i))));
    }

    public static int d(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzghk.zza(i))));
            }
        }
        return i3;
    }
}
