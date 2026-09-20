package defpackage;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzamh;
import com.google.android.gms.internal.ads.zzamx;
import com.google.android.gms.internal.ads.zzanj;
import com.google.android.gms.internal.ads.zzank;
import com.google.android.gms.internal.ads.zzanm;
import com.google.android.gms.internal.ads.zzaoq;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzgmm;
import com.google.android.gms.internal.ads.zzgnf;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class vy5 {
    public static boolean a = false;
    public static MessageDigest b;
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final CountDownLatch e = new CountDownLatch(1);

    public static String a(zzamx zzamxVar, String str) throws GeneralSecurityException {
        Vector vector;
        byte[] bArrD;
        int length;
        byte[] bArrZzaw = zzamxVar.zzaw();
        if (((Boolean) zzay.zzc().zzb(zzbiy.zzcu)).booleanValue()) {
            if (bArrZzaw == null || (length = bArrZzaw.length) <= 0) {
                vector = null;
            } else {
                int i = (length + 254) / 255;
                vector = new Vector();
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = i2 * 255;
                    try {
                        int length2 = bArrZzaw.length;
                        if (length2 - i3 > 255) {
                            length2 = i3 + 255;
                        }
                        vector.add(Arrays.copyOfRange(bArrZzaw, i3, length2));
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
            }
            if (vector == null || vector.size() == 0) {
                zzamh zzamhVarZza = zzamx.zza();
                zzamhVarZza.zzC(4096L);
                bArrD = d(((zzamx) zzamhVarZza.zzal()).zzaw(), str, true);
            } else {
                zzanj zzanjVarZza = zzank.zza();
                int size = vector.size();
                for (int i4 = 0; i4 < size; i4++) {
                    zzanjVarZza.zza(zzgnf.zzv(d((byte[]) vector.get(i4), str, false)));
                }
                zzanjVarZza.zzb(zzgnf.zzv(c(bArrZzaw)));
                bArrD = ((zzank) zzanjVarZza.zzal()).zzaw();
            }
        } else {
            if (g7.I == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrZza = g7.I.zza(bArrZzaw, str != null ? str.getBytes() : new byte[0]);
            zzanj zzanjVarZza2 = zzank.zza();
            zzanjVarZza2.zza(zzgnf.zzv(bArrZza));
            zzanjVarZza2.zzc(3);
            bArrD = ((zzank) zzanjVarZza2.zzal()).zzaw();
        }
        return zzanm.zza(bArrD, true);
    }

    public static void b() {
        synchronized (d) {
            if (!a) {
                a = true;
                new Thread(new uy5(0)).start();
            }
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (c) {
            b();
            MessageDigest messageDigest2 = null;
            try {
                if (e.await(2L, TimeUnit.SECONDS) && (messageDigest = b) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = b.digest();
        }
        return bArrDigest;
    }

    public static byte[] d(byte[] bArr, String str, boolean z) {
        byte[] bArrArray;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            zzamh zzamhVarZza = zzamx.zza();
            zzamhVarZza.zzC(4096L);
            bArr = ((zzamx) zzamhVarZza.zzal()).zzaw();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[i - length];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        wy5[] wy5VarArr = new zzaoq().G2;
        int length2 = wy5VarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            wy5VarArr[i2].zza(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgmm(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
