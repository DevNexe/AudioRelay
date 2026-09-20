package defpackage;

import android.util.Log;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzed;
import com.google.android.gms.internal.ads.zzyv;
import com.google.android.gms.internal.ads.zzzg;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes3.dex */
public final class gx5 {
    public static boolean a(zzzg zzzgVar) {
        zzed zzedVar = new zzed(8);
        int i = fx5.a(zzzgVar, zzedVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, 4, false);
        zzedVar.zzF(0);
        int iZze = zzedVar.zze();
        if (iZze == 1463899717) {
            return true;
        }
        Log.e("WavHeaderReader", "Unsupported form type: " + iZze);
        return false;
    }

    public static fx5 b(int i, zzzg zzzgVar, zzed zzedVar) throws zzbu, EOFException, InterruptedIOException {
        fx5 fx5VarA = fx5.a(zzzgVar, zzedVar);
        while (true) {
            int i2 = fx5VarA.a;
            if (i2 == i) {
                return fx5VarA;
            }
            bj0.b("Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
            long j = fx5VarA.b + 8;
            if (j > 2147483647L) {
                throw zzbu.zzc("Chunk is too large (~2GB+) to skip; id: " + fx5VarA.a);
            }
            ((zzyv) zzzgVar).zzo((int) j, false);
            fx5VarA = fx5.a(zzzgVar, zzedVar);
        }
    }
}
