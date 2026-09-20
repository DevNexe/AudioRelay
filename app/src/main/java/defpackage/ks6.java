package defpackage;

import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zzgeh;
import com.google.android.gms.internal.ads.zzgjd;
import com.google.android.gms.internal.ads.zzgle;
import com.google.android.gms.internal.ads.zzgmj;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes3.dex */
public final class ks6 implements zzgaa {
    public static final byte[] e = new byte[0];
    public final zzgjd a;
    public final hs6 b;
    public final sd6 c;
    public final w56 d;

    public ks6(zzgjd zzgjdVar, sd6 sd6Var, w56 w56Var, hs6 hs6Var) {
        this.a = zzgjdVar;
        this.c = sd6Var;
        this.d = w56Var;
        this.b = hs6Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgaa
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzd;
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        zzgjd zzgjdVar = this.a;
        sd6 sd6Var = this.c;
        w56 w56Var = this.d;
        hs6 hs6Var = this.b;
        byte[] bArrZzE = zzgjdVar.zzh().zzE();
        byte[] bArrZzb = zzgmj.zzb();
        sd6Var.getClass();
        byte[] bArrZza = zzgmj.zza(bArrZzb, bArrZzE);
        byte[] bArrZzc = zzgmj.zzc(bArrZzb);
        byte[] bArrZzc2 = zzgle.zzc(bArrZzc, bArrZzE);
        byte[] bArr4 = zzgeh.zzb;
        byte[] bArrZzc3 = zzgle.zzc(zzgeh.a, bArr4);
        w56 w56Var2 = (w56) sd6Var.x;
        int macLength = Mac.getInstance(w56Var2.w).getMacLength();
        byte[] bArr5 = zzgeh.c;
        byte[] bArrA = w56Var2.a(macLength, w56Var2.b(zzgle.zzc(bArr5, bArrZzc3, "eae_prk".getBytes(StandardCharsets.UTF_8), bArrZza), null), zzgeh.b("shared_secret", bArrZzc2, bArrZzc3, macLength));
        byte[] bArr6 = zzgeh.zzc;
        if (!Arrays.equals(bArr6, bArr6)) {
            throw new GeneralSecurityException("Could not determine HPKE KEM ID");
        }
        byte[] bArrZzc4 = zzgle.zzc(zzgeh.b, bArr4, bArr6, hs6Var.zzb());
        byte[] bArr7 = zzgeh.zzg;
        byte[] bArr8 = is6.d;
        w56Var.getClass();
        byte[] bArrZzc5 = zzgle.zzc(zzgeh.zza, w56Var.b(zzgle.zzc(bArr5, bArrZzc4, "psk_id_hash".getBytes(StandardCharsets.UTF_8), bArr8), bArr7), w56Var.b(zzgle.zzc(bArr5, bArrZzc4, "info_hash".getBytes(StandardCharsets.UTF_8), bArr3), bArr7));
        byte[] bArrB = w56Var.b(zzgle.zzc(bArr5, bArrZzc4, "secret".getBytes(StandardCharsets.UTF_8), bArr8), bArrA);
        int iZza = hs6Var.zza();
        byte[] bArrA2 = w56Var.a(iZza, bArrB, zzgeh.b(SubscriberAttributeKt.JSON_NAME_KEY, bArrZzc5, bArrZzc4, iZza));
        byte[] bArrA3 = w56Var.a(12, bArrB, zzgeh.b("base_nonce", bArrZzc5, bArrZzc4, 12));
        BigInteger bigInteger = BigInteger.ONE;
        is6 is6Var = new is6(bArrZzc, bArrA2, bArrA3, bigInteger.shiftLeft(96).subtract(bigInteger), hs6Var);
        byte[] bArr9 = e;
        synchronized (is6Var) {
            byte[] byteArray = is6Var.c.toByteArray();
            int length = byteArray.length;
            if (length != 12) {
                if (length > 13) {
                    throw new GeneralSecurityException("integer too large");
                }
                if (length != 13) {
                    byte[] bArr10 = new byte[12];
                    System.arraycopy(byteArray, 0, bArr10, 12 - length, length);
                    byteArray = bArr10;
                } else {
                    if (byteArray[0] != 0) {
                        throw new GeneralSecurityException("integer too large");
                    }
                    byteArray = Arrays.copyOfRange(byteArray, 1, 13);
                }
            }
            bArrZzd = zzgle.zzd(bArrA3, byteArray);
            if (is6Var.c.compareTo(is6Var.b) >= 0) {
                throw new GeneralSecurityException("message limit reached");
            }
            is6Var.c = is6Var.c.add(bigInteger);
        }
        return zzgle.zzc(bArrZzc, is6Var.a.a(bArrA2, bArrZzd, bArr, bArr9));
    }
}
