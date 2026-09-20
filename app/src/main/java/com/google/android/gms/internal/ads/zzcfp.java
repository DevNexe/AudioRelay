package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.ft;
import defpackage.g86;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcfp {
    public final ft a;
    public final zzcga b;
    public final String e;
    public final String f;
    public final Object d = new Object();

    @GuardedBy("lock")
    public long g = -1;

    @GuardedBy("lock")
    public long h = -1;

    @GuardedBy("lock")
    public long i = 0;

    @GuardedBy("lock")
    public long j = -1;

    @GuardedBy("lock")
    public long k = -1;

    @GuardedBy("lock")
    public final LinkedList c = new LinkedList();

    public zzcfp(ft ftVar, zzcga zzcgaVar, String str, String str2) {
        this.a = ftVar;
        this.b = zzcgaVar;
        this.e = str;
        this.f = str2;
    }

    public final Bundle zza() {
        Bundle bundle;
        synchronized (this.d) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.e);
                bundle.putString("slotid", this.f);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.j);
                bundle.putLong("tresponse", this.k);
                bundle.putLong("timp", this.g);
                bundle.putLong("tload", this.h);
                bundle.putLong("pcc", this.i);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g86 g86Var : this.c) {
                    g86Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("topen", g86Var.a);
                    bundle2.putLong("tclose", g86Var.b);
                    arrayList.add(bundle2);
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final String zzc() {
        return this.e;
    }

    public final void zzd() {
        synchronized (this.d) {
            try {
                if (this.k != -1) {
                    g86 g86Var = new g86(this);
                    g86Var.a = this.a.c();
                    this.c.add(g86Var);
                    this.i++;
                    this.b.zzd();
                    this.b.zzc(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.d) {
            try {
                if (this.k != -1 && !this.c.isEmpty()) {
                    g86 g86Var = (g86) this.c.getLast();
                    if (g86Var.b == -1) {
                        g86Var.b = g86Var.c.a.c();
                        this.b.zzc(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        synchronized (this.d) {
            if (this.k != -1 && this.g == -1) {
                this.g = this.a.c();
                this.b.zzc(this);
            }
            this.b.zze();
        }
    }

    public final void zzg() {
        synchronized (this.d) {
            this.b.zzf();
        }
    }

    public final void zzh(boolean z) {
        synchronized (this.d) {
            if (this.k != -1) {
                this.h = this.a.c();
            }
        }
    }

    public final void zzi() {
        synchronized (this.d) {
            this.b.zzg();
        }
    }

    public final void zzj(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        synchronized (this.d) {
            long jC = this.a.c();
            this.j = jC;
            this.b.zzh(zzlVar, jC);
        }
    }

    public final void zzk(long j) {
        synchronized (this.d) {
            this.k = j;
            if (j != -1) {
                this.b.zzc(this);
            }
        }
    }
}
