package defpackage;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzanj;
import com.google.android.gms.internal.ads.zzank;
import com.google.android.gms.internal.ads.zzbpp;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbts;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzfmf;
import com.google.android.gms.internal.ads.zzfmi;
import com.google.android.gms.internal.ads.zzfnt;
import com.google.android.gms.internal.ads.zzfoc;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzgnf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ma5 implements zzchj, zzfmi {
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public /* synthetic */ ma5(zzbuj zzbujVar, zzbtl zzbtlVar, Object obj, zzchf zzchfVar) {
        this.z = zzbujVar;
        this.w = zzbtlVar;
        this.x = obj;
        this.y = zzchfVar;
    }

    public /* synthetic */ ma5(Object obj, zzfnt zzfntVar, zzfoe zzfoeVar, zzfmf zzfmfVar) {
        this.w = obj;
        this.x = zzfntVar;
        this.y = zzfoeVar;
        this.z = zzfmfVar;
    }

    public /* synthetic */ ma5(ma5 ma5Var, d7G d7g) {
        this.y = new HashMap();
        this.z = new HashMap();
        this.w = ma5Var;
        this.x = d7g;
    }

    public static String k(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzanj zzanjVarZza = zzank.zza();
        zzanjVarZza.zzc(5);
        zzanjVarZza.zza(zzgnf.zzv(bArr));
        return Base64.encodeToString(((zzank) zzanjVarZza.zzal()).zzaw(), 11);
    }

    public final ma5 a() {
        return new ma5(this, (d7G) this.x);
    }

    public final ez5 b(ez5 ez5Var) {
        return ((d7G) this.x).h(this, ez5Var);
    }

    public final ez5 c(hu5 hu5Var) {
        ez5 ez5VarH = ez5.o;
        Iterator itG = hu5Var.g();
        while (itG.hasNext()) {
            ez5VarH = ((d7G) this.x).h(this, hu5Var.e(((Integer) itG.next()).intValue()));
            if (ez5VarH instanceof uv5) {
                break;
            }
        }
        return ez5VarH;
    }

    public final ez5 d(String str) {
        Object obj = this.y;
        if (((Map) obj).containsKey(str)) {
            return (ez5) ((Map) obj).get(str);
        }
        ma5 ma5Var = (ma5) this.w;
        if (ma5Var != null) {
            return ma5Var.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final synchronized int e() {
        try {
        } catch (Exception e) {
            throw new zzfoc(AdError.INTERNAL_ERROR_2006, e);
        }
        return ((Integer) this.w.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.w, new Object[0])).intValue();
    }

    public final void f(String str, ez5 ez5Var) {
        if (((Map) this.z).containsKey(str)) {
            return;
        }
        Object obj = this.y;
        if (ez5Var == null) {
            ((Map) obj).remove(str);
        } else {
            ((Map) obj).put(str, ez5Var);
        }
    }

    public final synchronized void g() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.w.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.w, new Object[0]);
            ((zzfmf) this.z).zzd(AdError.MEDIATION_ERROR_CODE, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfoc(AdError.INTERNAL_ERROR_2003, e);
        }
    }

    public final void h(String str, ez5 ez5Var) {
        Object obj = this.y;
        if (!((Map) obj).containsKey(str)) {
            Object obj2 = this.w;
            ma5 ma5Var = (ma5) obj2;
            if (ma5Var != null && ma5Var.j(str)) {
                ((ma5) obj2).h(str, ez5Var);
                return;
            }
        }
        if (((Map) this.z).containsKey(str)) {
            return;
        }
        if (ez5Var == null) {
            ((Map) obj).remove(str);
        } else {
            ((Map) obj).put(str, ez5Var);
        }
    }

    public final synchronized boolean i() {
        try {
        } catch (Exception e) {
            throw new zzfoc(AdError.INTERNAL_ERROR_CODE, e);
        }
        return ((Boolean) this.w.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.w, new Object[0])).booleanValue();
    }

    public final boolean j(String str) {
        if (((Map) this.y).containsKey(str)) {
            return true;
        }
        ma5 ma5Var = (ma5) this.w;
        if (ma5Var != null) {
            return ma5Var.j(str);
        }
        return false;
    }

    public final synchronized byte[] l(Map map) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            ((zzfmf) this.z).zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) this.w.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.w, null, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfmi
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = ((zzfoe) this.y).zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put("view", view);
        mapZza.put("act", activity);
        return k(l(mapZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfmi
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = ((zzfoe) this.y).zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        return k(l(mapZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfmi
    public final synchronized String zzc(Context context, String str) {
        Map mapZzb;
        mapZzb = ((zzfoe) this.y).zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return k(l(mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfmi
    public final synchronized void zzd(String str, MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.w.getClass().getDeclaredMethod("he", Map.class).invoke(this.w, map);
            ((zzfmf) this.z).zzd(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfoc(2005, e);
        }
    }

    public /* synthetic */ ma5() {
        this.w = new Bt7j();
        this.y = new SparseArray();
        this.z = new q62();
        this.x = new Bt7j();
    }

    public /* synthetic */ ma5(Throwable th, nr4 nr4Var) {
        this.w = th.getLocalizedMessage();
        this.x = th.getClass().getName();
        this.y = nr4Var.a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.z = cause != null ? new ma5(cause, nr4Var) : null;
    }

    @Override // com.google.android.gms.internal.ads.zzchj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbts zzbtsVar = (zzbts) obj;
        zzbuj zzbujVar = (zzbuj) this.z;
        zzbtl zzbtlVar = (zzbtl) this.w;
        Object obj2 = this.x;
        zzchf zzchfVar = (zzchf) this.y;
        try {
            zzt.zzq();
            String string = UUID.randomUUID().toString();
            zzbpp.zzo.zzc(string, new e66(zzbtlVar, zzbujVar, zzchfVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookAdapter.KEY_ID, string);
            jSONObject.put("args", zzbujVar.b.zzb(obj2));
            zzbtsVar.zzl(zzbujVar.d, jSONObject);
        } catch (Exception e) {
            try {
                zzchfVar.zze(e);
                zzcgn.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbtlVar.zzb();
            }
        }
    }
}
