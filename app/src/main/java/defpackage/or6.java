package defpackage;

import com.google.android.gms.internal.ads.zzgap;
import com.google.android.gms.internal.ads.zzgcx;
import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzgfg;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzght;
import com.google.android.gms.internal.ads.zzghw;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgkb;
import com.google.android.gms.internal.ads.zzgli;
import com.google.android.gms.internal.ads.zzgln;
import com.google.android.gms.internal.ads.zzglp;
import com.google.android.gms.internal.ads.zzgmb;
import com.google.android.gms.internal.ads.zzgme;
import com.google.android.gms.internal.ads.zzgpx;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class or6 extends zzgen {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or6(Class cls, int i) {
        super(cls);
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final /* bridge */ /* synthetic */ Object zza(zzgpx zzgpxVar) throws GeneralSecurityException {
        switch (this.b) {
            case 0:
                return new zzgcx(((zzggt) zzgpxVar).zzf().zzE());
            case 1:
                return zzgap.zza(((zzgkb) zzgpxVar).zzf().zze()).zzb();
            case 2:
                zzghw zzghwVar = (zzghw) zzgpxVar;
                zzght zzghtVarZzc = zzghwVar.zzf().zzc();
                zzgic zzgicVarZzf = zzghtVarZzc.zzf();
                int iC = ds6.c(zzgicVarZzf.zzg());
                byte[] bArrZzE = zzghwVar.zzg().zzE();
                return new zzgli((ECPrivateKey) ((KeyFactory) zzglp.zzg.zza("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrZzE), zzgln.zze(iC))), zzgicVarZzf.zze().zzE(), ds6.b(zzgicVarZzf.zzh()), ds6.d(zzghtVarZzc.zzi()), new es6(zzghtVarZzc.zza().zze()));
            default:
                zzgfg zzgfgVar = (zzgfg) zzgpxVar;
                return new zzgme(new zzgmb(zzgfgVar.zzg().zzE()), zzgfgVar.zzf().zza());
        }
    }
}
