package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import defpackage.j95;
import defpackage.qx5;
import defpackage.wx5;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaka implements Comparable {
    public final Object A;
    public final zzake B;
    public Integer C;
    public zzakd D;
    public boolean E;
    public zzajj F;
    public j95 G;
    public final zzajo H;
    public final wx5 w;
    public final int x;
    public final String y;
    public final int z;

    public zzaka(int i, String str, zzake zzakeVar) {
        Uri uri;
        String host;
        this.w = wx5.c ? new wx5() : null;
        this.A = new Object();
        int iHashCode = 0;
        this.E = false;
        this.F = null;
        this.x = i;
        this.y = str;
        this.B = zzakeVar;
        this.H = new zzajo();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.z = iHashCode;
    }

    public abstract zzakg a(zzajw zzajwVar);

    public abstract void c(Object obj);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.C.intValue() - ((zzaka) obj).C.intValue();
    }

    public final void d(String str) {
        zzakd zzakdVar = this.D;
        if (zzakdVar != null) {
            synchronized (zzakdVar.b) {
                zzakdVar.b.remove(this);
            }
            synchronized (zzakdVar.i) {
                Iterator it = zzakdVar.i.iterator();
                while (it.hasNext()) {
                    ((zzakc) it.next()).zza();
                }
            }
            zzakdVar.a();
        }
        if (wx5.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new qx5(this, str, id, 0));
            } else {
                this.w.a(str, id);
                this.w.b(toString());
            }
        }
    }

    public final void e(zzakg zzakgVar) {
        j95 j95Var;
        List list;
        synchronized (this.A) {
            j95Var = this.G;
        }
        if (j95Var != null) {
            zzajj zzajjVar = zzakgVar.zzb;
            if (zzajjVar != null) {
                if (!(zzajjVar.zze < System.currentTimeMillis())) {
                    String strZzj = zzj();
                    synchronized (j95Var) {
                        list = (List) ((Map) j95Var.a).remove(strZzj);
                    }
                    if (list != null) {
                        if (zzakm.zzb) {
                            zzakm.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
                        }
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((zzajr) j95Var.d).zzb((zzaka) it.next(), zzakgVar, null);
                        }
                        return;
                    }
                    return;
                }
            }
            j95Var.b(this);
        }
    }

    public final void g(int i) {
        zzakd zzakdVar = this.D;
        if (zzakdVar != null) {
            zzakdVar.a();
        }
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.z);
        zzw();
        return "[ ] " + this.y + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + this.C;
    }

    public final int zza() {
        return this.x;
    }

    public final int zzb() {
        return this.H.zzb();
    }

    public final int zzc() {
        return this.z;
    }

    public final zzajj zzd() {
        return this.F;
    }

    public final zzaka zze(zzajj zzajjVar) {
        this.F = zzajjVar;
        return this;
    }

    public final zzaka zzf(zzakd zzakdVar) {
        this.D = zzakdVar;
        return this;
    }

    public final zzaka zzg(int i) {
        this.C = Integer.valueOf(i);
        return this;
    }

    public final String zzj() {
        int i = this.x;
        String str = this.y;
        return i != 0 ? defpackage.LPt6Fixed.a(Integer.toString(1), "-", str) : str;
    }

    public final String zzk() {
        return this.y;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (wx5.c) {
            this.w.a(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzakj zzakjVar) {
        zzake zzakeVar;
        synchronized (this.A) {
            zzakeVar = this.B;
        }
        if (zzakeVar != null) {
            zzakeVar.zza(zzakjVar);
        }
    }

    public final void zzq() {
        synchronized (this.A) {
            this.E = true;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.A) {
            z = this.E;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.A) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final zzajo zzy() {
        return this.H;
    }
}
