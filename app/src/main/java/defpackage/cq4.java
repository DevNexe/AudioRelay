package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.RemoteException;
import android.util.Base64OutputStream;
import com.azefsw.audioconnect.R;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener;
import com.google.android.gms.internal.ads.zzbpq;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzbwf;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzcmn;
import com.google.android.gms.internal.ads.zzczj;
import com.google.android.gms.internal.ads.zzczn;
import com.google.android.gms.internal.ads.zzczq;
import com.google.android.gms.internal.ads.zzfft;
import com.google.android.gms.internal.ads.zzffu;
import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzfyk;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzyy;
import com.google.android.gms.internal.ads.zzzf;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class cq4 implements ex4, CustomEventNativeListener, ku2, MediationAdLoadCallback, zzfyk, a46 {
    public final /* synthetic */ int w;
    public Object x;
    public Object y;

    public /* synthetic */ cq4(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    public static String f(nt4 nt4Var, double d) {
        boolean zIsNaN = Double.isNaN(d);
        C0239D c0239d = nt4Var.a;
        if (zIsNaN) {
            c0239d.getClass();
            qu4.QnHx qnHx = qu4.a;
            Context context = kd.w;
            if (context != null) {
                qu4.a.getClass();
                return iZUl.b(qu4.QnHx.b, context, R.string.running_stats_not_available);
            }
            ur1.e("context");
            throw null;
        }
        NumberFormat numberFormat = nt4Var.c;
        if (d >= 1000.0d) {
            numberFormat.setMaximumFractionDigits(1);
            numberFormat.setMinimumFractionDigits(1);
            numberFormat.setRoundingMode(RoundingMode.HALF_UP);
            String str = numberFormat.format(d);
            c0239d.getClass();
            return kd.q(Th.j(m21.C, str));
        }
        numberFormat.setMaximumFractionDigits(1);
        numberFormat.setMinimumFractionDigits(1);
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str2 = numberFormat.format(d);
        c0239d.getClass();
        return kd.q(Th.j(m21.D, str2));
    }

    public static String g(nt4 nt4Var, double d) {
        String strB;
        int i = d >= 0.05d ? 1 : 0;
        if (!(i <= 2)) {
            throw new IllegalStateException("Check the implementation to ensure that we're not storing too many numbers".toString());
        }
        if (Double.isNaN(d)) {
            nt4Var.a.getClass();
            qu4.QnHx qnHx = qu4.a;
            Context context = kd.w;
            if (context == null) {
                ur1.e("context");
                throw null;
            }
            qu4.a.getClass();
            strB = iZUl.b(qu4.QnHx.b, context, R.string.running_stats_not_available);
        } else {
            double dPow = i == 0 ? 1.0d : Math.pow(10.0d, i);
            int iA = sy4.a(d * dPow);
            LinkedHashMap linkedHashMap = nt4Var.b;
            Map linkedHashMap2 = (Map) linkedHashMap.get(Integer.valueOf(i));
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                linkedHashMap.put(Integer.valueOf(i), linkedHashMap2);
            }
            String str = (String) linkedHashMap2.get(Integer.valueOf(iA));
            if (str != null) {
                return str;
            }
            NumberFormat numberFormat = nt4Var.d;
            numberFormat.setMaximumFractionDigits(i);
            numberFormat.setMinimumFractionDigits(i);
            numberFormat.setRoundingMode(RoundingMode.HALF_UP);
            strB = numberFormat.format((((double) iA) / dPow) / 100.0d);
            linkedHashMap2.put(Integer.valueOf(iA), strB);
        }
        return strB;
    }

    @Override // defpackage.a46
    public final ma5 a(ez5 ez5Var) {
        ma5 ma5VarA = ((ma5) this.x).a();
        ma5VarA.f((String) this.y, ez5Var);
        return ma5VarA;
    }

    @Override // defpackage.ex4
    public final String b() {
        return (String) this.x;
    }

    @Override // defpackage.ex4
    public final void c(u61 u61Var) {
        Object[] objArr = (Object[]) this.y;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                u61Var.f(i);
            } else if (obj instanceof byte[]) {
                u61Var.b(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                u61Var.c(((Float) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                u61Var.c(((Double) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                u61Var.e(i, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                u61Var.e(i, ((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                u61Var.e(i, ((Short) obj).shortValue());
            } else if (obj instanceof Byte) {
                u61Var.e(i, ((Byte) obj).byteValue());
            } else if (obj instanceof String) {
                u61Var.g(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                }
                u61Var.e(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public final x45 d(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((qq0) list.get(i)).a((rq0) this.y);
        }
        Z7jl z7jl = new Z7jl(((rq0) this.y).toString(), null, 6);
        rq0 rq0Var = (rq0) this.y;
        long jA = Cz.a(rq0Var.b, rq0Var.c);
        rq0 rq0Var2 = (rq0) this.y;
        int i2 = rq0Var2.d;
        x45 x45Var = new x45(z7jl, jA, i2 != -1 ? new s55(Cz.a(i2, rq0Var2.e)) : null);
        this.x = x45Var;
        return x45Var;
    }

    public final void e() {
        Reference referencePoll;
        do {
            referencePoll = ((ReferenceQueue) this.y).poll();
            if (referencePoll != null) {
                ((ui2) this.x).l(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final Object h() {
        g75 g75Var = (g75) ((AtomicReference) this.x).get();
        int iA = g75Var.a(Thread.currentThread().getId());
        if (iA >= 0) {
            return g75Var.c[iA];
        }
        return null;
    }

    public final String i(String str) {
        int identifier = ((Resources) this.x).getIdentifier(str, "string", (String) this.y);
        if (identifier == 0) {
            return null;
        }
        return ((Resources) this.x).getString(identifier);
    }

    public final void j(Object obj) {
        boolean z;
        long id = Thread.currentThread().getId();
        synchronized (this.y) {
            g75 g75Var = (g75) ((AtomicReference) this.x).get();
            int iA = g75Var.a(id);
            if (iA < 0) {
                z = false;
            } else {
                g75Var.c[iA] = obj;
                z = true;
            }
            if (z) {
                return;
            }
            ((AtomicReference) this.x).set(g75Var.b(id, obj));
            sd5 sd5Var = sd5.a;
        }
    }

    public final zzzf k(Object... objArr) {
        Constructor constructorZza;
        synchronized (((AtomicBoolean) this.y)) {
            if (!((AtomicBoolean) this.y).get()) {
                try {
                    try {
                        constructorZza = ((zzyy) this.x).zza();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.y).set(true);
                        constructorZza = null;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (zzzf) constructorZza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public final void l() {
        qw6 qw6Var = (qw6) this.y;
        Context context = (Context) this.x;
        if (!qw6Var.b) {
            a36.f("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver((qw6) qw6Var.c.y);
            qw6Var.b = false;
        }
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzcgn.zze("Custom event adapter called onAdClicked.");
        ((MediationNativeListener) this.y).onAdClicked((CustomEventAdapter) this.x);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzcgn.zze("Custom event adapter called onAdClosed.");
        ((MediationNativeListener) this.y).onAdClosed((CustomEventAdapter) this.x);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzcgn.zze("Custom event adapter called onAdFailedToLoad.");
        ((MediationNativeListener) this.y).onAdFailedToLoad((CustomEventAdapter) this.x, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdImpression() {
        zzcgn.zze("Custom event adapter called onAdImpression.");
        ((MediationNativeListener) this.y).onAdImpression((CustomEventAdapter) this.x);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzcgn.zze("Custom event adapter called onAdLeftApplication.");
        ((MediationNativeListener) this.y).onAdLeftApplication((CustomEventAdapter) this.x);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzcgn.zze("Custom event adapter called onAdLoaded.");
        ((MediationNativeListener) this.y).onAdLoaded((CustomEventAdapter) this.x, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzcgn.zze("Custom event adapter called onAdOpened.");
        ((MediationNativeListener) this.y).onAdOpened((CustomEventAdapter) this.x);
    }

    @Override // defpackage.ku2
    public final void onComplete(w05 w05Var) {
        ((gp5) this.y).b.remove((z05) this.x);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            ((zzbwm) this.x).zzf(adError.zza());
        } catch (RemoteException e) {
            zzcgn.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationInterscrollerAd mediationInterscrollerAd = (MediationInterscrollerAd) obj;
        if (mediationInterscrollerAd != null) {
            try {
                ((zzbwm) this.x).zzh(new zzbwf(mediationInterscrollerAd));
            } catch (RemoteException e) {
                zzcgn.zzh("", e);
            }
            return new p66((zzbvl) this.y);
        }
        zzcgn.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            ((zzbwm) this.x).zze("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            zzcgn.zzh("", e2);
            return null;
        }
    }

    public final String toString() {
        String string;
        switch (this.w) {
            case 16:
                try {
                    ((Base64OutputStream) this.y).close();
                    break;
                } catch (IOException e) {
                    zzcgn.zzh("HashManager: Unable to convert to Base64.", e);
                }
                try {
                    ((ByteArrayOutputStream) this.x).close();
                    string = ((ByteArrayOutputStream) this.x).toString();
                } catch (IOException e2) {
                    zzcgn.zzh("HashManager: Unable to convert to Base64.", e2);
                    string = "";
                } finally {
                    this.x = null;
                    this.y = null;
                }
                return string;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        switch (this.w) {
            case 18:
                ((zzchh) this.y).mo43zza();
                return;
            case 19:
                ((zzfyk) this.x).zza(th);
                zzcha.zze.execute(new zzczn((zzczq) this.y));
                return;
            case 20:
                return;
            default:
                synchronized (((zzffu) this.y)) {
                    ((zzffu) this.y).d = null;
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final void mo32zzb(Object obj) {
        switch (this.w) {
            case 18:
                ((zzchj) this.x).zza(obj);
                return;
            case 19:
                final zzczq zzczqVar = (zzczq) this.y;
                List<zzfyx> list = ((zzczj) obj).zza;
                final zzfyk zzfykVar = (zzfyk) this.x;
                if (list == null || list.isEmpty()) {
                    zzczqVar.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzczk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzfykVar.zza(new zzeas(3));
                        }
                    });
                    return;
                }
                zzfyx zzfyxVarZzi = zzfyo.zzi(null);
                for (final zzfyx zzfyxVar : list) {
                    zzfyxVarZzi = zzfyo.zzn(zzfyo.zzg(zzfyxVarZzi, Throwable.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzczl
                        @Override // com.google.android.gms.internal.ads.zzfxv
                        public final zzfyx zza(Object obj2) {
                            zzfykVar.zza((Throwable) obj2);
                            return zzfyo.zzi(null);
                        }
                    }, zzczqVar.a), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzczm
                        @Override // com.google.android.gms.internal.ads.zzfxv
                        public final zzfyx zza(Object obj2) {
                            zzczq zzczqVar2 = zzczqVar;
                            zzfyk zzfykVar2 = zzfykVar;
                            zzfyx zzfyxVar2 = zzfyxVar;
                            zzczc zzczcVar = (zzczc) obj2;
                            zzczqVar2.getClass();
                            if (zzczcVar != null) {
                                zzfykVar2.mo32zzb(zzczcVar);
                            }
                            return zzfyo.zzo(zzfyxVar2, ((Long) zzbla.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, zzczqVar2.b);
                        }
                    }, zzczqVar.a);
                }
                zzfyo.zzr(zzfyxVarZzi, new d7G(zzczqVar, zzfykVar, 15), zzczqVar.a);
                return;
            case 20:
                ((zzcmn) obj).zzaw((String) this.x, (zzbpq) this.y);
                return;
            default:
                synchronized (((zzffu) this.y)) {
                    Object obj2 = this.y;
                    ((zzffu) obj2).d = null;
                    ((zzffu) obj2).c.addFirst((zzfft) this.x);
                    zzffu zzffuVar = (zzffu) this.y;
                    if (zzffuVar.e == 1) {
                        zzffuVar.a();
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ cq4(Object obj, Object obj2, int i) {
        this.w = i;
        this.x = obj2;
        this.y = obj;
    }

    public /* synthetic */ cq4(Object obj, Object obj2, int i, int i2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzcgn.zze("Custom event adapter called onAdFailedToLoad.");
        ((MediationNativeListener) this.y).onAdFailedToLoad((CustomEventAdapter) this.x, adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    public cq4(jr5 jr5Var, AlertDialog alertDialog) {
        this.w = 14;
        this.y = jr5Var;
        this.x = alertDialog;
    }

    public cq4(w17 w17Var) {
        this.w = 25;
        this.y = w17Var;
    }

    public cq4(Context context) {
        this.w = 15;
        oa3.h(context);
        Resources resources = context.getResources();
        this.x = resources;
        this.y = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public cq4(Context context, int i) {
        this.w = 6;
        this.x = context;
        this.y = new qw6(this);
    }

    public cq4(zzyy zzyyVar) {
        this.w = 22;
        this.x = zzyyVar;
        this.y = new AtomicBoolean(false);
    }

    public cq4(Context context, bh3 bh3Var) {
        this.w = 6;
        this.x = context;
        this.y = new qw6(this, bh3Var);
    }

    public cq4(qu3 qu3Var, ln2 ln2Var) {
        this.w = 10;
        this.x = qu3Var;
        this.y = ln2Var;
    }

    public cq4(Context context, b83 b83Var) {
        this.w = 9;
        this.x = context;
        this.y = b83Var;
    }

    public cq4(ad4 ad4Var, as asVar) {
        this.w = 11;
        this.x = ad4Var;
        this.y = asVar;
    }

    public cq4(Context context, by1 by1Var) {
        this.w = 8;
        this.x = context;
        this.y = by1Var;
    }

    public cq4(rn2 rn2Var, ot4 ot4Var) {
        this.w = 7;
        this.x = rn2Var;
        this.y = ot4Var;
    }

    public cq4(int i) {
        this.w = i;
        if (i == 1) {
            this.x = new ui2(new Reference[16]);
            this.y = new ReferenceQueue();
            return;
        }
        if (i == 2) {
            Z7jl z7jl = oOd.a;
            x45 x45Var = new x45(z7jl, s55.b, (s55) null);
            this.x = x45Var;
            this.y = new rq0(z7jl, x45Var.b);
            return;
        }
        if (i != 16) {
            this.x = new AtomicReference(fTO$.A);
            this.y = new Object();
        } else {
            this.x = new ByteArrayOutputStream(4096);
            this.y = new Base64OutputStream((ByteArrayOutputStream) this.x, 10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cq4(String str) {
        this(4, str, (Object) null);
        this.w = 4;
    }

    public cq4(pg3 pg3Var) {
        this.w = 26;
        this.y = DesugarCollections.synchronizedMap(new HashMap());
        this.x = pg3Var;
    }
}
