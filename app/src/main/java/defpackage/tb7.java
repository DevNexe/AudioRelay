package defpackage;

import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.RemoteException;
import com.android.billingclient.api.T23;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcia;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzfry;
import com.google.android.gms.internal.ads.zzfrz;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfzq;
import com.google.android.gms.internal.ads.zzfzr;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.revenuecat.purchases.google.CQf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb7 implements Runnable {
    public final /* synthetic */ int w;
    public final Object x;
    public final Object y;

    public /* synthetic */ tb7(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        Throwable thZza;
        ss3 ss3Var;
        i = 0;
        int i = 0;
        int i2 = 1;
        switch (this.w) {
            case 0:
                ((CQf) this.x).a(T23.m, ((k70) this.y).a);
                return;
            case 1:
            default:
                Object obj = this.x;
                try {
                    ((kc7) obj).s(((Callable) this.y).call());
                    return;
                } catch (Exception e) {
                    ((kc7) obj).r(e);
                    return;
                } catch (Throwable th) {
                    ((kc7) obj).r(new RuntimeException(th));
                    return;
                }
            case 2:
                return;
            case 3:
                ((i26) this.y).A.zzi((IOException) this.x);
                return;
            case 4:
                return;
            case 5:
                zzcia zzciaVar = (zzcia) this.y;
                MediaPlayer mediaPlayer = (MediaPlayer) this.x;
                HashMap map = zzcia.O;
                if (((Boolean) zzay.zzc().zzb(zzbiy.zzbB)).booleanValue() && zzciaVar.y != null && mediaPlayer != null && (trackInfo = mediaPlayer.getTrackInfo()) != null) {
                    HashMap map2 = new HashMap();
                    for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
                        if (trackInfo2 != null) {
                            int trackType = trackInfo2.getTrackType();
                            if (trackType == 1) {
                                MediaFormat format2 = trackInfo2.getFormat();
                                if (format2 != null) {
                                    if (format2.containsKey("frame-rate")) {
                                        try {
                                            map2.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                        } catch (ClassCastException unused) {
                                            map2.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                        }
                                    }
                                    if (format2.containsKey("bitrate")) {
                                        Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                        zzciaVar.N = numValueOf;
                                        map2.put("bitRate", String.valueOf(numValueOf));
                                    }
                                    if (format2.containsKey("width") && format2.containsKey("height")) {
                                        map2.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                                    }
                                    if (format2.containsKey("mime")) {
                                        map2.put("videoMime", format2.getString("mime"));
                                    }
                                    if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                        map2.put("videoCodec", format2.getString("codecs-string"));
                                    }
                                    break;
                                }
                            } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                                if (format.containsKey("mime")) {
                                    map2.put("audioMime", format.getString("mime"));
                                }
                                if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                    map2.put("audioCodec", format.getString("codecs-string"));
                                }
                            }
                        }
                    }
                    if (!map2.isEmpty()) {
                        zzciaVar.y.zzd("onMetadataEvent", map2);
                    }
                }
                zzcib zzcibVar = zzciaVar.L;
                if (zzcibVar != null) {
                    zzcibVar.zzf();
                    return;
                }
                return;
            case 6:
                Object obj2 = this.x;
                Future future = (Future) obj2;
                boolean z = future instanceof zzfzq;
                Object obj3 = this.y;
                if (z && (thZza = zzfzr.zza((zzfzq) future)) != null) {
                    ((zzfyk) obj3).zza(thZza);
                    return;
                }
                try {
                    ((zzfyk) obj3).mo32zzb(zzfyo.zzp((Future) obj2));
                    return;
                } catch (Error e2) {
                    e = e2;
                    ((zzfyk) obj3).zza(e);
                    return;
                } catch (RuntimeException e3) {
                    e = e3;
                    ((zzfyk) obj3).zza(e);
                    return;
                } catch (ExecutionException e4) {
                    ((zzfyk) obj3).zza(e4.getCause());
                    return;
                }
            case 7:
                yb7 yb7Var = (yb7) this.x;
                r60.CQf cQf = (r60.CQf) this.y;
                yb7Var.getClass();
                cQf.getClass();
                yb7Var.b.post(new gd7(cQf, i2));
                return;
            case 8:
                dy6 dy6Var = (dy6) this.x;
                String str = (String) this.y;
                wg6 wg6VarM = dy6Var.a.m();
                String str2 = wg6VarM.p;
                if (str2 != null && !str2.equals(str)) {
                    i = 1;
                }
                wg6VarM.p = str;
                if (i != 0) {
                    dy6Var.a.m().l();
                    return;
                }
                return;
            case 9:
                synchronized (((AtomicReference) this.x)) {
                    try {
                        AtomicReference atomicReference = (AtomicReference) this.x;
                        Object obj4 = this.y;
                        atomicReference.set(Integer.valueOf(((dy6) obj4).a.g.i(((dy6) obj4).a.m().j(), lg6.O)));
                        ((AtomicReference) this.x).notify();
                    } catch (Throwable th2) {
                        ((AtomicReference) this.x).notify();
                        throw th2;
                    }
                }
                return;
            case 10:
                Object obj5 = this.x;
                Object obj6 = this.y;
                u07 u07Var = (u07) obj6;
                zzee zzeeVar = u07Var.d;
                if (zzeeVar == null) {
                    bi6 bi6Var = u07Var.a.i;
                    dq6.h(bi6Var);
                    bi6Var.f.b("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    oa3.h((p97) obj5);
                    zzeeVar.D((p97) obj5);
                    ((u07) obj6).p();
                    return;
                } catch (RemoteException e5) {
                    bi6 bi6Var2 = u07Var.a.i;
                    dq6.h(bi6Var2);
                    bi6Var2.f.c(e5, "Failed to send measurementEnabled to the service");
                    return;
                }
            case 11:
                synchronized (((s07) this.y)) {
                    ((s07) this.y).a = false;
                    if (!((s07) this.y).c.k()) {
                        bi6 bi6Var3 = ((s07) this.y).c.a.i;
                        dq6.h(bi6Var3);
                        bi6Var3.m.b("Connected to remote service");
                        u07 u07Var2 = ((s07) this.y).c;
                        zzee zzeeVar2 = (zzee) this.x;
                        u07Var2.e();
                        oa3.h(zzeeVar2);
                        u07Var2.d = zzeeVar2;
                        u07Var2.p();
                        u07Var2.o();
                    }
                    break;
                }
                return;
            case 12:
                r27 r27Var = (r27) this.x;
                r27Var.a();
                Runnable runnable = (Runnable) this.y;
                r27Var.zzaz().e();
                if (r27Var.p == null) {
                    r27Var.p = new ArrayList();
                }
                r27Var.p.add(runnable);
                r27Var.q();
                return;
            case 13:
                r27 r27Var2 = (r27) this.y;
                r27Var2.zzaz().e();
                r27Var2.k = new lk6(r27Var2);
                iy5 iy5Var = new iy5(r27Var2);
                iy5Var.g();
                r27Var2.c = iy5Var;
                vv5 vv5VarG = r27Var2.G();
                wl6 wl6Var = r27Var2.a;
                oa3.h(wl6Var);
                vv5VarG.c = wl6Var;
                y07 y07Var = new y07(r27Var2);
                y07Var.g();
                r27Var2.i = y07Var;
                fs5 fs5Var = new fs5(r27Var2);
                fs5Var.g();
                r27Var2.f = fs5Var;
                ny6 ny6Var = new ny6(r27Var2);
                ny6Var.g();
                r27Var2.h = ny6Var;
                c27 c27Var = new c27(r27Var2);
                c27Var.g();
                r27Var2.e = c27Var;
                r27Var2.d = new si6(r27Var2);
                if (r27Var2.q != r27Var2.r) {
                    r27Var2.zzay().f.d(Integer.valueOf(r27Var2.q), "Not all upload components initialized", Integer.valueOf(r27Var2.r));
                }
                r27Var2.m = true;
                r27Var2.zzaz().e();
                iy5 iy5Var2 = r27Var2.c;
                r27.E(iy5Var2);
                iy5Var2.N();
                if (r27Var2.i.g.a() == 0) {
                    bj6 bj6Var = r27Var2.i.g;
                    ((jg0) r27Var2.b()).getClass();
                    bj6Var.b(System.currentTimeMillis());
                }
                r27Var2.z();
                return;
            case 14:
                dy6 dy6Var2 = ((AppMeasurementDynamiteService) this.y).w.p;
                dq6.g(dy6Var2);
                ss3 ss3Var2 = (ss3) this.x;
                dy6Var2.e();
                dy6Var2.f();
                if (ss3Var2 != null && ss3Var2 != (ss3Var = dy6Var2.d)) {
                    oa3.j("EventInterceptor already set.", ss3Var == null);
                }
                dy6Var2.d = ss3Var2;
                return;
            case 15:
                Object obj7 = this.x;
                boolean zL = ((w05) obj7).l();
                Object obj8 = this.y;
                if (zL) {
                    ((jd6) obj8).y.t();
                    return;
                }
                try {
                    ((jd6) obj8).y.s((TContinuationResult) ((jd6) obj8).x.then((w05<TResult>) ((w05) obj7)));
                    return;
                } catch (RuntimeExecutionException e6) {
                    if (e6.getCause() instanceof Exception) {
                        ((jd6) obj8).y.r((Exception) e6.getCause());
                        return;
                    } else {
                        ((jd6) obj8).y.r(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ((jd6) obj8).y.r(e7);
                    return;
                }
            case 16:
                synchronized (((x27) this.y).x) {
                    nu2 nu2Var = ((x27) this.y).y;
                    if (nu2Var != null) {
                        Exception excJ = ((w05) this.x).j();
                        oa3.h(excJ);
                        nu2Var.onFailure(excJ);
                    }
                    break;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.w) {
            case 6:
                zzfry zzfryVarZza = zzfrz.zza(this);
                zzfryVarZza.zza((zzfyk) this.y);
                return zzfryVarZza.toString();
            default:
                return super.toString();
        }
    }

    public tb7(zzbbg zzbbgVar, String str) {
        this.w = 4;
        this.y = zzbbgVar;
        this.x = str;
    }

    public /* synthetic */ tb7(Object obj, Object obj2, int i) {
        this.w = i;
        this.y = obj;
        this.x = obj2;
    }

    public tb7(r27 r27Var, Runnable runnable) {
        this.w = 12;
        this.x = r27Var;
        this.y = runnable;
    }
}
