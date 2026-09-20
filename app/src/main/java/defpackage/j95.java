package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzajm;
import com.google.android.gms.internal.ads.zzajr;
import com.google.android.gms.internal.ads.zzaka;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzdyo;
import com.google.android.gms.internal.ads.zzdyp;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzeze;
import com.google.android.gms.internal.ads.zzezf;
import com.google.android.gms.internal.ads.zzguz;
import com.google.android.gms.internal.ads.zzpi;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzrp;
import com.google.android.gms.internal.ads.zzrx;
import com.google.android.gms.internal.ads.zzsc;
import com.google.android.gms.internal.ads.zzsg;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzsq;
import com.google.android.gms.internal.ads.zzue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class j95 implements zzeze, zzdyo, zzsq, zzpj {
    public static j95 e;
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public j95(zzrp zzrpVar, Integer num) {
        this.d = zzrpVar;
        this.b = zzrpVar.c.zza(0, null, 0L);
        this.c = zzrpVar.d.zza(0, null);
        this.a = num;
    }

    public /* synthetic */ j95(zzue zzueVar, boolean[] zArr) {
        this.a = zzueVar;
        this.b = zArr;
        int i = zzueVar.zzc;
        this.c = new boolean[i];
        this.d = new boolean[i];
    }

    public /* synthetic */ j95(eb6 eb6Var, sb6 sb6Var) {
        this.a = eb6Var;
        this.b = sb6Var;
    }

    public static synchronized j95 a(Context context, c15 c15Var) {
        if (e == null) {
            e = new j95(context, c15Var);
        }
        return e;
    }

    public final synchronized void b(zzaka zzakaVar) {
        String strZzj = zzakaVar.zzj();
        List list = (List) ((Map) this.a).remove(strZzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzakm.zzb) {
            zzakm.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
        }
        zzaka zzakaVar2 = (zzaka) list.remove(0);
        ((Map) this.a).put(strZzj, list);
        synchronized (zzakaVar2.A) {
            zzakaVar2.G = this;
        }
        try {
            ((BlockingQueue) this.c).put(zzakaVar2);
        } catch (InterruptedException e2) {
            zzakm.zzb("Couldn't add request to queue. %s", e2.toString());
            Thread.currentThread().interrupt();
            ((zzajm) this.b).zzb();
        }
    }

    public final synchronized boolean c(zzaka zzakaVar) {
        String strZzj = zzakaVar.zzj();
        if (!((Map) this.a).containsKey(strZzj)) {
            ((Map) this.a).put(strZzj, null);
            synchronized (zzakaVar.A) {
                zzakaVar.G = this;
            }
            if (zzakm.zzb) {
                zzakm.zza("new request, sending to network %s", strZzj);
            }
            return false;
        }
        List arrayList = (List) ((Map) this.a).get(strZzj);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        zzakaVar.zzm("waiting-for-response");
        arrayList.add(zzakaVar);
        ((Map) this.a).put(strZzj, arrayList);
        if (zzakm.zzb) {
            zzakm.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
        }
        return true;
    }

    public final boolean d(int i, zzsg zzsgVar) {
        zzsg zzsgVarD;
        if (zzsgVar != null) {
            zzsgVarD = ((zzrp) this.d).d(this.a, zzsgVar);
            if (zzsgVarD == null) {
                return false;
            }
        } else {
            zzsgVarD = null;
        }
        zzsp zzspVar = (zzsp) this.b;
        if (zzspVar.zza != i || !zzel.zzT(zzspVar.zzb, zzsgVarD)) {
            this.b = ((zzrp) this.d).c.zza(i, zzsgVarD, 0L);
        }
        zzpi zzpiVar = (zzpi) this.c;
        if (zzpiVar.zza == i && zzel.zzT(zzpiVar.zzb, zzsgVarD)) {
            return true;
        }
        this.c = ((zzrp) this.d).d.zza(i, zzsgVarD);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final /* synthetic */ zzdyo zza(String str) {
        str.getClass();
        this.d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzaf(int i, zzsg zzsgVar, zzsc zzscVar) {
        if (d(i, zzsgVar)) {
            ((zzsp) this.b).zzc(zzscVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzag(int i, zzsg zzsgVar, zzrx zzrxVar, zzsc zzscVar) {
        if (d(i, zzsgVar)) {
            ((zzsp) this.b).zze(zzrxVar, zzscVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzah(int i, zzsg zzsgVar, zzrx zzrxVar, zzsc zzscVar) {
        if (d(i, zzsgVar)) {
            ((zzsp) this.b).zzg(zzrxVar, zzscVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzai(int i, zzsg zzsgVar, zzrx zzrxVar, zzsc zzscVar, IOException iOException, boolean z) {
        if (d(i, zzsgVar)) {
            ((zzsp) this.b).zzi(zzrxVar, zzscVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final void zzaj(int i, zzsg zzsgVar, zzrx zzrxVar, zzsc zzscVar) {
        if (d(i, zzsgVar)) {
            ((zzsp) this.b).zzk(zzrxVar, zzscVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final /* bridge */ /* synthetic */ zzdyo zzb(long j) {
        this.c = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyo
    public final zzdyp zzc() {
        zzguz.zzc((Long) this.c, Long.class);
        zzguz.zzc((String) this.d, String.class);
        return new eg4((eb6) this.a, (sb6) this.b, (Long) this.c, (String) this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzeze
    public final zzezf zzd() {
        zzguz.zzc((Context) this.b, Context.class);
        zzguz.zzc((String) this.c, String.class);
        zzguz.zzc((zzq) this.d, zzq.class);
        return new kb6((eb6) this.a, (Context) this.b, (String) this.c, (zzq) this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzeze
    public final /* synthetic */ zzeze zza(zzq zzqVar) {
        zzqVar.getClass();
        this.d = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeze
    public final /* synthetic */ zzeze zzb(String str) {
        str.getClass();
        this.c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeze
    public final /* synthetic */ zzeze zzc(Context context) {
        context.getClass();
        this.b = context;
        return this;
    }

    public /* synthetic */ j95(zzajm zzajmVar, BlockingQueue blockingQueue, zzajr zzajrVar) {
        this.a = new HashMap();
        this.d = zzajrVar;
        this.b = zzajmVar;
        this.c = blockingQueue;
    }

    public /* synthetic */ j95(rl1.QnHx qnHx, rl1.CQf cQf, rl1.F1 f1, rl1.LPt8Fixed lPt8) {
        this.a = qnHx;
        this.b = cQf;
        this.c = f1;
        this.d = lPt8;
    }

    public j95(int i) {
        if (i != 9) {
            this.a = new x93();
            this.b = new x93();
            this.c = new x93();
            this.d = new kq4[32];
            return;
        }
        this.d = Collections.emptyList();
    }

    public /* synthetic */ j95(Context context, c15 c15Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = new r9(applicationContext, c15Var);
        this.b = new t9(applicationContext, c15Var);
        this.c = new bo2(applicationContext, c15Var);
        this.d = new du4(applicationContext, c15Var);
    }
}
