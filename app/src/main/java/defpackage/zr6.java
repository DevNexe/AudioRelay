package defpackage;

import com.google.android.gms.internal.ads.zzfzy;
import com.google.android.gms.internal.ads.zzgba;
import com.google.android.gms.internal.ads.zzgle;

/* JADX INFO: loaded from: classes3.dex */
public final class zr6 implements zzfzy {
    public final zzgba a;

    public zr6(zzgba zzgbaVar) {
        this.a = zzgbaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzy
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        zzgba zzgbaVar = this.a;
        return zzgle.zzc(zzgbaVar.zza().zzb(), ((zzfzy) zzgbaVar.zza().zza()).zza(bArr, bArr2));
    }
}
