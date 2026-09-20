package defpackage;

import com.google.android.gms.internal.ads.zzgen;
import com.google.android.gms.internal.ads.zzgfv;
import com.google.android.gms.internal.ads.zzggn;
import com.google.android.gms.internal.ads.zzgix;
import com.google.android.gms.internal.ads.zzgjd;
import com.google.android.gms.internal.ads.zzgks;
import com.google.android.gms.internal.ads.zzgkx;
import com.google.android.gms.internal.ads.zzglb;
import com.google.android.gms.internal.ads.zzgmk;
import com.google.android.gms.internal.ads.zzgpx;

/* JADX INFO: loaded from: classes3.dex */
public final class lr6 extends zzgen {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr6(Class cls, int i) {
        super(cls);
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final Object zza(zzgpx zzgpxVar) {
        switch (this.b) {
            case 0:
                zzgfv zzgfvVar = (zzgfv) zzgpxVar;
                return new zzgkx(zzgfvVar.zzh().zzE(), zzgfvVar.zzg().zza());
            case 1:
                return new zzglb(((zzggn) zzgpxVar).zzf().zzE());
            case 2:
                return new zzgmk(((zzgks) zzgpxVar).zzf().zzE());
            default:
                zzgjd zzgjdVar = (zzgjd) zzgpxVar;
                if (zzgjdVar.zzh().zzD()) {
                    throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
                }
                zzgix zzgixVarZzc = zzgjdVar.zzc();
                sd6 sd6VarO = g7.o(zzgixVarZzc);
                if (zzgixVarZzc.zzf() == 3) {
                    return new ks6(zzgjdVar, sd6VarO, new w56(1), g7.k(zzgixVarZzc));
                }
                throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
        }
    }
}
