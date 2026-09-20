package defpackage;

import com.google.android.gms.internal.ads.zzgak;
import com.google.android.gms.internal.ads.zzgal;
import com.google.android.gms.internal.ads.zzgby;
import com.google.android.gms.internal.ads.zzgdi;
import com.google.android.gms.internal.ads.zzgel;
import com.google.android.gms.internal.ads.zzggs;
import com.google.android.gms.internal.ads.zzggt;
import com.google.android.gms.internal.ads.zzggw;
import com.google.android.gms.internal.ads.zzghq;
import com.google.android.gms.internal.ads.zzghv;
import com.google.android.gms.internal.ads.zzghw;
import com.google.android.gms.internal.ads.zzghy;
import com.google.android.gms.internal.ads.zzghz;
import com.google.android.gms.internal.ads.zzgka;
import com.google.android.gms.internal.ads.zzgkb;
import com.google.android.gms.internal.ads.zzgke;
import com.google.android.gms.internal.ads.zzgln;
import com.google.android.gms.internal.ads.zzgmg;
import com.google.android.gms.internal.ads.zzgmi;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgpx;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class pr6 extends zzgel {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr6(Class cls, int i) {
        super(cls);
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* bridge */ /* synthetic */ zzgpx zza(zzgpx zzgpxVar) throws InvalidAlgorithmParameterException {
        switch (this.b) {
            case 0:
                zzggs zzggsVarZzc = zzggt.zzc();
                zzggsVarZzc.zza(zzgnf.zzv(zzgmg.zza(((zzggw) zzgpxVar).zza())));
                zzggsVarZzc.zzb(0);
                return (zzggt) zzggsVarZzc.zzal();
            case 1:
                zzgka zzgkaVarZzc = zzgkb.zzc();
                zzgkaVarZzc.zza((zzgke) zzgpxVar);
                zzgkaVarZzc.zzb(0);
                return (zzgkb) zzgkaVarZzc.zzal();
            default:
                zzghq zzghqVar = (zzghq) zzgpxVar;
                KeyPair keyPairZzb = zzgln.zzb(zzgln.zze(ds6.c(zzghqVar.zze().zzf().zzg())));
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairZzb.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairZzb.getPrivate();
                ECPoint w = eCPublicKey.getW();
                zzghy zzghyVarZzd = zzghz.zzd();
                zzghyVarZzd.zzb(0);
                zzghyVarZzd.zza(zzghqVar.zze());
                zzghyVarZzd.zzc(zzgnf.zzv(w.getAffineX().toByteArray()));
                zzghyVarZzd.zzd(zzgnf.zzv(w.getAffineY().toByteArray()));
                zzghz zzghzVar = (zzghz) zzghyVarZzd.zzal();
                zzghv zzghvVarZzc = zzghw.zzc();
                zzghvVarZzc.zzc(0);
                zzghvVarZzc.zzb(zzghzVar);
                zzghvVarZzc.zza(zzgnf.zzv(eCPrivateKey.getS().toByteArray()));
                return (zzghw) zzghvVarZzc.zzal();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* synthetic */ zzgpx zzb(zzgnf zzgnfVar) {
        switch (this.b) {
            case 0:
                return zzggw.zze(zzgnfVar, zzgnz.zza());
            case 1:
                return zzgke.zzd(zzgnfVar, zzgnz.zza());
            default:
                return zzghq.zzd(zzgnfVar, zzgnz.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final Map zzc() throws GeneralSecurityException {
        switch (this.b) {
            case 0:
                HashMap map = new HashMap();
                map.put("AES128_GCM_SIV", zzgby.a(16, 1));
                map.put("AES128_GCM_SIV_RAW", zzgby.a(16, 3));
                map.put("AES256_GCM_SIV", zzgby.a(32, 1));
                map.put("AES256_GCM_SIV_RAW", zzgby.a(32, 3));
                return Collections.unmodifiableMap(map);
            case 1:
            default:
                return super.zzc();
            case 2:
                HashMap map2 = new HashMap();
                zzgak zzgakVarZza = zzgal.zza("AES128_GCM");
                byte[] bArr = zzgdi.d;
                map2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzgdi.a(3, zzgakVarZza, bArr, 1));
                map2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgdi.a(3, zzgal.zza("AES128_GCM"), bArr, 3));
                map2.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzgdi.a(4, zzgal.zza("AES128_GCM"), bArr, 1));
                map2.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgdi.a(4, zzgal.zza("AES128_GCM"), bArr, 3));
                map2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzgdi.a(4, zzgal.zza("AES128_GCM"), bArr, 3));
                map2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgdi.a(3, zzgal.zza("AES128_CTR_HMAC_SHA256"), bArr, 1));
                map2.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgdi.a(3, zzgal.zza("AES128_CTR_HMAC_SHA256"), bArr, 3));
                map2.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgdi.a(4, zzgal.zza("AES128_CTR_HMAC_SHA256"), bArr, 1));
                map2.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgdi.a(4, zzgal.zza("AES128_CTR_HMAC_SHA256"), bArr, 3));
                return Collections.unmodifiableMap(map2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgel
    public final /* synthetic */ void zzd(zzgpx zzgpxVar) throws GeneralSecurityException {
        switch (this.b) {
            case 0:
                zzgmi.zza(((zzggw) zzgpxVar).zza());
                break;
            case 1:
                break;
            default:
                ds6.a(((zzghq) zzgpxVar).zze());
                break;
        }
    }
}
