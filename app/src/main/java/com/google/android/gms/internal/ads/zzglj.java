package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglj implements zzgaa {
    public static final byte[] f = new byte[0];
    public final zzglm a;
    public final String b;
    public final byte[] c;
    public final zzglh d;
    public final int e;

    public zzglj(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, zzglh zzglhVar) throws GeneralSecurityException {
        zzgln.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.a = new zzglm(eCPublicKey);
        this.c = bArr;
        this.b = str;
        this.e = i;
        this.d = zzglhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzglm zzglmVar = this.a;
        String str = this.b;
        byte[] bArr3 = this.c;
        zzglh zzglhVar = this.d;
        zzgll zzgllVarZza = zzglmVar.zza(str, bArr3, bArr2, zzglhVar.zza(), this.e);
        byte[] bArrZza = zzglhVar.zzb(zzgllVarZza.zzb()).zza(bArr, f);
        byte[] bArrZza2 = zzgllVarZza.zza();
        return ByteBuffer.allocate(bArrZza2.length + bArrZza.length).put(bArrZza2).put(bArrZza).array();
    }
}
