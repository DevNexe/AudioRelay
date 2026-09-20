package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzae;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbtr;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzdyb;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegb;
import com.google.android.gms.internal.ads.zzfcl;
import com.google.android.gms.internal.ads.zzfcm;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfje;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzguz;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class xi5 implements zzchh, zzfcl, zzg, zzfyk {
    public final /* synthetic */ int w;
    public Object x;
    public Object y;
    public Object z;

    public xi5(zzbtr zzbtrVar, zzbtq zzbtqVar, zzfir zzfirVar) {
        this.w = 1;
        this.z = zzbtrVar;
        this.x = zzbtqVar;
        this.y = zzfirVar;
    }

    public static void a(mf1 mf1Var, sh4 sh4Var) {
        b(mf1Var, "X-CRASHLYTICS-GOOGLE-APP-ID", sh4Var.a);
        b(mf1Var, "X-CRASHLYTICS-API-CLIENT-TYPE", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        b(mf1Var, "X-CRASHLYTICS-API-CLIENT-VERSION", "18.2.13");
        b(mf1Var, "Accept", "application/json");
        b(mf1Var, "X-CRASHLYTICS-DEVICE-MODEL", sh4Var.b);
        b(mf1Var, "X-CRASHLYTICS-OS-BUILD-VERSION", sh4Var.c);
        b(mf1Var, "X-CRASHLYTICS-OS-DISPLAY-VERSION", sh4Var.d);
        b(mf1Var, "X-CRASHLYTICS-INSTALLATION-ID", ((th1) sh4Var.e).c());
    }

    public static void b(mf1 mf1Var, String str, String str2) {
        if (str2 != null) {
            mf1Var.c.put(str, str2);
        }
    }

    public static HashMap c(sh4 sh4Var) {
        HashMap map = new HashMap();
        map.put("build_version", sh4Var.h);
        map.put("display_version", sh4Var.g);
        map.put("source", Integer.toString(sh4Var.i));
        String str = sh4Var.f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        switch (this.w) {
            case 5:
                xi5 xi5Var = new xi5(((ds5) this.x).clone());
                Iterator it = ((List) this.z).iterator();
                while (it.hasNext()) {
                    ((List) xi5Var.z).add(((ds5) it.next()).clone());
                }
                return xi5Var;
            default:
                return super.clone();
        }
    }

    public final JSONObject d(tp1 tp1Var) {
        int i = tp1Var.a;
        ((kK) this.z).h("Settings response code was: " + i);
        if (!(i == 200 || i == 201 || i == 202 || i == 203)) {
            kK kKVar = (kK) this.z;
            StringBuilder sbC = iZUl.c("Settings request failed; (status: ", i, ") from ");
            sbC.append((String) this.x);
            String string = sbC.toString();
            if (!kKVar.b(6)) {
                return null;
            }
            Log.e("FirebaseCrashlytics", string, null);
            return null;
        }
        String str = (String) tp1Var.b;
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            ((kK) this.z).i("Failed to parse settings JSON from " + ((String) this.x), e);
            ((kK) this.z).i("Settings response " + str, null);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zza(zzdck zzdckVar) {
        this.y = zzdckVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcl
    public final /* synthetic */ zzfcl zza(String str) {
        this.z = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    /* JADX INFO: renamed from: zza */
    public final void mo43zza() {
        zzfje zzfjeVar;
        synchronized (((zzbtr) this.z).a) {
            try {
                ((zzbtr) this.z).i = 1;
                zze.zza("Failed loading new engine. Marking new engine destroyable.");
                ((zzbtq) this.x).zzb();
                if (((Boolean) zzbkh.zzd.zze()).booleanValue() && (zzfjeVar = ((zzbtr) this.z).e) != null) {
                    zzfir zzfirVar = (zzfir) this.y;
                    zzfirVar.zze(false);
                    zzfjeVar.zzb(zzfirVar.zzj());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final /* synthetic */ zzg zzb(zzae zzaeVar) {
        this.z = zzaeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfcl
    public final /* synthetic */ zzfcl zzb(Context context) {
        context.getClass();
        this.y = context;
        return this;
    }

    @Override // com.google.android.gms.ads.nonagon.signalgeneration.zzg
    public final zzh zzc() {
        zzguz.zzc((zzdck) this.y, zzdck.class);
        zzguz.zzc((zzae) this.z, zzae.class);
        eb6 eb6Var = (eb6) this.x;
        zzae zzaeVar = (zzae) this.z;
        new zzdah();
        return new bc6(eb6Var, zzaeVar, new zzdyb(), (zzdck) this.y);
    }

    public /* synthetic */ xi5(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo32zzb(Object obj) {
        String str = (String) obj;
        if (!((zzcmn) this.x).zzF().zzak) {
            ((zzfju) this.y).zzc(str, null);
            return;
        }
        long jB = zzt.zzB().b();
        String str2 = ((zzcmn) this.x).zzR().zzb;
        int i = 2;
        if (!zzt.zzp().zzv(((zzcmn) this.x).getContext())) {
            if (!((Boolean) zzay.zzc().zzb(zzbiy.zzfo)).booleanValue() || !((zzcmn) this.x).zzF().zzT) {
                i = 1;
            }
        }
        ((zzefz) this.z).zzd(new zzegb(jB, str2, str, i));
    }

    public xi5(String str, sy4 sy4Var, int i) {
        kK kKVar = kK.x;
        this.w = 7;
        if (str != null) {
            this.z = kKVar;
            this.y = sy4Var;
            this.x = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    @Override // com.google.android.gms.internal.ads.zzfcl
    /* JADX INFO: renamed from: zzc, reason: collision with other method in class */
    public final zzfcm mo49zzc() {
        zzguz.zzc((Context) this.y, Context.class);
        return new wb6((eb6) this.x, (Context) this.y, (String) this.z);
    }

    public /* synthetic */ xi5(eb6 eb6Var, int i) {
        this.w = i;
        this.x = eb6Var;
    }

    public xi5() {
        this.w = 5;
        this.x = new ds5("", 0L, null);
        this.y = new ds5("", 0L, null);
        this.z = new ArrayList();
    }

    public xi5(ds5 ds5Var) {
        this.w = 5;
        this.x = ds5Var;
        this.y = ds5Var.clone();
        this.z = new ArrayList();
    }

    public xi5(ul1.QnHx qnHx, ul1.CQf cQf, ul1.F1 f1) {
        this.w = 0;
        this.x = qnHx;
        this.z = cQf;
        this.y = f1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xi5(String str, sy4 sy4Var) {
        this(str, sy4Var, 0);
        this.w = 7;
    }
}
