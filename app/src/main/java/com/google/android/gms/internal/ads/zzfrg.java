package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import defpackage.d15;
import defpackage.jm6;
import defpackage.kc7;
import defpackage.ku2;
import defpackage.lm6;
import defpackage.om6;
import defpackage.tz6;
import defpackage.w05;
import defpackage.z05;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfrg {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final zzfqv b;
    public boolean g;
    public final Intent h;
    public om6 l;
    public IInterface m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final zzfqy j = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfqy
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfrg.zzh(this.zza);
        }
    };
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "OverlayDisplayService";
    public final WeakReference i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.zzfqy] */
    public zzfrg(Context context, zzfqv zzfqvVar, String str, Intent intent, zzfqd zzfqdVar, zzfrb zzfrbVar, byte[] bArr) {
        this.a = context;
        this.b = zzfqvVar;
        this.h = intent;
    }

    public static void zzh(zzfrg zzfrgVar) {
        zzfrgVar.b.zzd("reportBinderDeath", new Object[0]);
        zzfrb zzfrbVar = (zzfrb) zzfrgVar.i.get();
        zzfqv zzfqvVar = zzfrgVar.b;
        if (zzfrbVar != null) {
            zzfqvVar.zzd("calling onBinderDied", new Object[0]);
            zzfrbVar.zza();
        } else {
            String str = zzfrgVar.c;
            zzfqvVar.zzd("%s : Binder has died.", str);
            ArrayList arrayList = zzfrgVar.d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((zzfqw) it.next()).zzc(new RemoteException(String.valueOf(str).concat(" : Binder has died.")));
            }
            arrayList.clear();
        }
        zzfrgVar.a();
    }

    public final void a() {
        synchronized (this.f) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((z05) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
            }
            this.e.clear();
        }
    }

    public final Handler zzc() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            if (!map.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                map.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.c);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.m;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void zzp(zzfqw zzfqwVar, final z05 z05Var) {
        synchronized (this.f) {
            this.e.add(z05Var);
            kc7<TResult> kc7Var = z05Var.a;
            ku2 ku2Var = new ku2() { // from class: com.google.android.gms.internal.ads.zzfqx
                @Override // defpackage.ku2
                public final void onComplete(w05 w05Var) {
                    zzfrg zzfrgVar = this.zza;
                    z05 z05Var2 = z05Var;
                    synchronized (zzfrgVar.f) {
                        zzfrgVar.e.remove(z05Var2);
                    }
                }
            };
            kc7Var.getClass();
            kc7Var.b.a(new tz6(d15.a, ku2Var));
            kc7Var.v();
        }
        synchronized (this.f) {
            if (this.k.getAndIncrement() > 0) {
                this.b.zza("Already connected to the service.", new Object[0]);
            }
        }
        zzc().post(new jm6(this, zzfqwVar.w, zzfqwVar));
    }

    public final void zzr() {
        synchronized (this.f) {
            if (this.k.get() > 0 && this.k.decrementAndGet() > 0) {
                this.b.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzc().post(new lm6(this));
        }
    }
}
