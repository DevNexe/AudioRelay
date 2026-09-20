package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.ye6;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdt {
    public final zzde a;
    public final zzdn b;
    public final zzdr c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public boolean g;

    public zzdt(Looper looper, zzde zzdeVar, zzdr zzdrVar) {
        this(new CopyOnWriteArraySet(), looper, zzdeVar, zzdrVar);
    }

    public static boolean zzg(zzdt zzdtVar, Message message) {
        for (ye6 ye6Var : zzdtVar.d) {
            if (!ye6Var.d && ye6Var.c) {
                zzaa zzaaVarZzb = ye6Var.b.zzb();
                ye6Var.b = new zzy();
                ye6Var.c = false;
                zzdtVar.c.zza(ye6Var.a, zzaaVarZzb);
            }
            if (zzdtVar.b.zzf(0)) {
                return true;
            }
        }
        return true;
    }

    public final zzdt zza(Looper looper, zzdr zzdrVar) {
        return new zzdt(this.d, looper, this.a, zzdrVar);
    }

    public final void zzb(Object obj) {
        if (this.g) {
            return;
        }
        this.d.add(new ye6(obj));
    }

    public final void zzc() {
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        zzdn zzdnVar = this.b;
        if (!zzdnVar.zzf(0)) {
            zzdnVar.zzj(zzdnVar.zza(0));
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (!zIsEmpty) {
            return;
        }
        while (!arrayDeque2.isEmpty()) {
            ((Runnable) arrayDeque2.peekFirst()).run();
            arrayDeque2.removeFirst();
        }
    }

    public final void zzd(final int i, final zzdq zzdqVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdp
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet<ye6> copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                zzdq zzdqVar2 = zzdqVar;
                for (ye6 ye6Var : copyOnWriteArraySet2) {
                    if (!ye6Var.d) {
                        if (i2 != -1) {
                            ye6Var.b.zza(i2);
                        }
                        ye6Var.c = true;
                        zzdqVar2.zza(ye6Var.a);
                    }
                }
            }
        });
    }

    public final void zze() {
        CopyOnWriteArraySet<ye6> copyOnWriteArraySet = this.d;
        for (ye6 ye6Var : copyOnWriteArraySet) {
            ye6Var.d = true;
            if (ye6Var.c) {
                zzaa zzaaVarZzb = ye6Var.b.zzb();
                this.c.zza(ye6Var.a, zzaaVarZzb);
            }
        }
        copyOnWriteArraySet.clear();
        this.g = true;
    }

    public final void zzf(Object obj) {
        CopyOnWriteArraySet<ye6> copyOnWriteArraySet = this.d;
        for (ye6 ye6Var : copyOnWriteArraySet) {
            if (ye6Var.a.equals(obj)) {
                ye6Var.d = true;
                if (ye6Var.c) {
                    zzaa zzaaVarZzb = ye6Var.b.zzb();
                    this.c.zza(ye6Var.a, zzaaVarZzb);
                }
                copyOnWriteArraySet.remove(ye6Var);
            }
        }
    }

    public zzdt(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzde zzdeVar, zzdr zzdrVar) {
        this.a = zzdeVar;
        this.d = copyOnWriteArraySet;
        this.c = zzdrVar;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = zzdeVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdo
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzdt.zzg(this.zza, message);
                return true;
            }
        });
    }
}
