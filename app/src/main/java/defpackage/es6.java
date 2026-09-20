package defpackage;

import com.google.android.gms.internal.ads.zzfzs;
import com.google.android.gms.internal.ads.zzfzy;
import com.google.android.gms.internal.ads.zzgbe;
import com.google.android.gms.internal.ads.zzgbg;
import com.google.android.gms.internal.ads.zzgdd;
import com.google.android.gms.internal.ads.zzgej;
import com.google.android.gms.internal.ads.zzgfo;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgfs;
import com.google.android.gms.internal.ads.zzgfu;
import com.google.android.gms.internal.ads.zzgfv;
import com.google.android.gms.internal.ads.zzggm;
import com.google.android.gms.internal.ads.zzggn;
import com.google.android.gms.internal.ads.zzggq;
import com.google.android.gms.internal.ads.zzggy;
import com.google.android.gms.internal.ads.zzggz;
import com.google.android.gms.internal.ads.zzghc;
import com.google.android.gms.internal.ads.zzgii;
import com.google.android.gms.internal.ads.zzgij;
import com.google.android.gms.internal.ads.zzgjl;
import com.google.android.gms.internal.ads.zzglh;
import com.google.android.gms.internal.ads.zzgnf;
import com.google.android.gms.internal.ads.zzgnz;
import com.google.android.gms.internal.ads.zzgoz;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class es6 implements zzglh {
    public final String a;
    public final int b;
    public final zzggn c;
    public final zzgfp d;
    public final int e;
    public final zzggz f;

    public es6(zzgjl zzgjlVar) throws GeneralSecurityException {
        String strZzf = zzgjlVar.zzf();
        this.a = strZzf;
        if (strZzf.equals(zzgbg.zzb)) {
            try {
                zzggq zzggqVarZze = zzggq.zze(zzgjlVar.zze(), zzgnz.zza());
                this.c = (zzggn) zzgbe.zzd(zzgjlVar);
                this.b = zzggqVarZze.zza();
                return;
            } catch (zzgoz e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (strZzf.equals(zzgbg.zza)) {
            try {
                zzgfs zzgfsVarZzd = zzgfs.zzd(zzgjlVar.zze(), zzgnz.zza());
                this.d = (zzgfp) zzgbe.zzd(zzgjlVar);
                int iZza = zzgfsVarZzd.zze().zza();
                this.e = iZza;
                this.b = iZza + zzgfsVarZzd.zzf().zza();
                return;
            } catch (zzgoz e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        }
        if (!strZzf.equals(zzgdd.zza)) {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(strZzf)));
        }
        try {
            zzghc zzghcVarZze = zzghc.zze(zzgjlVar.zze(), zzgnz.zza());
            this.f = (zzggz) zzgbe.zzd(zzgjlVar);
            this.b = zzghcVarZze.zza();
        } catch (zzgoz e3) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzglh
    public final int zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzglh
    public final zzgej zzb(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.b;
        if (length != i) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        String str = zzgbg.zzb;
        String str2 = this.a;
        if (str2.equals(str)) {
            zzggm zzggmVarZzc = zzggn.zzc();
            zzggmVarZzc.zzaj(this.c);
            zzggmVarZzc.zza(zzgnf.zzw(bArr, 0, i));
            return new zzgej((zzfzs) zzgbe.zzh(str2, (zzggn) zzggmVarZzc.zzal(), zzfzs.class));
        }
        if (!str2.equals(zzgbg.zza)) {
            if (!str2.equals(zzgdd.zza)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            zzggy zzggyVarZzc = zzggz.zzc();
            zzggyVarZzc.zzaj(this.f);
            zzggyVarZzc.zza(zzgnf.zzw(bArr, 0, i));
            return new zzgej((zzfzy) zzgbe.zzh(str2, (zzggz) zzggyVarZzc.zzal(), zzfzy.class));
        }
        int i2 = this.e;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, i);
        zzgfu zzgfuVarZzc = zzgfv.zzc();
        zzgfp zzgfpVar = this.d;
        zzgfuVarZzc.zzaj(zzgfpVar.zzf());
        zzgfuVarZzc.zza(zzgnf.zzv(bArrCopyOfRange));
        zzgfv zzgfvVar = (zzgfv) zzgfuVarZzc.zzal();
        zzgii zzgiiVarZzc = zzgij.zzc();
        zzgiiVarZzc.zzaj(zzgfpVar.zzg());
        zzgiiVarZzc.zza(zzgnf.zzv(bArrCopyOfRange2));
        zzgij zzgijVar = (zzgij) zzgiiVarZzc.zzal();
        zzgfo zzgfoVarZzc = zzgfp.zzc();
        zzgfoVarZzc.zzc(zzgfpVar.zza());
        zzgfoVarZzc.zza(zzgfvVar);
        zzgfoVarZzc.zzb(zzgijVar);
        return new zzgej((zzfzs) zzgbe.zzh(str2, (zzgfp) zzgfoVarZzc.zzal(), zzfzs.class));
    }
}
