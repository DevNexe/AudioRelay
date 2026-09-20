package defpackage;

import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzglp;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class w56 implements zzfyk {
    public String w;

    public /* synthetic */ w56() {
    }

    public byte[] a(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzglp zzglpVar = zzglp.zzb;
        String str = this.w;
        Mac mac = (Mac) zzglpVar.zza(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i4 = i3 + length;
            if (i4 >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr3, i3, i - i3);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, i3, length);
            i2++;
            i3 = i4;
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        zzglp zzglpVar = zzglp.zzb;
        String str = this.w;
        Mac mac = (Mac) zzglpVar.zza(str);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        return mac.doFinal(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public void zza(Throwable th) {
        zzt.zzp().zzs(th, this.w);
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public void mo32zzb(Object obj) {
    }

    public /* synthetic */ w56(int i) {
        if (i != 1) {
            this.w = "ActiveViewListener.callActiveViewJs";
        } else {
            this.w = "HmacSha256";
        }
    }
}
