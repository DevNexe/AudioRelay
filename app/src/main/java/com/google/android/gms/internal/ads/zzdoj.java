package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.Bt7j;
import defpackage.re6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdoj extends zzczc {
    public static final zzfuv zzc = zzfuv.zzt("3010", "3008", "1005", "1009", "2011", "2007");
    public final Context A;
    public final zzdol B;
    public final zzenr C;
    public final HashMap D;
    public final ArrayList E;
    public final Executor i;
    public final zzdoo j;
    public final zzdow k;
    public final zzdpo l;
    public final zzdot m;
    public final zzdoz n;
    public final zzgul o;
    public final zzgul p;
    public final zzgul q;
    public final zzgul r;
    public final zzgul s;
    public zzdqj t;
    public boolean u;
    public boolean v;
    public boolean w;
    public final zzcea x;
    public final zzapb y;
    public final zzcgt z;

    public zzdoj(zzczb zzczbVar, Executor executor, zzdoo zzdooVar, zzdow zzdowVar, zzdpo zzdpoVar, zzdot zzdotVar, zzdoz zzdozVar, zzgul zzgulVar, zzgul zzgulVar2, zzgul zzgulVar3, zzgul zzgulVar4, zzgul zzgulVar5, zzcea zzceaVar, zzapb zzapbVar, zzcgt zzcgtVar, Context context, zzdol zzdolVar, zzenr zzenrVar, zzbbo zzbboVar) {
        super(zzczbVar);
        this.i = executor;
        this.j = zzdooVar;
        this.k = zzdowVar;
        this.l = zzdpoVar;
        this.m = zzdotVar;
        this.n = zzdozVar;
        this.o = zzgulVar;
        this.p = zzgulVar2;
        this.q = zzgulVar3;
        this.r = zzgulVar4;
        this.s = zzgulVar5;
        this.x = zzceaVar;
        this.y = zzapbVar;
        this.z = zzcgtVar;
        this.A = context;
        this.B = zzdolVar;
        this.C = zzenrVar;
        this.D = new HashMap();
        this.E = new ArrayList();
    }

    public static boolean zzP(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzii)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        long jZzt = com.google.android.gms.ads.internal.util.zzs.zzt(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (jZzt >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzij)).intValue()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void zzh(zzdoj zzdojVar) {
        try {
            zzdoo zzdooVar = zzdojVar.j;
            zzdoo zzdooVar2 = zzdojVar.j;
            int iZzc = zzdooVar.zzc();
            zzdoz zzdozVar = zzdojVar.n;
            if (iZzc == 1) {
                if (zzdozVar.zzb() != null) {
                    zzdojVar.zzq("Google", true);
                    zzdozVar.zzb().zze((zzbmr) zzdojVar.o.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                if (zzdozVar.zza() != null) {
                    zzdojVar.zzq("Google", true);
                    zzdozVar.zza().zze((zzbmp) zzdojVar.p.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                if (zzdozVar.zzd(zzdooVar.zzy()) != null) {
                    if (zzdooVar2.zzr() != null) {
                        zzdojVar.zzq("Google", true);
                    }
                    zzdozVar.zzd(zzdooVar2.zzy()).zze((zzbmu) zzdojVar.s.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                if (zzdozVar.zzf() != null) {
                    zzdojVar.zzq("Google", true);
                    zzdozVar.zzf().zze((zzbnx) zzdojVar.q.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                zzcgn.zzg("Wrong native template id!");
            } else if (zzdozVar.zzg() != null) {
                zzdozVar.zzg().zzg((zzbsa) zzdojVar.r.zzb());
            }
        } catch (RemoteException e) {
            zzcgn.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final synchronized void a(View view, Map map, Map map2) {
        this.l.zzd(this.t);
        this.k.zzp(view, map, map2);
        this.v = true;
    }

    public final synchronized void b(zzdqj zzdqjVar) {
        Iterator<String> itKeys;
        View view;
        zzaox zzaoxVarZzc;
        if (this.u) {
            return;
        }
        this.t = zzdqjVar;
        this.l.zze(zzdqjVar);
        this.k.zzx(zzdqjVar.zzf(), zzdqjVar.zzm(), zzdqjVar.zzn(), zzdqjVar, zzdqjVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcf)).booleanValue() && (zzaoxVarZzc = this.y.zzc()) != null) {
            zzaoxVarZzc.zzn(zzdqjVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbw)).booleanValue()) {
            zzfcs zzfcsVar = this.b;
            if (zzfcsVar.zzam && (itKeys = zzfcsVar.zzal.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    WeakReference weakReference = (WeakReference) this.t.zzl().get(next);
                    this.D.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        zzbbn zzbbnVar = new zzbbn(this.A, view);
                        this.E.add(zzbbnVar);
                        zzbbnVar.zzc(new re6(this, next));
                    }
                }
            }
        }
        if (zzdqjVar.zzi() != null) {
            zzdqjVar.zzi().zzc(this.x);
        }
    }

    public final void c(zzdqj zzdqjVar) {
        this.k.zzy(zzdqjVar.zzf(), zzdqjVar.zzl());
        if (zzdqjVar.zzh() != null) {
            zzdqjVar.zzh().setClickable(false);
            zzdqjVar.zzh().removeAllViews();
        }
        if (zzdqjVar.zzi() != null) {
            zzdqjVar.zzi().zze(this.x);
        }
        this.t = null;
    }

    public final synchronized void zzA() {
        zzdqj zzdqjVar = this.t;
        if (zzdqjVar == null) {
            zzcgn.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = zzdqjVar instanceof zzdpi;
            this.i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdof
                @Override // java.lang.Runnable
                public final void run() {
                    zzdoj zzdojVar = this.zza;
                    boolean z2 = z;
                    zzdojVar.k.zzn(zzdojVar.t.zzf(), zzdojVar.t.zzl(), zzdojVar.t.zzm(), z2);
                }
            });
        }
    }

    public final synchronized void zzB() {
        if (this.v) {
            return;
        }
        this.k.zzq();
    }

    public final void zzC(View view) {
        zzdoo zzdooVar = this.j;
        IObjectWrapper iObjectWrapperZzu = zzdooVar.zzu();
        zzcmn zzcmnVarZzq = zzdooVar.zzq();
        if (!this.m.zzd() || iObjectWrapperZzu == null || zzcmnVarZzq == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzc(iObjectWrapperZzu, view);
    }

    public final synchronized void zzD(View view, MotionEvent motionEvent, View view2) {
        this.k.zzr(view, motionEvent, view2);
    }

    public final synchronized void zzE(Bundle bundle) {
        this.k.zzs(bundle);
    }

    public final synchronized void zzF(View view) {
        this.k.zzt(view);
    }

    public final synchronized void zzG() {
        this.k.zzu();
    }

    public final synchronized void zzH(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        this.k.zzv(zzcqVar);
    }

    public final synchronized void zzI(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.C.zza(zzdeVar);
    }

    public final synchronized void zzJ(zzbnu zzbnuVar) {
        this.k.zzw(zzbnuVar);
    }

    public final synchronized void zzK(final zzdqj zzdqjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbu)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdog
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.b(zzdqjVar);
                }
            });
        } else {
            b(zzdqjVar);
        }
    }

    public final synchronized void zzL(final zzdqj zzdqjVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbu)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.c(zzdqjVar);
                }
            });
        } else {
            c(zzdqjVar);
        }
    }

    public final boolean zzM() {
        return this.m.zze();
    }

    public final synchronized boolean zzN() {
        return this.k.zzz();
    }

    public final boolean zzO() {
        return this.m.zzd();
    }

    public final synchronized boolean zzQ(Bundle bundle) {
        if (this.v) {
            return true;
        }
        boolean zZzA = this.k.zzA(bundle);
        this.v = zZzA;
        return zZzA;
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final synchronized void zzV() {
        this.u = true;
        this.i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoh
            @Override // java.lang.Runnable
            public final void run() {
                zzdoj zzdojVar = this.zza;
                zzdojVar.k.zzh();
                zzdojVar.j.zzG();
            }
        });
        super.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzczc
    public final void zzW() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdod
            @Override // java.lang.Runnable
            public final void run() {
                zzdoj.zzh(this.zza);
            }
        };
        Executor executor = this.i;
        executor.execute(runnable);
        if (this.j.zzc() != 7) {
            final zzdow zzdowVar = this.k;
            zzdowVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdoe
                @Override // java.lang.Runnable
                public final void run() {
                    zzdowVar.zzo();
                }
            });
        }
        super.zzW();
    }

    public final zzdol zza() {
        return this.B;
    }

    public final String zzd() {
        return this.m.zzb();
    }

    public final synchronized JSONObject zzf(View view, Map map, Map map2) {
        return this.k.zzd(view, map, map2);
    }

    public final synchronized JSONObject zzg(View view, Map map, Map map2) {
        return this.k.zze(view, map, map2);
    }

    public final void zzi(View view) {
        IObjectWrapper iObjectWrapperZzu = this.j.zzu();
        if (!this.m.zzd() || iObjectWrapperZzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzed)).booleanValue() && zzfjx.zzb()) {
            Object objM0 = ObjectWrapper.M0(iObjectWrapperZzu);
            if (objM0 instanceof zzfjz) {
                ((zzfjz) objM0).zzb(view, zzfkf.NOT_VISIBLE, "Ad overlay");
            }
        }
    }

    public final synchronized void zzk() {
        this.k.zzg();
    }

    public final void zzq(String str, boolean z) {
        String str2;
        zzbyv zzbyvVar;
        zzbyw zzbywVar;
        String str3;
        zzdot zzdotVar = this.m;
        if (!zzdotVar.zzd() || TextUtils.isEmpty(str)) {
            return;
        }
        zzdoo zzdooVar = this.j;
        zzcmn zzcmnVarZzq = zzdooVar.zzq();
        zzcmn zzcmnVarZzr = zzdooVar.zzr();
        if (zzcmnVarZzq == null && zzcmnVarZzr == null) {
            zzcgn.zzj("Omid display and video webview are null. Skipping initialization.");
            return;
        }
        boolean z2 = false;
        boolean z3 = zzcmnVarZzq != null;
        boolean z4 = zzcmnVarZzr != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeh)).booleanValue()) {
            zzdotVar.zza();
            int iZzb = zzdotVar.zza().zzb();
            int i = iZzb - 1;
            if (i != 0) {
                if (i != 1) {
                    if (iZzb != 1) {
                        str3 = iZzb != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    zzcgn.zzj("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return;
                }
                if (zzcmnVarZzq == null) {
                    zzcgn.zzj("Omid media type was display but there was no display webview.");
                    return;
                } else {
                    z2 = true;
                    z4 = false;
                }
            } else {
                if (zzcmnVarZzr == null) {
                    zzcgn.zzj("Omid media type was video but there was no video webview.");
                    return;
                }
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzcmnVarZzq = zzcmnVarZzr;
        }
        zzcmnVarZzq.zzI();
        if (!com.google.android.gms.ads.internal.zzt.zzh().zze(this.A)) {
            zzcgn.zzj("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzcgt zzcgtVar = this.z;
        String str4 = zzcgtVar.zzb + "." + zzcgtVar.zzc;
        if (z4) {
            zzbyvVar = zzbyv.VIDEO;
            zzbywVar = zzbyw.DEFINED_BY_JAVASCRIPT;
        } else {
            zzbyvVar = zzbyv.NATIVE_DISPLAY;
            zzbywVar = zzdooVar.zzc() == 3 ? zzbyw.UNSPECIFIED : zzbyw.ONE_PIXEL;
        }
        IObjectWrapper iObjectWrapperZzb = com.google.android.gms.ads.internal.zzt.zzh().zzb(str4, zzcmnVarZzq.zzI(), "", "javascript", str2, str, zzbywVar, zzbyvVar, this.b.zzan);
        if (iObjectWrapperZzb == null) {
            zzcgn.zzj("Failed to create omid session in InternalNativeAd");
            return;
        }
        zzdooVar.zzaa(iObjectWrapperZzb);
        zzcmnVarZzq.zzar(iObjectWrapperZzb);
        if (z4) {
            com.google.android.gms.ads.internal.zzt.zzh().zzc(iObjectWrapperZzb, zzcmnVarZzr.zzH());
            this.w = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzh().zzd(iObjectWrapperZzb);
            zzcmnVarZzq.zzd("onSdkLoaded", new Bt7j());
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00b5 A[Catch: all -> 0x0119, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0019, B:11:0x001f, B:12:0x0029, B:14:0x002f, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a, B:37:0x008e, B:49:0x00b5, B:52:0x00ba, B:54:0x00cc, B:56:0x00d2, B:61:0x00d9, B:63:0x00eb, B:65:0x00f6, B:67:0x0100, B:69:0x010a, B:74:0x0111, B:44:0x00af, B:46:0x00b1, B:78:0x0117, B:79:0x0118, B:39:0x0090, B:41:0x0099, B:43:0x00a9), top: B:85:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[Catch: all -> 0x0119, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0019, B:11:0x001f, B:12:0x0029, B:14:0x002f, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a, B:37:0x008e, B:49:0x00b5, B:52:0x00ba, B:54:0x00cc, B:56:0x00d2, B:61:0x00d9, B:63:0x00eb, B:65:0x00f6, B:67:0x0100, B:69:0x010a, B:74:0x0111, B:44:0x00af, B:46:0x00b1, B:78:0x0117, B:79:0x0118, B:39:0x0090, B:41:0x0099, B:43:0x00a9), top: B:85:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc A[Catch: all -> 0x0119, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0019, B:11:0x001f, B:12:0x0029, B:14:0x002f, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a, B:37:0x008e, B:49:0x00b5, B:52:0x00ba, B:54:0x00cc, B:56:0x00d2, B:61:0x00d9, B:63:0x00eb, B:65:0x00f6, B:67:0x0100, B:69:0x010a, B:74:0x0111, B:44:0x00af, B:46:0x00b1, B:78:0x0117, B:79:0x0118, B:39:0x0090, B:41:0x0099, B:43:0x00a9), top: B:85:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d2 A[Catch: all -> 0x0119, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0019, B:11:0x001f, B:12:0x0029, B:14:0x002f, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a, B:37:0x008e, B:49:0x00b5, B:52:0x00ba, B:54:0x00cc, B:56:0x00d2, B:61:0x00d9, B:63:0x00eb, B:65:0x00f6, B:67:0x0100, B:69:0x010a, B:74:0x0111, B:44:0x00af, B:46:0x00b1, B:78:0x0117, B:79:0x0118, B:39:0x0090, B:41:0x0099, B:43:0x00a9), top: B:85:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d7 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d9 A[Catch: all -> 0x0119, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0019, B:11:0x001f, B:12:0x0029, B:14:0x002f, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a, B:37:0x008e, B:49:0x00b5, B:52:0x00ba, B:54:0x00cc, B:56:0x00d2, B:61:0x00d9, B:63:0x00eb, B:65:0x00f6, B:67:0x0100, B:69:0x010a, B:74:0x0111, B:44:0x00af, B:46:0x00b1, B:78:0x0117, B:79:0x0118, B:39:0x0090, B:41:0x0099, B:43:0x00a9), top: B:85:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb A[Catch: all -> 0x0119, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0019, B:11:0x001f, B:12:0x0029, B:14:0x002f, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a, B:37:0x008e, B:49:0x00b5, B:52:0x00ba, B:54:0x00cc, B:56:0x00d2, B:61:0x00d9, B:63:0x00eb, B:65:0x00f6, B:67:0x0100, B:69:0x010a, B:74:0x0111, B:44:0x00af, B:46:0x00b1, B:78:0x0117, B:79:0x0118, B:39:0x0090, B:41:0x0099, B:43:0x00a9), top: B:85:0x0001, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0111 A[Catch: all -> 0x0119, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0019, B:11:0x001f, B:12:0x0029, B:14:0x002f, B:19:0x0047, B:22:0x005b, B:23:0x0063, B:25:0x0069, B:27:0x007d, B:29:0x0083, B:34:0x008a, B:37:0x008e, B:49:0x00b5, B:52:0x00ba, B:54:0x00cc, B:56:0x00d2, B:61:0x00d9, B:63:0x00eb, B:65:0x00f6, B:67:0x0100, B:69:0x010a, B:74:0x0111, B:44:0x00af, B:46:0x00b1, B:78:0x0117, B:79:0x0118, B:39:0x0090, B:41:0x0099, B:43:0x00a9), top: B:85:0x0001, inners: #0 }] */
    public final synchronized void zzv(View view, Map map, Map map2, boolean z) {
        View view2;
        Rect rect;
        if (this.v) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbw)).booleanValue() && this.b.zzam) {
            Iterator it = this.D.keySet().iterator();
            while (it.hasNext()) {
                if (!((Boolean) this.D.get((String) it.next())).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcW)).booleanValue() && map != null) {
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                    if (view3 != null && zzP(view3)) {
                        a(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        synchronized (this) {
            if (map != null) {
                zzfuv zzfuvVar = zzc;
                int size = zzfuvVar.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        WeakReference weakReference = (WeakReference) map.get((String) zzfuvVar.get(i));
                        i++;
                        if (weakReference != null) {
                            view2 = (View) weakReference.get();
                            break;
                        }
                    }
                }
                if (view2 == null) {
                    a(view, map, map2);
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcX)).booleanValue()) {
                    if (zzP(view2)) {
                        a(view, map, map2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcY)).booleanValue()) {
                    a(view, map, map2);
                }
                rect = new Rect();
                if (!view2.getGlobalVisibleRect(rect, null) && view2.getHeight() == rect.height() && view2.getWidth() == rect.width()) {
                    a(view, map, map2);
                    return;
                }
            }
            view2 = null;
            if (view2 == null) {
                a(view, map, map2);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcX)).booleanValue()) {
                if (zzP(view2)) {
                    a(view, map, map2);
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcY)).booleanValue()) {
                    a(view, map, map2);
                } else {
                    rect = new Rect();
                    if (!view2.getGlobalVisibleRect(rect, null)) {
                    }
                }
            }
        }
    }

    public final synchronized void zzw(com.google.android.gms.ads.internal.client.zzcu zzcuVar) {
        this.k.zzi(zzcuVar);
    }

    public final synchronized void zzx(View view, View view2, Map map, Map map2, boolean z) {
        this.l.zzc(this.t);
        this.k.zzj(view, view2, map, map2, z);
        if (this.w) {
            zzdoo zzdooVar = this.j;
            if (zzdooVar.zzr() != null) {
                zzdooVar.zzr().zzd("onSdkAdUserInteractionClick", new Bt7j());
            }
        }
    }

    public final synchronized void zzy(String str) {
        this.k.zzk(str);
    }

    public final synchronized void zzz(Bundle bundle) {
        this.k.zzl(bundle);
    }
}
