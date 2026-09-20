package defpackage;

import android.os.Looper;
import android.view.View;
import com.google.android.gms.internal.ads.zzfkd;
import com.google.android.gms.internal.ads.zzfko;
import com.google.android.gms.internal.ads.zzfkw;
import com.google.android.gms.internal.ads.zzfkx;
import com.google.android.gms.internal.ads.zzfle;
import com.google.android.gms.internal.ads.zzflj;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzflq;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class uy5 implements Runnable {
    public final /* synthetic */ int w;

    public uy5() {
        this.w = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        switch (this.w) {
            case 0:
                try {
                    vy5.b = MessageDigest.getInstance("MD5");
                    countDownLatch = vy5.e;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = vy5.e;
                } catch (Throwable th) {
                    vy5.e.countDown();
                    throw th;
                }
                countDownLatch.countDown();
                return;
            case 1:
                Looper.myLooper().quit();
                return;
            default:
                zzflq zzflqVarZzd = zzflq.zzd();
                zzflqVarZzd.getClass();
                zzflqVarZzd.b.clear();
                for (zzfkd zzfkdVar : zzfko.zza().zzb()) {
                }
                zzflqVarZzd.f = System.nanoTime();
                zzflj zzfljVar = zzflqVarZzd.d;
                zzfljVar.zzi();
                long jNanoTime = System.nanoTime();
                zzfkx zzfkxVar = zzflqVarZzd.c;
                zzfkw zzfkwVarZza = zzfkxVar.zza();
                int size = zzfljVar.zze().size();
                zzflk zzflkVar = zzflqVarZzd.e;
                if (size > 0) {
                    for (String str : zzfljVar.zze()) {
                        JSONObject jSONObjectZza = zzfle.zza(0, 0, 0, 0);
                        View viewZza = zzfljVar.zza(str);
                        zzfkw zzfkwVarZzb = zzfkxVar.zzb();
                        String strZzc = zzfljVar.zzc(str);
                        if (strZzc != null) {
                            JSONObject jSONObjectZza2 = zzfkwVarZzb.zza(viewZza);
                            zzfle.zzb(jSONObjectZza2, str);
                            zzfle.zzf(jSONObjectZza2, strZzc);
                            zzfle.zzc(jSONObjectZza, jSONObjectZza2);
                        }
                        zzfle.zzi(jSONObjectZza);
                        HashSet hashSet = new HashSet();
                        hashSet.add(str);
                        zzflkVar.zzc(jSONObjectZza, hashSet, jNanoTime);
                    }
                }
                if (zzfljVar.zzf().size() > 0) {
                    JSONObject jSONObjectZza3 = zzfle.zza(0, 0, 0, 0);
                    zzfkwVarZza.zzb(null, jSONObjectZza3, zzflqVarZzd, true, false);
                    zzfle.zzi(jSONObjectZza3);
                    zzflkVar.zzd(jSONObjectZza3, zzfljVar.zzf(), jNanoTime);
                } else {
                    zzflkVar.zzb();
                }
                zzfljVar.zzg();
                long jNanoTime2 = System.nanoTime() - zzflqVarZzd.f;
                ArrayList<zzflp> arrayList = zzflqVarZzd.a;
                if (arrayList.size() > 0) {
                    for (zzflp zzflpVar : arrayList) {
                        TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                        zzflpVar.zzb();
                        if (zzflpVar instanceof zzflo) {
                            ((zzflo) zzflpVar).zza();
                        }
                    }
                    return;
                }
                return;
        }
    }
}
