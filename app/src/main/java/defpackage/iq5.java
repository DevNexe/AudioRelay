package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.YKK;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzbcb;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbxp;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class iq5 implements Runnable {
    public final /* synthetic */ int w;
    public final Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ iq5(int i, Object obj, Object obj2) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        Set<Scope> set;
        IAccountAccessor zzvVar = null;
        switch (this.w) {
            case 0:
                zact zactVar = (zact) this.y;
                zq5 zq5Var = (zq5) this.x;
                ep5 ep5Var = zact.D;
                z50 z50Var = zq5Var.x;
                if (z50Var.x == 0) {
                    YKK ykk = zq5Var.y;
                    oa3.h(ykk);
                    z50 z50Var2 = ykk.y;
                    if ((z50Var2.x == 0 ? 1 : 0) == 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(z50Var2)), new Exception());
                        ((wp5) zactVar.C).b(z50Var2);
                        zactVar.B.disconnect();
                        return;
                    }
                    jq5 jq5Var = zactVar.C;
                    IBinder iBinder = ykk.x;
                    if (iBinder != null) {
                        int i = IAccountAccessor.Stub.w;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        zzvVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzv(iBinder);
                    }
                    wp5 wp5Var = (wp5) jq5Var;
                    wp5Var.getClass();
                    if (zzvVar == null || (set = zactVar.z) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        wp5Var.b(new z50(4));
                    } else {
                        wp5Var.c = zzvVar;
                        wp5Var.d = set;
                        if (wp5Var.e) {
                            wp5Var.a.getRemoteService(zzvVar, set);
                        }
                    }
                } else {
                    ((wp5) zactVar.C).b(z50Var);
                }
                zactVar.B.disconnect();
                return;
            case 1:
                ((zzato) this.y).b.zzh((zzass) this.x);
                return;
            case 2:
                g26 g26Var = (g26) this.x;
                if (g26Var.c != null) {
                    g26Var.c = null;
                }
                i26 i26Var = (i26) this.y;
                int size = i26Var.J.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((zzayj) i26Var.J.valueAt(i2)).zzi();
                }
                return;
            case 3:
                zzbcl zzbclVar = (zzbcl) this.y;
                View view = (View) this.x;
                String str = zzbclVar.I;
                try {
                    zzbcb zzbcbVar = new zzbcb(zzbclVar.B, zzbclVar.C, zzbclVar.D, zzbclVar.E, zzbclVar.F, zzbclVar.G, zzbclVar.H, zzbclVar.K);
                    Context contextZzb = zzt.zzb().zzb();
                    if (contextZzb != null && !TextUtils.isEmpty(str)) {
                        String str2 = (String) view.getTag(contextZzb.getResources().getIdentifier((String) zzay.zzc().zzb(zzbiy.zzT), FacebookAdapter.KEY_ID, contextZzb.getPackageName()));
                        if (str2 != null && str2.equals(str)) {
                            return;
                        }
                    }
                    vm2 vm2VarA = zzbclVar.a(view, zzbcbVar);
                    zzbcbVar.zzm();
                    if (vm2VarA.a == 0 && vm2VarA.b == 0) {
                        return;
                    }
                    int i3 = vm2VarA.b;
                    zzbcc zzbccVar = zzbclVar.z;
                    if (i3 != 0) {
                        if (i3 == 0) {
                        }
                        zzbccVar.zzb(zzbcbVar);
                        return;
                    } else if (zzbcbVar.k == 0) {
                        return;
                    }
                    if (zzbccVar.zzd(zzbcbVar)) {
                        return;
                    }
                    zzbccVar.zzb(zzbcbVar);
                    return;
                } catch (Exception e) {
                    zzcgn.zzh("Exception in fetchContentOnUIThread", e);
                    zzt.zzp().zzt(e, "ContentFetchTask.fetchContent");
                    return;
                }
            case 4:
                zzt.zzj();
                zzm.zza(((zzbxp) this.y).a, (AdOverlayInfoParcel) this.x, true);
                return;
            case 5:
                ((WebView) this.x).destroy();
                return;
            case 6:
                u27 u27Var = (u27) this.x;
                z05 z05Var = (z05) this.y;
                Context context = u27Var.a;
                String string = context.getSharedPreferences("app_set_id_storage", 0).getString("app_set_id", null);
                long j = u27Var.a.getSharedPreferences("app_set_id_storage", 0).getLong("app_set_id_last_used_time", -1L);
                long j2 = j != -1 ? 33696000000L + j : -1L;
                if (string != null && System.currentTimeMillis() <= j2) {
                    try {
                        u27.b(context);
                    } catch (l17 e2) {
                        z05Var.a.r(e2);
                        return;
                    }
                    break;
                } else {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String strValueOf = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                            throw new l17("Failed to store the app set ID.");
                        }
                        u27.b(context);
                        if (!context.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String strValueOf2 = String.valueOf(context.getPackageName());
                            Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new l17("Failed to store the app set ID creation time.");
                        }
                    } catch (l17 e3) {
                        z05Var.a.r(e3);
                        return;
                    }
                }
                z05Var.a(new HB(string, 1));
                return;
            case 7:
                ((gcF) ((r60.QnHx) this.x)).a(((zzj) this.y).a());
                return;
            case 8:
                zzgq zzgqVar = (zzgq) this.y;
                zzgqVar.w.a();
                ft5 ft5Var = (ft5) this.x;
                if (ft5Var.y.b() == null) {
                    r27 r27Var = zzgqVar.w;
                    r27Var.getClass();
                    String str3 = ft5Var.w;
                    oa3.h(str3);
                    p97 p97VarV = r27Var.v(str3);
                    if (p97VarV != null) {
                        r27Var.k(ft5Var, p97VarV);
                        return;
                    }
                    return;
                }
                r27 r27Var2 = zzgqVar.w;
                r27Var2.getClass();
                String str4 = ft5Var.w;
                oa3.h(str4);
                p97 p97VarV2 = r27Var2.v(str4);
                if (p97VarV2 != null) {
                    r27Var2.n(ft5Var, p97VarV2);
                    return;
                }
                return;
            case 9:
                zzgq zzgqVar2 = (zzgq) this.y;
                zzgqVar2.w.a();
                r27 r27Var3 = zzgqVar2.w;
                p97 p97Var = (p97) this.x;
                r27Var3.zzaz().e();
                r27Var3.d();
                oa3.e(p97Var.w);
                r27Var3.F(p97Var);
                return;
            case 10:
                synchronized (((AtomicReference) this.x)) {
                    try {
                        AtomicReference atomicReference = (AtomicReference) this.x;
                        Object obj = this.y;
                        atomicReference.set(Long.valueOf(((dy6) obj).a.g.k(((dy6) obj).a.m().j(), lg6.N)));
                        ((AtomicReference) this.x).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.x).notify();
                        throw th;
                    }
                }
                return;
            case 11:
                ((dy6) this.y).v((Boolean) this.x, true);
                return;
            case 12:
                u07.s(((s07) this.y).c, (ComponentName) this.x);
                return;
            case 13:
                Object obj2 = this.y;
                try {
                    w05 w05Var = (w05) ((a90) ((lj6) obj2).z).then((w05) this.x);
                    if (w05Var == null) {
                        ((lj6) obj2).onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    cb7 cb7Var = d15.b;
                    lj6 lj6Var = (lj6) obj2;
                    w05Var.e(cb7Var, lj6Var);
                    w05Var.d(cb7Var, lj6Var);
                    w05Var.a(cb7Var, lj6Var);
                    return;
                } catch (RuntimeExecutionException e4) {
                    if (e4.getCause() instanceof Exception) {
                        ((lj6) obj2).y.r((Exception) e4.getCause());
                        return;
                    } else {
                        ((lj6) obj2).y.r(e4);
                        return;
                    }
                } catch (Exception e5) {
                    ((lj6) obj2).y.r(e5);
                    return;
                }
            case 14:
                synchronized (((tz6) this.y).x) {
                    ku2<TResult> ku2Var = ((tz6) this.y).y;
                    if (ku2Var != 0) {
                        ku2Var.onComplete((w05<TResult>) ((w05) this.x));
                    }
                    break;
                }
                return;
            default:
                Object obj3 = this.y;
                try {
                    w05 w05VarE = ((uw4) ((lj6) obj3).z).e(((w05) this.x).k());
                    if (w05VarE == null) {
                        ((lj6) obj3).onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    cb7 cb7Var2 = d15.b;
                    lj6 lj6Var2 = (lj6) obj3;
                    w05VarE.e(cb7Var2, lj6Var2);
                    w05VarE.d(cb7Var2, lj6Var2);
                    w05VarE.a(cb7Var2, lj6Var2);
                    return;
                } catch (RuntimeExecutionException e6) {
                    if (e6.getCause() instanceof Exception) {
                        ((lj6) obj3).onFailure((Exception) e6.getCause());
                        return;
                    } else {
                        ((lj6) obj3).onFailure(e6);
                        return;
                    }
                } catch (CancellationException unused) {
                    ((lj6) obj3).c();
                    return;
                } catch (Exception e7) {
                    ((lj6) obj3).onFailure(e7);
                    return;
                }
        }
    }

    public iq5(zzfld zzfldVar) {
        this.w = 5;
        this.y = zzfldVar;
        this.x = zzfldVar.d;
    }

    public /* synthetic */ iq5(Object obj, Object obj2, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
