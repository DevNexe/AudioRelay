package defpackage;

import com.google.android.gms.internal.ads.zzgap;
import com.google.android.gms.internal.ads.zzgaq;
import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzgcf;
import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzgev;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzggz;
import com.google.android.gms.internal.ads.zzghf;
import com.google.android.gms.internal.ads.zzght;
import com.google.android.gms.internal.ads.zzghz;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgij;
import com.google.android.gms.internal.ads.zzgir;
import com.google.android.gms.internal.ads.zzgix;
import com.google.android.gms.internal.ads.zzgja;
import com.google.android.gms.internal.ads.zzgkh;
import com.google.android.gms.internal.ads.zzgla;
import com.google.android.gms.internal.ads.zzglc;
import com.google.android.gms.internal.ads.zzglf;
import com.google.android.gms.internal.ads.zzglj;
import com.google.android.gms.internal.ads.zzgln;
import com.google.android.gms.internal.ads.zzglo;
import com.google.android.gms.internal.ads.zzgma;
import com.google.android.gms.internal.ads.zzgmd;
import com.google.android.gms.internal.ads.zzgme;
import com.google.android.gms.internal.ads.zzgpx;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class jr6 extends zzgen {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr6(Class cls, int i) {
        super(cls);
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final Object zza(zzgpx zzgpxVar) throws GeneralSecurityException {
        switch (this.b) {
            case 0:
                zzgfp zzgfpVar = (zzgfp) zzgpxVar;
                return new zzglo((zzgma) new zzgbp().zzk(zzgfpVar.zzf(), zzgma.class), (zzgaq) new zzgev().zzk(zzgfpVar.zzg(), zzgaq.class), zzgfpVar.zzg().zzg().zza());
            case 1:
                zzgge zzggeVar = (zzgge) zzgpxVar;
                return new zzgla(zzggeVar.zzg().zzE(), zzggeVar.zzf().zza());
            case 2:
                return new zzglf(((zzghf) zzgpxVar).zzf().zzE());
            case 3:
                zzgkh zzgkhVar = (zzgkh) zzgpxVar;
                return new zzgcf(zzgkhVar.zzf().zza(), zzgap.zza(zzgkhVar.zzf().zzf()).zzb());
            case 4:
                return new zzglc(((zzggz) zzgpxVar).zzf().zzE());
            case 5:
                zzghz zzghzVar = (zzghz) zzgpxVar;
                zzght zzghtVarZzc = zzghzVar.zzc();
                zzgic zzgicVarZzf = zzghtVarZzc.zzf();
                return new zzglj(zzgln.zzd(ds6.c(zzgicVarZzf.zzg()), zzghzVar.zzh().zzE(), zzghzVar.zzi().zzE()), zzgicVarZzf.zze().zzE(), ds6.b(zzgicVarZzf.zzh()), ds6.d(zzghtVarZzc.zzi()), new es6(zzghtVarZzc.zza().zze()));
            case 6:
                zzgja zzgjaVar = (zzgja) zzgpxVar;
                if (!zzgjaVar.zzk()) {
                    throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
                }
                if (!zzgjaVar.zzf().zzl()) {
                    throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
                }
                if (zzgjaVar.zzg().zzD()) {
                    throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
                }
                zzgix zzgixVarZzc = zzgjaVar.zzf().zzc();
                g7.o(zzgixVarZzc);
                if (zzgixVarZzc.zzf() != 3) {
                    throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
                }
                g7.k(zzgixVarZzc);
                int iZzg = zzgixVarZzc.zzg();
                if (iZzg - 2 == 1) {
                    return new js6();
                }
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzgir.zza(iZzg)));
            default:
                zzgij zzgijVar = (zzgij) zzgpxVar;
                int iZzg2 = zzgijVar.zzg().zzg();
                SecretKeySpec secretKeySpec = new SecretKeySpec(zzgijVar.zzh().zzE(), "HMAC");
                int iZza = zzgijVar.zzg().zza();
                int i = iZzg2 - 2;
                if (i == 1) {
                    return new zzgme(new zzgmd("HMACSHA1", secretKeySpec), iZza);
                }
                if (i == 2) {
                    return new zzgme(new zzgmd("HMACSHA384", secretKeySpec), iZza);
                }
                if (i == 3) {
                    return new zzgme(new zzgmd("HMACSHA256", secretKeySpec), iZza);
                }
                if (i == 4) {
                    return new zzgme(new zzgmd("HMACSHA512", secretKeySpec), iZza);
                }
                if (i == 5) {
                    return new zzgme(new zzgmd("HMACSHA224", secretKeySpec), iZza);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
